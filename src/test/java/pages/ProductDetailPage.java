package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    private final By addToBasketLocator = By.className("addBasketUnify");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddToCart() {
        click(addToBasketLocator);
    }


}
