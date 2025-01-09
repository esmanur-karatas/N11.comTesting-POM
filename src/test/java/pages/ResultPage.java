package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage extends BasePage {

    private final By resultTextLocator = By.className("resultText");

    private final By productNameLocator = By.className("productName");

    public ResultPage(WebDriver driver) {
        super(driver);

    }

    public WebElement getResultText() {
        return driver.findElement(resultTextLocator);
    }

    public void clickToFirstProduct() {
        click(productNameLocator);
    }
}
