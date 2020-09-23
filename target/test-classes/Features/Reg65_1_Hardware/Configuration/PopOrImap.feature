@POPorIMAPfetchers
Feature: POP or IMAP fetchers

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Add a Fetcher Configuration
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    Then user able to see the header "Email Fetcher Configurations"
    Then Enter Fetcher name to add fetcher
    And User clicks on Add Fetcher
    Then Fetcher Configuration Form should open
    And Fill all the required infomaton
    And User click on Create Fetcher
    Then Fetcher should created successfully

  Scenario: Add a existing fetcher configuration
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    Then user able to see the header "Email Fetcher Configurations"
    And Enter existing fetcher name to add
    And User clicks on Add Fetcher
    #Then Message displayed This configuration ID already exists

  Scenario: Choose valid server protocol - IMAP4
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    Then user able to see the header "Email Fetcher Configurations"
    Then Enter Fetcher name to add fetcher
    And User clicks on Add Fetcher
    Then user able to see the header "Fetcher Configuration"
    And Fill all the required infomaton
    Then User select "IMAP4"
    Then The Port number field is populated
    Then The Mailbox name  field  is populated
    And User click on Create Fetcher
    #Then Message displayed

  Scenario: Choose valid server protocol - sIMAP4
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    Then user able to see the header "Email Fetcher Configurations"
    Then Enter Fetcher name to add fetcher
    And User clicks on Add Fetcher
    Then user able to see the header "Fetcher Configuration"
    And Fill all the required infomaton
    Then User select "sIMAP4"
    Then The Port number field is populated
    Then The Mailbox name  field  is populated
    And User click on Create Fetcher
    #Then Message displayed

  Scenario: Choose valid server protocol - POP3
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    Then user able to see the header "Email Fetcher Configurations"
    Then Enter Fetcher name to add fetcher
    And User clicks on Add Fetcher
    Then user able to see the header "Fetcher Configuration"
    And Fill all the required infomaton
    Then User select "POP3"
    Then The Port number field is populated
    Then The Mailbox name  field  is populated
    And User click on Create Fetcher
    #Then Message displayed
  
  Scenario: Choose valid server protocol - sPOP3
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    Then user able to see the header "Email Fetcher Configurations"
    Then Enter Fetcher name to add fetcher
    And User clicks on Add Fetcher
    Then user able to see the header "Fetcher Configuration"
    And Fill all the required infomaton
    Then User select "sPOP3"
    Then The Port number field is populated
    Then The Mailbox name  field  is populated
    And User click on Create Fetcher
    #Then Message displayed

  Scenario: Restart a fetcher
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    And user clicks on refresh icon
    And user Select Restart the fetcher service
    And click on submit button
    #Then Message displayed

  Scenario: Reset a fetcher
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    And user clicks on refresh icon
    And user Select Reset the fetcher service
    And click on submit button
    #Then Message displayed

  Scenario: Test connection to email server for fetcher (Show detailed status for each test)
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    #And user clicks on connection icon
    #And Health Checkup Status for the fetcher is pending
    #And Click on Run tests button on Health Checkup Page
    #And Click on a status for a test
    #Then The description of status is displayed for the test
    #Then The description disappears on clicking again

  Scenario: Test connection to email server for fetcher (Up a test level)
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    #And user clicks on connection icon
    #And Health Checkup Status for the fetcher is pending
    #And Click on Up a Test Level
    #Then Fetch Health Checkup page is loaded

  Scenario: Edit Configuration
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    And user clicks on pencil icon
    #And user Edit the Server Description with "SMTP Server Description"
    #And click on save button
    #Then Message displayed

  Scenario: Delete fetcher
    When User navigate to Configuration
    Then User see Email Server Page
    When User clicks on "POP or IMAP Fetchers"
    #And user clicks on delete icon
    #Then Pop Up window is displayed
    #And user clicks on Ok button

  Scenario: Hide Side Menu
    When User clicks on "Configuration"
    When User clicks on "POP or IMAP Fetchers"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When User clicks on "Configuration"
    When User clicks on "POP or IMAP Fetchers"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When User clicks on "Configuration"
    When User clicks on "POP or IMAP Fetchers"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When User clicks on "Configuration"
    When User clicks on "POP or IMAP Fetchers"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When User clicks on "Configuration"
    When User clicks on "POP or IMAP Fetchers"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout link
    When User clicks on "Configuration"
    When User clicks on "POP or IMAP Fetchers"
    Then user click on Logout Icon
    Then user able to see Login Page
