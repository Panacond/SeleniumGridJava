package promUaPageTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(@id,'portable-order-button')]")
    private WebElement goToCart;

    @FindBy(xpath = "//a[@class='x-order-product__title']")
    private WebElement descriptionModel;

    public void clickGoToCart() {
        goToCart.click();
    }

    public WebElement getGoToCart() {
        return goToCart;
    }

    public WebElement getDescriptionModel() {
        return descriptionModel;
    }
}
