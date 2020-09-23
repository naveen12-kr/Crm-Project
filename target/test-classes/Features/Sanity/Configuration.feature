@ConfigurationTags
Feature: Configuration Tags

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Add a valid tag
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And user enters the valid tag name "Ram"
    And user click on Add Tag
    And enter a valid "Description:"
    And user click on Create Tag
    Then The message is displayed added tag successfully

  Scenario: Add a valid Legal Hold under tags
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And user enters the valid tag name "Ram"
    And user click on Add Tag
    And enter a valid "Description:"
    And Select the check box Legal Hold
    And user click on Create Tag
    Then The message is displayed added tag successfully

  Scenario: View description of a Legal Hold
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And a valid Legal Hold is created
    And click on the pencil icon
    Then The selected legal hold is displayed
    Then All the input fields are disabled
    Then On clicking OK Legal Holds page is returned

  Scenario: Change a tag into a legal hold
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And click on the pencil icon and Legal holds
    And user clicks on the Legal holds checkbox and clicks on save
    Then The message edited successfully is displayed
    Then Legal Holds page is returned

  Scenario: Sort by date newest to oldest
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user Select "Date: newest → oldest" from sort by dropdown menu
    Then user able to see the emails are sorted in "Newest to oldest"

  #Scenario: Sort by date oldest to newest
  #When User clicks on "Configuration"
  #And user navigate to "Tags"
  #And Click on the "magnifying glass"
  #And user Select "Date: oldest → newest" from sort by dropdown menu
  #Then user able to see the emails are sorted in "Oldest to Newest"
  #
  #Scenario: Sort by Email Address from a to z
  #When User clicks on "Configuration"
  #And user navigate to "Tags"
  #And Click on the "magnifying glass"
  #And user Select "From: a → z" from sort by dropdown menu
  #Then User able to see the email addresses are sorted by in "Oldest to Newest" order "From"
  #
  #Scenario: Sort by Email Address from z to a
  #When User clicks on "Configuration"
  #And user navigate to "Tags"
  #And Click on the "magnifying glass"
  #And user Select "From: z → a" from sort by dropdown menu
  #Then User able to see the email addresses are sorted by in "Newest to oldest" order "From"
  #
  Scenario: Sort by Email Subject from a to z
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user Select "Subject: a → z" from sort by dropdown menu
    Then User able to see the email addresses are sorted by in "Oldest to Newest" order "Subject"

  Scenario: Sort by Email Subject from z to a
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user Select "Subject: z → a" from sort by dropdown menu
    Then User able to see the email addresses are sorted by in "Newest to oldest" order "Subject"

  Scenario: Open an email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass" to view emails
    And user click on an email to be viewed
    Then The email is displayed in the same window

  Scenario: Open an email in the same window
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass" to view emails
    And Right click on the email and click on Open Here
    Then The email is displayed in the same window

  Scenario: Open an email in the new tab
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass" to view emails
    And Right click on the email and click on Open in a New Tab
    Then The email is displayed in the new window

  Scenario: Select All emails
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on the selected checkbox on the top of the email list
    Then user able to see All the emails in the list are selected

  Scenario: Export selected emails
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_zip" in "export_zipname"
    Then User Enter "intradyn.autotest@gmail.com" in "export_notify"
    And User click On Ok button
    Then Message displayed

  Scenario: Export selected emails with email notification specified
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_zip" in "export_zipname"
    Then User select "export_filetype" is "Headers Only (CSV)"
    Then User Enter "intradyn.autotest@gmail.com" in "export_notify"
    And User click On Ok button
    Then Message displayed

  Scenario: Forward selected emails to a valid email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And User click on "forward" tab
    Then User Enter "RamJpme" in "forward_to"
    And User click On forward Ok button
    Then Message displayed

  Scenario: Print selected emails
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And User click on "print" tab
    Then user able to see printable format of the emails selected is open in a new window

  Scenario: Print to PDF selected emails
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And User click on Print to PDF tab
    And User click On PDF Ok button
    Then user able to see PDF in new window

  Scenario: Print to PDF selected emails and notify
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And User click on Print to PDF tab
    Then User Enter "ramkumardkr@gmail.com" in "pdf_alertaddr"
    And User click On PDF Ok button
    Then user able to see PDF in new window

  Scenario: Tag selected emails
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And User click on "tag" tab
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    Then Message displayed

  Scenario: Tag selected emails by choosing multiple tags
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select Multiple number of Emails
    And User click on "tag" tab
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    Then Message displayed

  Scenario: Tag selected emails with existing tags
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And User click on "tag" tab
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    Then Message displayed

  Scenario: Perform an action without selecting an email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And User click on "export" tab
    Then Export pop-up should open
    And User click On Ok button
    Then Message displayed

  Scenario: Perform an action without selecting an email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then user able to see the message as No Emails has been selected

  Scenario: Add comments to an email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "comments"
    Then user able to see Comments page for the selected email

  Scenario: Forward a selected email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "link_forward forward"
    Then User Enter "intradyn.autotest@gmail.com" in "forward_one_to"
    And User click On the forward Ok button
    Then Message displayed

  Scenario: Print a selected email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "print printer_friendly"
    Then user able to see printable format of the emails selected is open in a new window

  Scenario: Print to PDF a selected email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "command-open print-pdf print_pdf"
    And clicks on Include Attachments checkbox
    And User click On the Ok button
    Then user able to see PDF in new window

  Scenario: Show header information
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "head raw_headers"
    Then user able to see Header in new window
