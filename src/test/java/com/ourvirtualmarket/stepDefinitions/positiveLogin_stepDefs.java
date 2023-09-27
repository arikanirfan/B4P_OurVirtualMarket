package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.BasePage;
import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;

public class positiveLogin_stepDefs {
    LoginPage loginPage= new LoginPage();
    BasePage basePage= new BasePage();

    @Given("The user already logged in by using {string} and {string}")
    public void theUserAlreadyLoggedInByUsingAnd(String username, String password) throws InterruptedException {
        Driver.get().get(ConfigurationReader.get("url"));
        basePage.loginButtonDirection();
        loginPage.login(username,password);
    }
}
