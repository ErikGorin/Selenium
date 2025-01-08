package demo.demoqa.main.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utilities.GetUtility.getText;
import static utilities.WaitUtility.*;

public class ProgressBarPage extends WidgetsPage {

    private By startButton = By.id("startStopButton");
    private By progressValue = By.xpath("//div[@id='progressBar']/div[@aria-valuenow='100']");

    public String getProgressValue() {
        fluentWaitUntilVisible(30, progressValue);
        return getText(progressValue);
    }

    public void clickStartButton() {
        click(startButton);
    }
}
