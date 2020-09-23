@ParsingFailures
Feature: Parsing Failures

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Viewing Parsing Failures
    When User clicks on "Email Viewing" tab
    When User clicks on "Parsing Failures" tab
    Then User able to see header "Parsing Failures"
    Then User able to see present year displayed under Years section
    Then User able to see last month is displayed under Month section
    Then User able to see count of Total emails received and Parsing failures for day

  Scenario: Expand the Collapse Icon
    When User clicks on "Email Viewing" tab
    When User clicks on "Parsing Failures" tab
    Then User able to see header "Parsing Failures"
    And User Click on Test Expand and Collapse icon
    Then All fields are minimised

  Scenario: Verifying parsing Failuers Emails Count
    When User clicks on "Email Viewing" tab
    When User clicks on "Parsing Failures" tab
    Then User able to see header "Parsing Failures"
    And User click on Parsing Failures count in Parsing
    Then All fields are minimised
    #Then verify total email results matches with list of emails

  Scenario: Viewing Parsing Failures per Day
    When User clicks on "Email Viewing" tab
    When User clicks on "Parsing Failures" tab
    Then User able to see header "Parsing Failures"
    And User click on Parsing Failures count in Parsing
    Then All fields are minimised
    Then User able to see All Emails List under Parsing Failures
