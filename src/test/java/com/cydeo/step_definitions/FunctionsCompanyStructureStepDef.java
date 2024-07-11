package com.cydeo.step_definitions;

import com.cydeo.pages.FunctionsInCompanyStructurePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertFalse;

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

    @Then("user should see the {string}")
    public void userShouldSeeThe(String arg0) {
        Assert.assertTrue(functionsInCompanyStructurePage.companyStructureTitle.isDisplayed());
    }

    @Then("user should see the {string} Employees page")
    public void userShouldSeeTheEmployeesPage( String arg1) {
        Assert.assertTrue(functionsInCompanyStructurePage.companyStructureTitle.isDisplayed());
    }

    @Then("user should not see ADD DEPARTMENT button")
    public void userShouldNotSeeADDDEPARTMENTButton() {
        try {
            WebElement driver = null;
            WebElement addButton = driver.findElement(By.xpath("(//span[.='Add department'])[1]"));
            assertFalse("ADD DEPARTMENT button should not be visible", addButton.isDisplayed());
        } catch (NoSuchElementException e) {
            // Element not found, which is expected
        }
    }
}
