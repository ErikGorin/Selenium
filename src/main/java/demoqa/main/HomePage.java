package demoqa.main;

import demoqa.main.forms.FormsPage;
import org.ex.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToForms() {
        click(formsCard);
        return new FormsPage();
    }
}
