@Tags
Feature: Tags

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

  Scenario: Add Tag with missing Tag name
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And user click on Add Tag
    Then The message "This field is required" is displayed.

  Scenario: Add Tag with missing Tag description
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And user enters the valid tag name "Ram"
    And user click on Add Tag
    And User leaves the description as empty
    And user click on Create Tag
    Then The message "This field is required" is displayed.

  Scenario: View emails under a specific tag
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"

  Scenario: View emails when no email has been tagged under a tag
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on "magnifying glass"
    Then No emails are displayed

  Scenario: Edit a tag
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And click on the pencil icon and edit description
    And user click on Save Changes
    Then The message edited successfully is displayed

  Scenario: View description of a Legal Hold
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And a valid Legal Hold is created
    And click on the pencil icon for legal hold true
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

  Scenario: Reuse a tag name
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And a valid Legal Hold is created
    And Enter an existing/deleted tag name

  Scenario: Reuse a deleted tag name
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And add deleted tag name
    Then Message displays as This configuration ID already exists
  
  Scenario: Reuse a tag name with a different case
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And a valid Legal Hold is created
    And Enter an existing/deleted tag name in upper case
    Then New tag Configuration page is open
  
  Scenario: Delete a tag name
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And user click on the Delete icon
    Then Pop Up window is displayed
    And user clicks on Ok button
   

  Scenario: View emails under a specific tag
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And user clicks on maginfing glass of tag having mails
    Then Total mail count should show

  Scenario: View emails when no email has been tagged under a tag
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And user clicks on maginfing glass of tag having no mails
    Then Total mail count should show as Zero

  Scenario: Sort by date newest to oldest
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user Select "Date: newest → oldest" from sort by dropdown menu
    Then user able to see the emails are sorted in "Newest to oldest"

  Scenario: Sort by date oldest to newest
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user Select "Date: oldest → newest" from sort by dropdown menu
    Then user able to see the emails are sorted in "Oldest to Newest"

  Scenario: Sort by Email Address from a to z
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user Select "From: a → z" from sort by dropdown menu
    Then User able to see the email addresses are sorted by in "Oldest to Newest" order "From"

  Scenario: Sort by Email Address from z to a
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user Select "From: z → a" from sort by dropdown menu
    Then User able to see the email addresses are sorted by in "Newest to oldest" order "From"

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
    #Then Email content should be displayed in 3 sections
  
  Scenario: Open an email in the same window
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass" to view emails
    And Right click on the email and click on Open Here
    Then The email is displayed in the same window
    #Then Email content should be displayed in 3 sections
  
  Scenario: Open an email in the new tab
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass" to view emails
    And Right click on the email and click on Open in a New Tab
    Then The email is displayed in the new window
    #Then Email content should be displayed three sections

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
    #Then Message displayed

  Scenario: Export selected emails with missing fields
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    And User click On Ok button
    #Then Message displayed

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
    #Then Message displayed

  Scenario: Forward selected emails to a valid email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And User click on "forward" tab
    Then User Enter "RamJpme" in "forward_to"
    And User click On forward Ok button
    #Then Message displayed

  Scenario: Forward selected emails to an invalid email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And User click on "forward" tab
    Then User Enter "abc" in "forward_to"
    And User click On forward Ok button
    #Then The message "No forwarding done" is displayed

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
    #Then Message displayed
	
  Scenario: Tag selected emails by choosing multiple tags
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select Multiple number of Emails
    And User click on "tag" tab
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    #Then Message displayed
    
  Scenario: Tag selected emails with existing tags
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And User click on "tag" tab
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    #Then Message displayed
	
  Scenario: Remove Tag on selected emails
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And user click on Remove Tag
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    #Then Message displayed
  
  Scenario: Remove multiple Tags on selected emails
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select Multiple number of Emails
    And user click on Remove Tag
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    #Then Message displayed

  Scenario: Remove non existing Tags on selected emails
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    Then Select any number of Emails
    And user click on Remove Tag
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    #Then Message displayed

  Scenario: Perform an action without selecting an email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And User click on "export" tab
    Then Export pop-up should open
    And User click On Ok button
    #Then Message displayed

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
    #And user navigate to second window "comments"
    #Then user able to see Comments page for the selected email

  Scenario: Forward a selected email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "link_forward forward"
    Then User Enter "intradyn.autotest@gmail.com" in "forward_one_to"
    And User click On the forward Ok button
    #Then Message displayed

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

  Scenario: Display Current Email Tags
    When User clicks on "Configuration"
    And user navigate to "Tags"
    Then user click on the collapse icon to maximise
    Then user able to see the Emails Tags Table

  Scenario: Hide Current Email Tags
    When User clicks on "Configuration"
    And user navigate to "Tags"
    Then user click on the collapse icon to minimise
    Then Emails Tags Table was minimised

  Scenario: Hide Side Menu
    When User clicks on "Configuration"
    And user navigate to "Tags"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When User clicks on "Configuration"
    And user navigate to "Tags"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When User clicks on "Configuration"
    And user navigate to "Tags"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When User clicks on "Configuration"
    And user navigate to "Tags"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When User clicks on "Configuration"
    And user navigate to "Tags"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Help link
    When User clicks on "Configuration"
    And user navigate to "Tags"
    Then user click on Logout Icon
    Then user able to see Login Page
  
  Scenario: Redact text in current email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    Then Selected text is redacted in the current Email
  
  Scenario: Redact text in entire tag
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    And Select Entire Tag
    And click on Redact OK button
    Then Selected text is redacted in the current Email
    And user click on another email to be viewed
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    Then Selected text is redacted in the Another Email
 
  Scenario: Redact email - choose default
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Make this the default checkbox
    And click on Redact OK button
    Then Selected text is redacted in the current Email

  Scenario: Redact email without selecting text
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    #And user navigate to second window "tag-redact"
    #Then The message "Please select text to redact" is displayed

  Scenario: Redact email without selecting text after choosing the default redact action
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    #And Select the text to be redacted
    #And user navigate to second window "tag-redact"
    #And Select Current Document
    #And click on Make this the default checkbox
    #And click on Redact OK button
    #And user navigate to second window "tag-redact"
    #Then The message "Please select text to redact" is displayed
  
  Scenario: Redact text on email body
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    And Select the email body to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    Then Selected text is redacted in the current Email
  
  Scenario: Redact text on email header labels
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    And select the email header text to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    Then selected header text is not redacted
  
  Scenario: Redact text on email header values
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    And select the email header value to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    Then selected header value is redacted

  Scenario: Undo all redactions from current email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    And Select the email body to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    And select the email header value to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    And user navigate to second window "tag-unredact"
    And Select the checkbox against Remove all Redactions
    And Select Current Document in Unredact
    And click on Unredact OK button

  Scenario: Undo single redaction  from current email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    And select the email header value to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    And Select the email body to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    Then Selected text is redacted in the current Email
    And user navigate to second window "tag-unredact"
    And Select the checkbox against single redaction to be removed
    And Select Current Document in Unredact
    And click on Unredact OK button

  Scenario: Undo multiple redactions from current email
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    And Select the email body to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    And select the email header value to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    And user navigate to second window "tag-unredact"
    And Select the checkbox against Remove multiple Redactions
    And Select Current Document in Unredact
    And click on Unredact OK button

  Scenario: UnRedact ALL text in entire tag
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    And Select Entire Tag
    And click on Redact OK button
    Then Selected text is redacted in the current Email
    And user navigate to second window "tag-unredact"
    And Select the checkbox against Remove all Redactions
    And Select Entire Tag to Unredact
    And click on Unredact OK button

  Scenario: UnRedact single text in entire tag
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    And Select Entire Tag
    And click on Redact OK button
    Then Selected text is redacted in the current Email
    And user navigate to second window "tag-unredact"
    And Select the checkbox against single redaction to be removed
    And Select Entire Tag to Unredact
    And click on Unredact OK button

  Scenario: UnRedact multiple text in entire tag
    When User clicks on "Configuration"
    And user navigate to "Tags"
    And Click on the "magnifying glass"
    And user click on an email to be viewed
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    And Select Entire Tag
    And click on Redact OK button
    Then Selected text is redacted in the current Email
    And user navigate to second window "tag-unredact"
    And Select the checkbox against Remove multiple Redactions
    And Select Entire Tag to Unredact
    And click on Unredact OK button
