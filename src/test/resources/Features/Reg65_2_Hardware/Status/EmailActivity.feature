@EmailActivity
Feature: EmailActivity

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Navigate to Email Activity
    When user click on the "Status"
    When user click on the "Email Activity"
    And Emails Fetched Graph should be displayed with current date
 
  Scenario: Check with backward option for Graph
    When user click on the "Status"
    When user click on the "Email Activity"
    And Click on backward arrow symbol
    And Emails Fetched Graph should be displayed with Previous date

  Scenario: Check with Magnifying glass
    When user click on the "Status"
    When user click on the "Email Activity"
    And Click on Magnifying glass symbol
    And Emails Fetched Graph During the Week should be displayed.

  Scenario: Check with Alter Graph Parameters
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "sent"
    And User select "timecat" from the second drop down "Week"
    And click on the "Render Graph" button
    And Emails Sent Graph During the Week should be displayed

  Scenario: Alter Graph Parameters with surrounding Range Day
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "sent"
    And User select "timecat" from the second drop down "Day"
    And click on the "Render Graph" button
    And Emails Sent Graph During the Day should be displayed

  Scenario: Alter Graph Parameters with surrounding Range Week
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "sent"
    And User select "timecat" from the second drop down "Week"
    And click on the "Render Graph" button
    And Emails Sent Graph During the Week should be displayed

  Scenario: Alter Graph Parameters with surrounding Range Month
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "sent"
    And User select "timecat" from the second drop down "Month"
    And click on the "Render Graph" button
    And Emails Sent Graph During the Month should be displayed

  Scenario: Alter Graph Parameters with surrounding Range Year
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "sent"
    And User select "timecat" from the second drop down "Year"
    And click on the "Render Graph" button
    And Emails Sent Graph During the Year should be displayed
  
  Scenario: Alter Graph Parameters with surrounding Range All Time
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "sent"
    And User select "timecat" from the second drop down "All"
    And click on the "Render Graph" button
    And Emails Sent Graph During the All Time should be displayed

  Scenario: Graph Subject with Email Sent option
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "sent"
    And User select "timecat" from the second drop down "All"
    And click on the "Render Graph" button
    And Emails Sent Graph During the All Time should be displayed

  Scenario: Graph Subject with Email Processing Failures option
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "fails"
    And User select "timecat" from the second drop down "All"
    And click on the "Render Graph" button
    And Emails with procesing failures Graph During the All Time should be displayed

  Scenario: Graph Subject with Tags Set by Tag Date option
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "tdate"
    And User select "timecat" from the second drop down "All"
    And click on the "Render Graph" button
    And Emails with Tags Set Graph During the All Time should be displayed

  Scenario: Graph Subject with Tagged Emails by Sent Date option
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "tsent"
    And User select "timecat" from the second drop down "All"
    And click on the "Render Graph" button
    And Emails with Tags Over Graph During the All Time should be displayed

  Scenario: Graph Subject with Tagged Emails by Fetch Date option
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "tfetched"
    And User select "timecat" from the second drop down "All"
    And click on the "Render Graph" button
    And Emails by Fetch Date Graph During the All Time should be displayed
 
  Scenario: Graph Subject with Comments Made by Comment Date option
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "cdate"
    And User select "timecat" from the second drop down "All"
    And click on the "Render Graph" button
    And Emails with Comments written Graph During the All Time should be displayed
  
  Scenario: Graph Subject with Commented Emails by Sent Date option
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "csent"
    And User select "timecat" from the second drop down "All"
    And click on the "Render Graph" button
    And Emails with Comments Graph During the All Time should be displayed
   
  Scenario: Graph Subject with Commented Emails by Fetch Date option
    When user click on the "Status"
    When user click on the "Email Activity"
    And User select "subject" from the second drop down "cfetched"
    And User select "timecat" from the second drop down "All"
    And click on the "Render Graph" button
    And Emails with Comments Graph During the All Time should be displayed
