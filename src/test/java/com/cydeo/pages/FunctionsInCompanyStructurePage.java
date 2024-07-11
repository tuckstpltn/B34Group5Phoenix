package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FunctionsInCompanyStructurePage {

    public FunctionsInCompanyStructurePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class= 'main-buttons-item-text-title'])[1]")
    public WebElement companyStructureTitle;

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement txtBox_userName;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement txtBox_password;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement btn_login;


    public void login(String userType) {

        String username = ConfigurationReader.getProperty(userType + "_username");
        String password = ConfigurationReader.getProperty(userType + "_password");
        txtBox_userName.sendKeys(username);
        txtBox_password.sendKeys(password);
        btn_login.click();

    }

}
