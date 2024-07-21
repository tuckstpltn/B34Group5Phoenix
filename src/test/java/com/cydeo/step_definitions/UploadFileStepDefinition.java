package com.cydeo.step_definitions;

import com.cydeo.pages.UploadFilePage;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
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

    public void UserUploadsFiles(String fileName) {
        String fileSeparator = System.getProperty("file.separator");
        String path = System.getProperty("user.dir") + fileSeparator + "src/test/resources/features/Files" + fileSeparator + fileName;
        //  uploadFile.sendKeys(path);
        uploadFile.SendButton.click();

    }
    @Then("user should be able to see {string} in the uploaded files")
    public void user_should_be_able_to_see_in_the_uploaded_files(String fileName) {
      //  waitFor(3);
      //  String uploadedFileText = activityStreamPage.uploadedFile.getText();
     //   System.out.println("uploadedFileText = " + uploadedFileText);
        //Assert.assertTrue(uploadedFileText.contains(fileName.substring(0,fileName.indexOf("."))));

}

    @And("the user removes the uploaded files")
    public void theUserRemovesTheUploadedFiles() {
       // uploadFile.removeUploadedFiles();
    }

    @Then("the user should not see the files in the upload list")
    public void theUserShouldNotSeeTheFilesInTheUploadList() {
        BrowserUtils.sleep(2);
        //Assert.assertFalse(uploadFile.verifyUploadedFiles());
    }
    }


