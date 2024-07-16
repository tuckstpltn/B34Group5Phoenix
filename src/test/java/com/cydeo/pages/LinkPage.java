package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkPage {
    public LinkPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id ="//div[@id='feed-add-post-form-tab']")
    public WebElement LinkMessage;

    @FindBy(xpath = "//*[@title='Link']")
    public WebElement AddLink;

    }
