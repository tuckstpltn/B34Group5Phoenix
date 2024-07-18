package com.cydeo.step_definitions;

import com.cydeo.pages.LinkPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LinkStepDefinitions {

    LinkPage linkPage = new LinkPage();
    @When("user clicks message in the activity screen")
    public void user_clicks_message_in_the_activity_screen() {
        linkPage.LinkMessage.click();


    }

    @And("user clicks on the add link tab")
    public void userClicksOnTheAddLinkTab() {
        linkPage.AddLink.click();

    }

    @Then("user should be able to add link in message link")
    public void userShouldBeAbleToAddLinkInMessageLink() {
        linkPage.textbox.sendKeys("google");
        linkPage.Urlbox.sendKeys("www.google.com");
        linkPage.savebtn.click();

        Assert.assertEquals("google",linkPage.googlelink.getText());

    }
}
