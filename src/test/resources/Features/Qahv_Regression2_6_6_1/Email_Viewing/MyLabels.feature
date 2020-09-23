@Label
Feature: My Labels

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Add a valid Label
    When User clicks on "Email Viewing"
    When User clicks on "My Labels"
    And Enter the valid label name "Ram"
    And click on Add label
    Then The label name is added to the Current Labels table
    Then The message is displayed added tag successfully

  Scenario: Add Label with missing label name
    When User clicks on "Email Viewing"
    When User clicks on "My Labels"
    And click on Add label
    #Then This field is required message is displayed

  Scenario: Add Label with existing label name
    When User clicks on "Email Viewing"
    When User clicks on "My Labels"
    And Enter the existing label name in the field
    And click on Add label
    Then Message displayed

  Scenario: Delete a label name

  #When User clicks on "Email Viewing"
  #When User clicks on "My Labels"
  #And Enter the valid label name "Ram"
  #And click on Add label
  #Then The label name is added to the Current Labels table
  #And Click on red delete icon against the Label to be deleted
  #And user clicks on Ok button
  #Then Message displayed
  Scenario: View emails under a specific label

  #When User clicks on "Email Viewing"
  #When User clicks on "My Labels"
  #And Click on the "magnifying glass" of My Labels
  #Then The number of emails listed matches the superscript on the View Labeled Emails
 
  Scenario: Sort by date oldest to newest
    When User clicks on "Email Viewing"
    When User clicks on "My Labels"
    And Click on the "magnifying glass" of My Labels
    Then user able to see the list of emails
    And user Select "Date: oldest → newest" from sort by dropdown menu
    #Then user able to see the emails are sorted in "Oldest to Newest"

  Scenario: Sort by date Newest to oldest
    When User clicks on "Email Viewing"
    When User clicks on "My Labels"
    And Click on the "magnifying glass" of My Labels
    Then user able to see the list of emails
    And user Select "Date: newest → oldest" from sort by dropdown menu
    #Then user able to see the emails are sorted in "Newest to oldest"

  Scenario: Sort by Email Address from a to z
    When User clicks on "Email Viewing"
    When User clicks on "My Labels"
    And Click on the "magnifying glass" of My Labels
    Then user able to see the list of emails
    And user Select "From: a → z" from sort by dropdown menu
    #Then User able to see the email addresses are Sorted by in "Oldest to Newest" order "From"
  
  Scenario: Sort by Email Address from z to a
    When User clicks on "Email Viewing"
    When User clicks on "My Labels"
    And Click on the "magnifying glass" of My Labels
    Then user able to see the list of emails
    And user Select "From: z → a" from sort by dropdown menu
    #Then User able to see the email addresses are Sorted by in "Newest to oldest" order "From"
  
  Scenario: Sort by Email Subjects from a to z
    When User clicks on "Email Viewing"
    When User clicks on "My Labels"
    And Click on the "magnifying glass" of My Labels
    Then user able to see the list of emails
    And user Select "Subject: a → z" from sort by dropdown menu
    #Then User able to see the email addresses are Sorted by in "Oldest to Newest" order "Subject"
  
  Scenario: Sort by Email Subjects from z to a
    When User clicks on "Email Viewing"
    When User clicks on "My Labels"
    And Click on the "magnifying glass" of My Labels
    Then user able to see the list of emails
    And user Select "Subject: z → a" from sort by dropdown menu
    #Then User able to see the email addresses are Sorted by in "Newest to oldest" order "Subject"

  Scenario: Select all emails
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    And Click on the "magnifying glass" of My Labels
    Then user able to see the list of emails
    And user click on the selected checkbox on the top of the email list
    Then user able to see All the emails in the list are selected

  Scenario: Open an email
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    And Click on the "magnifying glass" of My Labels
    Then user able to see the list of emails
    And user click on an email to be viewed
    Then The email is displayed in the same window

  Scenario: Open an email in the same window
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    And Click on the "magnifying glass" of My Labels
    And Right click on the email and click on Open Here
    Then The email is displayed in the same window

  Scenario: Open an email in the New window
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    And Click on the "magnifying glass" of My Labels
    And Right click on the email and click on Open in a New Tab
    Then The email is displayed in the new window

  Scenario: Display Current Labels
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    And user clicks on  Expand + icon on Current Legal Holds
    Then Current Legal Holds table is displayed

  Scenario: Hide Current Labels
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    And user clicks on  Expand - icon on Current Legal Holds
    Then Current Legal Holds table is not displayed

  Scenario: Check home link
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logut link
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    Then user click on Logout Icon
    Then user able to see Login Page

  Scenario: Export selected emails
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    And Click on the "magnifying glass" of My Labels
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_zip" in "export_zipname"
    Then User Enter "intradyn.autotest@gmail.com" in "export_notify"
    And User click On Ok button
    #Then Message displayed

  Scenario: Export selected emails with missing fields
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    And Click on the "magnifying glass" of My Labels
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    And User click On Ok button
    #Then Message displayed

  Scenario: Export selected emails with email notification specified
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    And Click on the "magnifying glass" of My Labels
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_test" in "export_zipname"
    Then User select "export_filetype" is "Headers Only (CSV)"
    Then User Enter "intradyn.autotest@gmail.com" in "export_notify"
    And User click On Ok button
    #Then Message displayed

  Scenario: Forward selected emails to a valid email
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    And Click on the "magnifying glass" of My Labels
    Then Select any number of Emails
    And User click on "forward" tab
    Then User Enter "ramkumardkr@gmail.com" in "forward_to"
    And User click On forward Ok button
    #Then Message displayed

  Scenario: Print to PDF a selected email
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    And Click on the "magnifying glass" of My Labels
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "command-open print-pdf print_pdf"
    And clicks on Include Attachments checkbox
    And User click On the Ok button
    Then user able to see PDF in new window

  Scenario: Show header information
    When User clicks on "Email Viewing"
    And user navigate to "My Labels"
    And Click on the "magnifying glass" of My Labels
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "head raw_headers"
    Then user able to see Header in new window

  #Scenario: Print a selected email
  # When User clicks on "Email Viewing"
  #And user navigate to "My Labels"
  #And Click on the "magnifying glass" of My Labels
  #And user click on an email to be viewed
  #Then The email is displayed in the same window
  #And user navigate to second window "print printer_friendly"
  #Then user able to see printable format of the emails selected is open in a new window
  @Sample
  Scenario: Print selected emails
    #When User clicks on "Email Viewing"
    #And user navigate to "My Labels"
    #And Click on the "magnifying glass" of My Labels
    #Then Select any number of Emails
    #And User click on "print" tab
    #Then user able to see printable format of the emails selected is open in a new window
