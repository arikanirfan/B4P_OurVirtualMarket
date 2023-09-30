package com.ourvirtualmarket.stepDefinitions;

import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.pages.SearchPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @When("The user navigates to back page")
    public void the_user_navigates_to_back_page() {
        Driver.get().navigate().back();
    }



    @Then("Verify that there is {string} name, {string} price and add to cart button")
    public void verify_that_there_is_name_price_and_add_to_cart_button(String productName, String productPrice) {
       searchPage.verifyProductName(productName);
       searchPage.verifyProductPrice(productPrice);
       searchPage.verifyAddToCartButtonIsDisplayed();
    }

    @When("The user selects {string} product")
    public void the_user_selects_product(String productName) {
        searchPage.clickProduct(productName);
    }

    @When("The user adds {string} units of the product to the cart")
    public void the_user_adds_units_of_the_product_to_the_cart(String quantity) {
     searchPage.inputQuantityOfProduct(quantity);
    }


}
