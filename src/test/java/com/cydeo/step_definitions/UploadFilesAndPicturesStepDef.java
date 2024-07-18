package com.cydeo.step_definitions;

import com.cydeo.pages.UploadFilesAndPicturesPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.cydeo.pages.UploadFilesAndPicturesPage.clickElementWithExactId;
import static com.cydeo.utilities.BrowserUtils.waitFor;

public class UploadFilesAndPicturesStepDef {
    UploadFilesAndPicturesPage uploadFilesAndPicturesPage = new UploadFilesAndPicturesPage();

    @Then("user clicks on Activity Stream")
    public void userClicksOnActivityStream() {
        uploadFilesAndPicturesPage.activityStream.click();
    }





    @When("user clicks {word} {word} with exact id {string}")
    public void user_clicks_send_button_with_exact_id(String ignoredWord1, String ignoredWord2, String id) {
        clickElementWithExactId(id);

    }

    @When("user upload the files {string}")
    public void user_upload_the_files(String fileName) {
        uploadFilesAndPicturesPage.uploadFile(fileName);
    }

    @Then("user should be able to see {string} in the uploaded files")
    public void user_should_be_able_to_see_in_the_uploaded_files(String fileName) {
        waitFor(3);
        String uploadedFileText = uploadFilesAndPicturesPage.uploadedFile.getText();
        System.out.println("uploadedFileText = " + uploadedFileText);
        Assert.assertTrue(uploadedFileText.contains(fileName.substring(0,fileName.indexOf("."))));
    }







    @Given("the user is on the text editor page")
    public void the_user_is_on_the_text_editor_page() {


    }

    @When("the user uploads a file or image")
    public void the_user_uploads_a_file_or_image() {


    }

    @When("the user inserts the uploaded file or image into the text")
    public void the_user_inserts_the_uploaded_file_or_image_into_the_text() {


    }

    @Then("the file or image should be inserted into the text successfully")
    public void the_file_or_image_should_be_inserted_into_the_text_successfully() {


    }



}
