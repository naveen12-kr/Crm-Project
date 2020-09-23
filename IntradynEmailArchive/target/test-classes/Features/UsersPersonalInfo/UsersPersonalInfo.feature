
Feature: UserAndGroups
	
 Background: 
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
    	
  Scenario: AddNewUser
    When User Clicks on UserAndGroups tab
    And Enter new user name "Jackie"
    And Click on Add User button
    Then User able to see the User Creation Wizard
	
  Scenario: Users Personal Information
    When User enter the password "ChangeMe"
    And User enters the confirm password "ChangeMe"
    And User enters full name "Ramkumar D"
    And User enters phone number "7799465089"
    And User enters email addresses "ramkumardkr@gmail.com"
    And User clicks on "next"
    Then User able to see the Configuration details
    
   