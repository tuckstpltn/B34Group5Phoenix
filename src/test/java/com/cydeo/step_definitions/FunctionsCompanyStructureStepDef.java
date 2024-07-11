package com.cydeo.step_definitions;

import com.cydeo.pages.FunctionsInCompanyStructurePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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

    @Then("user should be able to see {string} as page title")
    public void userShouldLandOnHomePageWith(String title) {
        BrowserUtils.verifyTitleContains(title);
    }

    FunctionsInCompanyStructurePage functionsInCompanyStructurePage = new FunctionsInCompanyStructurePage();




    @And("user clicks {string}")
    public void userClicks(String employee) {
        functionsInCompanyStructurePage.employees.click();
    }

    @And("user add department with name {string}")
    public void userAddDepartmentWithName(String department) {
    functionsInCompanyStructurePage.addDepartment.click();
    functionsInCompanyStructurePage.name.sendKeys(department);
    functionsInCompanyStructurePage.addButton.click();
    }

    @Then("user should see created department")
    public void userShouldSeeCreatedDepartment() {
        Assert.assertTrue(functionsInCompanyStructurePage.name.isDisplayed());
    }

    @Then("user should see the {string}")
    public void userShouldSeeThe(String arg0) {
        Assert.assertTrue(functionsInCompanyStructurePage.companyStructureTitle.isDisplayed());
    }

    @Then("user should see the {string} Employees page")
    public void userShouldSeeTheEmployeesPage( String arg1) {
        Assert.assertTrue(functionsInCompanyStructurePage.companyStructureTitle.isDisplayed());
    }
}
