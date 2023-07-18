package com.softwaretestingboard.magento.Pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class JacketPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a")
    List<WebElement> beforeProdductList;

    @CacheLookup
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement sort;

    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a")
    List<WebElement> afterProductList;

    @CacheLookup
    @FindBy(xpath = "//span[@class='price-wrapper ']//span")
    List<WebElement> beforePriceList;

    @CacheLookup
    @FindBy(xpath = "//span[@class='price-wrapper ']//span")
    List<WebElement> afterPriceList;

    //By sort = By.xpath("(//select[@id='sorter'])[1]");


    // Storing jackets names in list
    public void beforeSortByProductList() {
        List<WebElement> jacketsElementsList = beforeProdductList;
        List<String> jacketsNameListBefore = new ArrayList<>();
        for (WebElement value : jacketsElementsList) {
            jacketsNameListBefore.add(value.getText());
        }
        jacketsNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
    }

    public void sortByFilter(String filter) {
        selectByVisibleTextFromDropDown(sort, filter);
    }

    public void afterSortByProductList() throws InterruptedException {
        List<WebElement> jacketsElementsList = afterProductList;
        List<String> jacketsNameListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value1 : jacketsElementsList) {
            jacketsNameListAfter.add(value1.getText());
        }
    }

    // Storing jackets price in list before
    public void beforeSortByPriceList() {
        List<WebElement> jacketsPriceElementList = beforePriceList;
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }
    }

    // After Sorting Products by Price
    public void afterSortByPriceList() throws InterruptedException {
        List<WebElement> jacketsPriceElementList = afterPriceList;
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        Thread.sleep(1000);
        for (WebElement value : jacketsPriceElementList) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
    }
}
//    // Sort the jacketPriceListBefore to Ascending Order
//        Collections.sort(jacketsPriceListBefore);
//    // Verify the products price display in Low to High
//        Assert.assertEquals(jacketsPriceListBefore, jacketsPriceListAfter);
//}
//}

