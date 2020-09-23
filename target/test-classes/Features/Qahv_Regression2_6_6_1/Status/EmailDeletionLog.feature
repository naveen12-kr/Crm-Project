@EmailDeletionLog
Feature: EmailDeletionLog

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Navigate to Email Deletion Log
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Email Deletion Log"
    Then user should able to see the "Enable Per-Email Deletion"
  
    Scenario: Check with Data Retention option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Email Deletion Log"
    Then user should able to see the "Enable Per-Email Deletion"
    When user click on Data Retention link
    Then user able see Data retention policy page in another window