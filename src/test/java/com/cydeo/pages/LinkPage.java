package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkPage {
    public LinkPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="(//div[@class='microblog-top-tabs-visible']//span[contains(.,'Message')])[1]")
    public WebElement LinkMessage;

    @FindBy(id = "bx-b-link-blogPostForm")
    public WebElement AddLink;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textbox;

    @FindBy(xpath ="//input[@placeholder='Link URL']" )
    public  WebElement Urlbox;

    @FindBy(xpath = "//input[@class='adm-btn-save']")
    public WebElement savebtn;

    @FindBy(xpath = "//a[.='google']")
    public WebElement googlelink;

    }

