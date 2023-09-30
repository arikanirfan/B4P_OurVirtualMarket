package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(css = "#input-search")
    public WebElement searchResult;

    @FindBy(css = "#button-cart")
    public WebElement addToCartButton;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement closePopUpAfterAddToCart;


    public void clickProduct(String itemName) {
        WebElement productName = Driver.get().findElement(By.xpath("//div[@class='product-image-container']" +
                "/./a[contains(@title,'" + itemName + "')]"));
        BrowserUtils.scrollToElement(productName);
        BrowserUtils.clickWithJS(productName);
    }

    public void verifySearchedProductName(String searchedProductName) {
        BrowserUtils.waitFor(1);
        String actualSearchedProduct = searchResult.getAttribute("value");
        String expectedSearchedProduct = searchedProductName;
        Assert.assertEquals(expectedSearchedProduct, actualSearchedProduct);
    }

    public void AddToCart(){
        BrowserUtils.clickWithJS(addToCartButton);
    }

    public void closePopUpAfterClickAddToCartButton(){
        BrowserUtils.clickWithJS(closePopUpAfterAddToCart);
    }






}
