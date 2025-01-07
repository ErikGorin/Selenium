package demo.demoqa.main.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

public class BrowserWindowsPage extends Alert_Frames_WindowsPage {
    private By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        // Step 1: Get the current "Main" window handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main Window ID: " + currentHandle + "\n");

        // Step 2: Get all window handles
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("Nr of Open Windows: " + allHandles.size() + "\n");

        // Step 3: Switch to the new window using the windows handle

    }
}
