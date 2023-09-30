package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.By;

public class CheckoutPage extends BasePage{

    public String getMenuTitle(String menuTitle){
        return Driver.get().findElement(By.xpath("//a[text()='"+menuTitle+" ']")).getText();
    }
}





