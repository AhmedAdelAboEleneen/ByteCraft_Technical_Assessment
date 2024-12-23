package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadImagePage;

public class UploadImageTest extends HerokuappBaseClassTest{

    UploadImagePage uploadImagePage;

    @Test(priority = 1)
    public void UploadPhoto (){

        uploadImagePage = new UploadImagePage(driver);
        // upload new image
        uploadImagePage.uploadNewImage();
        // assert image name is equal uploaded image name
        Assert.assertTrue(uploadImagePage.getText().contains("Test.png"));
    }
}
