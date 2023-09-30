package com.ourvirtualmarket.pages;


import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

    @FindBy(xpath = "//td[contains(text(),'"+itemName+"')]")
    public WebElement productNameInShoppingCart;

    public void verifyProductAddedToCart(String productName){
        WebElement addedProductInTheShoppingCart = Driver.get().findElement(By.xpath("//td[contains(text()," +
                "'"+productName+"')]"));
        String actualProductNameInShoppingCart=productName;
        String expectedProductNameInShoppingCart=addedProductInTheShoppingCart.getText();
        Assert.assertTrue(expectedProductNameInShoppingCart.contains(actualProductNameInShoppingCart));
    }


    public void verifyProductNameAndQuantityInTheShoppingCart(String productName, Integer quantity){
        WebElement nameAndPriceInTheShoppingCart = Driver.get().findElement(By.xpath("//td[contains(text()," +
                "'" + productName + "')]/..//input[@value='" + quantity + "']"));
        Integer actualQuantity=nameAndPriceInTheShoppingCart.getAttribute("value"
    }


}
