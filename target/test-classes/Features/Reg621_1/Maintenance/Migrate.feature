@MigrateEmail
Feature: MigrateEmail

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
    

  Scenario: Hide Side Menu
    When User Click On "Maintenance" tab
    When User Click On "Migrate Email" tab
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When User Click On "Maintenance" tab
    When User Click On "Migrate Email" tab
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When User Click On "Maintenance" tab
    When User Click On "Migrate Email" tab
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When User Click On "Maintenance" tab
    When User Click On "Migrate Email" tab
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When User Click On "Maintenance" tab
    When User Click On "Migrate Email" tab
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout Link
    When User Click On "Maintenance" tab
    When User Click On "Migrate Email" tab
    Then user click on Logout Icon
    Then user able to see Login Page