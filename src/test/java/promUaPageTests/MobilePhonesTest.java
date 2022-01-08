package promUaPageTests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class MobilePhonesTest extends BaseTest {
    private static final String TEXT_NAME = "Apple";

    private static final String ATTRIBUTE_TITLE = "title";

    @Test(priority = 1)
    public void testSearch() {

        getHomePage().moveMouse(getHomePage().getTechnicsAndElectronic());
        getHomePage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getHomePage().getButtonMobilePhones());
        getHomePage().clickButtonMobilePhones();
        getMobilePhonesPage().waitVisibilityOfElement(DEFAULT_WAITING_TIME, getMobilePhonesPage().getRadioButtonXiaomi());
        getMobilePhonesPage().clickRadioButtonXiaomi();
        getMobilePhonesPage().clickRadioButtonApple();
        getMobilePhonesPage().clickSortPriceMax();
        getMobilePhonesPage().implicitWait(DEFAULT_WAITING_TIME);
        List<WebElement> checkList = getMobilePhonesPage().getSearchListTitle();
        String search;
        System.out.println(checkList.size());
        boolean expected = false;
        for (WebElement i : checkList) {
            search = i.getAttribute(ATTRIBUTE_TITLE);
            System.out.println(search);
            if (search.contains(TEXT_NAME)) {
                expected = true;
                break;
            }
        }
        assertTrue(expected);
    }
}
