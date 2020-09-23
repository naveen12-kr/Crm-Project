@SmtpServer
Feature: Smtp Server

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Start and stop smtp server
    When User navigate to Configuration
    Then User see Email Server Page
    When User click on Configuration "SMTP Server"
    Then Start or Stop smtp Server

  Scenario: smtp server
    When User navigate to Configuration
    Then User see Email Server Page
    When User click on Outgoing SMTP
    Then Outgoing smtp server page should open
    When User click on Save
    Then Outgoing mail save successfully

  Scenario: Check SMTP Server Status
    When User navigate to Configuration
    Then User see Email Server Page
    When User click on Configuration "SMTP Server"
    And Click on Status icon blue magnifying glass
    Then Process details for the SMTP Server on System Status page is displayed

  Scenario: Restart SMTP Server when active
    When User navigate to Configuration
    And User navigate to SMTP Server in Email servers
    And The SMTP Server is currently running
    And User clicks on Reset
    Then server is restarted message is displayed
