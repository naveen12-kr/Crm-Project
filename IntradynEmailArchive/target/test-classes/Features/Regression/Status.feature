Feature: Status

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Check Emails fetched link
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    And Click on More linktext on top of Emails fetched during current week graph
    Then Email Activity page is returned

  Scenario: Validate configured domains in Domains page
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    And Click on More linktext on top of Distict Addresses during current year
    Then Domains page is returned
    Then All configured domains are listed in the Domains page

  Scenario: View Status of an Active Job
    When User navigate to Configuration
    When User click on Configuration "SMTP Server"
    And User check SMTP Server
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    And Active jobs in the system
    And Click on icon blue magnifying glass for an Active job
    Then user should able to see the "Process Details:"
    Then The Process status should be in In-progress
    Then The End-Time value is empty

  Scenario: View Status of an Inctive Job
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    And Click on icon blue magnifying glass for an In-active job
    Then The In-active job Process status is Finished
    Then The End-Time value is present

  Scenario: Start SMTP Server
    When User navigate to Configuration
    When User click on Configuration "SMTP Server"
    And User check SMTP Server
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    And Active jobs in the system

  Scenario: Stop SMTP Server
    When User navigate to Configuration
    When User click on Configuration "SMTP Server"
    And User check SMTP Server is inactive
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    And In-active jobs in the system

  Scenario: Hide Side Menu
    When user click on the "Status"
    When user click on the "System Status"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When user click on the "Status"
    When user click on the "System Status"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When user click on the "Status"
    When user click on the "System Status"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When user click on the "Status"
    When user click on the "System Status"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When user click on the "Status"
    When user click on the "System Status"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout Link
    When user click on the "Status"
    When user click on the "System Status"
    Then user click on Logout Icon
    Then user able to see Login Page

  Scenario: Displayed information is validated
    When user click on the "Status"
    When user click on the "Summary Counts"
    Then user should able to see the "Email Summary Counts"
    Then Summary counts information displayed matches with the actual data

  Scenario: Check details link for Emails Count
    When user click on the "Status"
    When user click on the "Summary Counts"
    And Click on the linktext details in Total table
    Then All Emails page under Viewers module is returned

  Scenario: Check details link for Emails with Unindexable documents count
    When user click on the "Status"
    When user click on the "Summary Counts"
    And Click on the linktext details in  Index Related table
    Then Parsing Failures page under Viewers modulel is returned

  Scenario: Navigate to Full System health checkup
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then user should able to see the "Full System Health Checkup"
    Then status of all the tests is displayed as pending

  Scenario: Navigate to a specific Health Checkup
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to a specific test level
    Then user should able to see the "Remote Backup Health Checkup"
    Then status of all the tests is displayed as pending

  Scenario: Show all details of specific tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to a specific test level
    And User clicks on the Run Tests button
    And Click on the link Show All Details
    Then The detailed information is displayed

  Scenario: Hide all details of specific tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to a specific test level
    And User clicks on the Run Tests button
    And Click on the link Show All Details
    And click on the link Hide all Details
    Then Detailed information which was displayed is hidden

  Scenario: Run specific tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to specific test level
    And User clicks on the Run Tests button
    Then user able to see Cancel tests button
    Then status appear after running completed
    Then user able to see Run tests button

  Scenario: Cancel running tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to specific test level
    And user clicks on the Cancel Tests button
    Then status appear after running completed
    Then user able to see Run tests button

  Scenario: Rerun cancelled tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to specific test level
    And user clicks on the Cancel Tests button
    Then status appear after running completed
    And User clicks on the Run Tests button
    Then user able to see Cancel tests button
    Then status appear after running completed

  Scenario: Up a  test level
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to specific test level
    And User clicks on Up a Test Level
    Then user should able to see the "Full System Health Checkup"

  Scenario: Run tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And User clicks on the Run Tests button
    Then user able to see Cancel tests button
    Then status appear after running completed
    Then user able to see Run tests button

  Scenario: Cancel running tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And User clicks on the Run Tests button
    And User Clicks on the Cancel Tests button
    Then status appear after running completed
    Then user able to see Run tests button

  Scenario: Re-run cancelled tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And User clicks on the Run Tests button
    And user clicks on the Cancel Tests button
    And User clicks on the Run Tests button
    Then status appear after running completed
    Then user able to see Run tests button

  Scenario: Show all details
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And User clicks on the Run Tests button
    And Click on the link Show All Details
    Then All detailed information is displayed

  Scenario: Hide all details
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And User clicks on the Run Tests button
    And Click on the link Show All Details
    And click on the link Hide all Details
    Then Detailed information which was displayed is hidden

  Scenario: Hide Side Menu (Full System Health Checkup)
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu (Full System Health Checkup)
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link (Full System Health Checkup)
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link (Full System Health Checkup)
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link (Full System Health Checkup)
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout Link (Full System Health Checkup)
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then user click on Logout Icon
    Then user able to see Login Page

  Scenario: Navigate to current system activity
    When user click on the "Status"
    When user click on the "System Activity - Current"
    Then The page displays graphs of Current System Activity

  Scenario: Refresh content for every 1 second
    When user click on the "Status"
    When user click on the "System Activity - Current"
    And Choose 1 for Refresh every drop down menu

  Scenario: Refresh content for every 10 seconds
    When user click on the "Status"
    When user click on the "System Activity - Current"
    And Choose 10 for Refresh every drop down menu

  Scenario: Refresh content for every 60 seconds
    When user click on the "Status"
    When user click on the "System Activity - Current"
    And Choose 60 for Refresh every drop down menu

  @Status
  Scenario: Refresh content for every 60 seconds
    When user click on the "Status"
    When user click on the "System Activity - Current"
    And Hover the mouse over the graph
    Then The data is displayed as tooltip

  Scenario: Hide Side Menu
    When user click on the "Status"
    When user click on the "System Activity - Current"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu (System Activity - Current)
    When user click on the "Status"
    When user click on the "System Activity - Current"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link (System Activity - Current)
    When user click on the "Status"
    When user click on the "System Activity - Current"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link (System Activity - Current)
    When user click on the "Status"
    When user click on the "System Activity - Current"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link (System Activity - Current)
    When user click on the "Status"
    When user click on the "System Activity - Current"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout Link (System Activity - Current)
    When user click on the "Status"
    When user click on the "System Activity - Current"
    Then user click on Logout Icon
    Then user able to see Login Page
    
    Scenario: 
    When user click on the "Status"
    When user click on the "System Summary"
