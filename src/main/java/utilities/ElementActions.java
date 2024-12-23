package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ElementActions {

       public static void clickOnElement(WebDriver driver, By locator) {
        VerifyActions.isDisplayed(driver,locator);
        VerifyActions.isClickable(driver,locator);
        driver.findElement(locator).click();
    }
    public static void sendKeys(WebDriver driver, By locator, String keys) {
        VerifyActions.isClickable(driver,locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(keys);
    }
    public static void clickOnEnter(WebDriver driver)
    {
        try{
            Thread.sleep(3000);
            Actions action=new Actions(driver);
            action.sendKeys(Keys.ENTER).build().perform();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
    public static void clickOnArrowDown(WebDriver driver)
    {
        try{
            Thread.sleep(3000);
            Actions action=new Actions(driver);
            action.sendKeys(Keys.ARROW_DOWN).build().perform();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getElementText(WebDriver driver, By locator){
        VerifyActions.isDisplayed(driver,locator);
        return driver.findElement(locator).getText();
    }

}
