package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.BasePage;
import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class negativeLogin_stepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.loginButtonDirection();
    }
    @When("The user enter {string} and {string} and click the login button")
    public void the_user_enter_and_and_click_the_login_button(String username, String password){
        loginPage.waitForElement(By.id("email"));
        loginPage.login(username,password);
    }

    @Then("The user should get a {string}")
    public void the_user_should_get_a(String message) {
        loginPage.waitForElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
        Assert.assertEquals(loginPage.loginErrorMessage.getText(),message);
    }
}
