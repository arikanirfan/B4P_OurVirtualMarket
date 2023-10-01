package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.CheckoutPage;
import com.ourvirtualmarket.pages.SearchPage;
import com.ourvirtualmarket.pages.ShoppingCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCart_stepDefs {

    SearchPage searchPage= new SearchPage();
    ShoppingCartPage shoppingCartPage= new ShoppingCartPage();

    @Then("Verify that {string} has been added to cart")
    public void verify_that_has_been_added_to_cart(String productName) {
     searchPage.hoverToMyCartButton();
     searchPage.clickToViewCartButton();
     shoppingCartPage.verifyProductAddedToCart(productName);
    }

    @When("The user navigates to Shopping Cart page")
    public void the_user_navigates_to_shopping_cart_page() {
        searchPage.hoverToMyCartButton();
        searchPage.clickToViewCartButton();
    }

    @Then("The user should see {string} on the page previously added")
    public void the_user_should_see_on_the_page_previously_added(String productName) {
        shoppingCartPage.verifyProductAddedToCart(productName);
    }

    @Then("The user should see the {string} button on the Shopping cart page")
    public void the_user_should_see_the_button_on_the_shopping_cart_page(String buttonName) {
        shoppingCartPage.verifyCheckoutButton(buttonName);
    }

    @When("The user clicks on the CHECKOUT button")
    public void the_user_clicks_on_the_checkout_button() {
        shoppingCartPage.clickTheCheckoutBtn();
    }
}
