@RegisterProduct
Feature: RegisterProduct

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Registration home page - Registered product
    When User clicks on "Configuration"
    When user click on the "Register Product"
    #Then user should able to see the "Product Registration"
    #Then Special Message displayed"Your Intradyn appliance"

  Scenario: Hide Side Menu
    When User clicks on "Configuration"
    When user click on the "Register Product"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When User clicks on "Configuration"
    When user click on the "Register Product"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When User clicks on "Configuration"
    When user click on the "Register Product"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When User clicks on "Configuration"
    When user click on the "Register Product"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When User clicks on "Configuration"
    When user click on the "Register Product"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logut link
    When User clicks on "Configuration"
    When user click on the "Register Product"
    Then user click on Logout Icon
    Then user able to see Login Page
