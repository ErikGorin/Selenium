package part_3_4.demoqa.com.test.part_3.widgets;

import java.util.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import part_3_4.demoqa.com.base.BaseTest;

public class SelectDropDownTests extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti(2);
        selectMenuPage.selectStandardMulti("Audi");

        selectMenuPage.deselectStandardMulti("audi");

        List<String> actualSelectedOption = selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOption.contains("Volvo"));
        Assert.assertTrue(actualSelectedOption.contains("Opel"));
        Assert.assertTrue(actualSelectedOption.contains("Saab"));
        Assert.assertTrue(actualSelectedOption.contains("Audi"), "\n Audi is Selected\n"); //False
    }
}
