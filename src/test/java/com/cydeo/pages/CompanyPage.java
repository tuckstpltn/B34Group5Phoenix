package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyPage {

    public CompanyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@data-role='item-text'])[12]")
    public WebElement Companybutton;

    @FindBy(xpath = "//*[contains(@class, 'main-buttons-item-link')]")
    public List<WebElement> modules;

}
