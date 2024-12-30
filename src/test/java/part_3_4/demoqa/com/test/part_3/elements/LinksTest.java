package part_3_4.demoqa.com.test.part_3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part_3_4.demoqa.com.base.BaseTest;

public class LinksTest extends BaseTest {
    @Test
    public void testLinks() {
        var linksPage = homePage.goToElements().clickLLinks();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();
        Assert.assertFalse(actualResponse.contains("400") && actualResponse.contains("Bad request"), "\n Actual Response (" + actualResponse + ")\n Does Not Contain '400' and 'Bad request'\n");
    }
}
