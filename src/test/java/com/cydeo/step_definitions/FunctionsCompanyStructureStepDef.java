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
}
