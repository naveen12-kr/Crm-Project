@Login
Feature: Login

  Background: 
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Edit User
    When User Clicks on UserAndGroups tab
    And clicks on edit button
    Then User able to see personnal details
    And User changes his password "ChangeMe"
    And User changes his confirm password "ChangeMe"
    And User changes his full name "Jacky"
    And User changes his phone number "7799456980"
    And User changes his email addresses "kumar@gmail.com"
    And Clicks on save button
    Then message "" is displayed
  #@GenerateMail
 # Scenario: Remove Tag Email
  #  When User clicks on "Email Viewing"
  #  When User select search by "before" date
  # When User click on search
  #  Then User are successfully logged in the New-UI app
