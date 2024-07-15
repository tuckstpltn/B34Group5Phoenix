package com.cydeo.step_definitions;

import com.cydeo.pages.UploadFilePage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class UploadFileStepDefinition {
    UploadFilePage uploadFile = new UploadFilePage();


    @Given("the user is on the appreciation page")
    public void theUserIsOnTheAppreciationPage() {
        //Locate the upload FILE
        // Click on the Appreciation button to navigate to the appreciation page
        uploadFile.appreciationPageButton.click();

    }

    @When("the user uploads the following files:")
    public void theUserUploadsTheFollowingFiles(DataTable dataTable) {
        List<String> filePaths = dataTable.asList(String.class);
        for (String filePath : filePaths) {
            System.out.println("Uploading file: " + filePath);
          uploadFile.UploadFilesAndImages.sendKeys(filePath);
            BrowserUtils.sleep(1); // Adding a small sleep to ensure each file is uploaded properly
        }
       uploadFile.SendButton.click();
    }

    @Then("the user should see the files successfully uploaded")
    public void theUserShouldSeeTheFilesSuccessfullyUploaded() {
        BrowserUtils.sleep(2);
       Assert.assertTrue(uploadFile.userSeeUploadedFiles.isDisplayed());
    }
}


