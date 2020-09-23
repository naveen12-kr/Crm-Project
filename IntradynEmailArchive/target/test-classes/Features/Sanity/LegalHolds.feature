@LegalHolds
Feature: Legal Holds

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Add a valid Legal Hold
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And user enters the valid tag name "Ram"
    And user click on Add Legal Holds
    And enter a valid "Description:"
    And user selcts the check box Legal Hold
    And user click on Create Legal hold
    Then Message displayed

  Scenario: Add a valid Legal Hold
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    Then Number of Legal holds in a table
    And user enters the valid tag name "Ram"
    And user click on Add Legal Holds
    And enter a valid "Description:"
    And user not select the "legalhold" checkbox
    And user click on Create Legal hold
    Then Message displayed
    Then added tag is not found under the current legal holds table
    Then added tag is displayed on the Tags page under the current email tags table

  Scenario: View tagged emails under Legal Holds
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails

  Scenario: Edit a Legal Hold
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And click on the Pencil Icon of Legal Hold
    Then definition of the current Legal Hold is displayed
    And All input fields are disabled
    Then Click on Ok button

  Scenario: Sort by date oldest to newest
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user Select "Date: newest → oldest" from sort by dropdown menu
    Then user able to see the emails are sorted by date in descending order

  Scenario: Sort by date oldest to newest
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user Select "Date: oldest → newest" from sort by dropdown menu
    Then user able to see the emails are sorted by date in ascending order

  Scenario: Sort by Email Address from a to z
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user Select "From: a → z" from sort by dropdown menu
    Then user able to see the email addresses are sorted by in ascending order

  Scenario: Sort by Email Address from z to a
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user Select "From: z → a" from sort by dropdown menu
    Then user able to see the email addresses are sorted by in descending order

  Scenario: Sort by Email Subjects from a to z
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user Select "Subject: a → z" from sort by dropdown menu
    Then user able to see the email subjects are sorted by in ascending order

  Scenario: Sort by Email Subjects from z to a
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user Select "Subject: z → a" from sort by dropdown menu
    Then user able to see the email subjects are sorted by in descending order

  Scenario: Select all emails
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user click on the selected checkbox on the top of the email list
    Then user able to see All the emails in the list are selected

  Scenario: Open an email
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then user able to see the list of emails
    And user click on an email to be viewed
    Then The email is displayed in the same window

  Scenario: Open an email in the same window
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And Right click on the email and click on Open Here
    Then The email is displayed in the same window

  Scenario: Open an email in the New window
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And Right click on the email and click on Open in a New Tab
    Then The email is displayed in the new window

  
  Scenario: Add legal hold with missing required field
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And user click on Add Legal Holds
    Then This field is required is displayed
