@B34G5-141
Feature: As a user, I should be able to login.


	@B34G5-128
		  Scenario Outline: Verify that the  can login with valid credentials abd land on the home page after successful login.
			Given user is on the login page
			When user logs in as "<userType>"
		    Then user should be able to see "Portal" as page title
		    Examples:
		      | userType |
		      | hr       |
		      | helpdesk |
		      | marketing|	

	
	@B34G5-139
		Scenario Outline: Verify that "Incorrect login or password" error message is displayed for invalid credentials.
			  Given user is on the login page
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
		Scenario: Verify that the "Remember me on this computer" links exists
			Given user is on the login page
			Then user should be able to see remember me box
		    Then user should be able to see Remember me checkbox clicked
		    Then user should be able to see password is in bullet signs by default