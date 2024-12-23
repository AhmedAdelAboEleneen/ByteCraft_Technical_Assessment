package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTest extends GoogleBaseClassTest {

    SearchPage searchPage;
    String searchTxt = "selenium webdriver";


    @Test(priority = 1)
    public void searchText() {
        searchPage = new SearchPage(driver);
        // Search for "selenium webdriver" than click first link
        searchPage.searchForText(searchTxt);
        // Assert page tittle equal WebDriver
        Assert.assertEquals(searchPage.getText(),"WebDriver");

    }
}
