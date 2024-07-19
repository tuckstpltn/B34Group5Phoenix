@B34G5-138
Feature: As a user, I should be able to send messages by clicking on Message tab in the Activity Stream

  Background: user is already on the login page
    Given user is on the login page

  @B34G5-135
  Scenario Outline: Verify that the user can send a message by filling in the mandatory fields.
    Given user logs in as "<userType>"
    Then user clicks send message block
    Then user types message
    Then user clicks send button and error message is not displayed
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


  @B34G5-136
  Scenario Outline: Verify that the message delivery is to 'All employees' by default.
    Given user logs in as "<userType>"
    And user clicks send message block
    Then all employees is default recipient
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


  @B34G5-137
  Scenario Outline: Verify that the user can cancel sending message at any time before sending.
    Given user logs in as "<userType>"
    Then user clicks send message block
    And user types message
    Then user clicks cancel and message box closes
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |