package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ElementActions;

public class DynamicallyLoadingPage {

    // Elements
    public By dynamically_Loading_Bt = By.xpath("//*[@id=\"content\"]/ul/li[14]/a");

    public By example_Two_Bt = By.xpath("//*[@id=\"content\"]/div/a[2]");

    public By start_Bt = By.xpath("//*[@id=\"start\"]/button");

    public By hello_Msg = By.id("finish");

    WebDriver driver;

    public DynamicallyLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void clickDynamicallyLoading (){
        ElementActions.clickOnElement(driver,dynamically_Loading_Bt);
    }

    public void clickExampleTwo() {
        ElementActions.clickOnElement(driver,example_Two_Bt);
    }
    public void clickStart (){
        ElementActions.clickOnElement(driver,start_Bt);
    }

    public String getText() {
        return ElementActions.getElementText(driver,hello_Msg);
    }

    public void DynamicallyLoadingCheck() {
        try {
            clickDynamicallyLoading();
            clickExampleTwo();
            Thread.sleep(2000);
            clickStart();
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
