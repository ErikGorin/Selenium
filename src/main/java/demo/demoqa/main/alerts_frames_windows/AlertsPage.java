package demo.demoqa.main.alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlertsPage extends Alert_Frames_WindowsPage {

    private By informationAlertButton = By.id("alertButton");
    private By confirmationAlertButton = By.id("confirmButton");
    private By confirmationResult = By.id("confirmResult");
    private By promptAlertButton = By.id("promtButton");
    private By promptResult = By.id("promptResult");


    public void clickInformationAlertButton() {
        try {
            click(informationAlertButton);
        } catch (ElementClickInterceptedException e) {
            System.out.println("Element click intercepted. Handling the obstruction.");
            List<WebElement> iframes = driver.findElements(By.cssSelector("iframe"));
            for (WebElement iframe : iframes) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].remove();", iframe);
            }
            click(informationAlertButton);
        } catch (Exception e) {
            System.out.println("Unexpected error while clicking information alert button: " + e.getMessage());
            throw e;
        }
    }

    public void clickConfirmationAlertButton() {
        click(confirmationAlertButton);
    }

    public String getConfirmationResult() {
        return find(confirmationResult).getText();
    }


    public void clickPromptAlertButton() {
        try {
            click(promptAlertButton);
        } catch (ElementClickInterceptedException e) {
            System.out.println("Element click intercepted. Handling the obstruction.");
            List<WebElement> iframes = driver.findElements(By.cssSelector("iframe"));
            for (WebElement iframe : iframes) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].remove();", iframe);
            }
            click(promptAlertButton);
        } catch (Exception e) {
            System.out.println("Unexpected error while clicking information alert button: " + e.getMessage());
            throw e;
        }
    }

    public String getPromptAlertResult() {
        return find(promptResult).getText();
    }
}
