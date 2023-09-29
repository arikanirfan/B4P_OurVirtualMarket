package com.ourvirtualmarket.stepDefinitions;
import com.ourvirtualmarket.pages.ContactUsPage;
import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class contactUs_stepDefs {
   ContactUsPage contactUsPage =new ContactUsPage();


    @When("The user click on the Contact Us link at the bottom of the Home page.")
    public void the_user_click_on_the_link_at_the_bottom_of_the_home_page() {

        contactUsPage.setContactUsButton();
    }

    @Then("The user must see the Contact Form header")
    public void the_user_must_see_the_contact_form_header() {
        String expected = "CONTACT FORM";
        String actual = contactUsPage.contactFormTitle.getText();
        Assert.assertEquals(expected, actual);
    }

    @When("Enter {string} in the inquiry field")
    public void enter_in_the_inquiry_field(String string) {
       contactUsPage.setContactFormTitle(string);
    }

    @Then("Validate that warning {string} appears")
    public void validate_that_warning_appears(String string) {
       String expectedMessage = string;
       String actualMessage = contactUsPage.positiveMessage.getText();
       Assert.assertEquals(expectedMessage,actualMessage);

    }

    @When("Enter {string}")
    public void enter(String enquiry) {
        contactUsPage.setContactFormTitle(enquiry);
    }

    @When("Tap on SubmitButton")
    public void tap_on_submit_button() {
        contactUsPage.setEnquiryFormSubmitButton();
    }

    @Then("Validate that warning {string}")
    public void validate_that_warning(String string) {
        String expectedMessage = string;
        String actualMessage = contactUsPage.boundaryMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }
}
