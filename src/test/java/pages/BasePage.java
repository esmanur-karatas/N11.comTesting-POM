package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public WebElement find(By locator) {
       return driver.findElement(locator);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
