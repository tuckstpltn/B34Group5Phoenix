Feature: As a user, I should be able to access the Company page.

  Background: user is already on the login page
    Given user is on the login page

  Scenario Outline: Verify that user have access to the Company page
    When user logs in as "<userType>"
    When user clicks Company in the activity screen
    Then user should be able to see following 8 modules in the Company page

      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News        |
      | More                 |

    Examples:
      | userType |
      | hr       |
      | helpdesk |
      | marketing|
