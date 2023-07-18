package com.softwaretestingboard.magento.Pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
@CacheLookup
        @FindBy(xpath = "//a[@id='ui-id-4']//span[contains(text(),'Women')]")
    WebElement womenMenu;
@CacheLookup
        @FindBy(xpath = "//a[@id='ui-id-9']")
        WebElement tops;
@CacheLookup
        @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
        WebElement jackets;
@CacheLookup
        @FindBy(css = "li.level0.nav-3>a.level-top.ui-corner-all>span:nth-of-type(1)")
        WebElement menMenu;
@CacheLookup
        @FindBy(css = "#ui-id-18 span")
        WebElement menBottoms;
@CacheLookup
        @FindBy(css = "#ui-id-23 span")
        WebElement menPants;
@CacheLookup
        @FindBy(xpath = "//span[normalize-space()='Gear']")
        WebElement gearMenu;
@CacheLookup
        @FindBy(xpath = "//span[normalize-space()='Bags']")
        WebElement begs;
   // By womenMenu = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");//1.1
   // By tops = By.xpath("//a[@id='ui-id-9']");//1.2
   // By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");//1.3
    //By menMenu = By.cssSelector("li.level0.nav-3>a.level-top.ui-corner-all>span:nth-of-type(1)");
    //By menBottoms = By.cssSelector("#ui-id-18 span");
  //  By menPants = By.cssSelector("#ui-id-23 span");
   // By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    //By begs = By.xpath("//span[normalize-space()='Bags']");


    public void mouseHoverOnWomenMenu() {
        Reporter.log("Mouse hoover on women menu" + womenMenu.toString());
        mouseHoverToElement(womenMenu);
        CustomListeners.test.log(Status.PASS,"Mouse hoover on women menu");
    }

    public void mouseHoverOnTops() {
        Reporter.log("Mouse hoover on tops" + tops.toString());
        mouseHoverToElement(tops);
        CustomListeners.test.log(Status.PASS,"Mouse hoover on tops");
    }

    public void clickOnJackets(){
        Reporter.log("Click on jackets" + jackets.toString());
        mouseHoverToElementAndClick(jackets);
        CustomListeners.test.log(Status.PASS,"Click on jackets");
    }

    public void mouseHoverToMenMenu() {
        Reporter.log("Mouse hoover on men menu" + menMenu.toString());
        mouseHoverToElement(menMenu);
        CustomListeners.test.log(Status.PASS,"Mouse hoover on men menu");
    }

    public void mouseHoverToMenBottom() {
        Reporter.log("Mouse Hoover on men bottom " + menBottoms.toString());
        mouseHoverToElement(menBottoms);
        CustomListeners.test.log(Status.PASS,"Mouse Hoover on men bottom ");
    }

    public void clickOnPants() {
        Reporter.log("Click on pants" + menPants.toString());
        mouseHoverToElementAndClick(menPants);
        CustomListeners.test.log(Status.PASS,"Click on pants");
    }
    public void mouseHOverOnGearManu() {
        Reporter.log("Mouse Hover on Gear Menu"+gearMenu.toString());
        mouseHoverToElement(gearMenu);
        CustomListeners.test.log(Status.PASS,"Mouse Hover on Gear Menu");
    }

    public void clickOnBags() {
        Reporter.log("Click on Bags"+begs.toString());
        mouseHoverToElementAndClick(begs);
        CustomListeners.test.log(Status.PASS,"Click on Bags");
    }
}
