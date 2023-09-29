package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.SearchPage;
import com.ourvirtualmarket.pages.ShoppingCartPage;
import io.cucumber.java.en.Then;

public class ShoppingCart_stepDefs {

    SearchPage searchPage= new SearchPage();
    ShoppingCartPage shoppingCartPage= new ShoppingCartPage();

    @Then("Verify that {string} has been added to cart")
    public void verify_that_has_been_added_to_cart(String productName) {
     searchPage.hoverToMyCartButton();
     searchPage.clickToViewCartButton();
     shoppingCartPage.verifyProductAddedToCart(productName);
    }



}
