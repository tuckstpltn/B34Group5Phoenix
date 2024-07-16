@link
Feature: As a user, I should be able to add link message.

  Background: user is already on the login page
    Given user is on the login page

  Scenario Outline: Verify that user can add link in message
    When user logs in as "<userType>"
    And user clicks message in the activity screen
    And user clicks on the add link tab
    Then user should be able to add link in message link

    Examples:
      | userType |
      | hr       |
      | helpdesk |
      | marketing|
