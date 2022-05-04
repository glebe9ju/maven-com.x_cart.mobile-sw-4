package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SalePage extends Utility {
    By verifySale =By.xpath("//h1[@id='page-title']");
    By mousehoverOnSortBy = By.xpath("//span[@class='sort-by-label']");
    By clickNameAtoZ = By.xpath("//a[normalize-space()='Name A - Z']");
    //1.5 verify that product arrange alphabetically
    By clickPriceLowToHigh = By.xpath("//a[normalize-space()='Price Low - High']");
    //2.5 Verify that the product’s price arrange Low to High
    By clickOnRates = By.xpath("//a[normalize-space()='Rates']");
    //3.5 Verify that the product’s arrange Rates


    public String getVerifyTextSale(){
        return getTextFromElement(verifySale);
    }
    public void mouseHoverOnSortByOnSalePage(){
        mouseHoverToElement(mousehoverOnSortBy);
    }
    public void clickOnNameAToZ(){
        clickOnElement(clickNameAtoZ);
    }
    //***********************************************
    // 1.5 verify that product arrange alphabetically
    public void productArrangeALphabetically(){

    }
    //***********************************************
    public  void clickOnPriceLowToHigh(){
        clickOnElement(clickPriceLowToHigh);
    }
    //**********************************************
    //2.5 Verify that the product’s price arrange Low to High
    public void productsPriceArrangeLowtoHigh(){

    }
    //**************************************************
    public  void clickOnRates(){
        clickOnElement(clickOnRates);
    }
    //********************************************
    //3.5 Verify that the product’s arrange Rates
    public void productsArrangeRates(){

    }
    //*********************************************
}
