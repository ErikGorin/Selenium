package demo.demoqa.main;

import demo.demoqa.main.alerts_frames_windows.Alert_Frames_WindowsPage;
import demo.demoqa.main.elements.ElementsPage;
import demo.demoqa.main.forms.FormsPage;
import demo.base.BasePage;
import demo.demoqa.main.widgets.WidgetsPage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");
    private By widgetsCard = By.xpath("//div[@id='app']//h5[text()='Widgets']");
    private By alertFrameWindowsCard = By.xpath("//div[@id='app']//h5[text()='Alerts, Frame & Windows']");

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements() {
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets() {
        scrollToElementJS(widgetsCard);
        click(widgetsCard);
        return new WidgetsPage();
    }

    public Alert_Frames_WindowsPage goToAlertsFramesWindowsCard() {
        scrollToElementJS(alertFrameWindowsCard);
        click(alertFrameWindowsCard);
        return new Alert_Frames_WindowsPage();
    }
}
