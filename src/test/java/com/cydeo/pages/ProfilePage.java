package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

    public ProfilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Locators

   //  @FindBy(linkText = "General") // Would work?
    @FindBy(xpath = "//a[.='General']")
    public WebElement general;


    @FindBy(xpath = "//td[@class='user-profile-nowrap-second']")
    public WebElement userEmail;

}
