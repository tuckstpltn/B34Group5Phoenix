package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilesAndPicturesPage {




    public UploadFilesAndPicturesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title ='Activity Stream']")
    public WebElement activityStream;

    @FindBy(xpath = "(//span[.='More'])[1]")
    public WebElement moreDropdown;

    @FindBy (xpath = "(//span[.='File'])[1]")
    public WebElement fileDropdown;

    @FindBy (xpath = "(//span[.='Upload files and images'])[1]")
    public WebElement uploadFilesAndImages;

    @FindBy (xpath = "(//span[@id='check-in-text-n3654'])[1]")
    public WebElement insertInText;

    @FindBy(xpath = "(//button[@id='blog-submit-button-cancel'])[1]")
    public WebElement cancelButton;

    public void uploadFile(String fileName) {
        uploadFilesAndImages.click();
    }
    public WebElement uploadedFile;
}
