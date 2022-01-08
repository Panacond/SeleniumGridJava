package promUaPageTests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomeTest extends BaseTest {
    @Test(priority = 1)
    public void smokeTestHomePage() {

        assertTrue(getHomePage().isVisibleTechnicsAndElectronic());
        assertTrue(getHomePage().isVisibleButtonLanguage());
        assertTrue(getHomePage().isVisibleSelectRegion());
        assertTrue(getHomePage().isVisibleButtonSearch());

    }


}
