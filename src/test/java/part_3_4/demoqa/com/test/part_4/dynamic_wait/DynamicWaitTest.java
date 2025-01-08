package part_3_4.demoqa.com.test.part_4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part_3_4.demoqa.com.base.BaseTest;

public class DynamicWaitTest extends BaseTest {

    @Test
    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";
        Assert.assertEquals(actualText, expectedText, "\n Actual & Expected Text Do Not Match\n");
    }

    @Test
    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";
        Assert.assertEquals(actualValue, expectedValue, "\n Value Is Not 100% \n");
    }
}
