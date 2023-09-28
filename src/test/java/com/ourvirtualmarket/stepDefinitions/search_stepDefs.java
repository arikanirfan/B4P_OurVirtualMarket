package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.BasePage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class search_stepDefs {

    BasePage basePage = new BasePage();


    @When("The user search {string}")
    public void the_user_search(String string){
        BrowserUtils.waitFor(1);
        basePage.search(string);
        BrowserUtils.waitFor(1);
    }
}
