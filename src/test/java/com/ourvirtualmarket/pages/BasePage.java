package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    Actions actions;

    @FindBy(className = "popup-close")
    public WebElement closePopup;

    @FindBy(className = "link-lg")
    public WebElement mainPageLoginButton;

    @FindBy(xpath = "//a[text()=' Logout ']")
    public WebElement logoutButton;

    @FindBy(xpath = "//input[@class='autosearch-input form-control']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='button-search btn btn-default btn-lg']")
    public WebElement searchBoxButton;

    @FindBy(css = "[id='cart']")
    public WebElement myCartButton;

    @FindBy(xpath = "(//a[text()=' View Cart'])[1]")
    public WebElement viewCartButtonOnHomePage;


    public void loginButtonDirection(){
        closePopup.click();
        mainPageLoginButton.click();
    }

    public void search(String searchText) {
        searchBox.sendKeys(searchText);
        searchBoxButton.click();
    }

    public void hoverToMyCartButton(){
        actions= new Actions(Driver.get());
        BrowserUtils.hover(myCartButton);
    }

    public void clickToViewCartButton(){
        BrowserUtils.clickWithJS(viewCartButtonOnHomePage);
    }


}
