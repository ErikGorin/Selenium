package part_3_4.demoqa.com.test.part_4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part_3_4.demoqa.com.base.BaseTest;

@Test
public class FramesTest extends BaseTest {

    public void testFrameBigBox() {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualBigBoxText = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText, "\n Actual & Expected Text Do Not Match\n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "\n Expected & Actual Header Text Do Not Match\n");
    }

    @Test
    public void testFrameSmallBox() {
        var framesPage = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualSmallBoxText = framesPage.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText, "\n Actual & Expected Text Do Not Match\n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "\n Actual & Expected Header Text Do Not Match\n");
    }
}
