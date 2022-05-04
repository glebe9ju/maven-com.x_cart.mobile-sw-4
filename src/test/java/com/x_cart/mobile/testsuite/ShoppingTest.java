package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    HomePage homePage = new HomePage();
    BestSellerPage bestSellerPage = new BestSellerPage();
    ShoppingPage shoppingPage = new ShoppingPage();
    LogInPage logInPage = new LogInPage();
    SecureCheckOutPage secureCheckOutPage = new SecureCheckOutPage();

    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        homePage.mouseHoverOnHotDealLinkOnHomePage();
        // 1.2 Mouse hover on the “Bestsellers”  link and click
        homePage.mousehoverOnBestSellerLinkOnHomePageLink();
        homePage.clickOnBestSellerLinkOnHomePage();
        // 1.3 Verify the text “Bestsellers”
        String expectedMessage = "Bestsellers";
        String actualMessage = bestSellerPage.getVerifyTextBestSeller();
        Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
       // 1.4 Mouse hover on “Sort By” and select “Name A-Z”
        bestSellerPage.mouseHoverOnSortByOnBestSellerPage();
        bestSellerPage.clickOnNameAtoZ();
       // 1.5 Click on “Add to cart” button of the product “IPhone SE”
        Thread.sleep(2000);
        bestSellerPage.mousehoverOnAddtocartOnBestSellerPage();
        bestSellerPage.clickOnAddToCartOnBestsellerpage();
        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        String expectedMessage1 = "Product has been added to your cart";
        String actualMessage1 = bestSellerPage.verifyProductaddedInyourCartGreenbar();
        Assert.assertEquals(expectedMessage1, actualMessage1, "Can not match with Valid Text");
        //1.7 Click on X sign to close the message
        bestSellerPage.clockOnXSignButton();
       //1.8 Click on “Your cart” icon and Click on “View cart” button
        Thread.sleep(1000);
        bestSellerPage.clickOnYourCartOnBestSellerPage();
          //*****  error  *****//
        bestSellerPage.clickOnYourViewCartOnBestSellerPage();
        /***********************************************************************************************/
       // 1.9 Verify the text “Your shopping cart - 1 item”
        String expectedMessage2 = "Your shopping cart - 1 item";
        String actualMessage2 = shoppingPage.verifyYourShoppingCart1();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Can not match with Valid Text");
        // 1.10 Verify the Subtotal $299.00
//       String expectedMessage3 = "$299.00";
//        String actualMessage3 = shoppingPage.verifySubTotal();
//        Assert.assertEquals(expectedMessage3, actualMessage3, "Can not match with Valid Text");
//        //  1.11 Verify the total $106.23
//        String expectedMessage4 = "$311.03";
//        String actualMessage4 = shoppingPage.verifyTotal();
//        Assert.assertEquals(expectedMessage4, actualMessage4, "Can not match with Valid Text");
       // 1.12 Click on “Go to checkout” button
       shoppingPage.goToCheckOutButtononshoppingpage();
//        //**************************************************************************************************/
//        //  1.13 Verify the text “Log in to your account”
//        String expectedMessage5 = "Log in to your account";
//        String actualMessage5 = logInPage.VerifyLogInYouAccountonLogInpage();
//        Assert.assertEquals(expectedMessage4, actualMessage4, "Can not match with Valid Text");*/
        //  1.14 Enter Email address
        logInPage.enteremailAddressinLoginPage("prime123@gmail.com");
        // 1.15 Click on “Continue” Button
       logInPage.clickOnTheContinueButton();
        //1.16 Verify the text “Secure Checkout”
       Assert.assertEquals("Secure Checkout", secureCheckOutPage.verifySecureCheckOutPageOnSecurePage());
        // 1.17 Fill all the mandatory fields
        secureCheckOutPage.enterFirstNameOnSecureCheckOutPage("Daniel");
        secureCheckOutPage.enterLastNameOnSecureCheckOutPage("Mark");
        secureCheckOutPage.enterAddressOnSecureCheckOutPage("RedFort");
        secureCheckOutPage.enterCityOnSecureCheckOutPage("Manchester");
        secureCheckOutPage.enterCountryCodeOnSecureCheckOutPage("Denmark");
        secureCheckOutPage.enterStateOnSecureCheckOutPage("Watford");
        secureCheckOutPage.enterZipCodeOnSecureCheckOutPage("AB12 34CD");
        secureCheckOutPage.enteremailOnSecureCheckOutPage("daniel123@yahoo.com");
        // 1.18 Check the check box “Create an account for later use”
        //  1.19 Enter the password
        //1.20 Select the Delivery Method to “Local Shipping”
        secureCheckOutPage.clickOnLocalShippingonSecurePage();
        //  1.21 Select Payment Method “COD”
        secureCheckOutPage.clickOnPaymentMethodOnSecurePage();
        //  1.22 Verify the total $311.03.00
        String expectedMessage3 = " $311.03.00";
        String actualMessage3 = secureCheckOutPage.verify311TotalText();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Can not match with Valid Text");
        //  1.23 Click on “Place Order” Button
         secureCheckOutPage.clickOnPlaceOrderOnSecurePage();
        //  1.24 Verify the text “Thank you for your order”
        String expectedMessage4 = "Thank you for your order";
        String actualMessage4= secureCheckOutPage.verifyThankyouforYourorder();
        Assert.assertEquals(expectedMessage2, actualMessage2, "Can not match with Valid Text");


    }
       @Test
        public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException{
         //1.1 Mouse hover on the “Hot deals” link
           homePage.mouseHoverOnHotDealLinkOnHomePage();
         //1.2 Mouse hover on the “Bestseller”  link and click
           homePage.mousehoverOnBestSellerLinkOnHomePageLink();
           homePage.clickOnBestSellerLinkOnHomePage();
           //1.3 Verify the text “Bestsellers”
           String expectedMessage = "Bestsellers";
           String actualMessage = bestSellerPage.getVerifyTextBestSeller();
           Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
          //1.4 Mouse hover on “Sort By” and select “Name A-Z”
           bestSellerPage.mouseHoverOnSortByOnBestSellerPage();
           bestSellerPage.clickOnNameAtoZ();
           //1.5 Click on “Add to cart” button of the product “Vinyl Idolz: Ghostbusters”
          Thread.sleep(1000);
           bestSellerPage.clickOnAddToCartandselectProduct();
           //1.6 Verify the message “Product has been added to your cart” display in  green bar
           bestSellerPage.verifyProductaddedInyourCartGreenbar2();
           //1.7 Click on X sign to close the message
          bestSellerPage.clockOnXSignButton1();
          //1.8 Click on “Your cart” icon and Click on “View cart” button
           bestSellerPage.clickOnYourCart1();
           bestSellerPage.clickOnViewCart1();
           //1.9 Verify the text “Your shopping cart - 1 item”#
           bestSellerPage.verifyYourShoppingCart();
           //1.10 Click on “Empty your cart” link
           bestSellerPage.clickOnEmptyYourcart();
           //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
           //1.12 Click “Ok” on alert
           acceptAlert();
           //1.13 Verify the message “Item(s) deleted from your cart”
           String expectedMessage1 = "Item(s) deleted from your cart";
           String actualMessage1 = bestSellerPage.verifydeletedFromYourCart();
           Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");
           //1.15 Verify the text “Your cart is empty”
           String expectedMessage2 = "Your cart is empty";
           String actualMessage2 = bestSellerPage.verifyYourCartIsEmpty();
           Assert.assertEquals(expectedMessage, actualMessage, "Can not match with Valid Text");

       }
}
