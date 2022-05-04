package com.x_cart.mobile.pages;

import com.x_cart.mobile.utility.Utility;
import org.openqa.selenium.By;

public class SecureCheckOutPage extends Utility {
    By verifySecureCheckOut = By.xpath("//h1[@class='title']");
    By enterFIrstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By enterLastName = By.xpath("//input[@id='shippingaddress-lastname']") ;
    By enteraddress =By.xpath("//input[@id='shippingaddress-street']") ;
    By enterCity =By.xpath("//input[@id='shippingaddress-city']") ;
    By entercountryCode =By.xpath("//select[@id='shippingaddress-country-code']") ;
    By enterState =By.xpath("//input[@id='shippingaddress-custom-state']") ;
    By enterZipCode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By enteremail = By.xpath("//input[@id='email']");
    By clickOnLocalShipping = By.xpath("//input[@id='method128']");
    By clickOnPaymentMethod = By.xpath("//input[@id='pmethod6']");
    By verify311total = By.xpath("//div[@class='total clearfix']//span[@class='part-prefix'][normalize-space()='$']");
    By clickOnPlaceOrder = By.xpath("//span[normalize-space()='Place order: $311.03']");
    By verifyThankyouforYourorder = By.xpath("//h1[@id='page-title']");

    public String verifySecureCheckOutPageOnSecurePage(){
        return getTextFromElement(verifySecureCheckOut);
    }

    public void enterFirstNameOnSecureCheckOutPage(String firstName){
           sendTextToElement(enterFIrstName,firstName);
    }
    public void enterLastNameOnSecureCheckOutPage(String lastName){
        sendTextToElement(enterLastName,lastName);
    }
    public void enterAddressOnSecureCheckOutPage(String address){
        sendTextToElement(enteraddress,address);
    }
    public void enterCityOnSecureCheckOutPage(String city){
         sendTextToElement(enterCity,city);
    }
    public void enterCountryCodeOnSecureCheckOutPage(String countrycode){
          sendTextToElement(entercountryCode,countrycode);
    }
    public void enterStateOnSecureCheckOutPage(String state){
          sendTextToElement(enterState,state);
    }
    public void enterZipCodeOnSecureCheckOutPage(String zipCode){
          sendTextToElement(enterZipCode,zipCode);
    }
    public void enteremailOnSecureCheckOutPage(String email){
           sendTextToElement(enteremail,email);
    }
    public void clickOnLocalShippingonSecurePage(){
        clickOnElement(clickOnLocalShipping);
    }
    public void clickOnPaymentMethodOnSecurePage(){
        clickOnElement(clickOnPaymentMethod);
    }
    public String verify311TotalText() {
        return getTextFromElement(verify311total);
    }
    public void clickOnPlaceOrderOnSecurePage(){
        clickOnElement(clickOnPlaceOrder);
    }
    public String verifyThankyouforYourorder(){
        return getTextFromElement(verifyThankyouforYourorder);
    }
}
