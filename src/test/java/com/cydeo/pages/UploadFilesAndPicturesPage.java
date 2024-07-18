package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.fasterxml.jackson.core.JsonParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cydeo.utilities.BrowserUtils.waitFor;

public class UploadFilesAndPicturesPage {




    public UploadFilesAndPicturesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title ='Activity Stream']")
    public WebElement activityStream;

//    @FindBy(xpath = "(//span[.='More'])[1]")
//    public WebElement moreDropdown;
//
//    @FindBy (xpath = "(//span[.='File'])[1]")
//    public WebElement fileDropdown;
//
//    @FindBy (xpath = "(//span[.='Upload files and images'])[1]")
//    public WebElement uploadFilesAndImages;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    private WebElement btn_uploadedFile;

    @FindBy(xpath = "//tr[contains(@id,'disk-edit-attachn')]/td[1]/span/span[1]")
    public WebElement uploadedFile;


//    @FindBy (xpath = "(//span[@id='check-in-text-n3654'])[1]")
//    public WebElement insertInText;
//
//    @FindBy(xpath = "(//button[@id='blog-submit-button-cancel'])[1]")
//    public WebElement cancelButton;

    public void uploadFile(String fileName) {
        String fileSeparator = System.getProperty("file.separator");
        String path = System.getProperty("user.dir") + fileSeparator + "src/test/resources/File" + fileSeparator + fileName;
        btn_uploadedFile.sendKeys(path);

    }

    public static void clickElementWithExactId(String id) {
        waitFor(3);
        Driver.getDriver().findElement(By.id(id)).click();
    }

}
