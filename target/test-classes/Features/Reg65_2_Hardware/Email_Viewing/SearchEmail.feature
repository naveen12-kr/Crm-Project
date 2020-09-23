@SearchEmail
Feature: Search Email

  Background: 
    Given User is on Login Page
    When User enters username and password
    And User click the login button

  Scenario: Check Query Term Search
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    Then "Query Terms" filter is display
    And "Save Search Criteria" is displayed with the icon
    And "Save Layout" is displayed with the icon
    And "Clear Fields" is displayed with the icon
    And "Add Search Term" button is displayed
    And "Search" button is displayed
    And Mail box is displayed

  Scenario: Test Expand and Collapse Icon
    When User clicks on "Email Viewing"
    When User click on Collapse icon of "Query Terms"
    Then Search field minimised

  Scenario: Add Search Term
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_address".
    Then user able to see that search term fields with cross icon

  Scenario: Add Search Term - relative
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "yesterday" from the second drop down
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - relative
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "past week" from the second drop down
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - relative
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "past month" from the second drop down
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - relative
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "past 3 months" from the second drop down
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - relative
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "past 6 months" from the second drop down
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - relative
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "past 9 months" from the second drop down
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - relative
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "past year" from the second drop down
    And User click on search
    Then Total mail count should show

  Scenario: Email Date Sent - on
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "on" date
    Then user able to get calender for date
    And User click on search
    Then Total mail count should show

  Scenario: Email Date Sent - before
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    Then user able to get calender for date
    And User click on search
    Then Total mail count should show

  Scenario: Email Date Sent - after
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "after" date
    Then user able to get calender for date
    And User click on search
    Then Total mail count should show

  Scenario: Email Date Sent - between
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "between" date
    Then user able to get calender for date
    And User click on search
    Then Total mail count should show

  Scenario: Check Save Search Criteria
    When User clicks on "Email Viewing"
    When User clicks on "Save Search Criteria"
    Then Save and search PopUp should open
    And user able to all the required fields of saved Searches

  Scenario: Check Save Search Popup
    When User clicks on "Email Viewing"
    When User clicks on "Save Search Criteria"
    Then Save and search PopUp should open
    When User Enter Name and Description
    Then User click on "Save" button
    Then Successfull save search message should shown

  Scenario: Save Layout Format
    When User clicks on "Email Viewing"
    When User clicks on "Save Layout"
    Then Successfull save search message should shown
  
  Scenario: Check Clear Fields option
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And Enter the Data "email_from" for Search "bob@b.com"
    And Enter the Data "email_to" for Search "bob@b.com"
    When user clicks on Clear Fields icon
    Then all the fields are cleared

  Scenario: Check Delete option shown with the cross icon
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_address".
    And when clicks on cross icon of email from/to
    Then email from/to is deleted
  
  Scenario: Check Email From
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_from".
    Then user able to see all the required fields of Email From
  
  Scenario: Add Search Term - Email From(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User select "op_email_fromuuid" from the second drop down "all"
    And Enter the Data "email_from" for Search "adam"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "From:" respective to "all" Edited Changes "adam"
  
  Scenario: Add Search Term - Email From(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User select "op_email_fromuuid" from the second drop down "any"
    And Enter the Data "email_from" for Search "adam"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "From:" respective to "any" Edited Changes "adam"
  
  Scenario: Add Search Term - Email From(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User select "op_email_fromuuid" from the second drop down "none"
    And Enter the Data "email_from" for Search "adam"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "From:" respective to "none" Edited Changes "adam"
 
  Scenario: Add Search Term - Email To(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User select "op_email_touuid" from the second drop down "none"
    And Enter the Data "email_to" for Search "adam"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "To:" respective to "none" Edited Changes "adam"
  
  Scenario: Add Search Term - Email To(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User select "op_email_touuid" from the second drop down "any"
    And Enter the Data "email_to" for Search "b.com"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "To:" respective to "any" Edited Changes "b.com"
  
  Scenario: Add Search Term - Email To(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User select "op_email_touuid" from the second drop down "all"
    And Enter the Data "email_to" for Search "b.com"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "To:" respective to "all" Edited Changes "b.com"
  
  Scenario: Add Search Term - Email Text(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "email_text".
    And User select "op_email_textuuid" from the second drop down "all"
    And Enter the Data "email_text" for Search "application"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "email body" respective to "all" Edited Changes "application"
 
  Scenario: Add Search Term - Email Text(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "email_text".
    And User select "op_email_textuuid" from the second drop down "none"
    And Enter the Data "email_text" for Search "people is"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "email body" respective to "none" Edited Changes "people is"
  
  Scenario: Add Search Term - Email Text(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User select "op_email_textuuid" from the second drop down "any"
    And Enter the Data "email_text" for Search "people is"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "email body" respective to "any" Edited Changes "people is"
  
  Scenario: Add Search Term - Email Text(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User select "op_email_textuuid" from the second drop down "match"
    And Enter the Data "email_text" for Search "people is"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "email body" respective to "match" Edited Changes "people is"
   
   Scenario: Add Search Term - Email From/To(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "email_address".
    And User select "op_email_addressuuid" from the second drop down "any"
    And Enter the Data "email_address" for Search "adam"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "Email From/To" respective to "any" Edited Changes "adam"
  
  Scenario: Add Search Term - Email From/To(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "email_address".
    And User select "op_email_addressuuid" from the second drop down "all"
    And Enter the Data "email_address" for Search "adam"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "Email From/To" respective to "all" Edited Changes "adam"
  
  Scenario: Add Search Term - Email From/To(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "email_address".
    And User select "op_email_addressuuid" from the second drop down "none"
    And Enter the Data "email_address" for Search "adam"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "Email From/To" respective to "none" Edited Changes "adam"
  
  Scenario: Add Search Term - Email Subject(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "email_subject".
    And User select "op_email_subjectuuid" from the second drop down "none"
    And Enter the Data "email_subject" for Search "2019"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "Subject:" respective to "none" Edited Changes "2019"
    
  Scenario: Add Search Term - Email Subject(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "email_subject".
    And User select "op_email_subjectuuid" from the second drop down "all"
    And Enter the Data "email_subject" for Search "201"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "Subject:" respective to "all" Edited Changes "201"
  
  Scenario: Add Search Term - Email Subject(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_subject".
    And User select "op_email_subjectuuid" from the second drop down "match"
    And Enter the Data "email_subject" for Search "201"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "Subject:" respective to "match" Edited Changes "201"
  
  Scenario: Add Search Term - Email Subject(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "email_subject".
    And User select "op_email_subjectuuid" from the second drop down "any"
    And Enter the Data "email_subject" for Search "201"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "Subject:" respective to "any" Edited Changes "201"
  
  Scenario: Add Search Term - Email Body(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User select "op_email_fromuuid" from the second drop down "any"
    And Enter the Data "email_from" for Search "adam"
    And user selects from Add Search Term "email_body".
    And User select "op_email_bodyuuid" from the second drop down "none"
    And Enter the Data "email_body" for Search "the and so if because"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "email body" respective to "none" Edited Changes "the and so if because"
  
  Scenario: Add Search Term - Email Body(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User select "op_email_fromuuid" from the second drop down "any"
    And Enter the Data "email_from" for Search "adam"
    And user selects from Add Search Term "email_body".
    And User select "op_email_bodyuuid" from the second drop down "all"
    And Enter the Data "email_body" for Search "the"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "email body" respective to "all" Edited Changes "the"
  
  Scenario: Add Search Term - Email Body(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User select "op_email_fromuuid" from the second drop down "any"
    And Enter the Data "email_from" for Search "adam"
    And user selects from Add Search Term "email_body".
    And User select "op_email_bodyuuid" from the second drop down "any"
    And Enter the Data "email_body" for Search "the"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "email body" respective to "any" Edited Changes "the"
  
  Scenario: Add Search Term - Email Body(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User select "op_email_fromuuid" from the second drop down "any"
    And Enter the Data "email_from" for Search "adam"
    And user selects from Add Search Term "email_body".
    And User select "op_email_bodyuuid" from the second drop down "match"
    And Enter the Data "email_body" for Search "Policyholder"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "email body" respective to "match" Edited Changes "so"
  
  Scenario: Add Search Term - Email MessageID(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "email_msgid".
    And User select "op_email_msgiduuid" from the second drop down "none"
    And Enter the Data "email_msgid" for Search "<20181022010327.484409.intradyn@Driver>"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Email MessageID(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
     When User select search by "before" date
    And user selects from Add Search Term "email_msgid".
    And User select "op_email_msgiduuid" from the second drop down "all"
    And Enter the Data "email_msgid" for Search "<20181022010327.484409.intradyn@Driver>"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Email MessageID(is exactly)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "email_msgid".
    And User select "op_email_msgiduuid" from the second drop down "match"
    And Enter the Data "email_msgid" for Search "<20181022010327.484409.intradyn@Driver>"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Email MessageID(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "email_msgid".
    And User select "op_email_msgiduuid" from the second drop down "any"
    And Enter the Data "email_msgid" for Search "<20181022010327.484409.intradyn@Driver>"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Attachment Name(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "attachment_name".
    And User select "op_attachment_nameuuid" from the second drop down "any"
    And Enter the Data "attachment_name" for Search "sample"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "Attachments:" respective to "any" Edited Changes "ample"
  
  Scenario: Add Search Term - Attachment Name(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "attachment_name".
    And User select "op_attachment_nameuuid" from the second drop down "match"
    And Enter the Data "attachment_name" for Search "sample"
    And User click on search
    Then Total mail count should show
    Then user able to get Search "Attachments:" respective to "match" Edited Changes "ample"
  
  Scenario: Add Search Term - Attachment Contents(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "attachment_text".
    And User select "op_attachment_textuuid" from the second drop down "all"
    And Enter the Data "attachment_text" for Search "sample"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Attachment Contents(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "attachment_text".
    And User select "op_attachment_textuuid" from the second drop down "any"
    And Enter the Data "attachment_text" for Search "sample"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Attachment Contents(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "attachment_text".
    And User select "op_attachment_textuuid" from the second drop down "match"
    And Enter the Data "attachment_text" for Search "sample"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Attachment Available(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "attachment_available".
    And User select "op_attachment_availableuuid" from the second drop down "any"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Folder Name(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "folder_name".
    And User select "op_folder_nameuuid" from the second drop down "any"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Tag Name(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "tag_name".
    And User select "op_tag_nameuuid" from the second drop down "any"
    And User select "tag_nameuuid" from the second drop down2 "0"
    And User click on search
    Then Total mail count should show
 
  Scenario: Add Search Term - Label Name(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "label_name".
    And User select "op_label_nameuuid" from the second drop down "any"
    And User select "label_nameuuid" from the second drop down2 "0"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Comment Author(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "comment_author".
    And User select "op_comment_authoruuid" from the second drop down "any"
    And Enter the Data "comment_author" for Search "admin"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Comment Tag(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "comment_tag".
    And User select "op_comment_taguuid" from the second drop down "any"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Comment Contents(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "comment_text".
    And User select "op_comment_textuuid" from the second drop down "any"
    And Enter the Data "comment_text" for Search "admin"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Comment Contents(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "comment_text".
    And User select "op_comment_textuuid" from the second drop down "all"
    And Enter the Data "comment_text" for Search "admin"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Comment Contents(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "comment_text".
    And User select "op_comment_textuuid" from the second drop down "match"
    And Enter the Data "comment_text" for Search "admin"
    And User click on search
    Then Total mail count should show
  
  Scenario: Add Search Term - Random Sample(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And user selects from Add Search Term "random_sample".
    And Enter the Data "random_sample" for Search "60"
    And User click on search
    Then Total mail count should show

  Scenario: Sort by date newest to oldest
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user Select "Date: newest → oldest" from sort by dropdown menu
    Then user able to see the emails are sorted in "Newest to oldest"

  Scenario: Sort by date oldest to newest
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user Select "Date: oldest → newest" from sort by dropdown menu
    Then user able to see the emails are sorted in "Oldest to Newest"
	
  Scenario: Sort by Email Address from a to z
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user Select "From: a → z" from sort by dropdown menu
    Then User able to see the email addresses are sorted by in "Oldest to Newest" order "From"

  Scenario: Sort by Email Address from z to a
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user Select "From: z → a" from sort by dropdown menu
    Then User able to see the email addresses are sorted by in "Newest to oldest" order "From"

  Scenario: Sort by Email Subjects from a to z
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user Select "Subject: a → z" from sort by dropdown menu
    Then User able to see the email addresses are sorted by in "Oldest to Newest" order "Subject"

  Scenario: Sort by Email Subjects from z to a
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user Select "Subject: z → a" from sort by dropdown menu
    Then User able to see the email addresses are sorted by in "Newest to oldest" order "Subject"
  
  Scenario: Open an email
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user click on an email to be viewed
    Then The email is displayed in the same window
  
  Scenario: Open an email here
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And Right click on the email and click on Open Here
    Then The email is displayed in the same window

  Scenario: Open an email in a new tab
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And Right click on the email and click on Open in a New Tab
    Then The email is displayed in the new window

  Scenario: Select all emails
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user click on the selected checkbox on the top of the email list
    Then user able to see All the emails in the list are selected

  Scenario: Perform actions on selected emails - Export selected emails
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_zip1" in "export_zipname"
    Then User Enter "intradyn.autotest@gmail.com" in "export_notify"
    And User click On Ok button
    Then Message displayed

  Scenario: Perform actions on selected emails - Export selected emails with missing fields
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    And User click On Ok button
    Then Message displayed
  
  Scenario: Perform actions on selected emails - Export selected emails with email notification specified
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_test1" in "export_zipname"
    Then User select "export_filetype" is "Headers Only (CSV)"
    Then User Enter "intradyn.autotest@gmail.com" in "export_notify"
    And User click On Ok button
    Then Message displayed
  
  Scenario: Perform actions on selected emails - Export selected emails to a Invalid email
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_test1" in "export_zipname"
    Then User select "export_filetype" is "Headers Only (CSV)"
    Then User Enter "intrady" in "export_notify"
    And User click On Ok button
    #Then "invalid" Message displayed
    
    Scenario: Perform actions on selected emails - Forward selected emails to a valid email
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And User click on "forward" tab
    Then User Enter "ramkumardkr@gmail.com" in "forward_to"
    And User click On forward Ok button
    Then Message displayed
    
    Scenario: Perform actions on selected emails - Forward selected emails to a Invalid email
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And User click on "forward" tab
    Then User Enter "ram" in "forward_to"
    And User click On forward Ok button
    #Then "invalid" Message displayed

  Scenario: Perform actions on selected emails - Print selected emails
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And User click on "print" tab
    Then user able to see printable format of the emails selected is open in a new window

  Scenario: Perform actions on selected emails - Print to PDF selected emails
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And User click on Print to PDF tab
    And User click On PDF Ok button
    Then user able to see PDF in new window

  Scenario: Perform actions on selected emails - Print to PDF selected emails and notify
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And User click on Print to PDF tab
    Then User Enter "ramkumardkr@gmail.com" in "pdf_alertaddr"
    And User click On PDF Ok button
    Then user able to see PDF in new window
	
  Scenario: Perform actions on selected emails - Tag selected emails
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And User click on "tag" tab
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    Then Message displayed

  Scenario: Perform actions on selected emails - Tag selected emails by choosing multiple tags
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select Multiple number of Emails
    And User click on "tag" tab
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    Then Message displayed

  Scenario: Perform actions on selected emails - Tag selected emails with existing tags
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And User click on "tag" tab
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    Then Message displayed

  Scenario: Perform actions on selected emails - Remove Tag on selected emails
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And user click on Remove Tag
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    Then Message displayed

  Scenario: Perform actions on selected emails - Remove multiple Tags on selected emails
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select Multiple number of Emails
    And user click on Remove Tag
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    Then Message displayed

  Scenario: Perform actions on selected emails - Remove non existing Tags on selected emails
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then Select any number of Emails
    And user click on Remove Tag
    Then Choose a Tag by selecting the checkbox
    And User click On Tag Ok button
    Then Message displayed

  Scenario: Perform actions on selected emails - Perform an action without selecting an email
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And User click on "export" tab
    Then Export pop-up should open
    And User click On Ok button
    Then Message displayed

  Scenario: Perform actions on selected individual email - Perform an action without selecting an email
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    Then user able to see the message as No Emails has been selected

  Scenario: Perform actions on opened individual email - View the email content
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user click on an email to be viewed
    Then user able to the respected email should be visible with Email Addresses, Subject and message body

  Scenario: Perform actions on opened individual email - Forward an email
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "link_forward forward"
    Then User Enter "intradyn.autotest@gmail.com" in "forward_one_to"
    And User click On the forward Ok button
    Then Message displayed

  Scenario: Perform actions on opened individual email - Print an email
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "print printer_friendly"
    Then user able to see printable format of the emails selected is open in a new window

  Scenario: Perform actions on opened individual email - Print to PDF an email
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "command-open print-pdf print_pdf"
    And clicks on Include Attachments checkbox
    And User click On the Ok button
    Then user able to see PDF in new window
  
  Scenario: Perform actions on opened individual email - Show header information
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User select search by "before" date
    And User click on search
    Then Total mail count should show
    Then user able to see the list of emails
    And user click on an email to be viewed
    Then The email is displayed in the same window
    And user navigate to second window "head raw_headers"
    Then user able to see Header in new window

  Scenario: Search Email by Default
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    Then Total mail count should show

  Scenario: Remove Tag Email
    When User clicks on "Email Viewing"
    When User select search by "before" date
    When User click on search
    When Select Taged Emails
    And user click on Remove Tag
    Then "Remove Tag" popup is displayed

  Scenario: Remove Tag email-popup
    When User clicks on "Email Viewing"
    When User select search by "before" date
    And User click on search
    When Select Taged Emails
    And User clicks on "Remove Tag"
    And User clicks on "Remove Tags"
    And Select Tag
    And Click on OK button
    Then Message displayed

  Scenario: Add Label
    When User clicks on "Email Viewing"
    When User select search by "before" date
    And User click on search
    Then Select any number of Emails
    And Click on Label option
    Then "Labels" popup is displayed
    Then "Query Terms" Filter will be minimized

  Scenario: Remove Label email-popup
    When User clicks on "Email Viewing"
    When User select search by "before" date
    And User click on search
    And user click on the selected checkbox on the top of the email list
    And Click on Label option
    Then "Remove Labels" popup is displayed
    And User click on Label Option
    When Click on OK button
    Then Message displayed

  Scenario: Remove Label email
    When User clicks on "Email Viewing"
    When User select search by "before" date
    And User click on search
    Then Select any number of Emails
    And Click on Label option
    Then "Remove Labels" popup is displayed

  Scenario: Label Email - popup
    When User clicks on "Email Viewing"
    When User select search by "before" date
    And User click on search
    Then Select any number of Emails
    And Click On Label
    And User click on Label Option
    Then "Labels" popup is displayed

  Scenario: Search By Before with Email from default
    When User clicks on "Email Viewing"
    When User click on All Email
    Then Total email per day calender should show
    When User select mail to any date
    Then All email list should be shown
    When User open any mail
    Then Email content should be shown
    When User click on searchs
    When User select search by "before" date
    Then User enter email to search
    And User click on search
    Then Total mail count should show

  Scenario: Search By Before with Email from  contains all of
    When User clicks on "Email Viewing"
    When User click on All Email
    Then Total email per day calender should show
    When User select mail to any date
    Then All email list should be shown
    When User open any mail
    Then Email content should be shown
    When User click on searchs
    When User select search by "before" date
    Then User select "contains all of" Email from
    Then User enter email to search
    And User click on search
    Then Total mail count should show

  Scenario: Search By Before with Email from  contains none of
    When User clicks on "Email Viewing"
    When User click on All Email
    Then Total email per day calender should show
    When User select mail to any date
    Then All email list should be shown
    When User open any mail
    Then Email content should be shown
    When User click on searchs
    When User select search by "before" date
    Then User select "contains none of" Email from
    Then User enter email to search
    And User click on search
    Then Total mail count should show

  Scenario: Search By Before with Email from  contains all of
    When User clicks on "Email Viewing"
    When User click on All Email
    Then Total email per day calender should show
    When User select mail to any date
    Then All email list should be shown
    When User open any mail
    Then User open any mail to
    Then Email content should be shown
    When User click on searchs
    When User select search by "before" date
    Then User select "contains none of" Email from
    Then User select Email to "contains all of"
    Then User enter email to search
    And User click on search
    Then Total mail count should show

  Scenario: Mail Seach
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_subject".
    Then Click on Delete option shown with the cross icon.

  Scenario: Mail Seach-email from/to
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_address".
    Then Email FromTo is displayed under Query Terms filter list
    Then "contains one or more of" is displayed by default under Email FromTo
    Then Delete option shown with the cross icon is displayed for Email FromTo
    Then look up option magnigine icon is displayed
    Then Empty Mail box is displayed
   
  Scenario: View labeled emails
    When User clicks on "Email Viewing"
    When User select search by "before" date
    And User click on search
    Then Select any number of Emails
    And Click On Label
    Then Select any label present
    When User open any mail
    #Then Email content should be displayed in 3 sections
     
    Scenario: View tagged emails
    When User clicks on "Email Viewing"
    When User select search by "before" date
    And User click on search
    Then Select any number of Emails
    And Click On Tag
    Then Select any label present
    When User open any mail
    #Then Email content should be displayed in 3 sections
    
    Scenario: View legalhold emails
    When User clicks on "Email Viewing"
    When User select search by "before" date
    And User click on search
    Then Select any number of Emails
    And Click On Tag
    Then Select any legalhold present
    When User open any mail
    #Then Email content should be displayed in 3 sections
    
