package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class BestSellerPage extends Utility {
    By verifyBestSeller = By.xpath("//h1[@id='page-title']");
    By mousehoverOnSortBy = By.xpath("//span[@class='sort-by-label']");
    By clickNameZtoA = By.xpath("//a[@data-sort-by='translations.name' and @data-sort-order='desc']");
    //1.5  Verify that the product arrange by Z to A
    //********************************************************
    By clickOnHighToLow = By.xpath("//a[normalize-space()='Price Low - High']");
   //2.5 Verify that the product’s price arrange High to Low
    By clickOnRates = By.xpath("//a[normalize-space()='Rates']");
    //3.5 Verify that the product’s arrange Rates
    By clickNameAtoZ = By.xpath(("//a[normalize-space()='Name A - Z']"));
    By mouseHoveronaddToCart = By.xpath("//img[contains(@alt,'iPhone 5S')]");
    By clickOnAddtoCart = By.xpath("//button[contains(@class,'regular-button add-to-cart product-add2cart productid-42')]");
    By verifyproductadded = By.xpath("//li[@class='info']");
    By clickOnXsign = By.xpath("//a[@title='Close']");
    By clickOnYourCart = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[5]/div[4]");
    // *********          error *****************/
    //By clickOnViewCart = By.xpath("//a[@class='regular-button cart']");
    By clickOnViewCart = By.xpath("//a[@class='regular-button cart']");
    By selectProduct = By.xpath("By.xpath(\"//span[contains(text(),'View cart')]\")");
    By verifyproductadded1 = By.xpath("//li[contains(text(),'Product has been added to your cart')]");
    By clickOnXsign1 = By.xpath("//body/div[@id='mm-0']/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/a[1] ");
    By clickOnYourCart1 = By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']");
    By clickOnViewCart1 = By.xpath("//span[contains(text(),'View cart')]");
    By verifyYourshoppingcart = By.xpath("//h1[@id='page-title']");
    By clickemptyYourCart = By.xpath("//a[contains(text(),'Empty your cart')]");
  //  By verifyAreYuSureToClearCart =
    By verifyDeleteFromCart = By.xpath(" //li[contains(text(),'Item(s) deleted from your cart')]\n");
    By verifyYourCartEmpty =By.xpath("(//h1[normalize-space()='Your cart is empty'])[1]");


    public String getVerifyTextBestSeller(){
        return getTextFromElement(verifyBestSeller);
    }
    public void mouseHoverOnSortByOnBestSellerPage(){
        mouseHoverToElement(mousehoverOnSortBy);
    }
    public void clickOnNameZToA(){
        clickOnElement(clickNameZtoA);
    }
    //***********************************************
    //1.5  Verify that the product arrange by Z to A
    public void productArrangeByZtoA(){

    }
    //***********************************************
    public void clickOnHighToLowinbestsellsrPage(){
        clickOnElement(clickOnHighToLow);
    }
    //****************************************************
    //2.5 Verify that the product’s price arrange High to Low
    public void productspriceArrangeHightoLow(){

    }
    //********************************************************
    public void clickOnRates(){
        clickOnElement(clickOnRates);
    }
    //***************************************************
    //3.5 Verify that the product’s arrange Rates
    public void productArrangeRateonBestSellerPage(){

    }
    //***************************************************
    public void clickOnNameAtoZ(){
        clickOnElement(clickNameAtoZ);
    }
    //********************************* Shopping Test ***************************************************************//
    public void mousehoverOnAddtocartOnBestSellerPage(){
        mouseHoverToElement(mouseHoveronaddToCart);
    }
    public void clickOnAddToCartOnBestsellerpage(){
        clickOnElement(clickOnAddtoCart);
    }
    public String verifyProductaddedInyourCartGreenbar(){
        return getTextFromElement(verifyproductadded);
    }
    public void clockOnXSignButton(){
        clickOnElement(clickOnXsign);
    }
    public void clickOnYourCartOnBestSellerPage(){
        clickOnElement(clickOnYourCart);
    }
    public void clickOnYourViewCartOnBestSellerPage(){
        clickOnElement(clickOnViewCart);
    }
    public void clickOnAddToCartandselectProduct(){
        clickOnElement(selectProduct);
    }
    public String verifyProductaddedInyourCartGreenbar2(){
        return getTextFromElement(verifyproductadded1);
    }
    public void clockOnXSignButton1(){
        clickOnElement(clickOnXsign1);
    }
    public void clickOnYourCart1(){
        clickOnElement(clickOnYourCart1);
    }
    public void clickOnViewCart1(){
        clickOnElement(clickOnViewCart1);
    }
    public String verifyYourShoppingCart(){

        return getTextFromElement(verifyYourshoppingcart);
    }
    public void clickOnEmptyYourcart(){
        clickOnElement(clickemptyYourCart);
    }
    public String verifydeletedFromYourCart(){
        return getTextFromElement(verifyDeleteFromCart);
    }
    public String verifyYourCartIsEmpty(){
        return getTextFromElement(verifyYourCartEmpty);
    }

}
