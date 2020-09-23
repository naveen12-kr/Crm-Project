@SystemSummary
Feature: SystemSummary

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
   
  Scenario: Validate system information
    When user click on the "Status"
    When user click on the "System Summary"
    Then user should able to see the "System Summary" 
    And The system summary information matches with the actual data
    
   Scenario: Intradyn appliance has RAID partition
    #When user click on the "Status"
    #When user click on the "System Summary"
    #Then user should able to see the "System Summary"
    #Then Raid Status  for each partition appears in the system summary 
    #And The system summary information matches with the actual data
    
   Scenario: Intradyn appliance has RAID partition with status
    #When user click on the "Status"
    #When user click on the "System Summary"
    #Then user should able to see the "System Summary"
    #Then Raid Status  for each partition appears in the system summary
    #Then Click the details link on the failed RAID parrtition 
    #And The system summary information matches with the actual data

  Scenario: Hide Side Menu
    When user click on the "Status"
    When user click on the "System Summary"
    Then user should able to see the "System Summary"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When user click on the "Status"
    When user click on the "System Summary"
    Then user should able to see the "System Summary"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When user click on the "Status"
    When user click on the "System Summary"
    Then user should able to see the "System Summary"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When user click on the "Status"
    When user click on the "System Summary"
    Then user should able to see the "System Summary"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When user click on the "Status"
    When user click on the "System Summary"
    Then user should able to see the "System Summary"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout Link
    When user click on the "Status"
    When user click on the "System Summary"
    Then user should able to see the "System Summary"
    Then user click on Logout Icon
    Then user able to see Login Page
