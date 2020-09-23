@ViewBackupHistory
Feature: ViewBackupHistory

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Check Remote Backup History page
    When user clicks Backup tab
    When user clicks "View Backup History" tab
    Then user have to see the "Remote Backup History"
    Then Files displayed according to its start time, end time, File type or Error message along with the up and down arrows
   
  Scenario: Check Remote Backup History page - up and down arrow along with Start option
    When user clicks Backup tab
    When user clicks "View Backup History" tab
    Then user have to see the "Remote Backup History"
    Then Click on "Start" up and down arrow once
    Then Files is displayed in the descending order of it files "1" time

  Scenario: Check Remote Backup History page - up and down arrow along with end option
    When user clicks Backup tab
    When user clicks "View Backup History" tab
    Then user have to see the "Remote Backup History"
    Then Click on "End" up and down arrow once
    Then Files is displayed in the descending order of it files "2" time

  Scenario: Check Remote Backup History page - up and down arrow along with files option
    When user clicks Backup tab
    When user clicks "View Backup History" tab
    Then user have to see the "Remote Backup History"
    Then Click on "Files" up and down arrow once
    Then Files is displayed in the descending order of it files "3" time

  Scenario: Check Remote Backup History page - up and down arrow along with error option
    When user clicks Backup tab
    When user clicks "View Backup History" tab
    Then user have to see the "Remote Backup History"
    Then Click on "Error Messages" up and down arrow once
    Then Files is displayed in the descending order of it files "4" time
