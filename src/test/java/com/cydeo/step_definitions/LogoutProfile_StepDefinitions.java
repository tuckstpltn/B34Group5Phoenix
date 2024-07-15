package com.cydeo.step_definitions;

import com.cydeo.pages.LogoutProfilePage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class LogoutProfile_StepDefinitions {
    LogoutProfilePage logoutProfilePage = new LogoutProfilePage();

    @When("the user clicks the profile name")
    public void the_user_clicks_the_profile_name() {
        // Locate the profile name element
        logoutProfilePage.profileUserName.click();

    }

    @When("the user clicks the {string} button")
    public void the_user_clicks_the_logout_button(String string) {
        logoutProfilePage.logOut.click();


    }

    @Then("the user should be logged out successfully")
    public void the_user_should_be_logged_out_successfully() {
        Assert.assertTrue(logoutProfilePage.authorization.isDisplayed());

    }


    @Then("the user should see {int} options under the profile name")
    public void theUserShouldSeeOptionsUnderTheProfileName(int size, List<String>expected) {
        Assert.assertEquals(expected, BrowserUtils.getElementsText(logoutProfilePage.profileOptions));
    }
}




