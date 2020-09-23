@ImportUsersFromExcel
Feature: ImportUsersFromExcel

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Navigate to Import users from excel tab
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
 
  Scenario: Check with Example user import file
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    Then user Clicks on the "users.xls"
    Then The corresponding File "users" is downloaded

  Scenario: Check with Cancel button
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    And user clicks on "cancel" button
    Then Error message Displayed

  Scenario: Import user data from Excel
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    And Select "Copyofusers.xls" excel file from the system
    And Clicks on next button
    Then "Verify Excel file data formatting." is displayed under User Creation Wizard
    
  Scenario: Import user data with empty excel file
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    And Select "" excel file from the system
    And Clicks on next button
    Then This field is required message displayed
  
  Scenario: Import user data with existed user name
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    And Select "Copyofusers.xls" excel file from the system
    And Clicks on next button
    And Clicks on next button
    Then User able to see the Configuration details
    When User Enters session timeout in minitues "0"
    And Verify active account checkbox is checked
    And selects language fron dropdown "0"
    And selects the time zone	from dropdown "0"
    And Clicks on next button
    Then User able to see the Set Group Membership
    When User clicks on the groups he present
    And Clicks on next button
    Then User able to see the Select Permissions
    When Click on end user permissions
    And Clicks on next button
    Then User able to see the Set home page details
    When Click home page for new user
    And Clicks on next button
    Then User able to see the Set General Search Rule details
    When User selects the Departmental Search Rule
    And Enter the Search Results Limit "1000"
    And Clicks on next button
    Then User able to see Set allowed search addresses details
    When User has all search permissions click finish
    Then The user POP was created successfully
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    And Select "Copyofusers.xls" excel file from the system
    And Clicks on next button
    #Then "Verify Excel file data formatting." is displayed under User Creation Wizard
    #And Good users Found: none
    #And next button should be disabled
  
  Scenario: Verify Excel file data formatting
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    And Select "Copyofusers.xls" excel file from the system
    And Clicks on next button
    And Clicks on next button
    #Then "Configure basic options" is displayed under User Creation Wizard

  Scenario: Configure basic options
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    #And Select "Copyofusers.xls" excel file from the system
    And Select "aa.xls" excel file from the system
    And Clicks on next button
    And Clicks on next button
    Then User able to see the Configuration details
    When User Enters session timeout in minitues "0"
    And Verify active account checkbox is checked
    And selects language fron dropdown "0"
    And selects the time zone	from dropdown "0"
    And Clicks on next button
    #Then "Set group membership" is displayed under User Creation Wizard
  
  Scenario: Set group membership
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    #And Select "Copyofusers.xls" excel file from the system
    And Select "bb.xls" excel file from the system
    And Clicks on next button
    And Clicks on next button
    Then User able to see the Configuration details
    When User Enters session timeout in minitues "0"
    And Verify active account checkbox is checked
    And selects language fron dropdown "0"
    And selects the time zone	from dropdown "0"
    And Clicks on next button
    #Then "Set group membership" is displayed under User Creation Wizard
  
  Scenario: Select permissions
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    #And Select "Copyofusers.xls" excel file from the system
    And Select "cc.xls" excel file from the system
    And Clicks on next button
    And Clicks on next button
    Then User able to see the Configuration details
    When User Enters session timeout in minitues "0"
    And Verify active account checkbox is checked
    And selects language fron dropdown "0"
    And selects the time zone	from dropdown "0"
    And Clicks on next button
    Then User able to see the Set Group Membership
    When User clicks on the groups he present
    And Clicks on next button
    Then User able to see the Select Permissions
    When Click on end user permissions
    And Clicks on next button
    #Then "Set homepage" is displayed under User Creation Wizard

  Scenario: Select No permissions
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    #And Select "Copyofusers.xls" excel file from the system
    And Select "dd.xls" excel file from the system
    And Clicks on next button
    And Clicks on next button
    Then User able to see the Configuration details
    When User Enters session timeout in minitues "0"
    And Verify active account checkbox is checked
    And selects language fron dropdown "0"
    And selects the time zone	from dropdown "0"
    And Clicks on next button
    Then User able to see the Set Group Membership
    And Clicks on next button
    And Clicks on next button
    Then Error message Displayed

  Scenario: Set homepage
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    #And Select "Copyofusers.xls" excel file from the system
    And Select "ee.xls" excel file from the system
    And Clicks on next button
    And Clicks on next button
    Then User able to see the Configuration details
    When User Enters session timeout in minitues "0"
    And Verify active account checkbox is checked
    And selects language fron dropdown "0"
    And selects the time zone	from dropdown "0"
    And Clicks on next button
    Then User able to see the Set Group Membership
    When User clicks on the groups he present
    And Clicks on next button
    Then User able to see the Select Permissions
    When Click on end user permissions
    And Clicks on next button
    Then User able to see the Set home page details
    When Click home page for new user
    And Clicks on next button
    #Then "Set general search rule" is displayed under User Creation Wizard

  Scenario: Set general search rule
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    #And Select "Copyofusers.xls" excel file from the system
    And Select "ff.xls" excel file from the system
    And Clicks on next button
    And Clicks on next button
    Then User able to see the Configuration details
    When User Enters session timeout in minitues "0"
    And Verify active account checkbox is checked
    And selects language fron dropdown "0"
    And selects the time zone	from dropdown "0"
    And Clicks on next button
    Then User able to see the Set Group Membership
    When User clicks on the groups he present
    And Clicks on next button
    Then User able to see the Select Permissions
    When Click on end user permissions
    And Clicks on next button
    Then User able to see the Set home page details
    When Click home page for new user
    And Clicks on next button
    #Then "Set general search rule" is displayed under User Creation Wizard
    Then User able to see the Set General Search Rule details
    When User selects the Departmental Search Rule
    And Enter the Search Results Limit "1000"
    And Clicks on next button
    #Then "Set allowed search addresses" is displayed under User Creation Wizard
 
  Scenario: Set allowed search addresses
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    #And Select "Copyofusers.xls" excel file from the system
    And Select "gg.xls" excel file from the system
    And Clicks on next button
    And Clicks on next button
    Then User able to see the Configuration details
    When User Enters session timeout in minitues "0"
    And Verify active account checkbox is checked
    And selects language fron dropdown "0"
    And selects the time zone	from dropdown "0"
    And Clicks on next button
    Then User able to see the Set Group Membership
    When User clicks on the groups he present
    And Clicks on next button
    Then User able to see the Select Permissions
    When Click on end user permissions
    And Clicks on next button
    Then User able to see the Set home page details
    When Click home page for new user
    And Clicks on next button
    Then User able to see the Set General Search Rule details
    When User selects the Departmental Search Rule
    And Enter the Search Results Limit "1000"
    And Clicks on next button
    Then User able to see Set allowed search addresses details
    When User has all search permissions click finish
    Then The user POP was created successfully
    And Remove the Added Data
