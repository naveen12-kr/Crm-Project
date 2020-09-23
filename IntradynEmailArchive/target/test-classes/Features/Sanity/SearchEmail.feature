
Feature: Search Email

  Background: 
    Given User is on Login Page
    When User enters username and password
    And User click the login button
 @SearchEmail
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
	
  Scenario: Test Expand And Collapse Icon
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
    And  user selects from Add Search Term "email subject".
    Then Click on Delete option shown with the cross icon.
    
    
    Scenario: Mail Seach
  	When User clicks on "Email Viewing"
    When User clicks on "Search" tab
    And  user selects from Add Search Term "email from/to".
    Then Email FromTo is displayed under Query Terms filter list
    Then "contains one or more of" is displayed by default under Email FromTo
    Then Delete option shown with the cross icon is displayed for Email FromTo
    Then look up option magnigine icon is displayed
    Then Empty Mail box is displayed
