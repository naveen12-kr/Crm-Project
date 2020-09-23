@FederatedConfiguration
Feature: Federated Configuration

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
    
    Scenario: Check the Federated Configuration Page
    When User clicks on "Configuration"
    When User clicks on "Federated Configuration"
    Then user should able to see the "Federated Search Configuration"
    #Then Federated Search Configuration page should be displayed with  3 sections
    
    Scenario: Check the Server Information
    When User clicks on "Configuration"
    When User clicks on "Federated Configuration"
    Then user should able to see the "Federated Search Configuration"
    #Then ServerInfo section should be displayed with all the requied fields
    
    Scenario: Hide Side Menu
    When User clicks on "Configuration"
    When User clicks on "Federated Configuration"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When User clicks on "Configuration"
    When User clicks on "Federated Configuration"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When User clicks on "Configuration"
    When User clicks on "Federated Configuration"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When User clicks on "Configuration"
    When User clicks on "Federated Configuration"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When User clicks on "Configuration"
    When User clicks on "Federated Configuration"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout link
    When User clicks on "Configuration"
    When User clicks on "Federated Configuration"
    Then user click on Logout Icon
    Then user able to see Login Page
    