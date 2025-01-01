package part_3_4.demoqa.com.test.part_3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part_3_4.demoqa.com.base.BaseTest;

public class DateTest extends BaseTest {
    @Test
    public void testSelectingDate() {
        String month = "July";
        String day = "12";
        String year = "2026";
        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.clickDay(day);
        datePickerPage.selectYear(year);

        String actualDate = datePickerPage.getDate();
        String expectedDate = month + "/" + day + "/" + year;
//        Assert.assertEquals(actualDate, expectedDate, "\n Actual and Expected Dates Dont Match " +
//                "\n Actual date:   " + actualDate +
//                "\n Expected date: " + expectedDate + "\n");
    }

}
