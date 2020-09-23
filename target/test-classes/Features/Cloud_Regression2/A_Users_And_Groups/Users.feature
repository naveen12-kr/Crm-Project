@Users
Feature: Users

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Add a valid User
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    Then User able to see the User Creation Wizard
  
  Scenario: Add new user
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    Then User able to see the Configuration details
    When User Enters session timeout in minitues "0"
    And Verify active account checkbox is checked
    And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #Then User able to see the Set Group Membership
    #When User clicks on the groups he present
    #And Clicks on next button
    #Then User able to see the Select Permissions
    #When Click on end user permissions
    #And Clicks on next button
    #Then User able to see the Set home page details
    #When Click home page for new user
    #And Clicks on next button
    #Then User able to see the Set General Search Rule details
    #When User selects the Departmental Search Rule
    #And Enter the Search Results Limit "1000"
    #And Clicks on next button
    #Then User able to see Set allowed search addresses details
    #When User has all search permissions click finish
    #Then The user POP was created successfully

  Scenario: Add existing user
    When User Clicks on UserAndGroups tab
    And Enter existing user name "Jackie"
    And Click on Add User button
    #Then Message displayed

  Scenario: Set the user personal information
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    Then User able to see the Configuration details
    #Then "Configure basic options" is displayed under User Creation Wizard
    Then prev button is enabled

  Scenario: Set the user personal information with missing mandetory fields and confirm password
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And Clicks on next button
    #Then Message displayed
    Then Password and confirmation password did not match message is displayed

  Scenario: Set the user personal information with missing mandetory fields
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And Clicks on next button
    #Then Message displayed

  Scenario: Set the user personal information
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    Then User able to see the Configuration details
    Then prev button is enabled
    #Then "Configure basic options" is displayed under User Creation Wizard

  Scenario: Configure basic options
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #Then "Set group membership" is displayed under User Creation Wizard
    #Then prev button is enabled

  
  Scenario: Configure basic options and click pre button
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on Prev button
    #Then "Set the user's personal information" is displayed under User Creation Wizard
    #Then prev button is disabled

  Scenario: Set group membership without any membership
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #Then "Select permissions" is displayed under User Creation Wizard
    #Then prev button is enabled

  Scenario: Set group membership without any membership click prev button
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on Prev button
    #Then "Configure basic options" is displayed under User Creation Wizard

  Scenario: Select permissions
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #And Clicks on next button
    #Then Error message displayed

  Scenario: Select permissions HR/legal
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #Then Clicks on HR/legal permission
    #Then HR/legal permissions are selected
    #And Clicks on next button
    #Then "Set homepage" is displayed under User Creation Wizard
    #Then prev button is enabled

  Scenario: Select permissions admin
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #Then Clicks on admin permission
    #Then admin permissions are selected
    #And Clicks on next button
    #Then "Set homepage" is displayed under User Creation Wizard
    #Then prev button is enabled

  Scenario: Select permissions end-user
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #Then Clicks on end-user permission
    #Then end-user permissions are selected
    #And Clicks on next button
    #Then "Set homepage" is displayed under User Creation Wizard
    #Then prev button is enabled
    #
    Scenario: Set homepage HR/legal
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #Then Clicks on HR/legal permission
    #Then HR/legal permissions are selected
    #And Clicks on next button
    #Then "Set homepage" is displayed under User Creation Wizard
    #And select any radio button as home page
    #And Clicks on next button
    #Then "Set general search rule" is displayed under User Creation Wizard
    #Then prev button is enabled
  
  Scenario: Set homepage admin
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #Then Clicks on Admin permission
    #And Clicks on next button
    #Then "Set homepage" is displayed under User Creation Wizard
    #And select any radio button as home page
    #And Clicks on next button
    #Then Message displayed

  Scenario: Set homepage end-user
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #Then Clicks on end-user permission
    #Then end-user permissions are selected
    #And Clicks on next button
    #Then "Set homepage" is displayed under User Creation Wizard
    #And select any radio button as home page
    #And Clicks on next button
    #Then "Set general search rule" is displayed under User Creation Wizard
    #Then prev button is enabled
  
  Scenario: Set general search rule No default search addresses
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #Then Clicks on end-user permission
    #Then end-user permissions are selected
    #And Clicks on next button
    #And select any radio button as home page
    #And Clicks on next button
    #And select No default search addresses as Search Rule
    #And Enter the Search Results Limit "1000"
    #And Clicks on next button
    #Then "Set allowed search addresses" is displayed under User Creation Wizard
    #And User Searchable Departments is displayed
    #And User Searchable Addresses is displayed
    #And Add Department list is displayed
    #Then prev button is enabled

  Scenario: Set general search rule as his own addresses
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #Then Clicks on end-user permission
    #Then end-user permissions are selected
    #And Clicks on next button
    #And select any radio button as home page
    #And Clicks on next button
    #And select User can search on his own addresses as Search Rule
    #And Enter the Search Results Limit "1000"
    #And Clicks on next button
    #Then "Set allowed search addresses" is displayed under User Creation Wizard
    #And User Searchable Departments is displayed
    #And User Searchable Addresses is displayed
    #And Entered email address is displayed
    #And Add Department list is displayed
    #Then prev button is enabled

  Scenario: Set general search rule as User can search on addresses within the department
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #Then Clicks on end-user permission
    #Then end-user permissions are selected
    #And Clicks on next button
    #And select any radio button as home page
    #And Clicks on next button
    #And select User can search on User can search on addresses within the department he belongs to as Search Rule
     #When User selects the Departmental Search Rule
    #And Enter the Search Results Limit "1000"
    #And Clicks on next button
    #Then "Set allowed search addresses" is displayed under User Creation Wizard
    #And User Searchable Departments is displayed
    #And User Searchable Addresses is displayed
    #And Entered email address is displayed
    #And Add Department list is displayed
    #Then prev button is enabled

  Scenario: Set general search rule as User can search on all addresses
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    #Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #Then Clicks on end-user permission
    #Then end-user permissions are selected
    #And Clicks on next button
    #And select any radio button as home page
    #And Clicks on next button
    #And select User can search on User can search on all addresses
    #And Enter the Search Results Limit "1000"
    #And Clicks on next button
    #Then "Set allowed search addresses" is displayed under User Creation Wizard
    #And you cannot add new departments to their search permissions
    #And you cannot add new addresses to their search permissions

  Scenario: Set general search rule as User can search on all addresses
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    Then User able to see the User Creation Wizard
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And Clicks on next button
    #And User gives some TimeOut period
    #And selects language fron dropdown "0"
    #And selects the time zone	from dropdown "0"
    #And Clicks on next button
    #And Clicks on next button
    #Then Clicks on end-user permission
    #Then end-user permissions are selected
    #And Clicks on next button
    #And select any radio button as home page
    #And Clicks on next button
    #And select User can search on User can search on all addresses
    #And Enter the Search Results Limit "1000"
    #And Clicks on next button
    #Then "Set allowed search addresses" is displayed under User Creation Wizard
    #And Clicks on next button
    #Then Message displayed
  
  

  