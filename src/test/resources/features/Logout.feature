Feature: Profile and Logout functionality

  User Story:
As a user, I should be able to log out from the app

  Scenario: Verify users can log out from the app
    Given the user is logged in as "HR"
    When the user clicks the profile name
    And the user clicks the "Log out" button
    Then the user should be logged out successfully

  Scenario: Verify users see 5 options under the profile name
    Given the user is logged in as "HR"
    When the user clicks the profile name
    Then the user should see 5 options under the profile name
    And the options should be:
      | My Profile             |
      | Edit Profile Settings  |
      | Themes                 |
      | Configure notifications|
      | Log out                |
