package part_3_4.demoqa.com.test.part_4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part_3_4.demoqa.com.base.BaseTest;

public class SliderTest extends BaseTest {

    @Test
    public void testSliderResult() {
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSlider(100, 0);
        String actualValue = sliderPage.getSliderValue();
        String expectedValue = "25";
        Assert.assertEquals(actualValue, expectedValue, "\n Actual & Expected Values Do Not Match\n");
    }
}
