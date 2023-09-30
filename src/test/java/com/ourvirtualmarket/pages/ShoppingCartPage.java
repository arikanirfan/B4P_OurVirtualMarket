package com.ourvirtualmarket.pages;


import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement checkoutButton;

    public void verifyProductAddedToCart(String productName){
        WebElement addedProductInTheShoppingCart = Driver.get().findElement(By.xpath("//td[contains(text()," +
                "'"+productName+"')]"));
        String expectedProductNameInShoppingCart=productName;
        String actualProductNameInShoppingCart=addedProductInTheShoppingCart.getText();
        Assert.assertTrue(actualProductNameInShoppingCart.contains(expectedProductNameInShoppingCart));
    }

   public void verifyCheckoutButton(String checkoutBtn){
        String actualCheckoutBtn=checkoutButton.getText();
        String expectedCheckoutBtn=checkoutBtn;
        Assert.assertEquals(expectedCheckoutBtn,actualCheckoutBtn);
   }

   public void clickTheCheckoutBtn(){
       BrowserUtils.clickWithJS(checkoutButton);
       BrowserUtils.waitFor(2);
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
