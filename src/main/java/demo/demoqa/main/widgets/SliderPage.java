package demo.demoqa.main.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import static utilities.ActionsUtility.dragAndDropBy;
import static utilities.GetUtility.getAttribute;

public class SliderPage extends WidgetsPage {

    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private By sliderValue = By.id("sliderValue");

    public String getSliderValue() {
        return getAttribute(sliderValue, "value");
    }

    public void moveSlider(int a, int b) {
//       with Class
//        Actions act = new Actions(driver);
//        act.dragAndDropBy(find(slider), a, b).perform();

        dragAndDropBy(find(slider), a, b); // with utility
    }
}
