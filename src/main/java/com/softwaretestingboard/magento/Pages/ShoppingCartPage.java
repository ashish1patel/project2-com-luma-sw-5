package com.softwaretestingboard.magento.Pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(css = "main div h1 span")
    WebElement textShoppingCart;
    @CacheLookup
    @FindBy(css ="[data-th=\"Item\"] div strong a" )
    WebElement textCronusYogaPant;
    @CacheLookup
    @FindBy(css =".item-options>dd:first-of-type" )
    WebElement textSize32;
    @CacheLookup
    @FindBy(css = ".item-options>dd:last-of-type")
    WebElement textBlack;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement getProductNameText;
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement quantityText;
    @CacheLookup
    @FindBy(xpath ="//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']" )
    WebElement productPriceText;
    @CacheLookup
    @FindBy(xpath ="//input[@title='Qty']" )
    WebElement updateQty;
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Update Shopping Cart']" )
    WebElement clickUpdateQty;
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement productPriceText1;
//
//    By textShoppingCart = By.cssSelector("main div h1 span");
//    By textCronusYogaPant = By.cssSelector("[data-th=\"Item\"] div strong a");
//    By textSize32 = By.cssSelector(".item-options>dd:first-of-type");
//    By textBlack = By.cssSelector(".item-options>dd:last-of-type");
//    By getProductNameText = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
//    By quantityText = By.xpath("//input[@title='Qty']");
//    By productPriceText = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
//    By updateQty = By.xpath("//input[@title='Qty']");
//    By clickUpdateQty = By.xpath("//span[normalize-space()='Update Shopping Cart']");
//    By productPriceText1 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");


    public String getTextShoppingCart() {
        Reporter.log("Get text shopping cart");
        CustomListeners.test.log(Status.PASS,"Get text shopping cart");
        return getTextFromElement(textShoppingCart);
    }

    public String getTextCronusYogaPant() {
        Reporter.log("Get text Cronus Yoga Pant");
        CustomListeners.test.log(Status.PASS,"Get text Cronus Yoga Pant");
        return getTextFromElement(textCronusYogaPant);
    }

    public String getTextSize32() {
        Reporter.log("Get text of size 32");
        CustomListeners.test.log(Status.PASS,"Get text of size 32");
        return getTextFromElement(textSize32);
    }

    public String getTextBlack() {
        Reporter.log("Get text of colour black");
        CustomListeners.test.log(Status.PASS,"Get text of colour black");
        return getTextFromElement(textBlack);
    }

    public String verifyTheProductName() {
        Reporter.log("Verify the product name");
        CustomListeners.test.log(Status.PASS,"Verify the product name");
        return getTextFromElement(getProductNameText);}

//    public String verifyTheQuantityNumber() throws InterruptedException {
//        Thread.sleep(3000);
//        return getAttributeValueFromElement(quantityText);}

    public String verifyTheProductPrice() {
        Reporter.log("Verify the product price");
        CustomListeners.test.log(Status.PASS,"Verify the product price");
        return getTextFromElement(productPriceText);}

    public void updateTheQuantity(String qty) throws InterruptedException {
        Reporter.log("Update the quantity" + updateQty.toString());
       updateQty.clear();
        Thread.sleep(2000);
        sendTextToElement(updateQty,qty);
    CustomListeners.test.log(Status.PASS,"Update the quantity");
    }


    public void clickOnUpdateShoppingCart() {
        Reporter.log("Click on update the quantity"+ clickUpdateQty.toString());
        clickOnElement(clickUpdateQty);
    CustomListeners.test.log(Status.PASS,"Click on update the quantity");
    }

    public String verifyTheProductPrice1() {
        Reporter.log("Verify the product price");
        CustomListeners.test.log(Status.PASS,"Verify the product price");
        return getTextFromElement(productPriceText1);}
}
