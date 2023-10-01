package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;

public class SearchPage extends BasePage {

    @FindBy(css = "#input-search")
    public WebElement searchResult;

    @FindBy(css = "#button-cart")
    public WebElement addToCartButton;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement closePopUpAfterAddToCart;

    @FindBy(xpath = "//div[@class='title-product']/./h1")
    public WebElement productNameInProductDetails;

    @FindBy(xpath = "//span[@id='price-old']")
    public WebElement productPriceInProductDetails;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantityInputBox;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement successfullyAddedMessage;


    public void clickProduct(String itemName) {
        WebElement productName = Driver.get().findElement(By.xpath("//div[@class='product-image-container']" +
                "/./a[contains(@title,'" + itemName + "')]"));
        BrowserUtils.scrollToElement(productName);
        BrowserUtils.clickWithJS(productName);
    }

    public void verifySearchedProductName(String searchedProductName) {
        BrowserUtils.waitFor(1);
        String actualSearchedProduct = searchResult.getAttribute("value");
        String expectedSearchedProduct = searchedProductName;
        Assert.assertEquals(expectedSearchedProduct, actualSearchedProduct);
    }

    public void AddToCart() {
        BrowserUtils.clickWithJS(addToCartButton);
    }

    public void closePopUpAfterClickAddToCartButton() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(closePopUpAfterAddToCart);
    }

    public void verifyProductName(String productName) {
        String actualProductName = productNameInProductDetails.getText();
        Assert.assertTrue(actualProductName.contains(productName));
    }

    public void verifyProductPrice(String productPrice) {
        String actualProductPrice = productPriceInProductDetails.getText();
        Assert.assertEquals(productPrice, actualProductPrice);
    }

    public void verifyAddToCartButtonIsDisplayed() {
        Assert.assertTrue(addToCartButton.isDisplayed());
    }

    public void inputQuantityOfProduct(String quantity) {
        BrowserUtils.clickWithJS(quantityInputBox);
        BrowserUtils.waitFor(1);
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].value = '';", quantityInputBox);
        BrowserUtils.waitFor(1);
        quantityInputBox.sendKeys(quantity);
        addToCartButton.click();
    }


    public void verifyProductAddedSuccessfullyMessage(String message) {
        BrowserUtils.waitForVisibility(successfullyAddedMessage,3);
        String actualSuccessfullyAddedToCartMessage = successfullyAddedMessage.getText();
        Assert.assertEquals(message, actualSuccessfullyAddedToCartMessage);
    }


}
