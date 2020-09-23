@MSEWSServices
Feature: MS EWS Services

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Navigate to MS EWS Services
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"

  Scenario: Check with Add New Server option
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    And click on the "Add New Server" button
    Then user should able to see the "Add Exchange Server"

  Scenario: Adding the New Server
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    And click on the "Add New Server" button
    Then user should able to see the "Add Exchange Server"
    #And User enters the activity name as "Intra"
    And User enters the activity name as "mail.qa.intradyn.com"
    And User select "version" from the second drop down "1"
    #And Enter the Data "id_priv_user" for Search "sudhakar@intradyn.com"
    And Enter the Data "id_priv_user" for Search "bind"
    #And Enter the Data "id_priv_password_0" for Search "Intradyn1234"
    And Enter the Data "id_priv_password_0" for Search "IntradynTest1"
    And click on the "Submit" button
    Then Server name should be added under the Exchange Servers Activities list

  Scenario: Check with Edit option
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    And user Edit Version of any of the Exchange Server
    And click on the "Submit" button
    Then The version  of the server should be changed

  Scenario: Check with Test option
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    When user click on Test Icon
    Then user should able to see the "Health Checkup"

  Scenario: Check with Delete option
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    And click on the "Add New Server" button
    Then user should able to see the "Add Exchange Server"
    #And User enters the activity name as "Intra"
     And User enters the activity name as "mail.qa.intradyn.com"
    And User select "version" from the second drop down "1"
    #And Enter the Data "id_priv_user" for Search "sudhakar@intradyn.com"
    And Enter the Data "id_priv_user" for Search "bind"
    #And Enter the Data "id_priv_password_0" for Search "Intradyn1234"
    And Enter the Data "id_priv_password_0" for Search "IntradynTest1"
    And click on the "Submit" button
    When user click on Delete Icon
    Then Server name should be deleted from the list

  Scenario: Test the Health Checkup for server
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    When user click on Test Icon
    Then user should able to see the "Health Checkup"
    And click on the "Run Tests" button
    Then the Result of the test in obtained

  Scenario: Add New Server with Empty Fields
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    And click on the "Add New Server" button
    Then user should able to see the "Add Exchange Server"
    And click on the "Submit" button
    Then Error message displayed

  Scenario: Check with Add New Activity option
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    And click on the "Add New Activity" button
    Then user should able to see the "Add Exchange Activity"

  Scenario: Adding the New Acivity
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    And click on the "Add New Activity" button
    Then user should able to see the "Add Exchange Activity"
    And User enters the activity name as "Intra"
    And User select "atype" from the second drop down1 "Folder Sync"
    #And User select "server" from the second drop down1 "QA2-DC2"
    #And User select "server" from the second drop down1 "mail.qa.intradyn.com"
    And User select the server of exchange server
    And User select "run_days" from the second drop down1 "Sunday"
    And Enter the Data "id_run_time" for Search "6:30"
    And click on the "Submit" button
    When user click on the "MS EWS Services"
    Then Activity name should be added under the Exchange Servers Activities list

  Scenario: Check with Edit option for Acivity
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    When user clicks on pencil icon for edit the Activity details
    Then user should able to see the "Update Exchange Activity"
    When user edit the Activity details
    And click on the "Submit" button
    Then Activity is eddited successfully
	@Test1
  Scenario: Check with Delete option for Acivity
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    And click on the "Add New Activity" button
    Then user should able to see the "Add Exchange Activity"
    #And User enters the activity name as "Intra"
    And User enters the activity name as "Intra2"
    And User select "atype" from the second drop down1 "Folder Sync"
    #And User select "server" from the second drop down1 "QA2-DC2"
     #And User select "server" from the second drop down1 "mail.qa.intradyn.com"
     And User select the server of exchange server
    And User select "run_days" from the second drop down "mon"
    And Enter the Data "id_run_time" for Search "6:30"
    And click on the "Submit" button
    When user clicks on Delete icon for edit the Activity details
    Then Activity name should be deleted from the list

  Scenario: Check with Activate option
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    #When user Clicks on Activate Up Arrow option
    #Then Arrow direction should be changed

  Scenario: Check with Deactivate option
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    #When user Clicks on Deactivate Down Arrow option
    #Then Arrow direction should be changed to down

  Scenario: Add activity with empty fields
    When User clicks on "Configuration"
    When user click on the "MS EWS Services"
    Then user should able to see the "MS Exchange Services"
    And click on the "Add New Activity" button
    Then user should able to see the "Add Exchange Activity"
    And click on the "Submit" button
    Then The message "This field is required" is displayed.
