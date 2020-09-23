@LDAP
Feature: LDAP

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Check the LDAP / Active Directory page
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
 
  Scenario: Creating an Authenticator
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
    And user Enters data in the input field "id_newName" as "Zanjo"
    And click on the "Add Auth" button
    Then user able to see "LDAP Authenticator Wizard"
    Then the Current Class Should be "Choose the LDAP server type."
    And Clicks on next button
    Then the Current Class Should be "Verify LDAP attribute names."
    And Clicks on next button
    Then the Current Class Should be "Enter LDAP bind and search information."
    And user Enters data in the input Field "id_server" as "10.100.1.217"
    And user Enters data in the input Field "id_bindName" as "Sudhakar GVVN@QA-Exchange2.text"
    And user Enters data in the input Field "id_bindPwd" as "Intradyn1234"
    And user Enters data in the input Field "id_basedn" as "CN=Users,DC=QA-Exchange2,DC=text"
    And Clicks on next button
    And Clicks on next button
    And Clicks on next button
    Then the Current Class Should be "Configure basic options"
    And Clicks on next button
    Then User able to see the Set Group Membership
    When User clicks on the groups he present
    And Clicks on next button
    Then User able to see the Select Permissions
    When Click on end user permissions
    And Clicks on next button
    Then the Current Class Should be "Set homepage"
    And select any radio button as home page
    And Clicks on next button
    Then the Current Class Should be "Set general search rule"
    And select User can search on his own addresses as Search Rule
    And Enter the Search Results Limit "1000"
    And Clicks on next button
    Then the Current Class Should be "Set allowed search addresses"
    And click on the "finish" button
    Then Message displayed
    And the data is added in the table

  Scenario: Check with Select permissions page (With No permissions)
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
    And user Enters data in the input field "id_newName" as "Zanjo"
    And click on the "Add Auth" button
    Then user able to see "LDAP Authenticator Wizard"
    Then the Current Class Should be "Choose the LDAP server type."
    And Clicks on next button
    Then the Current Class Should be "Verify LDAP attribute names."
    And Clicks on next button
    Then the Current Class Should be "Enter LDAP bind and search information."
    And user Enters data in the input Field "id_server" as "10.100.1.217"
    And user Enters data in the input Field "id_bindName" as "Sudhakar GVVN@QA-Exchange2.text"
    And user Enters data in the input Field "id_bindPwd" as "Intradyn1234"
    And user Enters data in the input Field "id_basedn" as "CN=Users,DC=QA-Exchange2,DC=text"
    And Clicks on next button
    And Clicks on next button
    Then the Current Class Should be "Configure basic options"
    And Clicks on next button
    Then the Current Class Should be "Set group membership"
    And Clicks on next button
    Then the Current Class Should be "Select permissions"
    And Clicks on next button
    #Then The message "All users are required to have at least one permission" is displayed
    #Then Message displayed

  Scenario: Check Edit the LDAP User Authenticator
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
    And user click on "6" Icon
    Then user able to see "LDAP Authenticator Editing"

  Scenario: Edit the LDAP User Authenticator with options
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
    And user click on "6" Icon
    Then user able to see "LDAP Authenticator Editing"
    And User select "serverType" from the second drop down "AD"
    And click on the "Save" button
    Then Message displayed

  Scenario: Copy the LDAP User Authenticator
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
    And user click on "7" Icon
    And user Enters data in the input field "clone_name" as "Zanjo"
    And User click On Ok button
    And the data is added in the table

  Scenario: Copy the LDAP User Authenticator with empty field
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
    And user click on "7" Icon
    And User click On Ok button

  Scenario: Delete the LDAP User Authenticator
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
    And user click on "8" Icon
    And User click Alert Ok button

  Scenario: Check the Test option in LDAP User Authenticator
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
    And user click on "5" Icon
    Then user able to see "Authenticator"
 
  Scenario: Check the Test option in LDAP User Authenticator with results
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
    And user click on "5" Icon
    Then user able to see "Authenticator"
    #And click on the "Run Tests" button
    #And get the Results of the run

  Scenario: Check the Test option in LDAP User Authenticator Health Checkup
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
    And user click on "5" Icon
    Then user able to see "Authenticator"
    And user clicks on Up a Test Level icon
    Then user able to see "LDAP Authentication Health Checkup"

  Scenario: Add Authenticator with empty field
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
    And click on the "Add Auth" button
    Then Special Message displayed"This field is required"

  Scenario: Add Authenticator with Existing auth name
    When user click on "Users and Groups"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"
    And Enter existing user name "Jackie"
    And click on the "Add Auth" button
    Then Special Message displayed"This configuration ID already exists"
