package part_3_4.demoqa.com.test.part_4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part_3_4.demoqa.com.base.BaseTest;

public class TextBoxTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullNAme("Erik Gorin");
        textBoxPage.setEmail("ErikGorin@gmail.com");
        textBoxPage.setCurrentAddress("Stefan Cel Mare 123");
        textBoxPage.setCurrentAddress("Casa n# 8");
        textBoxPage.setCurrentAddress("Etaj 6");
        textBoxPage.setCurrentAddress("Casuta Mea ");
        textBoxPage.clickSubmitButton();
        String actualAddress = textBoxPage.getCurrentAddres();
        Assert.assertTrue(actualAddress.contains("Etaj 6"), "\n Actual Address Does Not Contain (Etaj 6)\n");
    }
}
