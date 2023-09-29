package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.BasePage;
import com.ourvirtualmarket.pages.RegisterAccountPage;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RegisterAccount_stepDefs {
    RegisterAccountPage registerAccountPage=new RegisterAccountPage();

    @Given("The user is on the homepage")
    public void The_user_is_on_the_homepage() {

        Driver.get().get(ConfigurationReader.get("url"));
    }


    @When("The user click the registration link")
    public void the_user_click_the_registration_link() {
        registerAccountPage.registerButtonDirection();
    }

    @Then("The user should see a register link")
    public void The_user_should_see_a_register_link() {
        WebElement registerLink = registerAccountPage.branchPageRegisterButton;
        assertTrue(registerLink.isDisplayed());

    }


    @Then("The user should be on the registration page")
    public void the_user_should_be_on_the_registration_page() {
        String currentUrl = Driver.get().getCurrentUrl();
        assertTrue(currentUrl.contains("register"));
    }

    @Given("The user is on the registration page")
    public void the_user_is_on_the_registration_page() {
        Driver.get().get("https://ourvirtualmarket.com/index.php?route=account/register");
    }


    @When("The user fill in all necessary registration fields")
    public void the_user_fill_in_all_necessary_registration_fields() throws InterruptedException {
        registerAccountPage.registerAccountForm("Emily","QAEMİLY","emily@gmail.com","05550102030","emily12345","emily12345");
        Thread.sleep(5);
    }


    @When("The user accept the Privacy Policy")
    public void the_user_accept_the_privacy_policy() throws InterruptedException {
     registerAccountPage.privacyPolicyCheckbox.click();
        Thread.sleep(5);
    }

    @When("The user click the Continue button")
    public void the_user_click_the_continue_button() throws InterruptedException {
        registerAccountPage.clickContinueButton();
        Thread.sleep(5);

    }



    @Then("The user should see a success message")
    public void the_user_should_see_a_success_message() throws InterruptedException {
       // String registerTitle = Driver.get().getTitle();
        //Assert.assertTrue(registerTitle.contains("success"));
        assertTrue(registerAccountPage.successMessage.isDisplayed());

    }


    @When("The user click the Continue button without filling necessary fields")
    public void the_user_click_the_continue_button_without_filling_necessary_fields() {
        registerAccountPage.clickContinueButton();
    }


    @Then("The user should see warning messages")
    public void the_user_should_see_warning_messages() {
       // String currentUrl = Driver.get().getCurrentUrl();
        //assertEquals(currentUrl,"Your Account Has Been Created!");
        registerAccountPage.warningMessages();
    }

    @When("The user do not accept the Privacy Policy")
    public void the_user_do_not_accept_the_privacy_policy() {

    }


    @Then("The user should see a warning message about Privacy Policy acceptance")
    public void the_user_should_see_a_warning_message_about_privacy_policy_acceptance() {

    }


    @When("The user enter a First Name that is too long")
    public void the_user_enter_a_first_name_that_is_too_long() {

    }
    @Then("The user should see a warning message about First Name length")
    public void the_user_should_see_a_warning_message_about_first_name_length() {

    }


    @When("The user enter a Last Name that is too long")
    public void the_user_enter_a_last_name_that_is_too_long() {

    }


    @Then("The user should see a warning message about Last Name length")
    public void the_user_should_see_a_warning_message_about_last_name_length() {

    }


    @When("The user enter an invalid Email Address")
    public void the_user_enter_an_invalid_email_address() {

    }


    @Then("The user should see a warning message about Email Address format")
    public void the_user_should_see_a_warning_message_about_email_address_format() {

    }



    @When("The user enter a Telephone Number that is too long")
    public void the_user_enter_a_telephone_number_that_is_too_long() {

    }


    @Then("The user should see a warning message about Telephone Number length")
    public void the_user_should_see_a_warning_message_about_telephone_number_length() {

    }



    @Given("The user am on the registration page")
    public void the_user_am_on_the_registration_page() {

    }


    @When("The user enter a Password that is too short")
    public void the_user_enter_a_password_that_is_too_short() {

    }


    @Then("The user should see a warning message about Password length")
    public void the_user_should_see_a_warning_message_about_password_length() {

    }







































}
