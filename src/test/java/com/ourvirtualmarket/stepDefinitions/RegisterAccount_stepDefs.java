package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.BasePage;
import com.ourvirtualmarket.pages.RegisterAccountPage;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class RegisterAccount_stepDefs {
    RegisterAccountPage registerAccountPage=new RegisterAccountPage();

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @Then("I should see a register link")
    public void i_should_see_a_register_link() {
        WebElement registerLink = registerAccountPage.branchPageRegisterButton;
        assertTrue(registerLink.isDisplayed());

    }



}
