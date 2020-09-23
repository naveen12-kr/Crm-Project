@Groups
Feature: Groups

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
   
    Scenario: Add a valid group
    When user click on "Users and Groups"
    When user clicks on Groups tab
    Then user able to see Groups
    And Enter new user name "Zanjo"
    #And click on the "Add Group" button
    #Then user able to see the header "Group Creation"
   
  Scenario: Group Creation
    When user click on "Users and Groups"
    When user clicks on Groups tab
    Then user able to see Groups
    And Enter new user name "Zanjo"
    And click on the "Add Group" button
    Then user able to see the header "Group Creation"
    #Then Clicks on HR/legal permission
    #Then User clicks on Save button
    #Then Message displayed
 
  Scenario: Add a existing group
    When user click on "Users and Groups"
    When user clicks on Groups tab
    Then user able to see Groups
    #And Enter existing user name "Jackie"
    #And Click on Add User button
    #Then Message displayed
 
  Scenario: Add with no  group
    When user click on "Users and Groups"
    When user clicks on Groups tab
    Then user able to see Groups
    And Click on Add User button
    #Then Message displayed
    
    Scenario: Edit the group
    When user click on "Users and Groups"
    When user clicks on Groups tab
    Then user able to see Groups
    #And user clicks on pencil icon in groups "1"
    #Then user able to see "Group Editing"
    
    Scenario: Edit the group with permissions
    When user click on "Users and Groups"
    When user clicks on Groups tab
    #Then user able to see Groups
    #And user clicks on pencil icon in groups "1"
    #Then user able to see "Group Editing"
    #Then Clicks on HR/legal permission
    #Then HR/legal permissions are selected
    #And user clicks on submit button
    #Then message is displayed
     
    Scenario: Edit the group with members
    When user click on "Users and Groups"
    When user clicks on Groups tab
    Then user able to see Groups
    And Enter new user name "Zanjo"
    And click on the "Add Group" button
    #Then user able to see the header "Group Creation"
    #Then Clicks on HR/legal permission
    #Then User clicks on Save button
    #When user click on "Users and Groups"
    #And get the user name to be enterd
    #When user clicks on Groups tab
    #Then user able to see Groups
    #And user clicks on pencil icon in groups "2"
    #Then user able to see "Group Editing"
    #And user clicks on members link
    #Then user enters member name
    #And user clicks on "add members" button
    #Then message is displayed
    #And The user name should be added into membership
   
    Scenario: Add multiple user membership
    When user click on "Users and Groups"
    When user clicks on Groups tab
    Then user able to see Groups
    And Enter new user name "Zanjo"
    And click on the "Add Group" button
    #Then user able to see the header "Group Creation"
    #Then Clicks on HR/legal permission
    #Then User clicks on Save button
    #When user click on "Users and Groups"
    #And get the user name to be enterd
    #When user clicks on Groups tab
    #Then user able to see Groups
    #And user clicks on pencil icon in groups "2"
    #Then user able to see "Group Editing"
    #And user clicks on members link
    #Then user enter multiple member name
    #And user clicks on "add members" button
    #Then message is displayed
    #And The user name should be added into membership
   
    Scenario: Remove members from membership
    When user click on "Users and Groups"
    And get the user name to be enterd
    When user clicks on Groups tab
    #Then user able to see Groups
    #And user clicks on pencil icon in groups "1"
    #Then user able to see "Group Editing"
    #And user clicks on members link
    #And user Select any one of the members
    #And user clicks on "remove members" button
    #Then message is displayed
    
    Scenario: Delete the group
    When user click on "Users and Groups"
    When user clicks on Groups tab
    Then user able to see Groups
    And Enter new user name "Zanjo"
    And click on the "Add Group" button
    #Then user able to see the header "Group Creation"
    #Then Clicks on HR/legal permission
    #Then User clicks on Save button
    #When user click on "Users and Groups"
    #And get the user name to be enterd
    #When user clicks on Groups tab
    #Then user able to see Groups
    #And user clicks on cross Icon
    #Then the group is deleted
    #
    Scenario: Add group with deleted group name
    When user click on "Users and Groups"
    When user clicks on Groups tab
    Then user able to see Groups
    #And user clicks on cross Icon
    #Then the group is deleted
    #And Add the Deleted group in new Group
    #And click on the "Add Group" button
    #Then user able to see the header "Group Creation"
    
    
    
    
    