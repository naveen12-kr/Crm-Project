@BackUp-WarmStandby
Feature: BackUp-WarmStandby

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Testing Configuration page
    When user clicks Backup tab
    Then user have to see the "Warm Standby Overview"
    Then Staus is displayed with three details Encryption Key, Warning, Enter stand by mode
    Then Warning Standby Target is displayed with Name, FQDN or IP, Product Key, Current Sched, Actions
