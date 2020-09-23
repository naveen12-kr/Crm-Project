@AuditLogs
Feature: AuditLogs

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Navigate to Audit Log
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"

  Scenario: Check with Refresh button
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user select Any radio button Dates Range "show_dates"
    And Enter From/To dates in input fields "2017-10-03" To "2018-11-16"
    And click on the "Refresh" button

  Scenario: Arrange list with Oldest to Newest Install Date
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user clicks on Install Date end arrow "1" and "1"
    Then names are arranged "Oldest to Newest" and "1"

  Scenario: Arrange list with Newest to oldest Install Date
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user clicks on Install Date end arrow "2" and "1"
    Then names are arranged "Newest to oldest" and "1"

  Scenario: Show User in accending order with Audit Log Entries
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user clicks on Install Date end arrow "1" and "2"
    Then names are arranged in "Oldest to Newest" and "2"

  Scenario: Show User in decending order with Audit Log Entries
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user clicks on Install Date end arrow "2" and "2"
    Then names are arranged in "Newest to oldest" and "2"

  Scenario: Show Action in accending order with Audit Log Entries
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user clicks on Install Date end arrow "1" and "3"
    Then names are arranged in "Oldest to Newest" and "3"

  Scenario: Show Action in decending order with Audit Log Entries
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user clicks on Install Date end arrow "2" and "3"
    Then names are arranged in "Newest to oldest" and "3"

  Scenario: Show Notes in accending order with Audit Log Entries
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user clicks on Install Date end arrow "1" and "4"
    Then names are arranged in "Oldest to Newest" and "4"

  Scenario: Show Notes in decending order with Audit Log Entries
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user clicks on Install Date end arrow "2" and "4"
    Then names are arranged in "Newest to oldest" and "4"
 
    Scenario: Change the no.of History results
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user select Any radio button Dates Range "hide_dates"
    And click on the "Refresh" button
    And user change the number of Audit Log results
  
  Scenario: Check the diff. pages of Audit Log Entries.
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user click on any page number "3"
    
    Scenario: Audit Log Search Criteria - Check the Show Dates option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user select Any radio button Dates Range "show_dates"
    And Enter From/To dates in input fields "2017-10-03" To "2018-11-16"
    And click on the "Refresh" button
 
  Scenario: Check the Show Dates option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And user select Any radio button Dates Range "hide_dates"
    And click on the "Refresh" button

  Scenario: Check the username option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And User select "username" from the second drop down3 "admin"
    And click on the "Refresh" button

  Scenario: Check the Action option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    #And User select "action" from the second drop down1 "Access Email Content"
    And click on the "Refresh" button
   
    Scenario: Check with Export Log To File option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Export Log To File..." button
    Then user should able to see the "Export Audit Log"
 
  Scenario: Export Audit Log into xls format.
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Export Log To File..." button
    Then user should able to see the "Export Audit Log"
    And user Enters data in the input field "id_filename" as "Intradyn"
    And user select Any radio button Dates Range "id_format_0"
    And click on the "Save Log" button
    Then user should able to see the "Browse Exported Search Results"
    And the data is added in the table

  Scenario: Export Audit Log into csv format
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Export Log To File..." button
    Then user should able to see the "Export Audit Log"
    And user Enters data in the input field "id_filename" as "Intradyn"
    And user select Any radio button Dates Range "id_format_1"
    And click on the "Save Log" button
    Then user should able to see the "Browse Exported Search Results"
    And the data is added in the table

  Scenario: Export Audit Log into tsv format
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Export Log To File..." button
    Then user should able to see the "Export Audit Log"
    And user Enters data in the input field "id_filename" as "Intradyn"
    And user select Any radio button Dates Range "id_format_2"
    And click on the "Save Log" button
    Then user should able to see the "Browse Exported Search Results"
    And the data is added in the table
   
    Scenario: Check with Browse Exported Log Files option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Browse Exported Log Files" button
    Then user should able to see the "Browse Exported Search Results"

  Scenario: Show FileName in accending order
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Browse Exported Log Files" button
    Then user should able to see the "Browse Exported Search Results"
    And user clicks on Install Date end arrow "1" and "1"
    Then names are arranged in "Oldest to Newest" and "1"

  Scenario: Show FileName in decending order
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Browse Exported Log Files" button
    Then user should able to see the "Browse Exported Search Results"
    And user clicks on Install Date end arrow "2" and "1"
    Then names are arranged in "Newest to oldest" and "1"

  Scenario: Show FileSize in accending order
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Browse Exported Log Files" button
    Then user should able to see the "Browse Exported Search Results"
    And user clicks on Install Date end arrow "1" and "2"
    Then size are arranged in "Oldest to Newest" and "2"

  Scenario: Show FileSize in decending order
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Browse Exported Log Files" button
    Then user should able to see the "Browse Exported Search Results"
    And user clicks on Install Date end arrow "2" and "2"
    Then size are arranged in "Newest to oldest" and "2"

  Scenario: Show FileDate in accending order
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Browse Exported Log Files" button
    #Then user should able to see the "Browse Exported Search Results"
    #And user clicks on Install Date end arrow "1" and "3"
    #Then names are arranged "Oldest to Newest" and "3"

  Scenario: Show FileDate in decending order
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Browse Exported Log Files" button
    #Then user should able to see the "Browse Exported Search Results"
    #And user clicks on Install Date end arrow "2" and "3"
    #Then names are arranged "Newest to oldest" and "3"

  Scenario: Check with download option
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Browse Exported Log Files" button
    Then user should able to see the "Browse Exported Search Results"
    And user click on "4" Icon

  Scenario: Check for Delete Icon
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    And click on the "Browse Exported Log Files" button
    Then user should able to see the "Browse Exported Search Results"
    And user click on "7" Icon
    And User click Alert Ok button
