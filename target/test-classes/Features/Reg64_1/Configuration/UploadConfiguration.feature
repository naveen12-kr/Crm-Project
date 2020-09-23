@UploadConfiguration
Feature: UploadConfiguration

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
    
    Scenario: Navigate to Upload Configuration
    When User clicks on "Configuration"
    When user click on the "Upload Configuration"
    Then user should able to see the "Upload Configuration"
    Then Special Message displayed"This appliance contains emails.  You cannot upload a new configuration"
    
    Scenario: Check with here link
    When User clicks on "Configuration"
    When user click on the "Upload Configuration"
    Then user should able to see the "Upload Configuration"
    And user Clicks on the here Link
    Then user should able to see the "System Status"