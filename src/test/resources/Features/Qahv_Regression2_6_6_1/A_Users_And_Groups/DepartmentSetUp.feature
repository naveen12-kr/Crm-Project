@DepartmentSetUp
Feature: Department SetUp

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Check the Department setup page
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    Then user able to see "Departmental Email Address Configuration"

  Scenario: Add a new Department
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    Then user able to see "Departmental Email Address Configuration"
    #And Enter new user name "Jackie"
    #When user clicks on "Add Department" button
    #Then user able to see "Department Creation"
    #And Enter the content in Description field "Description"
    #When user clicks on submit button
    #Then Message displayed

  Scenario: Add a new Department with LDAP
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    Then user able to see "Departmental Email Address Configuration"
    #And Enter new user name "Ja"
    #When user clicks on "Add Department" button
    #Then user able to see "Department Creation"
    #And Enter the content in Description field "Description"
    #And user select Any radio button Dates Range "id_useldap"
    #When user clicks on submit button
    #Then user able to see "LDAP Department Wizard"
    #And Clicks on next button
    #Then the Current Class Should be "Verify LDAP attribute names."
    #And Clicks on next button
    #Then the Current Class Should be "Enter LDAP bind and search information."
    #And user Enters data in the input Field "id_server" as "10.100.1.217"
    #And user Enters data in the input Field "id_bindName" as "Sudhakar GVVN@QA-Exchange2.text"
    #And user Enters data in the input Field "id_bindPwd" as "Intradyn1234"
    #And user Enters data in the input Field "id_basedn" as "CN=Users,DC=QA-Exchange2,DC=text"
    #And Clicks on next button
    #And click on the "finish" button
    #Then Message displayed
  
  Scenario: Add Department with missing field
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    Then user able to see "Departmental Email Address Configuration"
    When user clicks on "Add Department" button
    #Then This field is required message displayed

  Scenario: Department Creation
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    Then user able to see "Departmental Email Address Configuration"
    #And Enter new user name "ackie"
    #When user clicks on "Add Department" button
    #Then user able to see "Department Creation"
    #And Enter the content in Description field "Description"
    #When user clicks on submit button
    #Then Message displayed

  Scenario: Check the Edit option
    When user click on the "Users and Groups"
    When user click on the "Department Setup"
    Then user should able to see the "Departmental Email Address Configuration"
    #And Enter new user name "ackie"
    #When user clicks on "Add Department" button
    #Then user able to see "Department Creation"
    #And Enter the content in Description field "Description"
    #When user clicks on submit button
    #Then Message displayed
    #When user click on "Department Setup"
    #And Click on pencil icon for editing the department
    #Then user should able to see the "Department"
  
  Scenario: Edit the Department
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    Then user able to see "Departmental Email Address Configuration"
    #And Enter new user name "ackie"
    #When user clicks on "Add Department" button
    #Then user able to see "Department Creation"
    #And Enter the content in Description field "Description"
    #When user clicks on submit button
    #Then Message displayed
    #When user click on "Department Setup"
    #And Click on pencil icon for editing the department
    #And Enter the content in Description field "Description"
    #When user clicks on submit button
    #Then Message displayed
  
  Scenario: Add the sub departments
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    Then user able to see "Departmental Email Address Configuration"
    #And Enter new user name "Jackie"
    #When user clicks on "Add Department" button
    #Then user able to see "Department Creation"
    #And Enter the content in Description field "Description"
    #When user clicks on submit button
    #Then Message displayed
    #When user click on "Department Setup"
    #And Click on pencil icon for editing the department
    #And Select one Department name under the Departments subDepartments
    #When user clicks on "Add Department" button
  
  Scenario: Add the sub departments
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    Then user able to see "Departmental Email Address Configuration"
    #And Enter new user name "Jackie"
    #When user clicks on "Add Department" button
    #Then user able to see "Department Creation"
    #And Enter the content in Description field "Description"
    #When user clicks on submit button
    #Then Message displayed
    #And Select one Department name under the Departments subDepartments
  
  Scenario: Delete the sub departments
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    Then user able to see "Departmental Email Address Configuration"
    #And Click on pencil icon for editing the department
    #When user clicks on "Add Department" button
    #And Click on Delete icon under the Departments subDepartments list
    #And pop up alert message displayed
    #And click on ok button
  
  Scenario: Add the Departments Email Addresses
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    Then user able to see "Departmental Email Address Configuration"
    #And Enter new user name "ackie"
    #When user clicks on "Add Department" button
    #Then user able to see "Department Creation"
    #And Enter the content in Description field "Description"
    #When user clicks on submit button
    #Then Message displayed
    #When user click on "Department Setup"
    #And Click on pencil icon for editing the department
    #And Enter one email id "adam@a.com"in the text field under the Department's Email Addresses.
    #When user clicks on "Add Addresses" button
    #Then Message displayed
  
  Scenario: Add the Multiple Department's Email Addresses
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    #Then user able to see "Departmental Email Address Configuration"
    #And Click on pencil icon for editing the department
    #And Enter one email id "adam@a.com; curt@c.com"in the text field under the Department's Email Addresses.
    #When user clicks on "Add Addresses" button
    #Then Message displayed
 
  Scenario: Remove the Department's Email address
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    #Then user able to see "Departmental Email Address Configuration"
    #And Click on pencil icon for editing the department
    #And Enter one email id "adam@a.com; curt@c.com"in the text field under the Department's Email Addresses.
    #When user clicks on "Add Addresses" button
    #And Click on delete icon under the Departments emial addresses list
    #And pop up alert message displayed
    #And click on ok button
   
  Scenario: Delete the Department setup
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    #Then user able to see "Departmental Email Address Configuration"
    #And Click on the Delete icon of Departmental Email Address Configuration
    #And pop up alert message displayed
    #And click on ok button
  
  Scenario: Add Department with existing department
    When User Clicks on UserAndGroups tab
    When user click on "Department Setup"
    #Then user able to see "Departmental Email Address Configuration"
    #And Enter existing Department name in text field
    #When user clicks on "Add Department" button
    #Then Error message displayed
