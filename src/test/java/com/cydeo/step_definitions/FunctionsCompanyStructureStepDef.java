package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FunctionsCompanyStructureStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        System.out.println("DONE IN HOOKS");
        //Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @When("user logs in as {string}")
    public void user_logs_in_as(String userType) {

        loginPage.login(userType);
    }



    @Then("user should see the {string}")
    public void userShouldSeeThe(String companyStructureTitle) {

        BrowserUtils.verifyTitleContains(companyStructureTitle);
    }
}
