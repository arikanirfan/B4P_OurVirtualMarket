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

    @Then("The user should see {string} units of {string} product in the cart")
    public void the_user_should_see_units_of_product_in_the_cart(String quantity, String productName) {
       shoppingCartPage.hoverToMyCartButton();
       shoppingCartPage.clickToViewCartButton();
       shoppingCartPage.verifyProductNameAndQuantityInTheShoppingCart(productName,quantity);
    }






}
