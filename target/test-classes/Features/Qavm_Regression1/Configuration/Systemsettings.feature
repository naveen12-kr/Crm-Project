@SystemSettings
Feature: System settings

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
  
  Scenario: Navigate to System Settings page
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    Then User able to see the "System Settings"

  Scenario: Default Charset - Set with Unicode (UTF-8)
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed

  Scenario: Default Charset - Set with Western European (ISO-8859-1)
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Western European (ISO-8859-1)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed
    
    Scenario: Default Charset - Set with Chinese Traditional (Big5)
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Chinese Traditional (Big5)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed
    
    Scenario: Default Charset - Set with Chinese Simplified (GB2312)
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Chinese Simplified (GB2312)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed
    
    Scenario: Default Charset - Set with Japanese (ISO-2022-JP)
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Japanese (ISO-2022-JP)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed

    Scenario: Default Charset - Set with Korean (EUC-KR)
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Korean (EUC-KR)"
    And user selects default language "Japanese"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed
    
    Scenario: Default Charset - Set with Thai (TIS-620)
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Thai (TIS-620)"
    And user selects default language "Japanese"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed
    
    Scenario: Default Language - Set with English
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 GMT"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed
    
    Scenario: Default Language - Set with French
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "French"
    And user selects the Time Zone "GMT+00:00 GMT"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed
    
    Scenario: Default Language - Set with Japanese
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "Japanese"
    And user selects the Time Zone "GMT+00:00 GMT"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed
    
    Scenario: Default Language - Set with Chinese (Simplified)
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "Chinese(Simplified)"
    And user selects the Time Zone "GMT+00:00 GMT"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed
    
    Scenario: Default Language - Set with Chinese (Traditional)
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "Chinese(Traditional)"
    And user selects the Time Zone "GMT+00:00 GMT"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed
   
    Scenario: Set the Time Zone
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "Chinese(Traditional)"
    And user selects the Time Zone "GMT+00:00 GMT"
    And user selects the Time determination method as Set Time Mnaually
    And current date and time is dispalyed
    Then User click on Save
    #Then Message displayed
    
    Scenario: Synchronize with NTP Server
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Synchronize with NTP Server
    Then User click on Save
    #Then Message displayed
    
    Scenario: Check with preselected NTP Servers
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Synchronize with NTP Server
    And user selects the preselected NTP servers "Europe (pool.europe.ntp.org)"
    And user see the "list of NTP servers"
    Then User click on Save
    #Then Message displayed
    	
    Scenario: Set Time Manually
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    Then User click on Save
    #Then Message displayed
  
    Scenario: Set Date and Time manually
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    And user set the time manually as "2019-11-03 05:50:12"
    Then User click on Save
    #Then The message "Enter a valid date/time" is displayed
    #Then Message displayed
   
    Scenario: Enter invali date format
    When user click on "Configuration" Tab
    When user click on "System Settings" Tab
    And user selects the default charset "Unicode (UTF-8)"
    And user selects default language "English"
    And user selects the Time Zone "GMT+00:00 UTC"
    And user selects the Time determination method as Set Time Mnaually
    And user set the time manually as "gfh"
    Then User click on Save
    #Then Error message displayed
