@DashboardFeature
Feature: Dashboard Test

  Background: Access Email Contents
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
  @Dashboard
  Scenario: Verify the dashboard
    When User clicks on "Dashboard"
    Then User verify the dashboard
      | Email Space Usage   |
      | System Status       |
      | Remote Backup       |
      | Warm Standby        |
      | Network Information |
      | Software Contract   |

  @Dashboard
  Scenario: Verify the Logout functionality
    When User click on Logout
    Then User Login page should be load

  Scenario: Verify the Dashboard help page
    When User click on Help Icon
    Then User help page should be open

  Scenario: Verify Dashboard more link
    When User clicks on "Dashboard"
    When User click on "Email Fetch" more link
    Then "Graph of Emails Fetched over Time" Page should open

  Scenario: Verify Dashboard more link
    When User clicks on "Dashboard"
    When User click on "Distinct Addresses" more link
    Then "Domain" Page should open
    
 Scenario: Verify Dashboard to Download Address
    When User clicks on "Dashboard"
    When User click on "Distinct Addresses" more link
    Then User click on download Address zip
    
 Scenario: Verify Dashboard to Download Counts
    When User clicks on "Dashboard"
    When User click on "Distinct Addresses" more link
    Then User click on download counts zip
    Then User click on Ok button

 Scenario: Verify Dashboard more link
    When User clicks on "Dashboard"
    When User click on "Distinct Addresses" more link
    Then User click on download counts zip
    And User choose "12" Month time period
    Then User click on Ok button
 
 Scenario: Verify Dashboard more link
    When User clicks on "Dashboard"
    When User click on "Distinct Addresses" more link
    Then User click on download counts zip
    And User choose "6" Month time period
    Then User click on Ok button

 Scenario: Verify Dashboard more link
    When User clicks on "Dashboard"
    When User click on "Distinct Addresses" more link
    Then User click on download counts zip
    And User choose "12" Month time period
    Then User click on Ok button
    
  Scenario: Cancel Download Counts
    When User clicks on "Dashboard"
    When User click on "Distinct Addresses" more link
    Then "Domain" Page should open
    When User click on domain download count dowload
    Then Download period popup should be open
    When User choose "One year" in the time period
    Then User close the downloads popup

  Scenario: Verify Address view count for current year
    When User clicks on "Dashboard"
    When User click on "Distinct Addresses" more link
    Then "Domain" Page should open
    When User click on Domain View count
    Then User count domain Popup left arrow should be enable and right arrow should be disable
   
  Scenario: Verify Address view count for Previous year
    When User clicks on "Dashboard"
    When User click on "Distinct Addresses" more link
    Then "Domain" Page should open
    When User click on Domain View count
    Then User count domain Popup left arrow should be enable and right arrow should be disable
    When User click on left Arrow
    Then Left Arrow should be disable
    
  Scenario: Verify Close Address count
    When User clicks on "Dashboard"
    When User click on "Distinct Addresses" more link
    Then "Domain" Page should open
    When User click on Domain View count
    Then User count domain Popup left arrow should be enable and right arrow should be disable
    When User click on outside the popup of address count view
	 
	Scenario: Verify Collapse and Expand icon
	When User clicks on "Dashboard"
	When User click on Collapse icon
	Then Side menu bar should be collapse
	When User click on Expand icon
	Then Side menu bar should be Expand
	
	Scenario: Verify Dashboard Setting Icon
	When User click on Collapse icon 
	When User click on Setting icon
	Then Setting page should be shown
	
	Scenario: Verify Dashboard Help page
	When User clicks on "Dashboard"
	And Click on Help icon of Dashboard
	Then Help page should open in new window