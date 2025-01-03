package part_3_4.demoqa.com.test.part_4.screenshot;

import org.testng.annotations.Test;
import part_3_4.demoqa.com.base.BaseTest;

public class CaptureFailedScreenshotTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExecutor() {
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }
}
