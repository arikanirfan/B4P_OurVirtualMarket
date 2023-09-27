package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "popup-close")
    public WebElement closePopup;

    @FindBy(className = "link-lg")
    public WebElement mainPageLoginButton;

    public void loginButtonDirection(){
        closePopup.click();
        mainPageLoginButton.click();
    }
}
