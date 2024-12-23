package tests;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.readers.PropertiesReader;
import utilities.WebBrowsers;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class TestBase {

    public static WebDriver driver;

    @BeforeClass
    public void startDriver() {
        driver = WebBrowsers.chooseBrowserDriver(PropertiesReader.getValue("BROWSER"), false);
        WebBrowsers.staticmaximizeWindow(driver);
    }

    @AfterMethod
    public void TakeScreenShot(ITestResult result) {

        if (ITestResult.FAILURE == result.getStatus()) {

            System.out.println("Test Failed! Taking Screenshot....");
            var camera = (TakesScreenshot)driver;
            File screenShot = camera.getScreenshotAs(OutputType.FILE);
            try {
                String Error = String.format(PropertiesReader.getValue("SCREEN_SHOT"),result.getName());
                Files.move(screenShot, new File(Error));

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @AfterClass
    public void quitDriver() {
       driver.quit();
    }

}
