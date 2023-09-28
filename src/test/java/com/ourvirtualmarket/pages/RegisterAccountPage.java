package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterAccountPage extends BasePage{

    @FindBy(id= "input-firstname")
    public WebElement firstName;

    @FindBy(xpath= "//input[@id='input-lastname']")
    public WebElement lastName;

    @FindBy(xpath= "//input[@id='input-email']")
    public WebElement eMail;

    @FindBy(xpath= "//input[@id='input-telephone']")
    public WebElement telephone;

    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement password;

    @FindBy(xpath= "//input[@id='input-confirm']")
    public WebElement passwordConfirm;

    @FindBy(xpath= "(//input[@type='radio'])[2]")
    public WebElement subScribeYesButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement privacyPolicyCheckbox;

    @FindBy(css = "[value='Continue']")
    public WebElement continueButton;


    public void registerAccountForm(String userFirstName, String userLastName,String userEmail, String userTelephone,String userPassword, String userPasswordConfirm){
        BrowserUtils.clickWithJS(firstName);
        firstName.sendKeys(userFirstName);
        lastName.sendKeys(userLastName);
        eMail.sendKeys(userEmail);
        telephone.sendKeys(userTelephone);
        password.sendKeys(userPassword);
        passwordConfirm.sendKeys(userPasswordConfirm);
        BrowserUtils.clickWithJS(subScribeYesButton);
        //subScribeYesButton.click();
        BrowserUtils.clickWithJS(privacyPolicyCheckbox);
        //privacyPolicyCheckbox.click();
        BrowserUtils.clickWithJS(continueButton);
        //continueButton.click();
    }





}
