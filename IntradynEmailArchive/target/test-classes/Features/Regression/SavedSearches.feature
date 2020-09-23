
Feature: Saved Search

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
    
   
 Scenario: Test Expand and Collapse icon
  	When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User Click on Test Expand and Collapse icon
    Then All fields are minimised
  
 Scenario: check for Run Icon
  	When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User clicks on Run icon
    Then Then User able to see All Emails
 @SavedSearch   
 Scenario: check for Delete Icon
  	When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User clicks on delete Icon
    And pop up alert message displayed
    And click on ok button
    Then File deleted Succesfully
    
    