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


    @FindBy(xpath = "//div[@class='menu-popup']")
    public WebElement usernameMenu;

}
