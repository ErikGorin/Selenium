package demo.demoqa.main.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavaScriptUtility.scrollToElementJS;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage {

    private By fullNameField = By.id("userName");
    private By curresntAddressField = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAddresResult = By.xpath("//p[@id='currentAddress']");

    public String getCurrentAddres() {
        explicitWaitUntilVisible(5, currentAddresResult);
        return getText(currentAddresResult);
    }

    public void clickSubmitButton() {
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public void setCurrentAddress(String address) {
        find(curresntAddressField).sendKeys(address + Keys.ENTER);
    }

    public void setFullNAme(String name) {
        scrollToElementJS(fullNameField);
//        Actions act = new Actions(driver);
//        act.sendKeys(find(fullNameField), Keys.chord(name)).perform();
        sendKeys(find(fullNameField), Keys.chord(name));
    }

    public void setEmail(String email) {
        setFullNAme(Keys.chord(Keys.TAB, email));
    }


}

