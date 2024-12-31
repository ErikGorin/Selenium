package demo.demoqa.main.widgets;

import org.openqa.selenium.By;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavaScriptUtility.*;

public class SelectMenuPage extends WidgetsPage {
    private By standardMultiSelect = By.id("cars");

    public void selectStandardMulti(String text) {
        scrollToElementJS(standardMultiSelect);
        selectByVisibleText(standardMultiSelect, text);
//        Select select = new Select(find(standardMultiSelect));
//        select.selectByVisibleText(text);
    }

    public void selectStandardMulti(int index) {
        scrollToElementJS(standardMultiSelect);
        selectByIndex(standardMultiSelect, index);
    }

    public void deselectStandardMulti(String value) {
        scrollToElementJS(standardMultiSelect);
        deselectByValue(standardMultiSelect, value);
    }

    public List<String> getAllSelectedStandardMultiOptions() {
        return getAllSelectedOptions(standardMultiSelect);
    }

}