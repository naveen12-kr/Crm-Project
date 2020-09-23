@SystemStatus
Feature: SystemStatus

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
    
    Scenario: View Status of an Active Job
    When user click on the "Status"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    And user clicks on Detaiils icon for an "Active job"
    Then user should able to see the "Process Details"
    And To verify the Process status and the End-Time value for "Active job"
    
    Scenario: View Status of an Inactive Job
    When user click on the "Status"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    And user clicks on Detaiils icon for an "Inactive job"
    #Then user should able to see the "Process Details"
    #And To verify the Process status and the End-Time value for "Inactive job"
    
    Scenario: Stop SMTP Server
    When User navigate to Configuration
    Then User see Email Server Page
    When User click on Configuration "SMTP Server"
    #And User check SMTP Server
    And User check SMTP Server is inactive
    When user click on the "Status"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    And To verify SMTP Server is listed under "Inactive jobs"
   
    Scenario: Start SMTP Server
    When User navigate to Configuration
    Then User see Email Server Page
    When User click on Configuration "SMTP Server"
    #And User check SMTP Server is inactive
    And User check SMTP Server
    When user click on the "Status"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    And To verify SMTP Server is listed under "Active jobs"
    
    Scenario: Hide Side Menu
    When user click on the "Status"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears
    
    Scenario: Display Side Menu
    When user click on the "Status"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed
    
    Scenario: Check home link
    When user click on the "Status"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page
    
    Scenario: Check Account Settings link
    When user click on the "Status"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page
    
    Scenario: Check Help link
    When user click on the "Status"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags
    
    Scenario: Check Logout link
    When user click on the "Status"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    Then user click on Logout Icon
    Then user able to see Login Page