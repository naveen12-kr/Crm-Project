@SmtpServer
Feature: Smtp Server

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

Scenario: Start smtp server
  When User navigate to Configuration
  Then User see Email Server Page
  When User click on Configuration "SMTP Server"
  And User check SMTP Server is inactive
  And User check SMTP Server

Scenario: Stop smtp server
  When User navigate to Configuration
  Then User see Email Server Page
  When User click on Configuration "SMTP Server"
  And User check SMTP Server
  And User check SMTP Server is inactive

Scenario: smtp server
  When User navigate to Configuration
  Then User see Email Server Page
  When User click on Outgoing SMTP
  Then Outgoing smtp server page should open
  When User click on Save
  Then Outgoing mail save successfully

Scenario: Check SMTP Server Status
  When User navigate to Configuration
  Then User see Email Server Page
  When User click on Configuration "SMTP Server"
  And Click on Status icon blue magnifying glass
  Then Process details for the SMTP Server on System Status page is displayed

Scenario: Restart SMTP Server when active
  When User navigate to Configuration
  And User navigate to SMTP Server in Email servers
  And User check SMTP Server
  And User clicks on Reset
  Then server is restarted message is displayed

Scenario: Restart SMTP Server when inactive
  When User navigate to Configuration
  And User navigate to SMTP Server in Email servers
  And User check SMTP Server is inactive
  And User clicks on Reset
  Then server is restarted message is displayed

Scenario: Set valid SMTP Timeout
  When User navigate to Configuration
  And User navigate to SMTP Server in Email servers
  And User gives some TimeOut period
  And User click on Save

Scenario: Missing valid SMTP Timeout
  When User navigate to Configuration
  And User navigate to SMTP Server in Email servers
  And User gives no TimeOut period
  And User click on Save
  Then this field is Requierd message is displayed

Scenario: Invalid value SMTP Timeout
  When User navigate to Configuration
  And User navigate to SMTP Server in Email servers
  And User gives invalid TimeOut period
  And User click on Save
  Then this field is Requierd message is displayed

Scenario: Invalid format SMTP Timeout
  When User navigate to Configuration
  And User navigate to SMTP Server in Email servers
  And User gives invalid formate TimeOut period
  And User click on Save
  Then this field is Requierd message is displayed

Scenario: Hide Side Menu
  When User navigate to Configuration
  And User navigate to SMTP Server in Email servers
  Then click on Collapse - icon on Home Logo for hide
  Then Side menu disappears

Scenario: Display Side Menu
  When User navigate to Configuration
  And User navigate to SMTP Server in Email servers
  Then click on Collapse - icon on Home Logo for display
  Then Side menu is displayed

Scenario: Check home link
  When User navigate to Configuration
  And User navigate to SMTP Server in Email servers
  Then user click on Intradyn Logo
  Then user able to see the Dashboard page

Scenario: Check Account Settings link
  When User navigate to Configuration
  And User navigate to SMTP Server in Email servers
  Then user click on Account Settings Icon
  Then user able to see the Account Settings page

  Scenario: Check Help link
    When User navigate to Configuration
    And User navigate to SMTP Server in Email servers
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout Link
    When User navigate to Configuration
    And User navigate to SMTP Server in Email servers
    Then user click on Logout Icon
    Then user able to see Login Page
  
  Scenario: No server host
    When User navigate to Configuration
    And User navigate to SMTP Server in Email servers
    And User check SMTP Server is inactive
    And User gives some TimeOut period
    And User gives valid list of Domains in Domains field
    And User click on Save
    And User check SMTP Server
  
  Scenario: Add an existing host
    When User navigate to Configuration
    And User navigate to SMTP Server in Email servers
    And User check SMTP Server is inactive
    And User enters existing IP Address
    And User click on ADD Server button
    Then Message displayed
    And User check SMTP Server
  
  Scenario: Add Server with missing required field
    When User navigate to Configuration
    And User navigate to SMTP Server in Email servers
    And User check SMTP Server is inactive
    And User click on ADD Server button
    Then Error message displayed
    And User check SMTP Server
    	
  Scenario: Add Server List with a valid file
    When User navigate to Configuration
    And User navigate to SMTP Server in Email servers
    And User clicks on ADD Server List button
    And User clicks on Choose File button
    And user click on Create Legal hold
    
  Scenario: Add Server List with a missing file
    When User navigate to Configuration
    And User navigate to SMTP Server in Email servers
    And User clicks on ADD Server List button
    And user click on Create Legal hold
   
  Scenario: Add Server List with an invalid file
    When User navigate to Configuration
    And User navigate to SMTP Server in Email servers
    And User clicks on ADD Server List button
    And User Choose invalid File
    And user click on Create Legal hold
    Then Message displayed	
 
 	 Scenario: Delete an authorized IP Address
    When User navigate to Configuration
    And User navigate to SMTP Server in Email servers
    And user click on the Delete Icon
    Then Pop Up window is displayed
    And user clicks on Ok button
    
    Scenario: Delete an authorized IP Address
    When User navigate to Configuration
    And User navigate to SMTP Server in Email servers
    And user click on the Delete Icon
    Then Pop Up window is displayed
    And user clicks on Ok button
    
