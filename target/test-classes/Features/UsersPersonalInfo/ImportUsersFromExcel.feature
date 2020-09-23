@UsersAndGroups
Feature: Users and Groups

	Background: Login
  
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
 
  @importUserExcel
  Scenario: Import users from excel
    When User Clicks on UserAndGroups tab
    When User clicks on Import users from excel file
    Then User is able to see Excel-Based User Creation Wizard
    When User clicks on browse and uploads excel file
    And Clicks on next button
    Then Good users found
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
    

  