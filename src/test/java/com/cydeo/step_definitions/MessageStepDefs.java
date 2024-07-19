package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;

public class MessageStepDefs {


    /*
    Message Element locators under Home Page
     */
    HomePage homePage = new HomePage();

    @Then("user clicks send message block")
    public void user_clicks_send_message_block() {

        homePage.messageBlock.click();

    }

    @Then("user types message")
    public void user_types_message() {
        // <html> iframe --> Check this
        Driver.getDriver().switchTo().frame(homePage.messageIFrame);
        homePage.iFrameBody.sendKeys("Automated Message Test");
    }

    @Then("user clicks send button and error message is not displayed")
    public void user_clicks_send_button_and_error_message_is_not_displayed() {

        // switch from iFrame back to default Content
        Driver.getDriver().switchTo().defaultContent();
        homePage.sendButton.click();

        // I think this is correct? Or is this try-catch redundant?
        try {
            Assert.assertFalse("recipientNotSpecifiedErrorMessage is being displayed --> Test Fail!" , homePage.recipientNotSpecifiedErrorMessage.isDisplayed());
            Assert.assertFalse("titleNotSpecifiedErrorMessage is being displayed --> Test Fail!" , homePage.titleNotSpecifiedErrorMessage.isDisplayed());
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException being thrown because Error Message is not displayed --> Test Passing!");
        }
    }

    @Then("all employees is default recipient")
    public void all_employees_is_default_recipient() {
    Assert.assertTrue(homePage.allEmployeeOption.isEnabled());
    }


    @Then("user clicks cancel and message box closes")
    public void user_clicks_cancel_and_message_box_closes() {
        // switch from iFrame back to default Content
        Driver.getDriver().switchTo().defaultContent();
        homePage.cancelMessageBtn.click();
        // if "Send Button" is NOT displayed, then message box is closed
        Assert.assertFalse(homePage.sendButton.isDisplayed());
    }


}
