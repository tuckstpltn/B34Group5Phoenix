Feature: As a user, I should be able to upload files and pictures as messages.

  Scenario Outline: Verify that all <userType> can upload files and pictures Supported file formats .pdf, .txt, .jpeg, .png, .docx.
    When user logs in as "<userType>"
    And user clicks on Activity Stream
    And user clicks send message block
    And user clicks Upload area with exact id "bx-b-uploadfile-blogPostForm"
    When user upload the files "<fileType>"
    Then user should be able to see "<fileType>" in the uploaded files


    Examples:
      | userType  | fileType      |
      | marketing | jpeg_43-2.jpg |
      | hr        | jpeg_43-2.jpg |
      | helpdesk  | jpeg_43-2.jpg |


  Scenario: Verify that the user can insert the files and images into the text
    Given the user is on the text editor page
    When the user uploads a file or image
    And the user inserts the uploaded file or image into the text
    Then the file or image should be inserted into the text successfully

  Scenario: Verify that the user can remove files and images at any time before sending
    Given the user is on the text editor page
#    And the user has uploaded files or images
#    When the user decides to remove a file or image
#    Then the file or image should be removed successfully