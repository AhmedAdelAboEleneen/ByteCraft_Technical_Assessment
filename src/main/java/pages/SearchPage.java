package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ElementActions;

public class SearchPage {

    // Elements
    public By search_Txt = By.id("APjFqb");

    public By first_Link = By.xpath("//*[@id=\"ixcYae\"]/div/div/div[1]/div/div/span/a/h3");

    public By text = By.xpath("/html/body/div/div[1]/div/main/div/h1");

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void sendSearchTxt(String keys) {
        ElementActions.sendKeys(driver, search_Txt, keys);
        ElementActions.clickOnArrowDown(driver);
        ElementActions.clickOnEnter(driver);
    }

    public void clickOnFirstLink() {
        ElementActions.clickOnElement(driver,first_Link);
    }

    public String getText() {
        return ElementActions.getElementText(driver,text);
    }
    // Search for selenium webdriver & click first link
    public void searchForText(String searchValue) {
        try {
            sendSearchTxt(searchValue);
            clickOnFirstLink();
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
