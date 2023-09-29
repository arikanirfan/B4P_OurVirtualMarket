package com.ourvirtualmarket.pages;


import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends BasePage{

    public void verifyProductAddedToCart(String productName){
        WebElement addedProductInTheShoppingCart = Driver.get().findElement(By.xpath("//td[contains(text()," +
                "'"+productName+"')]"));
        String actualProductNameInShoppingCart=productName;
        String expectedProductNameInShoppingCart=addedProductInTheShoppingCart.getText();
        Assert.assertTrue(expectedProductNameInShoppingCart.contains(actualProductNameInShoppingCart));
    }


}
