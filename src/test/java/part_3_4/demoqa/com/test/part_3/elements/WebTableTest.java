package part_3_4.demoqa.com.test.part_3.elements;

import org.testng.Assert;
import org.testng.annotations.Test;
import part_3_4.demoqa.com.base.BaseTest;

public class WebTableTest extends BaseTest {
    @Test
    public void testWebTable() {
        String email = "kierra@example.com";
        String expectedAge = "50";

        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge("50");
        webTablePage.clickSubmitButton();
        String actualAge = webTablePage.getTableAge(email);
        Assert.assertEquals(actualAge, expectedAge, "\n Actual and Expected Ages Do Not Match\n");
    }
}
