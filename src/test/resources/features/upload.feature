@Structure
Feature: Upload files and pictures while sending appreciation

  UserStory:
  As a story i should be able to upload files and pictures while sending appreciation.

  Background: user is already on the login page
    Given user is on the login page
    When user logs in as "<userType>"

  Scenario Outline: Verify users can upload files and pictures
    Given the user is on the appreciation page
    When the user uploads the following files:
      | filePath
      | path/to/file.pdf          |
      | path/to/file.txt          |
      | path/to/file.jpeg         |
      | path/to/file.png          |
      | path/to/file.docx         |

    Then the user should see the files successfully uploaded

    Examples:
      | userType |
      | hr
