package com.softwaretestingboard.magento.Pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ProductPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//span[@class='base']")
    WebElement productText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeQty;

    @CacheLookup
    @FindBy(xpath ="//button[@id='product-addtocart-button']")

    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement addedProductText;
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='shopping cart']")
    WebElement linkShoppingCart;

//    By productText = By.xpath("//span[@class='base']");
//    By changeQty = By.xpath("//input[@id='qty']");
//    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");
//    By addedProductText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
//    By linkShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");

    public String verifyOvernightDuffleText() {
        Reporter.log("verify Overnight Duffle Text"+productText.toString());
        CustomListeners.test.log(Status.PASS,"verify Overnight Duffle Text");
        return getTextFromElement(productText);
    }

    public void changeQuantity(String qty) {
        Reporter.log("Change Quantity"+changeQty.toString());
        changeQty.clear();
        sendTextToElement(changeQty, "3");
        CustomListeners.test.log(Status.PASS,"Change Quantity");

    }

    public void addToCart() {
        Reporter.log("Add TO Cart"+addToCartButton.toString());
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS,"Add TO Cart");
    }
    public String verifyProductAddText() {
        Reporter.log("Verify Product Added Text"+addedProductText.toString());
        CustomListeners.test.log(Status.PASS,"Verify Product Added Text");
        return getTextFromElement(addedProductText);
    }

    public void clickOnShoppingCart() {
        Reporter.log("Click on Shopping Cart"+linkShoppingCart.toString());
        clickOnElement(linkShoppingCart);
        CustomListeners.test.log(Status.PASS,"Click on Shopping Cart");
    }
}
