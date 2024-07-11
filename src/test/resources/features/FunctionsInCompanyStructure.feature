@Structure
Feature: As a user, I should be able to use functions on Company Structure under Employee menu

  Background: user is already on the login page
    Given user is on the login page


    Scenario Outline: Verify that the Company Structure is visible for all <userType> types.
      When user logs in as "<userType>"
      Then user should see the "Company Structure"
      Examples:
        | userType |
        | hr       |
        | helpdesk |
        | marketing|

    Scenario: Verify that hr user can add a department from the Company Structure
      When user logs in as "hr"
      And user clicks "Employees"
      And user add department with name "Department"
      Then user should see created department
