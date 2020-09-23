@RestorePreviousBackup
Feature: RestorePreviousBackup

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

    Scenario: Navigate to Restore Previous Backup page
    When user clicks Backup tab
    When user clicks "Restore Previous Backup" tab
    Then user have to see the "Restore Previous Backup"
    
    Scenario: Checking Remote Host Config link
    When user clicks Backup tab
    When user clicks "Restore Previous Backup" tab
    Then user have to see the "Restore Previous Backup"
    When user click on Data Retention link
    Then user have to see the "Remote Backup Host Configuration"
    