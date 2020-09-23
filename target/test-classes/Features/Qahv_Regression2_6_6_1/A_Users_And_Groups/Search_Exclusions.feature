@SearchExclusions
Feature: SearchExclusions

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

Scenario: Check the search exclusions page
    When user click on "Users and Groups"
    When user click on "Search Exclusions"
    Then user able to see "Global Search Exclusions"

  Scenario: Search Exclusions without email address
    When user click on "Users and Groups"
    When user click on "Search Exclusions"
    And User click On the submit Button
    #Then Message displayed

  Scenario: Search Exclusions with email address
    When user click on "Users and Groups"
    When user click on "Search Exclusions"
    And Enter valid email address "bob@b.com" in Exclusion Addresses field
    And User click On the submit Button
    #Then Message displayed

  Scenario: Search Exclusions with multiple email address
    When user click on "Users and Groups"
    When user click on "Search Exclusions"
    And Enter valid email address "bob@b.com; adam@a.com" in Exclusion Addresses field
    And User click On the submit Button
    #Then Message displayed

  Scenario: Check the Look Up option
    When user click on "Users and Groups"
    When user click on "Search Exclusions"
    When user click on Look Up link
    Then New window of Look Up Search Addresses page should be open

  Scenario: Check the Look Up option
    When user click on "Users and Groups"
    When user click on "Search Exclusions"
    When user click on Look Up link
    Then New window of Look Up Search Addresses page should be open
    #And Enter "a" in Search Terms field
    #And List of email addresses should be displayed in below list and select one email address
    #When user click on add selections button
    #Then The selected email address should be added into Exclusion Addresses box
    #And User click On the submit Button
    #And User click On Add Override button
  
  Scenario: Check the Look Up option with multiple email addresses
    When user click on "Users and Groups"
    When user click on "Search Exclusions"
    When user click on Look Up link
    Then New window of Look Up Search Addresses page should be open
    #And Enter "a" in Search Terms field
    #And List of email addresses should be displayed in below list and select multiple email address
    #When user click on add selections button
    #Then The selected email address should be added into Exclusion Addresses box
    #And User click On the submit Button
  
  Scenario: Add email address into Exclusion Overrides
    When user click on "Users and Groups"
    When user click on "Search Exclusions"
    And user enters the exclusion addresses "@gmail.com"
    And User click On the submit Button
    #And Added email address are shown into Exclusion overrides
    #And Select email address from dropdown list under Exclusion Overrides
    #And Select user name from dropdown list under Exclusion Overrides
    #And User click On Add Override button
    #Then Message displayed
  
  Scenario: Add existing email address into exclusion overrides
    When user click on "Users and Groups"
    When user click on "Search Exclusions"
    #And user enters the exclusion addresses "@gmail.com"
    #And User click On the submit Button
    #And User click On Add Override button
    #And User click On Add Override button
    #Then Message displayed
 
  #Scenario: delete overrided email address
    #When user click on "Users and Groups"
    #When user click on "Search Exclusions"
    #And Added email address are shown into Exclusion Addresses list
    #And Click on Delete icon under the Exclusion Overrides

  
  #Scenario: Delete the email addresses from Exclusions Addresses
    #When user click on "Users and Groups"
    #When user click on "Search Exclusions"
    #And User click On Add Override button
    #And Added email address are shown into Exclusion Addresses list
    #And Click on Delete icon under the Exclusion Overrides
    #And User click On the submit Button
    #Then Message displayed
