package promUaPageTests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTest extends BaseTest {

    private static final String TEXT_FIND = "XIAOMI 11T Pro 8/128GB";
    private static final String TEXT_NAME = "Xiaomi 11T Pro 8/128GB";

    private static final String ATTRIBUTE_TITLE = "title";
    private static final String ATTRIBUTE_PRICE = "data-qaprice";

    @Test(priority = 1)
    public void checkListResultSearch() {
        getHomePage().inputSearch(TEXT_FIND);
        getHomePage().implicitWait(DEFAULT_WAITING_TIME);
        List<WebElement> listTitle = getSearchPage().getSearchListTitle();
        int number;
        number = 0;
        String search;
        for (WebElement i : listTitle) {
            search = i.getAttribute(ATTRIBUTE_TITLE);
            if (search.contains(TEXT_NAME)) {
                number++;
            }
        }
        boolean expected = false;
        if (number > 3) {
            expected = true;
        }
        assertTrue(expected);
    }

    @Test(priority = 1)
    public void checkSortPrise() {
        getHomePage().inputSearch(TEXT_FIND);
        getHomePage().implicitWait(DEFAULT_WAITING_TIME);
        getSearchPage().clickSortPriceMax();
        List<WebElement> listPrice = getSearchPage().getSearchListPrice();
        boolean expected = true;
        System.out.println("12" + listPrice.get(0).getAttribute(ATTRIBUTE_PRICE));
        double number;
        number = Double.parseDouble(listPrice.get(0).getAttribute(ATTRIBUTE_PRICE));
        double numberNext;
        for (int i = 1; i < listPrice.size(); i++) {
            numberNext = Double.parseDouble(listPrice.get(i).getAttribute(ATTRIBUTE_PRICE));
            expected = numberNext <= number;
            number = numberNext;
        }
        assertTrue(expected);
    }

}
