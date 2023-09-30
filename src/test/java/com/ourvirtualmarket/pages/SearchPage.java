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

    @FindBy(xpath = "//div[@class='title-product']/./h1")
    public WebElement productNameInProductDetails;

    @FindBy(xpath = "//span[@id='price-old']")
    public WebElement productPriceInProductDetails;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantityInputBox;



    public void clickProduct(String itemName) {
        WebElement productName = Driver.get().findElement(By.xpath("//div[@class='product-image-container']" +
                "/./a[contains(@title,'" + itemName + "')]"));
        BrowserUtils.scrollToElement(productName);
        BrowserUtils.clickWithJS(productName);
    }

    public void verifySearchedProductName(String searchedProductName) {
        BrowserUtils.waitFor(1);
        String expectedSearchedProduct = searchResult.getAttribute("value");
        String actualSearchedProduct = searchedProductName;
        Assert.assertEquals(expectedSearchedProduct, actualSearchedProduct);
    }

    public void AddToCart(){
        BrowserUtils.clickWithJS(addToCartButton);
    }

    public void closePopUpAfterClickAddToCartButton(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(closePopUpAfterAddToCart);
    }

    public void verifyProductName(String productName){
        String actualProductName= productNameInProductDetails.getText();
        Assert.assertTrue(actualProductName.contains(productName));
    }

    public void verifyProductPrice(String productPrice){
        String actualProductPrice=productPriceInProductDetails.getText();
        Assert.assertEquals(productPrice,actualProductPrice);
    }

    public void verifyAddToCartButtonIsDisplayed(){
        Assert.assertTrue(addToCartButton.isDisplayed());
    }

    public void inputQuantityOfProduct(Integer quantity){
        quantityInputBox.clear();
        quantityInputBox.sendKeys(String.valueOf(quantity));
    }



}
