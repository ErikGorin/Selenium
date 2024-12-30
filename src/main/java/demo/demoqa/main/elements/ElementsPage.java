package demo.demoqa.main.elements;

import demo.demoqa.main.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {
    private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");

    private By linksMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");

    public WebTablesPage clickWebTables() {
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLLinks() {
        click(linksMenuItem);
        return new LinksPage();
    }
}
