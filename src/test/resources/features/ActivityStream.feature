@B34G5-134
Feature: Default


  @B34G5-133
  Scenario Outline: Verify that the user views the following 4 options under the MORE tab.
    Given user logs in as "<userType>"
    Then user clicks "MORE" to see "File" "Appreciation" "Announcement" "Workflow"
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


  @B34G5-132
  Scenario Outline: Verify that the user views the following options on the Activity Stream page.
    Given user logs in as "<userType>"
    Then user should see "MESSAGE" "TASK" "POLL" "MORE" options
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |