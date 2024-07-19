@Drive
Feature: As a user, I should be able to access the Drive page.

  Background: user is already on the login page
    Given user is on the login page

  Scenario Outline: Verify that user have access to the Drive page
    When user logs in as "<userType>"
    When user clicks Drive in the activity screen
    Then user should be able to see following 7 modules in the Drive page
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |
      | More                       |

    Examples:
      | userType |
      | hr       |
      | helpdesk |
      | marketing|
