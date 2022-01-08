package promUaPageTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@data-qaid='product_gallery']/div/div/a[@target='_self']")
    private List<WebElement> searchListTitle;

    @FindBy(xpath = "//button[contains(@id,'portable-order-button')]")
    private WebElement goToCart;

    @FindBy(xpath = "//a[@class='x-order-product__title']")
    private WebElement descriptionModel;

    @FindBy(xpath = "//a[contains(@href,'shopping_cart')]")
    private List<WebElement> buttonList;

    @FindBy(xpath = "//span[@data-qaid='product_price']")
    private List<WebElement> searchListPrice;


    @FindBy(xpath = "//span[text()='Дороже']")
    private WebElement sortMaxPrice;

    public List<WebElement> getSearchListTitle() {
        return searchListTitle;
    }

    public List<WebElement> getSearchListPrice() {
        return searchListPrice;
    }


    public void clickSortPriceMax() {
        sortMaxPrice.click();
    }

    public void clickButtonFirstElement() {
        System.out.println(buttonList.size());
        buttonList.get(0).click();
    }


    public WebElement getDescriptionModel() {
        return descriptionModel;
    }

}
