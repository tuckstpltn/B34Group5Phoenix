@B34G5-141
Feature: Default


	@B34G5-128
	Scenario: Verify user should be able to login
		Feature: As a user, I should be able to login.
		
		  Background: user is already on the login page
		  Given user is on the login page
		
		  Scenario Outline: Verify that the <userType> can login with valid credentials abd land on the home page after successful login.
		    When user logs in as "<userType>"
		    Then user should be able to see "Portal" as page title
		    Examples:
		      | userType |
		      | hr       |
		      | helpdesk |
		      | marketing|	

	
	@B34G5-139
	Scenario:  Verify that "Incorrect login or password" error message is displayed for invalid (valid username-invalid password and invalid username-valid password) credentials.
		Scenario Outline: Verify that "Incorrect login or password" error message is displayed for invalid credentials.
		      When user logged in with username as "<username>" and password as "<password>"
		      Then user should be able to see error message "Incorrect login or password"
		      Examples:
		      | username                    | password |
		      | hr1@cyberteckschool.com     | invalid  |
		      | invalid@cyberteckschool.com | UserUser |
		      | invalid@cyberteckschool.com | invalid  |	

	#4-Verify that the "Remember me on this computer" link exists and is clickable on the login page.
	#5-Verify that the password is in bullet signs by default.
	@B34G5-140
	Scenario: 3- Verify that the "Please fill out this field" error message is displayed if the password or username is empty.
		Scenario: Verify that the "Remember me on this computer" links exists
		    Then user should be able to see remember me box
		    Then user should be able to see Remember me checkbox clicked
		    Then user should be able to see password is in bullet signs by default