package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.CheckoutBillingDetailsPage;
import com.ourvirtualmarket.pages.CheckoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckoutBillingDetails_stepDefs {
   CheckoutPage checkoutPage=new CheckoutPage();
   CheckoutBillingDetailsPage checkoutBillingDetailsPage=new CheckoutBillingDetailsPage();

    @Then("The user should be able to see {string} menu")
    public void the_user_should_be_able_to_see_menu(String MenuTitle) {
        String actualMenuTitle = checkoutPage.getMenuTitle(MenuTitle);
        String expectedMenuTitle = MenuTitle;
        Assert.assertEquals(expectedMenuTitle, actualMenuTitle);
    }

    @When("If the user sees the form,fills it out with {string},{string},{string},{string},{string},{string},{string},{string},{string};if not,chooses existing address")
    public void ıf_the_user_sees_the_form_fills_it_out_with_if_not_chooses_existing_address(String firstname, String lastname, String company, String address1,String address2, String city, String postcode, String country, String region) {
        checkoutBillingDetailsPage.billingDetails(firstname,lastname,company,address1,address2,city,postcode,country,region);
    }

    @When("The user taps on CONTINUE button")
    public void the_user_taps_on_contınue_button() {
        checkoutBillingDetailsPage.clickTheContinueBtn();
    }

    @When("If the user sees the form,fills it out with {string},{string},{string},{string},{string},{string},{string},{string},{string};if not,chooses new address")
    public void ıf_the_user_sees_the_form_fills_it_out_with_if_not_chooses_new_address(String firstname, String lastname, String company, String address1,String address2, String city, String postcode, String country, String region){
         checkoutBillingDetailsPage.billingDetailsForNegativeTest(firstname,lastname,company,address1,address2,city,postcode,country,region);
    }

    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String expectedMessage) {
        String actualMessage=checkoutBillingDetailsPage.getWarningMessageText(expectedMessage);
        Assert.assertEquals(expectedMessage,actualMessage);
    }

}