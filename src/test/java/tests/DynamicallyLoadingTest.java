package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicallyLoadingPage;

public class DynamicallyLoadingTest extends HerokuappBaseClassTest{
    DynamicallyLoadingPage dynamicallyLoadingPage;

    @Test(priority = 1)
    public void CheckHelloWorldMessage (){

        dynamicallyLoadingPage = new DynamicallyLoadingPage(driver);
        // Click on Dynamic Loading than Click on "Example 2" than Click "Start" than Wait for loading to finish
        dynamicallyLoadingPage.DynamicallyLoadingCheck();
        // Check that the text displayed is "Hello World!"
        Assert.assertTrue(dynamicallyLoadingPage.getText().contains("Hello World!"));
    }
}
