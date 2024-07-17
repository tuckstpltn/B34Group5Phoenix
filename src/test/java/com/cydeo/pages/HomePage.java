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
    // Use Link Text? Essentially that is what is being used via xpath

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


}
