package part_2.saucedemo.com.test.producs;

import static org.testng.Assert.*;

import org.testng.annotations.Test;
import part_2.saucedemo.com.base.BaseTest;
import demo.saucedemo.ProductsPage;

public class ProductsTest extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        assertTrue(productsPage.isProductsHeaderDisplay(), "\n Products Header Is Not Displayed \n");
    }
}
