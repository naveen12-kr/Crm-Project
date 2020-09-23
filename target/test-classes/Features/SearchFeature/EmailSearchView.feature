@EmailSearch_View
Feature: Email Search View

  Background: 
    Given User is on Login Page
    When User enters username and password
    And User click the login button
	
	Scenario: Version Verification
	When User got the version
	
  Scenario: Search Email for data dictionary
    When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    When User click on Collapse icons of "Query Terms"
      | on       |
      | before   |
      | after    |
      | between  |
      | relative |
    And User select "op_email_fromuuid" from the Email from drop down
      | all                     |
       | any                     |
      | none                    |
    And User select "op_email_touuid" from the Email from drop down
      | all  |
      | any  |
      | none |
    And User select "op_email_textuuid" from the Email from drop down
      | all  |
      | any  |
      | none |
      |match |
   When User click on Add Search Term
   Then User select "Email Body" field
   And User select "op_email_bodyuuid" from the Email from drop down
  		| all  |
      | any  |
      | none |
      |match |
   
   
