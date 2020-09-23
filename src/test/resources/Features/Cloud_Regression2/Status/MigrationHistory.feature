@MigrationHistory
Feature: MigrationHistory

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Navigate to Migration History
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Migration History"
    Then user should able to see the "Migration Entries"
  
   Scenario: Check the View option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Migration History"
    Then user should able to see the "Migration Entries"
    When user click on magnifing glass 
    
    