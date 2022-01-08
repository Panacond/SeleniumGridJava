package promUaPageTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MobilePhonesPage extends BasePage {
    public MobilePhonesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[text()='Apple']")
    private WebElement radioButtonApple;

    @FindBy(xpath = "//div[text()='Xiaomi']")
    private WebElement radioButtonXiaomi;

    @FindBy(xpath = "//span[text()='Дороже']")
    private WebElement sortMaxPrice;

    @FindBy(xpath = "//div[@data-qaid='product_gallery']/div/div/a[@target='_self']")
    private List<WebElement> searchListTitle;

    public List<WebElement> getSearchListTitle() {
        return searchListTitle;
    }

    public void clickRadioButtonApple() {
        radioButtonApple.click();
    }

    public void clickRadioButtonXiaomi() {
        radioButtonXiaomi.click();
    }

    public WebElement getRadioButtonXiaomi() {
        return radioButtonXiaomi;
    }

    public void clickSortPriceMax() {
        sortMaxPrice.click();
    }
}
