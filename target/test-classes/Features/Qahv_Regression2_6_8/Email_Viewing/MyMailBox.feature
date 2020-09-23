@MyMailBox
Feature: My MailBox

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Hide all fields of Mailbox
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And user clicks on collapse icon of Mailbox
    Then Mailbox all fields are disappears

  Scenario: Hide all sub fields of All received and sent
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And user clicks on collapse icon of All received and sent
    Then All received and sent fields are disappears

  Scenario: Check All received and sent mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox All received and sent
    And Click on dropdown box and select "3 months"
    And click on view button
    Then All "received and sent" mails displayed and it should be last "3 months"

  Scenario: Check All received and sent mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox All received and sent
    And Click on dropdown box and select "6 months"
    And click on view button
    Then All "received and sent" mails displayed and it should be last "6 months"
 
  Scenario: Check All received and sent mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox All received and sent
    And Click on dropdown box and select "9 months"
    And click on view button
    Then All "received and sent" mails displayed and it should be last "9 months"

  Scenario: Check All received and sent mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox All received and sent
    And Click on dropdown box and select "1 year"
    And click on view button
    Then All "received and sent" mails displayed and it should be last "1 year"

  Scenario: Check All received and sent mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox All received and sent
    And Click on dropdown box and select "All"
    And click on view button
    Then All "received and sent" mails displayed and it should be last "All"

  Scenario: Check All received mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox received
    And Click on dropdown box and select "3 months"
    And click on view button
    Then All "received" mails displayed and it should be last "3 months"

  Scenario: Check All received mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox received
    And Click on dropdown box and select "6 months"
    And click on view button
    Then All "received" mails displayed and it should be last "6 months"

  Scenario: Check All received mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox received
    And Click on dropdown box and select "9 months"
    And click on view button
    Then All "received" mails displayed and it should be last "9 months"

  Scenario: Check All received mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox received
    And Click on dropdown box and select "1 year"
    And click on view button
    Then All "received" mails displayed and it should be last "1 year"

  Scenario: Check All received mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox received
    And Click on dropdown box and select "All"
    And click on view button
    Then All "received" mails displayed and it should be last "All"

  Scenario: Check All sent mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox Sent
    And Click on dropdown box and select "3 months"
    And click on view button
    Then All "sent" mails displayed and it should be last "3 months"

  Scenario: Check All sent mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox Sent
    And Click on dropdown box and select "6 months"
    And click on view button
    Then All "sent" mails displayed and it should be last "6 months"

  Scenario: Check All sent mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox Sent
    And Click on dropdown box and select "9 months"
    And click on view button
    Then All "sent" mails displayed and it should be last "9 months"

  Scenario: Check All sent mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox Sent
    And Click on dropdown box and select "1 year"
    And click on view button
    Then All "sent" mails displayed and it should be last "1 year"

  Scenario: Check All sent mails
    When User clicks on "Email Viewing" tab
    When User clicks on "My Mailbox" tab
    And Click on CheckBox Sent
    And Click on dropdown box and select "All"
    And click on view button
    Then All "sent" mails displayed and it should be last "All"
