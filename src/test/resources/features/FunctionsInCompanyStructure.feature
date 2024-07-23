@Structure
Feature: As a user, I should be able to use functions on Company Structure under Employee menu

    Scenario Outline: Verify that the Company Structure is visible for all <userType> types.
      When user logs in as "<userType>"
      And user clicks "Employees"
      Then user should see the "<companyStructureTitle>" Employees page
      Examples:
        | userType  | companyStructureTitle |
        | hr        | CompanyStructure      |
        | helpdesk  | CompanyStructure      |
        | marketing | CompanyStructure      |

  Scenario: Verify that hr user can add a department from the Company Structure
      When user logs in as "hr"
      And user clicks "Employees"
      And user add department with name "Department"
      Then user should see created department

    Scenario Outline: Verify that the "ADD DEPARTMENT" button is not displayed for helpdesk and marketing users
      When user logs in as "<userType>"
      And user clicks "Employees"
      Then user should not see ADD DEPARTMENT button
      Examples:
        | userType  | ADD DEPARTMENT |
        | helpdesk  | ADD DEPARTMENT |
        | marketing | ADD DEPARTMENT |
