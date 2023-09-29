package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PositiveLogin_stepDefs {
    LoginPage loginPage= new LoginPage();

    @When("The user logged in with {string} and {string}")
    public void The_user_logged_in_with(String email, String password) {
        loginPage.login(email,password);
    }

    @Then("Verify that the user successfully logged in")
    public void verify_that_the_user_successfully_logged_in() {
      loginPage.verifyLogin();
    }


    @Given("User already logged in with {string} and {string}")
    public void User_already_logged_in_with(String email, String password) {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.loginButtonDirection();
        loginPage.login(email,password);
        loginPage.verifyLogin();
    }

    }
