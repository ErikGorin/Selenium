package part_3_4.demoqa.com.test.part_3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part_3_4.demoqa.com.base.BaseTest;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckbox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsCheckbox();
        formsPage.clickReadCheckbox();
        formsPage.clickMusicCheckbox();
        formsPage.unClickReadCheckbox();

        boolean isReadingCheckboxSelected = formsPage.isReadingSelected();
        Assert.assertFalse(isReadingCheckboxSelected, "\n Reading Checkbox Is Selected\n");
    }
}
