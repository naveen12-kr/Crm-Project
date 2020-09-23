@UpdateNow
Feature: UpdateNow

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
    
    Scenario: Navigate to View Update History
    When User Click On "Maintenance" tab
    When User Click On "Update Now" tab
    Then user able to see the header "Update Now"
    
    Scenario: Check with Upgrade Test Page
    When User Click On "Maintenance" tab
    When User Click On "Update Now" tab
    Then user able to see the header "Update Now"
    And Click on Upgrade Test Page link
    Then user able to see the header "Upgrade & Technical Support Health Checkup"
    
    Scenario: Check with Run Tests
    When User Click On "Maintenance" tab
    When User Click On "Update Now" tab
    Then user able to see the header "Update Now"
    And Click on Upgrade Test Page link
    Then user able to see the header "Upgrade & Technical Support Health Checkup"
    And click on the "Run Tests" button
    Then The Health Checkup result with pass/fail should be displayed
    And Fully upgraded data should be pass
    
    Scenario: Check with Cancel Tests
    When User Click On "Maintenance" tab
    When User Click On "Update Now" tab
    Then user able to see the header "Update Now"
    And Click on Upgrade Test Page link
    Then user able to see the header "Upgrade & Technical Support Health Checkup"
    And click on the "Run Tests" Button
    And click on the "Cancel Tests" Button
    Then The Running process should be cancelled and Run Tests button should be visible
    And Health Checkup status should be dispalyed with Cancelled
    
    Scenario: Show all Details of Health Checkup
    When User Click On "Maintenance" tab
    When User Click On "Update Now" tab
    Then user able to see the header "Update Now"
    And Click on Upgrade Test Page link
    Then user able to see the header "Upgrade & Technical Support Health Checkup"
    And click on the "Run Tests" button
    Then The Health Checkup result with pass/fail should be displayed
    And Fully upgraded data should be pass
    When user Clicks on "showDetails()" link
    Then The complete details of the Health checkup result for all "Show"
    
    Scenario: Hide all Details of Health Checkup
    When User Click On "Maintenance" tab
    When User Click On "Update Now" tab
    Then user able to see the header "Update Now"
    And Click on Upgrade Test Page link
    Then user able to see the header "Upgrade & Technical Support Health Checkup"
    And click on the "Run Tests" button
    Then The Health Checkup result with pass/fail should be displayed
    And Fully upgraded data should be pass
    When user Clicks on "showDetails()" link
    When user Clicks on "hideDetails()" link
    Then The complete details of the Health checkup result for all "Hide"
    
    Scenario: View Health Checkup information for individual
    When User Click On "Maintenance" tab
    When User Click On "Update Now" tab
    Then user able to see the header "Update Now"
    And Click on Upgrade Test Page link
    Then user able to see the header "Upgrade & Technical Support Health Checkup"
    And click on the "Run Tests" button
    Then The Health Checkup result with pass/fail should be displayed
    And user Click on any one of pass/fail text
    Then The Status result with full information should be displayed
    
    Scenario: Check with Up a Test Level
    When User Click On "Maintenance" tab
    When User Click On "Update Now" tab
    Then user able to see the header "Update Now"
    And Click on Upgrade Test Page link
    Then user able to see the header "Upgrade & Technical Support Health Checkup"
    And Click on Upgrade Test Page Link
    Then user able to see the header "Full System Health Checkup"
    
        