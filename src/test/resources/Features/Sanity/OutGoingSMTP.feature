@OutgoingSMTP
Feature: Outgoing SMTP

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Outgoing SMTP
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    And user enters mail servfer username
    And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed

  Scenario: Outgoing SMTP
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    And user enters mail servfer username
    And user enters mail server password
    And user enters from address
    Then User click on Disable Outgoing Email
    Then Pop Up window is displayed
    And user clicks on Ok button
    Then Message displayed
