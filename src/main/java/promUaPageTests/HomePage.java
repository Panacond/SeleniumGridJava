package promUaPageTests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {
    @FindBy(xpath = "//span[@title='Русский']")
    private WebElement buttonLanguage;

    @FindBy(xpath = "//span[text()='Техника и электроника']")
    private WebElement buttonTechnicsAndElectronic;

    @FindBy(xpath = "//a[text()='Мобильные телефоны, смартфоны']")
    private WebElement buttonMobilePhones;

    @FindBy(xpath = "//span[text()='Украина']")
    private WebElement selectRegion;

    @FindBy(xpath = "//input[@name='search_term']")
    private WebElement buttonSearch;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void rusLanguageClick() {
        buttonLanguage.click();
    }

    public boolean isVisibleButtonLanguage() {
        return buttonLanguage.isDisplayed();
    }

    public WebElement getTechnicsAndElectronic() {
        return buttonTechnicsAndElectronic;
    }

    public void clickButtonMobilePhones() {
        buttonMobilePhones.click();
    }

    public WebElement getButtonMobilePhones() {
        return buttonMobilePhones;
    }

    public boolean isVisibleTechnicsAndElectronic() {
        return buttonTechnicsAndElectronic.isDisplayed();
    }


    public boolean isVisibleSelectRegion() {
        return selectRegion.isDisplayed();
    }

    public boolean isVisibleButtonSearch() {
        return buttonSearch.isDisplayed();
    }

    public void inputSearch(String text) {
        buttonSearch.sendKeys(text, Keys.ENTER);
    }


}

