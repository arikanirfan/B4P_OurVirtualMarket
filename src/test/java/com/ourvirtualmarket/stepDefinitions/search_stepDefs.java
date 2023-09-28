package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.BasePage;
import io.cucumber.java.en.When;

public class search_stepDefs {

    BasePage basePage = new BasePage();

    @When("The user search {string}")
    public void the_user_search(String string) throws InterruptedException {
      // Thread.sleep(2000);
        basePage.search("TV");
    }
}
