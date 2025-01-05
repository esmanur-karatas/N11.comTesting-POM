package com.n11test.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TabBarPage {
    private final WebDriver driver;
    private final By searchBox = By.id("searchData");

    private final By basket = By.className("basketTotalNum");

    public TabBarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String searchWord) {
        driver.findElement(searchBox).sendKeys(searchWord + Keys.ENTER);

    }

    public String getBasketTotalNumber() {
       return driver.findElement(basket).getText();
    }
}
