package part_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstSeleniumTest {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://feelgrounded.com/account/login");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void testLogging() throws InterruptedException {
        Thread.sleep(3000);
       WebElement username =  driver.findElement(By.name("customer[email]"));
       username.sendKeys("rerety84@gmail.com");
       var password = driver.findElement(By.name("customer[password]"));
       password.sendKeys("Admin12345");

       driver.findElement(By.className("button")).click();
    }
}
