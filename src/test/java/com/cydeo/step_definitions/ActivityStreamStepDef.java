package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ActivityStreamStepDef {

    /*
    Activity Stream Elements located under HomePage
     */
    HomePage homePage = new HomePage();


    @Then("user clicks {string} to see {string} {string} {string} {string}")
    public void user_clicks_to_see(String string, String string2, String string3, String string4, String string5) {

    }


    @Then("user should see {string} {string} {string} {string} {string} options")
    public void user_should_see_options(String message, String task, String event, String poll, String more) {

        // Message
        Assert.assertEquals(homePage.messageTab.getText(), message);
        homePage.messageTab.isDisplayed();

        // Task
        Assert.assertEquals(homePage.taskTab.getText(), task);
        homePage.taskTab.isDisplayed();

        // Event
        Assert.assertEquals(homePage.eventTab.getText(), event);
        homePage.eventTab.isDisplayed();

        // Poll
        Assert.assertEquals(homePage.pollTab.getText(), poll);
        homePage.pollTab.isDisplayed();

        // More
        Assert.assertEquals(homePage.moreTab.getText(), more);
        homePage.moreTab.isDisplayed();

    }
}
