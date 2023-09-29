package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.pages.SearchPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_stepDefs {

    LoginPage loginPage = new LoginPage();
    SearchPage searchPage= new SearchPage();

    @When("The user search {string}")
    public void the_user_search(String string){
        BrowserUtils.waitFor(1);
        loginPage.search(string);
        BrowserUtils.waitFor(1);
    }


    @Then("Verify that the user is able to see product name as {string}")
    public void verify_that_the_user_is_able_to_see_product_name_as(String searchedProductName) {
        searchPage.verifySearchedProductName(searchedProductName);
    }

    @When("The user adds {string} to cart")
    public void the_user_adds_to_cart(String productName) {
        searchPage.clickProduct(productName);
        searchPage.AddToCart();
        searchPage.closePopUpAfterClickAddToCartButton();
    }



}
