@FullSystemHealthCheckUp
Feature: FullSystemHealthCheckUp

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
  
    Scenario: Navigate to Full System health checkup
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then user should able to see the "Full System Health Checkup"
    
    Scenario: Navigate to a specific Health Checkup
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to a "SMTP" test level
    Then The corresponding Health checkup page of "SMTP" is returned
    And the status of all the tests is displayed as pending
    
    Scenario: Run specific tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to a "SMTP" test level
    Then User click on "startTest" tab
    And the status of all the tests is displayed
    
    Scenario: Show all details of specific tests 
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to a "SMTP" test level
    Then User click on "startTest" tab
    And the status of all the tests is displayed
    And user Clicks on "showDetails()" link
    Then the detailed information is displayed
    
    Scenario: Hide all details of specific tests 
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to a "SMTP" test level
    Then User click on "startTest" tab
    And the status of all the tests is displayed
    And user Clicks on "showDetails()" link
    Then the detailed information is displayed
    And user Clicks on "hideDetails()" link
    Then the detailed information should be hidden
    
    Scenario: Cancel running tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to a "Upgrade & Technical Support " test level
    And User click on "startTest" tab
    And User click on "cancelTest" tab
    Then The Running process should be cancelled and Run Tests button should be visible
    And Health Checkup status should be dispalyed with Cancelled
    
    Scenario: Rerun cancelled tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to a "Upgrade & Technical Support " test level
    And User click on "startTest" tab
    And User click on "cancelTest" tab
    Then The Running process should be cancelled and Run Tests button should be visible
    And User click on "startTest" tab
    Then The cancelled process should be Running and cancel Tests button should be visible
    And the status of all the tests is displayed
    
    Scenario: Run specific test level - Up a  test level
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And Click the blue arrow next to a "SMTP" test level
    Then The corresponding Health checkup page of "SMTP" is returned
    And Click on Upgrade Test Page Link
    Then user able to see the header "Full System Health Checkup"
    
    Scenario: Run all tests - Run tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And User click on "startTest" tab
    #And the status of all the tests is displayed
    #Then The Running process should be cancelled and Run Tests button should be visible
    
    Scenario: Run all tests - Cancel running tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And User click on "startTest" tab
    And User click on "cancelTest" tab
    #Then The Running process should be cancelled and Run Tests button should be visible
    #And Health Checkup status should be dispalyed with Cancelled
    
    Scenario: Run all tests - Rerun cancelled tests
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And User click on "startTest" tab
    And User click on "cancelTest" tab
    Then The Running process should be cancelled and Run Tests button should be visible
    And User click on "startTest" tab
    Then The cancelled process should be Running and cancel Tests button should be visible
    And User click on "cancelTest" tab
    #And the status of all the tests is displayed
    #Then The Running process should be cancelled and Run Tests button should be visible
    
    Scenario: Run all tests - Show all details
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And User click on "startTest" tab
    Then The cancelled process should be Running and cancel Tests button should be visible
    And the status of all the tests is displayed
    Then The Running process should be cancelled and Run Tests button should be visible
    And user Clicks on "showDetails()" link
    Then the detailed information is displayed
    
    Scenario: Run all tests - Hide all details
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    And User click on "startTest" tab
    Then The cancelled process should be Running and cancel Tests button should be visible
    And the status of all the tests is displayed
    Then The Running process should be cancelled and Run Tests button should be visible
    And user Clicks on "showDetails()" link
    Then the detailed information is displayed
    And user Clicks on "hideDetails()" link
    Then the detailed information should be hidden
    
    Scenario: Hide Side Menu
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears
    
    Scenario: Display Side Menu
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed
    
    Scenario: Check home link
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page
    
    Scenario: Check Account Settings link
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page
    
    Scenario: Check Help link
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags
    
    Scenario: Check Logout link
    When user click on the "Status"
    When user click on the "Full System Health Checkup"
    Then user click on Logout Icon
    Then user able to see Login Page
    
    