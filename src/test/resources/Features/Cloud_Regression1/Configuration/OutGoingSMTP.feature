@OutGoingSMTP
Feature: Outgoing SMTP

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Configure the application with a valid authenticated outgoing SMTP server
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
   # And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    Then Disable Outgoing Email button appears

  Scenario: Configure the application with a valid unauthenticated outgoing SMTP server
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters invalid out going SMTP Server
    And user enters from address
    Then User click on Save
    Then Message displayed
    Then Disable Outgoing Email button appears
    
  Scenario: Missing required fields
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And clear the field of out going SMTP Server
    And clear the field of from address
    Then User click on Save
    Then The message "This field is required" is displayed
    #Then Message displayed
 
  Scenario: Configure the application with an invalid From Address
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    And user enters invalid from address
    Then User click on Save
    Then Error message displayed

  Scenario: Disable Outgoing SMTP Server
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Disable Outgoing Email
    Then Pop Up window is displayed
    And user clicks on Ok button
    Then Message displayed

  Scenario: Enter a valid data and navigate without clicking save
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    When user click on "Email Notification" Tab
    When user click on "Outgoing SMTP" Tab
    Then the entered data is not saved and the fields are cleared

  Scenario: Hide Side Menu
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout Link
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    Then user click on Logout Icon
    Then user able to see Login Page
