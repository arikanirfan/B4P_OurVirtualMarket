package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "popup-close")
    public WebElement closePopup;

    @FindBy(className = "link-lg")
    public WebElement mainPageLoginButton;

    @FindBy(xpath = "//a[text()=' Logout ']")
    public WebElement logoutButton;

    @FindBy(linkText = "Register")
    public WebElement branchPageRegisterButton;
    @FindBy(xpath = "//input[@class='autosearch-input form-control']")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='button-search btn btn-default btn-lg']")
    public WebElement searchBoxButton;

    public void loginButtonDirection(){
        closePopup.click();
        mainPageLoginButton.click();
    }

    public void registerButtonDirection(){
        closePopup.click();
        branchPageRegisterButton.click();
    }






    public void search(String searchText) {
        searchBox.sendKeys(searchText);
        searchBoxButton.click();
    }
}
