package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.BestSellerPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.pages.SalePage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealsTest extends TestBase {
    HomePage homePage = new HomePage();
    SalePage salePage = new SalePage();
    BestSellerPage bestSellerPage = new BestSellerPage();

    @Test
    public void verifySaleProductsArrangeAlphabetically(){
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mousehoverOnSaleLinkOnHomePage();
        homePage.clickOnSaleLinkOnHomePage();
        String expectedMessage = "Sale";
        String actualMessage = salePage.getVerifyTextSale();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
        salePage.mouseHoverOnSortByOnSalePage();
        salePage.clickOnNameAToZ();
        //1.5 verify that product arrange alphabetically
    }
    @Test
    public void verifySaleProductsPriceArrangeLowToHigh(){
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mousehoverOnSaleLinkOnHomePage();
        homePage.clickOnSaleLinkOnHomePage();
        String expectedMessage = "Sale";
        String actualMessage = salePage.getVerifyTextSale();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
        salePage.mouseHoverOnSortByOnSalePage();
        salePage.clickOnPriceLowToHigh();
        //2.5 Verify that the product’s price arrange Low to High
    }
    @Test
    public void verifySaleProductsArrangeByRates() {
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mousehoverOnSaleLinkOnHomePage();
        homePage.clickOnSaleLinkOnHomePage();
        String expectedMessage = "Sale";
        String actualMessage = salePage.getVerifyTextSale();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
        salePage.mouseHoverOnSortByOnSalePage();
        salePage.clickOnRates();
        //3.5 Verify that the product’s arrange Rates
    }
    @Test
    public void verifyBestSellersProductsArrangeByZToA(){
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mousehoverOnBestSellerLinkOnHomePageLink();
        homePage.clickOnBestSellerLinkOnHomePage();
        String expectedMessage = "Bestsellers";
        String actualMessage = bestSellerPage.getVerifyTextBestSeller();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
        bestSellerPage.mouseHoverOnSortByOnBestSellerPage();
        bestSellerPage.clickOnNameZToA();
        //1.5  Verify that the product arrange by Z to A
    }
    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() {
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mousehoverOnBestSellerLinkOnHomePageLink();
        homePage.clickOnBestSellerLinkOnHomePage();
        String expectedMessage = "Bestsellers";
        String actualMessage = bestSellerPage.getVerifyTextBestSeller();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
        bestSellerPage.mouseHoverOnSortByOnBestSellerPage();
        bestSellerPage.clickOnHighToLowinbestsellsrPage();
        //2.5 Verify that the product’s price arrange High to Low
    }
    @Test
    public void  verifyBestSellersProductsArrangeByRates() {
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        homePage.mousehoverOnBestSellerLinkOnHomePageLink();
        homePage.clickOnBestSellerLinkOnHomePage();
        String expectedMessage = "Bestsellers";
        String actualMessage = bestSellerPage.getVerifyTextBestSeller();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
        bestSellerPage.mouseHoverOnSortByOnBestSellerPage();
        bestSellerPage.clickOnRates();
        //3.5 Verify that the product’s arrange Rates
    }
}
