@B34G5-153
Feature: Default

	
	@B34G5-150
	Scenario Outline: Verify that the user can upload files and pictures. Supported file formats .pdf, .txt, .jpeg, .png, .docx
		When user logs in as "<userType>"
		    And user clicks on Activity Stream
		    And user clicks send message block
		    And user clicks Upload area with exact id "bx-b-uploadfile-blogPostForm"
		    When user upload the files "<fileType>"
		    Then user should be able to see "<fileType>" in the uploaded files
		
		
		    Examples:
		      | userType  | fileType      |  |  |
		      | marketing | jpeg_43-2.jpg |  |  |
		      | hr        | jpeg_43-2.jpg |  |  |
		      | helpdesk  | jpeg_43-2.jpg |  |  |
		
		    Examples:
		      | userType  | fileType                                                                                  |
		      | marketing | png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png |
		      | hr        | png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png |
		      | helpdesk  | png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png |
		
		    Examples:
		      | userType  | fileType               |
		      | marketing | Selenium_Hierarchy.pdf |
		      | hr        | Selenium_Hierarchy.pdf |
		      | helpdesk  | Selenium_Hierarchy.pdf |	

	
	@B34G5-151
	Scenario Outline: Verify that the user can insert the files and images into the text.
		When user logs in as "<userType>"
		    And user clicks on Activity Stream
		    And user clicks send message block
		    When the user is on the text editor page
		    And user clicks Upload area with exact id "bx-b-uploadfile-blogPostForm"
		    When user upload the files "<fileType>"
		    And the user inserts the uploaded file or image into the text
		    Then the file or image should be inserted into the text successfully
		
		    Examples:
		      | userType | fileType      |
		      | hr       | jpeg_43-2.jpg |	

	
	@B34G5-152
	Scenario Outline:  Verify that the user can remove files and images at any time before sending.
		When user logs in as "<userType>"
		    And user clicks on Activity Stream
		    And user clicks send message block
		    When the user is on the text editor page
		    And user clicks Upload area with exact id "bx-b-uploadfile-blogPostForm"
		    When user upload the files "<fileType>"
		    And the user inserts the uploaded file or image into the text
		    When the user decides to remove a file or image
		    Then the file or image should be removed successfully
		
		    Examples:
		      | userType | fileType      |
		      | hr       | jpeg_43-2.jpg |