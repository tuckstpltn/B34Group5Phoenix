package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.ProfilePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class ProfilePageStepDef {

    HomePage homePage = new HomePage();

    ProfilePage profilePage = new ProfilePage();

    @When("user clicks username to reveal dropdown")
    public void user_clicks_username_to_reveal_dropdown() {
        homePage.usernameBlock.click();
    }

    @When("user clicks My Profile")
    public void user_clicks_my_profile() {
        homePage.myProfileLink.click();
    }

    @Then("user is on {string} My Profile Page")
    public void user_is_on_my_profile_page(String userType) {
        String myProfilePageTitle = ConfigurationReader.getProperty(userType+ "_username");
        BrowserUtils.verifyTitle(myProfilePageTitle);
    }

    @Given("general tab is selected")
    public void general_tab_is_selected() {

    }

    @Then("user email is the same as user account")
    public void user_email_is_the_same_as_user_account() {

    }


}
