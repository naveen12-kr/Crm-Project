@DataPurgeHistory
Feature: DataPurgeHistory

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Navigate to Data Purge History
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Data Purge History"
    Then user should able to see the "Data Purge History"
    
    Scenario: Check the Data Purge History with no data
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Data Purge History"
    Then user should able to see the "Data Purge History"
    Then perform action on Data of respective month According to the presence of data
    
    Scenario: Check the Data Purge History with data
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Data Purge History"
    Then user should able to see the "Data Purge History"
    Then perform action on Data of respective month According to the presence of data
    
