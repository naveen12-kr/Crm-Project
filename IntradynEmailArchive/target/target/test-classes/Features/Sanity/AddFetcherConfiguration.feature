@AddFetcherConfig
Feature: Add Fetcher Configuration

  Background: Login
  
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

    Scenario: Add Fetcher and Configuration
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    Then Email Fetcher Configurations page should open
    Then Enter Fetcher name to add fetcher
    And User clicks on Add Fetcher
    Then Fetcher Configuration Form should open
    And Fill all the required infomaton
    And User click on Create Fetcher
    Then Fetcher should created successfully
    
    Scenario: Add Fetcher With POP3 protocol
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    Then Email Fetcher Configurations page should open
    Then Enter Fetcher name to add fetcher
    And User clicks on Add Fetcher
    Then Fetcher Configuration Form should open
    And Fill all the required infomaton
    Then User select "POP3"
    And User click on Create Fetcher
    Then Fetcher should created successfully
    
    Scenario: Add Fetcher With sIMAP4 protocol
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    Then Email Fetcher Configurations page should open
    Then Enter Fetcher name to add fetcher
    And User clicks on Add Fetcher
    Then Fetcher Configuration Form should open
    And Fill all the required infomaton
    Then User select "sIMAP4"
    And User click on Create Fetcher
    Then Fetcher should created successfully
    
    Scenario: Add Fetcher With sPOP3 protocol
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    Then Email Fetcher Configurations page should open
    Then Enter Fetcher name to add fetcher
    And User clicks on Add Fetcher
    Then Fetcher Configuration Form should open
    And Fill all the required infomaton
    Then User select "sPOP3"
    And User click on Create Fetcher
    Then Fetcher should created successfully