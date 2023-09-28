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
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class RegisterAccount_stepDefs {
    RegisterAccountPage registerAccountPage=new RegisterAccountPage();

    @Given("The user is on the homepage")
    public void The_user_is_on_the_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("The user should see a register link")
    public void The_user_should_see_a_register_link() {
        WebElement registerLink = registerAccountPage.branchPageRegisterButton;
        assertTrue(registerLink.isDisplayed());

    }

    @When("The user click the registration link")
    public void the_user_click_the_registration_link() {
       registerAccountPage.registerButtonDirection();
    }
    @Then("The user should be on the registration page")
    public void the_user_should_be_on_the_registration_page() {
        String currentUrl = Driver.get().getCurrentUrl();
        assertTrue(currentUrl.contains("register"));
    }

    @When("The user enter  credentials")
    public void the_user_enter_credentials() {
       registerAccountPage.registerAccountForm("Emily","QAEMİLY","emily@gmail.com","05550102030","emily12345","emily12345");

    registerAccountPage.clickContinueButton();
    }

    @When("The user click the Continue button")
    public void the_user_click_the_continue_button() {
        registerAccountPage.clickContinueButton();

    }

    @Then("The user should see a confirmation message")
    public void the_user_should_see_a_confirmation_message() {
      registerAccountPage.verifyConfirmationMessage();
    }






}
