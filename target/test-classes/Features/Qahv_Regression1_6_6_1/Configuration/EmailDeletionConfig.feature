@EmailDeletion
Feature: Email Deletion Config

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
  
    Scenario: Navigate to Email Deletion Configuration page
    When User Click On "Configuration" tab
    #When User Click On "Email Deletion Configuration" tab
    #Then User able to see the "Enable Per-Email Deletion"
  
    Scenario: Check with Data Retention option
    When User Click On "Configuration" tab
    When User Click On "Email Deletion Configuration" tab
    #Then User able to see the "Enable Per-Email Deletion"
    #When User Click on Data Retention Link
    #Then User able to see the "Enable Per-Email Deletion"