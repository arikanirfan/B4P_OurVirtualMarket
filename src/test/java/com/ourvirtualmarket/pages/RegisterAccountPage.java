package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

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

    @FindBy(xpath = "//div[@id='content']/h1")
    public WebElement  successMessage;

    @FindBy(xpath = "(//div[@class='text-danger'])[1]")
    public WebElement  firstNameMessage;

    @FindBy(xpath = "(//div[@class='text-danger'])[2]")
    public WebElement   lastNameMessage;

    @FindBy(xpath = "(//div[@class='text-danger'])[3]")
    public WebElement emailMessage ;

    @FindBy(xpath = "(//div[@class='text-danger'])[4]")
    public WebElement  telephoneMessage;

    @FindBy(xpath = "(//div[@class='text-danger'])[5]")
    public WebElement  passwordMessage;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement  successContinue;


    public void registerAccountForm(String userFirstName, String userLastName,String userEmail, String userTelephone,String userPassword, String userPasswordConfirm){
        BrowserUtils.clickWithJS(firstName);
        firstName.sendKeys(userFirstName);
        lastName.sendKeys(userLastName);
        eMail.sendKeys(userEmail);
        telephone.sendKeys(userTelephone);
        password.sendKeys(userPassword);
        passwordConfirm.sendKeys(userPasswordConfirm);
        //BrowserUtils.clickWithJS(subScribeYesButton);
        //subScribeYesButton.click();
       // BrowserUtils.clickWithJS(privacyPolicyCheckbox);
        //privacyPolicyCheckbox.click();

    }
    public void clickContinueButton(){
        BrowserUtils.clickWithJS(continueButton);
        //continueButton.click();
    }

    public void verifyConfirmationMessage(){
        //String expected="Your Account Has Been Created!";
        //String actual= Driver.get().confirmationMessage.getText();
        //Assert.assertEquals(expected,actual);
        String messageText =successMessage.getText();
        Assert.assertEquals("Your Account Has Been Created!",messageText);

    }

    public void warningMessages(){
        assertTrue(firstNameMessage.isDisplayed());
        assertTrue(lastNameMessage.isDisplayed());
        assertTrue(emailMessage.isDisplayed());
        assertTrue(telephoneMessage.isDisplayed());
        assertTrue(passwordMessage.isDisplayed());


    }










}
