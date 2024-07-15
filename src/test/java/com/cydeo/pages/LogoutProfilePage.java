package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LogoutProfilePage {
    public LogoutProfilePage() {PageFactory.initElements(Driver.getDriver(), this);
        // Locators
    }
    @FindBy(xpath = "//span[@class='menu-popup-item-text']")
    public List<WebElement> profileOptions;

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement profileUserName;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfile;

    @FindBy(xpath = "//span[.='Edit Profile Settings']")
    public WebElement editProfileSetting;

    @FindBy(xpath = "(//span[.='Themes'])[2]")
    public WebElement themes;

    @FindBy(xpath = "(//span[.='Configure notifications'])[2]")
    public WebElement configurationNotifications;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logOut;

    @FindBy(xpath = "//div[.='Authorization']")
    public WebElement authorization;




    }


