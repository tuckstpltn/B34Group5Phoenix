@login
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

    Scenario Outline: Verify that "Incorrect login or password" error message is displayed for invalid credentials.
      When user logged in with username as "<username>" and password as "<password>"
      Then user should be able to see error message "Incorrect login or password"
      Examples:
      | username                    | password |
      | hr1@cyberteckschool.com     | invalid  |
      | invalid@cyberteckschool.com | UserUser |
      | invalid@cyberteckschool.com | invalid  |


  Scenario: Verify that the "Remember me on this computer" links exists
    Then user should be able to see remember me box
    Then user should be able to see Remember me checkbox clicked
    Then user should be able to see password is in bullet signs by default
