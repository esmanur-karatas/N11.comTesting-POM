package com.n11test.pom;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class N11Test extends BaseTest{

    TabBarPage tabBarPage;
    ResultPage resultPage;
    ProductDetailPage productDetailPage;
    @Test(priority = 1)
    public void searchTest (){
        driver.get("https://www.n11.com/");
        tabBarPage = new TabBarPage(driver);
        tabBarPage.search("Laptop");
    }
    @Test(priority = 2)
    public void resultPageTest() {
        resultPage = new ResultPage(driver);
        WebElement resultWebElement = resultPage.getResultText();
        softAssert.assertTrue(resultWebElement.isDisplayed());
        resultPage.clickToFirstProduct();
    }
    @Test(priority = 3)
    public void addToCartTest() throws InterruptedException {
        productDetailPage = new ProductDetailPage(driver);
        productDetailPage.clickAddToCart();
        Thread.sleep(3000);
        softAssert.assertTrue(tabBarPage.getBasketTotalNumber().equals("1"));

    }

}
