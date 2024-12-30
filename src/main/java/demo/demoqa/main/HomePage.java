package demo.demoqa.main;

import demo.demoqa.main.elements.ElementsPage;
import demo.demoqa.main.forms.FormsPage;
import demo.base.BasePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements() {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }
}
