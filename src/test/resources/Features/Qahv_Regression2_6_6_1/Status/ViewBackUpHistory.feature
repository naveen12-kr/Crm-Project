@ViewBackUpHistory
Feature: ViewBackUpHistory

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Navigate to View Backup History
    When user click on the "Status"
    Then user should able to see header "Reports"
    #When user click on the "View Backup History"
    #Then user should able to see the "Remote Backup History"
    
    Scenario: Navigate to View Backup History
    When user click on the "Status"
    Then user should able to see header "Reports"
    #When user click on the "View Backup History"
    #Then user should able to see the "Remote Backup History"
    #Then Files displayed according to its start time, end time, File type or Error message along with the up and down arrows

  Scenario: View Sort by Start with latest date
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "View Backup History"
    #Then user should able to see the "Remote Backup History"
    #Then Click on "Start" down arrow once
    #Then Files is displayed in the descending order of it files "1" time

  Scenario: View Sort by Start with oldest date
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "View Backup History"
    #Then user should able to see the "Remote Backup History"
    #Then Click on "Start" up and down arrow once
    #Then Files is displayed in the descending order of it files "1" time

  Scenario: View Sort by End with latest date
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "View Backup History"
    #Then user should able to see the "Remote Backup History"
    #Then Click on "End" down arrow once
    #Then Files is displayed in the descending order of it files "2" time

  Scenario: View Sort by End with oldest date
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "View Backup History"
    #Then user should able to see the "Remote Backup History"
    #Then Click on "End" up and down arrow once
    #Then Files is displayed in the descending order of it files "2" time

  Scenario: Check the Files with descending order
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "View Backup History"
    #Then user should able to see the "Remote Backup History"
    #Then Click on "Files" down arrow once
    #Then Files is displayed in the descending order of it files "3" time

  Scenario: Check the Files with assending order
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "View Backup History"
    #Then user should able to see the "Remote Backup History"
    #Then Click on "Files" up and down arrow once
    #Then Files is displayed in the descending order of it files "3" time

  Scenario: Check the Error messages with descending order
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "View Backup History"
    #Then user should able to see the "Remote Backup History"
    #Then Click on "Error Messages" down arrow once
    #Then Files is displayed in the descending order of it files "4" time

  Scenario: Check the Error messages with assending order
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "View Backup History"
    #Then user should able to see the "Remote Backup History"
    #Then Click on "Error Messages" up and down arrow once
    #Then Files is displayed in the descending order of it files "4" time
    
