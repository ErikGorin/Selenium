package demo.demoqa.main.alerts_frames_windows;


import org.openqa.selenium.By;

public class FramesPage extends Alert_Frames_WindowsPage {

    private By textInFrame = By.id("sampleHeading");

    public String getTextInBigFrame() {
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: " + bigFrameText);
        return bigFrameText;
    }
}
