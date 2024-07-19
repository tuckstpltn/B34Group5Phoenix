package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DrivePage {
    public DrivePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@data-role='item-text'])[6]")
    public WebElement Drivebutton;


    @FindBy(xpath = "//a[@class='main-buttons-item-link']")
    public List<WebElement> allModulesOfDrivePage;

}
