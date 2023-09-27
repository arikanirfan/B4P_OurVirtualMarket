package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.BasePage;
import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class positiveLogin_stepDefs {
    LoginPage loginPage= new LoginPage();
    BasePage basePage= new BasePage();


    @When("The user logged in by using {string} and {string}")
    public void The_user_logged_in_by_using_and(String email, String password) {
        Driver.get().get(ConfigurationReader.get("url"));
        basePage.loginButtonDirection();
        loginPage.login(email,password);
    }

    @Then("Verify that the user is on the home page")
    public void verify_that_the_user_is_on_the_home_page() {
      loginPage.verifyLogin();
    }


}
