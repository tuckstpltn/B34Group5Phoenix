package com.cydeo.step_definitions;

import com.cydeo.pages.HomePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.ProfilePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ProfilePageStepDef {

    /*
    - Some redundancy in steps definitions...
    - Can be cleaned up.
     */

    HomePage homePage = new HomePage();

    ProfilePage profilePage = new ProfilePage();

    @When("user clicks username to reveal dropdown and clicks My Profile")
    public void user_clicks_username_to_reveal_dropdown_and_clicks_my_profile() {
        homePage.usernameBlock.click();
        homePage.myProfileLink.click();
    }

    @Then("user confirms {string} My Profile Page")
    public void user_confirms_my_profile_page(String userType) {
        String username = ConfigurationReader.getProperty(userType+ "_username");
        BrowserUtils.verifyTitle(username);
    }

    @Given("general tab is selected")
    public void general_tab_is_selected() {
        profilePage.general.click();
    }

    @Then("user {string} email is the same as user account")
    public void userEmailIsTheSameAsUserAccount(String userType) {
        String username = ConfigurationReader.getProperty(userType+ "_username");
        String emailText = profilePage.userEmail.getText();
        Assert.assertEquals(username, emailText);
    }
}
