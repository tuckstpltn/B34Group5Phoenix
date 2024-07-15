package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilePage {
    public UploadFilePage() {
        PageFactory.initElements(Driver.getDriver(), this);}

        // Locators

        @FindBy(xpath = "(//span[.='Appreciation'])[2]")
        public WebElement appreciationPageButton;

        @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
        public WebElement UploadFiles;
    @FindBy(xpath = "(//input[@class='diskuf-fileUploader wd-test-file-light-inp '])[1]")
    public WebElement UploadFilesAndImages;

        @FindBy(xpath = "//a[@class='files-path']")
        public WebElement userSeeUploadedFiles;

        @FindBy(xpath = "//button[@id='blog-submit-button-save']")
        public WebElement SendButton;


    }



