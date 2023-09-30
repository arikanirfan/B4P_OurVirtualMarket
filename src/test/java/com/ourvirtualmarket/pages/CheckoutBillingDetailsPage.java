package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutBillingDetailsPage extends BasePage {
    Actions actions;
    Select select;


    @FindBy(css = "#input-payment-firstname")
    public WebElement firstnameInputBox;

    @FindBy(css = "#input-payment-lastname")
    public WebElement lastnameInputBox;

    @FindBy(css = "#input-payment-company")
    public WebElement companyInputBox;

    @FindBy(css = "#input-payment-address-1")
    public WebElement address1InputBox;

    @FindBy(css = "#input-payment-address-2")
    public WebElement address2InputBox;

    @FindBy(css = "#input-payment-city")
    public WebElement cityInputBox;

    @FindBy(css = "#input-payment-postcode")
    public WebElement postcodeInputBox;

    @FindBy(css = "#input-payment-country")
    public WebElement countryInputBox;

    @FindBy(css = "#input-payment-zone")
    public WebElement regionInputBox;

    @FindBy(xpath = "//input[@id='button-payment-address']")
    public WebElement continueBtn;

    @FindBy(xpath = "//select[@name=\"address_id\"]")
    public WebElement existingAddressDropDown;

    @FindBy(xpath = "(//input[@name='payment_address'])[2]")
    public WebElement newAddress;

    public void billingDetails(String firstname, String lastname, String company, String address1, String address2, String city, String postcode, String country, String region) {
        if (firstnameInputBox.isDisplayed()) {
            fillForm(firstname, lastname, company, address1, address2, city, postcode, country, region);
        } else {
            selectExistingAddressMenu();
        }
    }

    public void selectExistingAddressMenu() {
        select = new Select(existingAddressDropDown);
        select.selectByIndex(0);
    }

    public void billingDetailsForNegativeTest(String firstname, String lastname, String company, String address1, String address2, String city, String postcode, String country, String region) {
        if (firstnameInputBox.isDisplayed()) {
            fillForm(firstname, lastname, company, address1, address2, city, postcode, country, region);
        } else {
            newAddress.click();
            fillForm(firstname, lastname, company, address1, address2, city, postcode, country, region);
        }
    }

    public void fillForm(String firstname, String lastname, String company, String address1, String address2, String city, String postcode, String country, String region) {
        actions = new Actions(Driver.get());

        actions.click(firstnameInputBox)
                .sendKeys(firstname + Keys.TAB)
                .sendKeys(lastname + Keys.TAB)
                .sendKeys(company + Keys.TAB)
                .sendKeys(address1 + Keys.TAB)
                .sendKeys(address2 + Keys.TAB)
                .sendKeys(city + Keys.TAB)
                .sendKeys(postcode + Keys.TAB).perform();
        selectCountry(country);
        selectRegion(region);
    }

    public void selectCountry(String country) {
        select = new Select(countryInputBox);
        select.selectByVisibleText(country);
    }

    public void selectRegion(String region) {
        select = new Select(regionInputBox);
        select.selectByVisibleText(region);
    }

    public void clickTheContinueBtn() {
        BrowserUtils.clickWithJS(continueBtn);
    }

    public String getWarningMessageText(String message) {
        return Driver.get().findElement(By.xpath("//div[contains(text(),'" + message + "')]")).getText();
    }
}