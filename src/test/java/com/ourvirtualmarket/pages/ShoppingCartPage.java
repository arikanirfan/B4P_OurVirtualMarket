package com.ourvirtualmarket.pages;


import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

    public void verifyProductAddedToCart(String productName){
        WebElement addedProductInTheShoppingCart = Driver.get().findElement(By.xpath("//td[contains(text()," +
                "'"+productName+"')]"));
        String actualProductNameInShoppingCart=productName;
        String expectedProductNameInShoppingCart=addedProductInTheShoppingCart.getText();
        Assert.assertTrue(expectedProductNameInShoppingCart.contains(actualProductNameInShoppingCart));
    }

//    //td[contains(text(),'Hisense 50A7100FTUK')]/..//input[@value='8']

    public void verifyProductNameAndQuantityInTheShoppingCart(String productName, String quantity){
        WebElement nameAndPriceInTheShoppingCart = Driver.get().findElement(By.xpath("//td[contains(text()," +
                "'" + productName + "')]/..//input[@value='" + quantity + "']"));
        String actualQuantity=nameAndPriceInTheShoppingCart.getAttribute("value");
        Assert.assertEquals(quantity,actualQuantity);
        System.out.println("actualQuantity = " + actualQuantity);
    }


}
