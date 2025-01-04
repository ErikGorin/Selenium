package demo.demoqa.main.alerts_frames_windows;

import org.openqa.selenium.By;

public class ModalDialogsPage extends Alert_Frames_WindowsPage {
    private By smallModalButton = By.xpath("//div[@id='modalWrapper']//button[text()='Small modal']");
    private By smallModalText = By.xpath(" //div[contains(text(),'very less content')]");
    private By closeButton = By.id("closeSmallModal");

    public void clickSmallModalButton() {
        click(smallModalButton);
    }

    public String getSmallModalText() {
        return find(smallModalText).getText();
    }

    public void clickCloseButton() {
        click(closeButton);
    }
}
