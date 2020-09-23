@RemoteBackupSchedule
Feature: RemoteBackupSchedule

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Testing Remote Backup Schedule
    When user clicks Backup tab
    When user clicks "Remote Backup Schedule" tab
    Then user have to see the "Remote Backup Schedule"
    Then Frequency radio buttons and I never intend to schedule this job checkbox is displayed

  Scenario: Testing Remote Backup Schedule - Frequency
    When user clicks Backup tab
    When user clicks "Remote Backup Schedule" tab
    Then user have to see the "Remote Backup Schedule"
    Then click on submit button
    Then Remote backup schedule has been updated message is displayed

  Scenario: Testing Remote Backup Schedule - Hourly
    When user clicks Backup tab
    When user clicks "Remote Backup Schedule" tab
    Then user have to see the "Remote Backup Schedule"
    Then Select Hourly option, and set the hours "3"
    Then click on submit button
    Then Remote backup schedule has been updated message is displayed

  Scenario: Testing Remote Backup Schedule - Daily
    When user clicks Backup tab
    When user clicks "Remote Backup Schedule" tab
    Then user have to see the "Remote Backup Schedule"
    And Select daily option at "6", and set the time "10"
    Then click on submit button
    Then Remote backup schedule has been updated message is displayed

  Scenario: Testing Remote Backup Schedule - Weekly per day
    When user clicks Backup tab
    When user clicks "Remote Backup Schedule" tab
    Then user have to see the "Remote Backup Schedule"
    And Select weekly on "Friday" option at "6", and set the time "10"
    Then click on submit button
    Then Remote backup schedule has been updated message is displayed
    
    Scenario: Uncheck the never intend to do a backup checkbox
    When user clicks Backup tab
    When user clicks "Remote Backup Schedule" tab
    Then user have to see the "Remote Backup Schedule"
    Then click on submit button
    Then Remote backup schedule has been updated message is displayed
    
    Scenario: Select the never intend to do a backup checkbox
    When user clicks Backup tab
    When user clicks "Remote Backup Schedule" tab
    Then user have to see the "Remote Backup Schedule"
    And Select the never intend to do a backup check box
    Then pop up alert message displayed
    
    Scenario: Pop up with Cancel button
    When user clicks Backup tab
    When user clicks "Remote Backup Schedule" tab
    Then user have to see the "Remote Backup Schedule"
    And Select the never intend to do a backup check box
    Then pop up alert message displayed
    And User click Alert Cancel button
    Then Check box should be unchecked
    
    Scenario: Pop up with OK button
    When user clicks Backup tab
    When user clicks "Remote Backup Schedule" tab
    Then user have to see the "Remote Backup Schedule"
    And Select the never intend to do a backup check box
    Then pop up alert message displayed
    And User click Alert Ok button
    Then Check box should be unchecked