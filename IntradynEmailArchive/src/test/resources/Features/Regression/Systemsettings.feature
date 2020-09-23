
Feature: Configuration System settings
	
  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: System Settings
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    Then Message displayed  

	Scenario: System Settings
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Western European (ISO-8859-1)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    Then Message displayed
    
 Scenario: System Settings
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Korean (EUC-KR)"
    And user selects default language "Japanese"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    Then Message displayed
    
  Scenario: System Settings
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "French"
    And user selects the Time Zone "GMT+00:00 GMT"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    Then Message displayed
 @SystemSettings 
   Scenario: System Settings
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Synchronize with NTP Server
    And user selects the preselected NTP servers "Europe (pool.europe.ntp.org)"
    And user see the "list of NTP servers"
    Then User click on Save
    Then Message displayed
    
    