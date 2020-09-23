@SummaryCounts
Feature: SummaryCounts

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Displayed information is validated
    When user click on the "Status"
    When user click on the "Summary Counts"
    Then user should able to see the "Email Summary Counts"

  Scenario: Check details link for Emails Count
    When user click on the "Status"
    When user click on the "Summary Counts"
    Then user should able to see the "Email Summary Counts"
    And user clicks on linktext details in "Total table"
    Then user should able to see header "Total Emails per day, Parsing Failures"

  Scenario: Check details link for Emails with Unindexable documents count
    When user click on the "Status"
    When user click on the "Summary Counts"
    #Then user should able to see the "Email Summary Counts"
    #And user clicks on linktext details in "Index Related table"
    #Then user should able to see header "Parsing Failures"

  Scenario: Hide Side Menu
    When user click on the "Status"
    When user click on the "Summary Counts"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When user click on the "Status"
    When user click on the "Summary Counts"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When user click on the "Status"
    When user click on the "Summary Counts"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When user click on the "Status"
    When user click on the "Summary Counts"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When user click on the "Status"
    When user click on the "Summary Counts"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout link
    When user click on the "Status"
    When user click on the "Summary Counts"
    Then user click on Logout Icon
    Then user able to see Login Page
