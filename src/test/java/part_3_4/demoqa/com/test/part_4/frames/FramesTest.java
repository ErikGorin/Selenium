package part_3_4.demoqa.com.test.part_4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part_3_4.demoqa.com.base.BaseTest;

public class FramesTest extends BaseTest {

    @Test
    public void testFrameBigBox() {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a simple page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText, "\n Actual & Expected Text Do Not Match\n");
    }
}
