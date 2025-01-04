package demo.demoqa.main.forms;

import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage {
    private By femaleRadioButton = By.id("gender-radio-2");
    private By sportsHobbyCheckbox = By.cssSelector("label[for='hobbies-checkbox-1']");
    private By readingHobbyCheckbox = By.cssSelector("label[for='hobbies-checkbox-2']");
    private By musicHobbyCheckbox = By.cssSelector("label[for='hobbies-checkbox-3']");
    private By submitButton = By.id("submit");

    public void clickFemaleRadioButton() {
        scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }

    public boolean isFemaleSelected() {
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckbox() {
        if (!find(sportsHobbyCheckbox).isSelected()) {
            scrollToElementJS(sportsHobbyCheckbox);
            click(sportsHobbyCheckbox);
        }
    }

    public void clickReadCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            click(readingHobbyCheckbox);
        }
    }

    public void clickMusicCheckbox() {
        if (!find(musicHobbyCheckbox).isSelected()) {
            scrollToElementJS(musicHobbyCheckbox);
            click(musicHobbyCheckbox);
        }
    }

    public void unClickReadCheckbox() {
        if (!find(readingHobbyCheckbox).isSelected()) {
            scrollToElementJS(readingHobbyCheckbox);
            click(readingHobbyCheckbox);
        }
    }

    public boolean isReadingSelected() {
        return find(readingHobbyCheckbox).isSelected();
    }

    public void clickSubmitButton() {
//        scrollToElementJS(submitButton);
        click(submitButton);
    }
}
