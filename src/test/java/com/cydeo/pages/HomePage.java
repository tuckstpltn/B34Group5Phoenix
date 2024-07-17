package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Locators

    @FindBy(id = "user-block")
    public WebElement usernameBlock;


    // @FindBy(xpath = "//div[@class='menu-popup']")
    @FindBy(linkText = "My Profile")
    public WebElement myProfileLink;


    // Activity Stream Tabs

    // Message Tab
    @FindBy(xpath = "(//span[.='Message'])[2]")
    public WebElement messageTab;

    // Task Tab

    @FindBy(xpath = "(//span[.='Task'])[2]")
    public WebElement taskTab;

    // Event Tab
    @FindBy(xpath = "(//span[.='Event'])[2]")
    public WebElement eventTab;

    // Poll Tab
    @FindBy(xpath = "(//span[.='Poll'])[2]")
    public WebElement pollTab;

    // More Tab
    @FindBy(xpath = "(//span[.='More'])[2]")
    public WebElement moreTab;

    // Options Under More Tab

    // File Tab (under More)
    @FindBy(xpath = "(//span[.='File'])[2]")
    public WebElement fileTab;

    // Appreciation Tab (under More)
    @FindBy(xpath = "(//span[.='Appreciation'])[2]")
    public WebElement appreciationTab;

    // Announcement Tab (under More)
    @FindBy(xpath = "(//span[.='Announcement'])[2]")
    public WebElement announcementTab;

    // Workflow Tab (under More)
    @FindBy(xpath = "(//span[.='Workflow'])[2]")
    public WebElement workflowTab;


}
