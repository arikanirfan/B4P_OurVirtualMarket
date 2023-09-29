package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {

    @FindBy(xpath = "(//a[text()='Contact Us'])[2]")
    public WebElement contactUsButton;

    @FindBy(xpath = "//h2[text()='Contact Form ']")
    public WebElement contactFormTitle;

    @FindBy(css = "#input-enquiry")
    public WebElement enquiryForm;

    @FindBy(css = "[class='btn btn-info']>span")
    public WebElement submitButton;

    @FindBy(css = "#content p")
    public WebElement positiveMessage;

    @FindBy(xpath = "//div[text()='Enquiry must be between 10 and 3000 characters! ']")
    public WebElement boundaryMessage;

    public void setEnquiryFormSubmitButton(){
        BrowserUtils.clickWithJS(submitButton);
    }

    public void setContactFormTitle(String string){
        enquiryForm.sendKeys(string);
    }

    public void setContactUsButton(){
        BrowserUtils.clickWithJS(contactUsButton);
            }




}