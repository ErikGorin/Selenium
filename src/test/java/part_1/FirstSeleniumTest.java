package part_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://profile.w3schools.com/login");
    }

    @AfterClass
    public void tearDown() {
//        driver.quit();
    }

    @Test
    public void testLogging() throws InterruptedException {
        Thread.sleep(3000);
        WebElement username = driver.findElement(By.name("email"));
        username.sendKeys("rerety84@gmail.com");
        var password = driver.findElement(By.name("password"));
        password.sendKeys("Ut}ih!@!H%.D8*+");

        driver.findElement(By.xpath("//div[@id='root']//button[text()='Login']")).click();
        Thread.sleep(3000);

    }
}
