@Structure
Feature:Profile  and Logout functionality

  User Story:
As a user, I should be able to log out from the app
  Background: user is already on the login page
    Given user is on the login page
  Scenario Outline: Verify users can log out from the app
    When user logs in as "<userType>"
    When the user clicks the profile name
    And the user clicks the "Log out" button
    Then the user should be logged out successfully

    Examples:
      | userType |
      | hr       |
      | helpdesk |
      | marketing|



  Scenario Outline: Verify users see 5 options under the profile name
    When user logs in as "<userType>"
    And the user clicks the profile name
    Then the user should see 5 options under the profile name
      | My Profile             |
      | Edit Profile Settings  |
      | Themes                 |
      | Configure notifications|
      | Log out                |

    Examples:
      | userType |
      | hr       |
      | helpdesk |
      | marketing|
