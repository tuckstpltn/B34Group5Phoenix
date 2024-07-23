@B34G5-145
Feature: Default

	
	@B34G5-142
	Scenario: As a user, I should be able to use functions on Company Structure under Employee menu
		Scenario Outline: Verify that the Company Structure is visible for all <userType> types.
		      When user logs in as "<userType>"
		      And user clicks "Employees"
		      Then user should see the "<companyStructureTitle>" Employees page
		      Examples:
		        | userType  | companyStructureTitle |
		        | hr        | CompanyStructure      |
		        | helpdesk  | CompanyStructure      |
		        | marketing | CompanyStructure      |	

	
	@B34G5-143
	Scenario: Verify that the HR user can add a department from the Company Structure.
		Scenario: Verify that hr user can add a department from the Company Structure
		      When user logs in as "hr"
		      And user clicks "Employees"
		      And user add department with name "Department"
		      Then user should see created department	

	
	@B34G5-144
	Scenario: Verify that the “ADD DEPARTMENT” button is not displayed for Helpdesk and Marketing users.
		Scenario Outline: Verify that the "ADD DEPARTMENT" button is not displayed for helpdesk and marketing users
		      When user logs in as "<userType>"
		      And user clicks "Employees"
		      Then user should not see ADD DEPARTMENT button
		      Examples:
		        | userType  | ADD DEPARTMENT |
		        | helpdesk  | ADD DEPARTMENT |
		        | marketing | ADD DEPARTMENT |