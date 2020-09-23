@NotificationEmailHistory
Feature: NotificationEmailHistory

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

Scenario: Navigate to Notification Email History
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Notification Email History"
    Then user should able to see the "Notification Email History"

  Scenario: Notification Email Filter with Date Range option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Notification Email History"
    Then user should able to see the "Notification Email History"
    And user select Any radio button Dates Range "show_dates"
    And Enter From/To dates in input fields "2017-10-03" To "2018-11-16"
    And click on the "Refresh" button

  Scenario: Notification Email Filter with Show All Dates option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Notification Email History"
    Then user should able to see the "Notification Email History"
    And user select Any radio button Dates Range "hide_dates"
    And click on the "Refresh" button

  Scenario: Check with Print option without selection
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Notification Email History"
    Then user should able to see the "Notification Email History"
    And user select Any radio button Dates Range "print"
    Then Message displayed
  
  Scenario: Check with Print option with single Email Entry
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Notification Email History"
    Then user should able to see the "Notification Email History"
    Then Select Show All Dates
    And user select Any radio button Dates "1" and "1"
    And user select Any radio button Dates Range "print"
    Then user able to see PDF in new window
    
  Scenario: Check with Print option with multiple Email Entries
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Notification Email History"
    Then user should able to see the "Notification Email History"
    Then Select Show All Dates
    And user select Any radio button Dates "1" and "1"
    And user select Any radio button Dates "2" and "1"
    And user select Any radio button Dates Range "print"
    Then user able to see PDF in new window
  
  Scenario: Check with Printer Friendly option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Notification Email History"
    Then user should able to see the "Notification Email History"
    Then Select Show All Dates
    And user select Any radio button Dates "1" and "3"
    Then user able to see PDF in new window
  
  Scenario: Check with Print to PDF option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Notification Email History"
    Then user should able to see the "Notification Email History"
    Then Select Show All Dates
    And user select Any radio button Dates "1" and "4"
    Then user able to see PDF in new window
  
  Scenario: Check with View option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Notification Email History"
    Then user should able to see the "Notification Email History"
    Then Select Show All Dates
    And user select Any radio button Dates "1" and "5"
    Then user should able to see the "Notification Email"
