package demo.saucedemo;

import demo.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {
    private By productsHeader = By.xpath("//span[text()='Products']");

    public boolean isProductsHeaderDisplay() {
        return find(productsHeader).isDisplayed();
    }

}
