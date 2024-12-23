package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ElementActions;

public class UploadImagePage {

    // Elements
    public By upload_File_Bt = By.xpath("//*[@id=\"content\"]/ul/li[18]/a");

    public By chose_File_Bt = By.id("file-upload");

    public By submit_Bt = By.id("file-submit");

    public By success_Msg = By.id("uploaded-files");

    WebDriver driver;

    public UploadImagePage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void clickUploadFile (){
        ElementActions.clickOnElement(driver,upload_File_Bt);
    }

    public void UploadImage() {
        ElementActions.sendKeys(driver,chose_File_Bt,"/Users/ahmed/IdeaProjects/ByteCraft_Technical_Assessment/src/test/resources/TestPIC/Test.png");

    }
    public void SubmitAction (){
        ElementActions.clickOnElement(driver,submit_Bt);
    }

    public String getText() {
        return ElementActions.getElementText(driver,success_Msg);
    }
    public void uploadNewImage() {
        try {
            clickUploadFile();
            UploadImage();
            SubmitAction();
            Thread.sleep(5000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
