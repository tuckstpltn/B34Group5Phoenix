@B34G5-131
Feature: Default

  Background: user is already on the login page
    Given user is on the login page

  @B34G5-129
  Scenario Outline: Verify that the user can view the following
    Given user logs in as "<userType>"
    When user clicks username to reveal dropdown
    And user clicks My Profile
    Then user is on "<userType>" My Profile Page
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


  @B34G5-130
  Scenario: Verify that the email under the General tab is the same as the users account
    Given user is on My Profile Page
    And general tab is selected
    Then user email is the same as user account