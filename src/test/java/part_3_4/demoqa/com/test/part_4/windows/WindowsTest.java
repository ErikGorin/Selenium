package part_3_4.demoqa.com.test.part_4.windows;

import org.testng.annotations.Test;
import part_3_4.demoqa.com.base.BaseTest;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindowURL() {
        var windowsPage = homePage.goToAlertsFramesWindowsCard().clickBrowserWindows();
        windowsPage.clickNewWindowButton();
    }
}
