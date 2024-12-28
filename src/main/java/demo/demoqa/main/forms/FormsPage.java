package demo.demoqa.main.forms;

import demo.demoqa.main.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {
    private By practiceFromMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public PracticeFormPage clickPracticeForm() {
        scrollToElementJS(practiceFromMenuItem);
        click(practiceFromMenuItem);
        return new PracticeFormPage();
    }
}