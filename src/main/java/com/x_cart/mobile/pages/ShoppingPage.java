package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingPage extends Utility {
    By verifyYourcart1 = By.xpath("//h1[@id='page-title']");
    By verifySubTotal = By.xpath("//ul[@class='sums']//span[@class='part-decimal'][normalize-space()='00']");
    By verifyTotal = By.xpath("//span[contains(text(),'311')]");
    By goToCheckoutButton = By.xpath("//button[contains(@class,'regular-button regular-main-button checkout')]");


    public String verifyYourShoppingCart1(){
        return getTextFromElement(verifyYourcart1);
    }
    public String verifySubTotal(){
        return getTextFromElement(verifySubTotal);
    }
    public String verifyTotal(){
        return getTextFromElement(verifyTotal);
    }
    public void goToCheckOutButtononshoppingpage(){
        clickOnElement(goToCheckoutButton);
    }

}
