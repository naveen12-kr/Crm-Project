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
    #Then Message displayed

  Scenario: Add a valid Legal Hold
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    Then Number of Legal holds in a table
    And user enters the valid tag name "Ram"
    And user click on Add Legal Holds
    And enter a valid "Description:"
    And user not select the "legalhold" checkbox
    And user click on Create Legal hold
    #Then Message displayed
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

  Scenario: Sort by date newest to oldest
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user Select "Date: newest → oldest" from sort by dropdown menu
    Then user able to see the emails are sorted in "Newest to oldest"

  Scenario: Sort by date oldest to newest
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user Select "Date: oldest → newest" from sort by dropdown menu
    Then user able to see the emails are sorted in "Oldest to Newest"

  Scenario: Sort by Email Address from a to z
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user Select "From: a → z" from sort by dropdown menu
    Then User able to see the email addresses are sorted by in "Oldest to Newest" order "From"

  Scenario: Sort by Email Address from z to a
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user Select "From: z → a" from sort by dropdown menu
    Then User able to see the email addresses are sorted by in "Newest to oldest" order "From"
    
  Scenario: Sort by Email Subjects from a to z
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user Select "Subject: a → z" from sort by dropdown menu
    Then User able to see the email addresses are sorted by in "Oldest to Newest" order "Subject"

  Scenario: Sort by Email Subjects from z to a
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Hold
    Then user able to see the list of emails
    And user Select "Subject: z → a" from sort by dropdown menu
    Then User able to see the email addresses are sorted by in "Newest to oldest" order "Subject"

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
    #Then Email content should be displayed in 3 sections

  Scenario: Open an email in the same window
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select any number of Emails
    And Right click on the email and click on Open Here
    Then The email is displayed in the same window
    #Then Email content should be displayed in 3 sections
 
  Scenario: Open an email in the New window
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And Right click on the email and click on Open in a New Tab
    Then The email is displayed in the new window
    #Then Email content should be displayed three sections

  Scenario: Delete a Legal Hold
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And user click on the Delete icon in legal holds
    Then Pop Up window is displayed
    And user clicks on Ok button
    #Then Message "deleted" is displayed

  Scenario: Add legal hold with missing required field
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And user click on Add Legal Holds
    Then The message This field is required displayed

  Scenario: Add legal hold with missing description
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And user enters the valid tag name "Jack"
    And user click on Add Legal Holds
    And user click on Create Legal Holds
    Then the message description field is required displayed

  Scenario: legal hold with existing Legal Hold name
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Enter an existing/deleted Legalhold name
    And user click on Add Legal Holds
    Then the Already existed message displayed

  Scenario: legal hold with deleteing Legal Hold name
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Enter an deleted Legalhold name
    And user click on Add Legal Holds
    Then the Already existed message displayed

  Scenario: Display Current Legal Holds
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And user clicks on  Expand + icon on Current Legal Holds
    Then Current Legal Holds table is displayed

  Scenario: Hide Current Legal Holds
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And user clicks on  Expand - icon on Current Legal Holds
    Then Current Legal Holds table is not displayed

  Scenario: Check home link
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logut link
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    Then user click on Logout Icon
    Then user able to see Login Page

  Scenario: Export selected emails
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_zip" in "export_zipname"
    Then User Enter "intradyn.autotest@gmail.com" in "export_notify"
    And User click On Ok button
    #Then Message displayed

  Scenario: Export selected emails with missing fields
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    And User click On Ok button
    #Then Message displayed

  Scenario: Export selected emails with email notification specified
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_test" in "export_zipname"
    Then User select "export_filetype" is "Headers Only (CSV)"
    Then User Enter "intradyn.autotest@gmail.com" in "export_notify"
    And User click On Ok button
    #Then Message displayed

  Scenario: Forward selected emails to a valid email
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select any number of Emails
    And User click on "forward" tab
    Then User Enter "ramkumardkr@gmail.com" in "forward_to"
    And User click On forward Ok button
    #Then Message displayed

  Scenario: Forward selected emails to a Invalid email
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select any number of Emails
    And User click on "forward" tab
    Then User Enter "abc" in "forward_to"
    And User click On forward Ok button
    #Then The message "No forwarding done" is displayed

  Scenario: Print to PDF selected emails
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "command-open print-pdf print_pdf"
    And User click On the Ok button
    Then user able to see PDF in new window

  Scenario: Print to PDF selected emails and notify
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select any number of Emails
    And User click on Print to PDF tab
    Then User Enter "ramkumardkr@gmail.com" in "pdf_alertaddr"
    And User click On PDF Ok button
    Then user able to see PDF in new window
	
  Scenario: Tag selected emails
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select any number of Emails
    And User click on "tag" tab
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    #Then Message displayed

  Scenario: Tag selected emails by choosing multiple tags
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select Multiple number of Emails
    And User click on "tag" tab
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    #Then Message displayed
	
  Scenario: Tag selected emails with existing tags
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select any number of Emails
    And User click on "tag" tab
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    #Then Message displayed
  
  Scenario: Remove Tag on selected emails
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select any number of Emails
    And user click on Remove Tag
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    #Then Message displayed

  Scenario: Remove multiple Tags on selected emails
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select Multiple number of Emails
    And user click on Remove Tag
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    #Then Message displayed

  Scenario: Remove non existing Tags on selected emails
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then Select any number of Emails
    And user click on Remove Tag
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    #Then Message displayed

  Scenario: Perform an action without selecting an email
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And User click on "export" tab
    Then Export pop-up should open
    And User click On Ok button
    #Then Message displayed

  Scenario: Perform an action without selecting an email
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    Then user able to see the message as No Emails has been selected

  Scenario: Add comments to an email
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    Then The email is displayed in the same window
    #And user navigate to second window "comments"
    #Then user able to see Comments page for the selected email

  Scenario: Forward a selected email
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "link_forward forward"
    Then User Enter "intradyn.autotest@gmail.com" in "forward_one_to"
    And User click On the forward Ok button
    #Then Message displayed

  Scenario: Print an email
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "print printer_friendly"
    Then user able to see printable format of the emails selected is open in a new window

  Scenario: Print to PDF an email
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "command-open print-pdf print_pdf"
    And clicks on Include Attachments checkbox
    And User click On the Ok button
    Then user able to see PDF in new window

  Scenario: Show header informations
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "head raw_headers"
    Then user able to see Header in new window
  
  Scenario: Redact text in current email
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    Then Selected text is redacted in the current Email
 	
  Scenario: Redact text in entire tag
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    And Select Entire Tag
    And click on Redact OK button
    Then Selected text is redacted in the current Email
  
  Scenario: Redact email - choose default
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Make this the default checkbox
    And click on Redact OK button
    Then Selected text is redacted in the current Email
    And user click on another email to be viewed
    And Select the text to be redacted
    And user navigate to second window "tag-redact"
    Then Selected text is redacted in the Another Email
  
  Scenario: Redact email without selecting text
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    #And user navigate to second window "tag-redact"
    #Then The message "Please select text to redact" is displayed

   
  Scenario: Redact email without selecting text after choosing the default redact action
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
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
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    And Select the email body to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    Then Selected text is redacted in the current Email

  Scenario: Redact text on email header labels
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    And select the email header text to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    Then selected header text is not redacted

  Scenario: Redact text on email header values
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
    And user click on an email to be viewed
    And select the email header value to be redacted
    And user navigate to second window "tag-redact"
    And Select Current Document
    And click on Redact OK button
    Then selected header value is redacted
  
  Scenario: Undo all redactions from current email
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
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
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
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
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
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
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
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
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
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
    And user navigate to "Legal Holds"
    And Click on the "magnifying glass" of Legal Holds
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
   
