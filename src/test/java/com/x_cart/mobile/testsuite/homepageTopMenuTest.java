package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homepageTopMenuTest extends TestBase {

    HomePage homePage = new HomePage();
    ShippingPage shippingPage = new ShippingPage();
    NewPage newPage = new NewPage();
    ComingSoonPage comingSoonPage = new ComingSoonPage();
    ContactUsPage contactUsPage = new ContactUsPage();

    @Test
    public void verifyUserShouldNavigateToShippingPageSuccessfully(){
        homePage.clickOnShippingLink();
        String expectedMessage = "Shipping";
        String actualMessage = shippingPage.getVerifyTextShipping();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
    @Test
    public void verifyUserShouldNavigateToNewPageSuccessfully(){
        homePage.clickOnNewLink();
        String expectedMessage = "New arrivals";
        String actualMessage = newPage.getVerifyTextNew();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
    @Test
    public void verifyUserShouldNavigateToComingsoonPageSuccessfully(){
        homePage.clickOnComingSoonLink();
        String expectedMessage = "Coming soon";
        String actualMessage = comingSoonPage.getVerifyTextComingSoon();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
    @Test
    public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
        homePage.clickOnContactUsLink();
        String expectedMessage = "Contact us";
        String actualMessage = contactUsPage.getVerifyTextContactUs();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
    }
}
