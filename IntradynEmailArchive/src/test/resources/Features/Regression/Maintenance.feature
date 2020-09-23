Feature: Maintenance

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Check Download page link
    When User Click On "Maintenance" tab
    When User Click On "Download Tools" tab
    And user clicks on the visit this page link
    Then user able to see "Download Tools"

  Scenario: Hide Side Menu
    When User Click On "Maintenance" tab
    When User Click On "Download Tools" tab
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When User Click On "Maintenance" tab
    When User Click On "Download Tools" tab
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When User Click On "Maintenance" tab
    When User Click On "Download Tools" tab
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When User Click On "Maintenance" tab
    When User Click On "Download Tools" tab
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When User Click On "Maintenance" tab
    When User Click On "Download Tools" tab
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout Link
    When User Click On "Maintenance" tab
    When User Click On "Download Tools" tab
    Then user click on Logout Icon
    Then user able to see Login Page

  Scenario: Check Logout Link (Migrate Emails)
    When User Click On "Maintenance" tab
    When User Click On "Migrate Email" tab
    Then user click on Logout Icon
    Then user able to see Login Page

  Scenario: Check Help link (Uploaded Emails)
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags
  
  Scenario: Check Logout Link (Uploaded Emails)
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user click on Logout Icon
    Then user able to see Login Page
    
    @Maintenance
    Scenario: Check for Maintenance page status for a configured machine
    When User Click On "Maintenance" tab
    When User Click On "Maintenance Key" tab
    Then User able to see the Maintanence Key Contract details
    Then The information displayed is read-only
    
    
