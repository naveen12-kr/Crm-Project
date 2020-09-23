@AccessEmailContent
Feature: Access EmailContent

  Background: Access Email Contents
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
  
  Scenario: acess contens of email
    When User clicks on "Email Viewing"
    When User click on All Email
    Then Total email per day calender should show
    When User select mail to any date
    Then All email list should be shown
    When User open any mail
    Then User get the contents of email
  
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
