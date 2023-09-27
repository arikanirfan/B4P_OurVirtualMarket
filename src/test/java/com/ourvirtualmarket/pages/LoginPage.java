package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
/*Çok sık login test yaparsanız "Warning: Your account has exceeded allowed number of login attempts.
Please try again in 1 hour."
hatası verir.

*/
public class LoginPage extends BasePage{

    @FindBy(id ="email")
    public WebElement emailInputBox;

    @FindBy(id ="pass")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    public WebElement loginErrorMessage;

    public void login(String username, String password){
        BrowserUtils.clickWithJS(emailInputBox);
        emailInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }

    public void waitForElement(By element){
        WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void verifyLogin(){
        Assert.assertTrue(logoutButton.getText().contains("Logout"));
    }
}
