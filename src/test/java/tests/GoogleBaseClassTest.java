package tests;

import org.testng.annotations.Test;
import utilities.readers.PropertiesReader;

public class GoogleBaseClassTest extends TestBase {

    // Open google url
    @Test
    public void openGoogle() {
        driver.get(PropertiesReader.getValue("Google_URL"));
    }
}
