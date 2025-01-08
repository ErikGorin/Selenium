package demo.demoqa.main.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utilities.SwitchToUtility.*;

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

        for (String handle : allHandles) {
            if (currentHandle.equals(handle)) {
                System.out.println("First window ID: " + handle);
            } else {
                switchToWindow(handle);
                System.out.println("Second window ID: " + handle);
            }
        }
        // Step 3: Switch to the new window using the windows handle

    }
}
