@SearchEmail
Feature: Search Email

  Background: 
    Given User is on Login Page
    When User enters username and password
    And User click the login button

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

  Scenario: Search Email by Default
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    Then Total mail count should show

  Scenario: Search By "ON" email sent date
    When User clicks on "Email Viewing"
    When User select search by "on" date
    And Date field is default
    And User click on search
    Then Total mail count should show

  Scenario: Search By "Before" email sent date
    When User clicks on "Email Viewing"
    When User select search by "before" date
    And Date field is default
    And User click on search
    Then Total mail count should show

  Scenario: Search By "After" email sent date
    When User clicks on "Email Viewing"
    When User select search by "after" date
    And User click on search
    Then Total mail count should show

  Scenario: Search By "Between" email sent date
    When User clicks on "Email Viewing"
    When User select search by "between" date
    And User click on search
    Then Total mail count should show

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

  Scenario: Test Expand and Collapse Icon
    When User clicks on "Email Viewing"
    When User click on Collapse icon of "Query Terms"
    Then Search field minimised

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

  Scenario: Add Search Term - Email From(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "op_email_fromuuid" from the second drop down "all"
    And Enter the Data "email_from" for Search "bob@b.com"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email From(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "op_email_fromuuid" from the second drop down "any"
    And Enter the Data "email_from" for Search "bob@b.com"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email From(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "op_email_fromuuid" from the second drop down "none"
    And Enter the Data "email_from" for Search "bob@b.com"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email To(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "op_email_touuid" from the second drop down "none"
    And Enter the Data "email_to" for Search "bob@b.com"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email To(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "op_email_touuid" from the second drop down "any"
    And Enter the Data "email_to" for Search "bob@b.com"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email To(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "op_email_touuid" from the second drop down "all"
    And Enter the Data "email_to" for Search "bob@b.com"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Text(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "op_email_textuuid" from the second drop down "all"
    And Enter the Data "email_text" for Search "Mural formalin cox maternity rafael brooke monoclinic harvester deliverance solo"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Text(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "op_email_textuuid" from the second drop down "none"
    And Enter the Data "email_text" for Search "Mural formalin cox maternity rafael brooke monoclinic harvester deliverance solo"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Text(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "op_email_textuuid" from the second drop down "any"
    And Enter the Data "email_text" for Search "Mural formalin cox maternity rafael brooke monoclinic harvester deliverance solo"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Text(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And User select "op_email_textuuid" from the second drop down "match"
    And Enter the Data "email_text" for Search "Mural formalin cox maternity rafael brooke monoclinic harvester deliverance solo"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email From/To(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_address".
    And User select "op_email_addressuuid" from the second drop down "any"
    And Enter the Data "email_address" for Search "bob@b.com"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email From/To(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_address".
    And User select "op_email_addressuuid" from the second drop down "all"
    And Enter the Data "email_address" for Search "bob@b.com"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email From/To(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_address".
    And User select "op_email_addressuuid" from the second drop down "none"
    And Enter the Data "email_address" for Search "bob@b.com"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Subject(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_subject".
    And User select "op_email_subjectuuid" from the second drop down "none"
    And Enter the Data "email_subject" for Search "bob@b.com"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Subject(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_subject".
    And User select "op_email_subjectuuid" from the second drop down "all"
    And Enter the Data "email_subject" for Search "2019"
    And User click on search
    Then Total mail count should show

  @testtag
  Scenario: Add Search Term - Email Subject(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_subject".
    And User select "op_email_subjectuuid" from the second drop down "match"
    And Enter the Data "email_subject" for Search "bob@b.com"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Subject(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_subject".
    And User select "op_email_subjectuuid" from the second drop down "any"
    And Enter the Data "email_subject" for Search "bob@b.com"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Body(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_body".
    And User select "op_email_bodyuuid" from the second drop down "none"
    And Enter the Data "email_body" for Search "Policyholder"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Body(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_body".
    And User select "op_email_bodyuuid" from the second drop down "all"
    And Enter the Data "email_body" for Search "Policyholder"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Body(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_body".
    And User select "op_email_bodyuuid" from the second drop down "any"
    And Enter the Data "email_body" for Search "Policyholder"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Body(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_body".
    And User select "op_email_bodyuuid" from the second drop down "match"
    And Enter the Data "email_body" for Search "Policyholder"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email MessageID(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_msgid".
    And User select "op_email_msgiduuid" from the second drop down "none"
    And Enter the Data "email_msgid" for Search "<20181022010327.484409.intradyn@Driver>"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email MessageID(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_msgid".
    And User select "op_email_msgiduuid" from the second drop down "all"
    And Enter the Data "email_msgid" for Search "<20181022010327.484409.intradyn@Driver>"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email MessageID(is exactly)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_msgid".
    And User select "op_email_msgiduuid" from the second drop down "match"
    And Enter the Data "email_msgid" for Search "<20181022010327.484409.intradyn@Driver>"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email MessageID(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_msgid".
    And User select "op_email_msgiduuid" from the second drop down "any"
    And Enter the Data "email_msgid" for Search "<20181022010327.484409.intradyn@Driver>"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Text(contains none of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_text".
    And User select "op_email_textuuid" from the second drop down "none"
    And Enter the Data "email_text" for Search "Policyholder"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Text(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_text".
    And User select "op_email_textuuid" from the second drop down "all"
    And Enter the Data "email_text" for Search "Policyholder"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Text(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_text".
    And User select "op_email_textuuid" from the second drop down "any"
    And Enter the Data "email_text" for Search "Policyholder"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Email Text(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_text".
    And User select "op_email_textuuid" from the second drop down "match"
    And Enter the Data "email_text" for Search "Policyholder"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Attachment Name(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "attachment_name".
    And User select "op_attachment_nameuuid" from the second drop down "any"
    And Enter the Data "attachment_name" for Search "sample"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Attachment Name(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "attachment_name".
    And User select "op_attachment_nameuuid" from the second drop down "match"
    And Enter the Data "attachment_name" for Search "sample"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Attachment Contents(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "attachment_text".
    And User select "op_attachment_textuuid" from the second drop down "all"
    And Enter the Data "attachment_text" for Search "sample"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Attachment Contents(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "attachment_text".
    And User select "op_attachment_textuuid" from the second drop down "any"
    And Enter the Data "attachment_text" for Search "sample"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Attachment Contents(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "attachment_text".
    And User select "op_attachment_textuuid" from the second drop down "match"
    And Enter the Data "attachment_text" for Search "sample"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Attachment Available(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "attachment_available".
    And User select "op_attachment_availableuuid" from the second drop down "any"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Folder Name(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "folder_name".
    And User select "op_folder_nameuuid" from the second drop down "any"
    And User click on search
    Then Total mail count should show
	@TestTag
  Scenario: Add Search Term - Tag Name(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "tag_name".
    And User select "op_tag_nameuuid" from the second drop down "any"
   # And User select "tag_nameuuid" from the second drop down1 "0"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Label Name(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "label_name".
    And User select "op_label_nameuuid" from the second drop down "any"
     And User select "label_nameuuid" from the second drop down1 "0"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Comment Author(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "comment_author".
    And User select "op_comment_authoruuid" from the second drop down "any"
    And Enter the Data "comment_author" for Search "admin"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Comment Tag(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "comment_tag".
    And User select "op_comment_taguuid" from the second drop down "any"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Comment Contents(contains one or more of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "comment_text".
    And User select "op_comment_textuuid" from the second drop down "any"
    And Enter the Data "comment_text" for Search "admin"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Comment Contents(contains all of)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "comment_text".
    And User select "op_comment_textuuid" from the second drop down "all"
    And Enter the Data "comment_text" for Search "admin"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Comment Contents(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "comment_text".
    And User select "op_comment_textuuid" from the second drop down "match"
    And Enter the Data "comment_text" for Search "admin"
    And User click on search
    Then Total mail count should show

  Scenario: Add Search Term - Random Sample(contains exact phrase)
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And user selects from Add Search Term "random_sample".
    And Enter the Data "random_sample" for Search "60"
    And User click on search
    Then Total mail count should show

  Scenario: Search By "SSN" with specifi security num
    When User clicks on "Email Viewing"
    When User select search by "before" date
    And user selects from Add Search Term "ssn_text".
    And User enter social security number
    And User click on search
    Then Total mail count should show

  Scenario: Search By "SSN" with Any Social Security Number
    When User clicks on "Email Viewing"
    When User select search by "before" date
    And user selects from Add Search Term "ssn_text".
    Then User select "Any Social Security Number" from SSN
    And User click on search
    Then Total mail count should show
