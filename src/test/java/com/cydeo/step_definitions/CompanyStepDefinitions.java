package com.cydeo.step_definitions;

import com.cydeo.pages.CompanyPage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class CompanyStepDefinitions {

    CompanyPage companyPage = new CompanyPage();

    @When("user clicks Company in the activity screen")
    public void user_clicks_company_in_the_activity_screen() {
        companyPage.Companybutton.click();


    }
    @Then("user should be able to see following {int} modules in the Company page")
    public void user_should_be_able_to_see_following_modules_in_the_company_page(Integer size, List<String> expectedList ) {
        List<String>actualList = BrowserUtils.getElementsText(companyPage.modules);
        Assert.assertEquals(expectedList,actualList);

    }


}
