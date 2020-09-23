@DashBoard
Feature: DashBoard

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
  
  Scenario: Check for link
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    And Clicks on MoreLinkText on  "Emails fetched"
    Then user should able to see the "Graph of Emails Fetched over Time"
 
  Scenario: Validate configured domains in Domains page
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Dashboard"
    #Then user should able to see the "Dashboard"
    #And Clicks on MoreLinkText on  "Distict Addresses"
    #Then user should able to see the "Domains"
   #
   #Scenario: Domains page - Download report
    #When user click on the "Status"
    #Then user should able to see header "Reports"
    #When user click on the "Dashboard"
    #Then user should able to see the "Dashboard"
    #And Clicks on MoreLinkText on  "Distict Addresses"
    #Then user should able to see the "Domains"
    #And  Click on the Download Report link
    #Then The corresponding File "EmailAddrs-Jan2019-AllDomains" is downloaded
     #
    #Scenario: Domains page - Download report
    #When user click on the "Status"
    #Then user should able to see header "Reports"
    #When user click on the "Dashboard"
    #Then user should able to see the "Dashboard"
    #And Clicks on MoreLinkText on  "Distict Addresses"
    #Then user should able to see the "Domains"
    #And  Click on the Download Report link
    #Then The corresponding File "EmailAddrs" is Downloaded "1"
    #
    #Scenario: Domains page - Download Addresses
    #When user click on the "Status"
    #Then user should able to see header "Reports"
    #When user click on the "Dashboard"
    #Then user should able to see the "Dashboard"
    #And Clicks on MoreLinkText on  "Distict Addresses"
    #Then user should able to see the "Domains"
    #And  Click on the Download Addresses
    #Then The corresponding File "EmailAddrs" is Downloaded "2"
    #
    #Scenario: Download Counts for 3 months
    #When user click on the "Status"
    #Then user should able to see header "Reports"
    #When user click on the "Dashboard"
    #Then user should able to see the "Dashboard"
    #And Clicks on MoreLinkText on  "Distict Addresses"
    #Then user should able to see the "Domains"
    #And  Click on the Download Counts "3 months"
    #And click on ok Button
    #Then The corresponding File "CountEmailAddrs" is Downloaded "2"
    #
    #Scenario: Download Counts for - All Time
    #When user click on the "Status"
    #Then user should able to see header "Reports"
    #When user click on the "Dashboard"
    #Then user should able to see the "Dashboard"
    #And Clicks on MoreLinkText on  "Distict Addresses"
    #Then user should able to see the "Domains"
    #And  Click on the Download Counts "All time"
    #And click on ok Button
    #Then The corresponding File "CountEmailAddrs" is Downloaded "2"
   #
    #Scenario: Download Counts for - 1Year
    #When user click on the "Status"
    #Then user should able to see header "Reports"
    #When user click on the "Dashboard"
    #Then user should able to see the "Dashboard"
    #And Clicks on MoreLinkText on  "Distict Addresses"
    #Then user should able to see the "Domains"
    #And  Click on the Download Counts "1 year"
    #And click on ok Button
    #Then The corresponding File "CountEmailAddrs" is Downloaded "2"
  #
    #Scenario: Cancel download counts
    #When user click on the "Status"
    #Then user should able to see header "Reports"
    #When user click on the "Dashboard"
    #Then user should able to see the "Dashboard"
    #And Clicks on MoreLinkText on  "Distict Addresses"
    #Then user should able to see the "Domains"
    #And  Click on the Download Counts "1 year"
    #And click on Cross Button
    #
    #Scenario: Address counts for current year
    #When user click on the "Status"
    #Then user should able to see header "Reports"
    #When user click on the "Dashboard"
    #Then user should able to see the "Dashboard"
    #And Clicks on MoreLinkText on  "Distict Addresses"
    #And user clicks on Magnifingglass
    #Then the "left" Arrow is "Enable"
    #Then the "right" Arrow is "Disable"
    #
    #Scenario: Address counts for previous year
    #When user click on the "Status"
    #Then user should able to see header "Reports"
    #When user click on the "Dashboard"
    #Then user should able to see the "Dashboard"
    #And Clicks on MoreLinkText on  "Distict Addresses"
    #And user clicks on Magnifingglass
    #When user clicks on left Arrow 
    #Then the "left" Arrow is "Disable"
    #Then the "right" Arrow is "Disable"
    #
    #Scenario: Close address counts
    #When user click on the "Status"
    #Then user should able to see header "Reports"
    #When user click on the "Dashboard"
    #Then user should able to see the "Dashboard"
    #And Clicks on MoreLinkText on  "Distict Addresses"
    #And user clicks on Magnifingglass
    #When Click outside the pop up
    #Then The Address count graph pop up is closed
     
    Scenario: Validate Disk space
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    #And The disk space information in the graph matches with the actual data
    
    Scenario: Validate Network Info
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    And The Network information in the graph matches with the actual data
   
    Scenario: Validate software contract info
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    And The software version information in the graph matches with the actual data
  
  Scenario: Hide Side Menu
    When user click on the "Status"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When user click on the "Status"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Display Side Menu
    When user click on the "Status"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    And Result

  Scenario: Check home link
    When user click on the "Status"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When user click on the "Status"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When user click on the "Status"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout Link
    When user click on the "Status"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    Then user click on Logout Icon
    Then user able to see Login Page
