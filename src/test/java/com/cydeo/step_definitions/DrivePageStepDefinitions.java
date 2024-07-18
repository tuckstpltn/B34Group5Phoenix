package com.cydeo.step_definitions;

import com.cydeo.pages.DrivePage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DrivePageStepDefinitions {

    DrivePage drivePage = new DrivePage();

    @When("user clicks Drive in the activity screen")
    public void user_clicks_drive_in_the_activity_screen() {
        drivePage.Drivebutton.click();


    }


    @Then("user should be able to see following {int} modules in the Drive page")
    public void userShouldBeAbleToSeeFollowingModulesInTheDrivePage(int size, List<String>expectedList) {
        List<String>actualList = BrowserUtils.getElementsText(drivePage.allModulesOfDrivePage);
        Assert.assertEquals(expectedList,actualList);


    }
}
