@AllEmails 
Feature: All Emails

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
  
  Scenario: Viewing All Emails
    When User clicks on "Email Viewing" tab
    When User clicks on "All Emails" tab
    Then User able to see header "Total Emails per day, Parsing Failures"
    Then User able to see present year displayed under Years section
    Then User able to see last month is displayed under Month section
    Then User able to see count of Total emails received and Parsing failures for day
   
  Scenario: Hide all fields of Calender View
    When User clicks on "Email Viewing" tab
    When User clicks on "All Emails" tab
    Then User able to see header "Total Emails per day, Parsing Failures"
    And User Click on Test Expand and Collapse icon
    Then All fields are minimised
  
  Scenario: Viewing Total Received Emails Per Day
    When User clicks on "Email Viewing" tab
    When User clicks on "All Emails" tab
    Then User able to see header "Total Emails per day, Parsing Failures"
    And User click on Total Recevied Emails Count in Calender
    Then All fields are minimised
    Then User able to see All Emails List under Received Emails 
  
  Scenario: Viewing Parsing Failures per Day
    When User clicks on "Email Viewing" tab
    When User clicks on "All Emails" tab
    Then User able to see header "Total Emails per day, Parsing Failures"
    And User click on Parsing Failures count in calender
    Then All fields are minimised
    Then User able to see All Emails List under Parsing Failures
    