package tests;

import org.testng.annotations.Test;
import utilities.readers.PropertiesReader;

public class HerokuappBaseClassTest extends TestBase {

    // Open herokuapp url

    @Test
    public void openHerokuapp() {
        driver.get(PropertiesReader.getValue("Herokuapp-Url"));
    }
}
