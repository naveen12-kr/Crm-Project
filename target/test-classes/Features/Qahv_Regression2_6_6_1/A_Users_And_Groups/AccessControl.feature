@AccessControl
Feature: Access Control

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
  @U&G_A_CON_001
  Scenario: Check the Access Control page
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
  @U&G_A_CON_002
  Scenario: Control Rule Creation Wizard
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
    And click on the "Create Rule" button
    Then user should able to see the "Access Control Rule Creation Wizard"
  @U&G_A_CON_003
  Scenario: Create Rule
    When user click on "Users and Groups"
    When user click on "User"
    And Enter valid user name in Name text field
    And Clicks on next button
    Then the Current Class Should be "Confirm Assignee"
    And Clicks on next button
    Then the Current Class Should be "Select Content"
    And Enter valid user name in Name text field1
    And user enters email address
    And User select "selecteddept" from the drop down "0"
    And Clicks on next button
    Then the Current Class Should be "Confirm Content"
    And Clicks on next button
    #Then Message displayed
   @U&G_A_CON_004
  Scenario: Create Rule with invalid use
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
    And click on the "Create Rule" button
    Then user should able to see the "Access Control Rule Creation Wizard"
    And user enters invalid user
    And Clicks on next button
    Then Message displayed
  @U&G_A_CON_005
  Scenario: Select content page with empty fields
    When user click on "Users and Groups"
    When user click on "User"
    And Enter valid user name in Name text field
    And Clicks on next button
    Then the Current Class Should be "Confirm Assignee"
    And Clicks on next button
    Then the Current Class Should be "Select Content"
    And Clicks on next button
    Then the Current Class Should be "Confirm Content"
    And Clicks on next button
    #Then Message displayed
 @U&G_A_CON_006

  Scenario: Look Up option with Select content page
    When user click on "Users and Groups"
    When user click on "User"
    And Enter valid user name in Name text field
    And Clicks on next button
    Then the Current Class Should be "Confirm Assignee"
    And Clicks on next button
    Then the Current Class Should be "Select Content"
    When user click on Look Up link "2"
    Then New window of Look Up Search Addresses page should be open
  @U&G_A_CON_007
  Scenario: Look Up option with Select content page
    When user click on "Users and Groups"
    When user click on "User"
    And Enter valid user name in Name text field
    And Clicks on next button
    Then the Current Class Should be "Confirm Assignee"
    And Clicks on next button
    Then the Current Class Should be "Select Content"
    When user click on Look Up link "2"
    Then New window of Look Up Search Addresses page should be open
    And Enter "ab" in Search Terms field
    And List of email addresses should be displayed in below list and select one email address
    #When user click on add selections button
    #Then The selected email address should be added into Exclusion Addresses box
    #And Selected emails should be added into Users text field
  @U&G_A_CON_008
  Scenario: Edit the Rule
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
    And user click on "1" icon
    Then user able to see "Access Control Rule Creation Wizard"
  @U&G_A_CON_009
  Scenario: Edit the Rule
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
    And user click on "1" icon
    Then user able to see "Access Control Rule Creation Wizard"
    And Enter valid user name in Name text field1
    And user enters email address
    And User select "selecteddept" from the drop down "0"
    And Clicks on next button
    Then the Current Class Should be "Confirm Content"
    And Clicks on next button
    #Then Message displayed
  @U&G_A_CON_010
  Scenario: Cancel the edit rule
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
    And user click on "1" icon
    Then user able to see "Access Control Rule Creation Wizard"
    When user clicks on "cancel" button
    #Then Message displayed
  @U&G_A_CON_011
  Scenario: Edit Rule with empty fields
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
    And user click on "1" icon
    Then user able to see "Access Control Rule Creation Wizard"
    When user clicks on "next" button
    #Then Message displayed
  @U&G_A_CON_013
  Scenario: Edit Rule with selecting Tags
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
    And user click on "1" icon
    Then user able to see "Access Control Rule Creation Wizard"
    And User select "selecteddept" from the drop down "0"
    When user clicks on "next" button
    Then the Current Class Should be "Confirm Content"
    And Clicks on next button
    #Then Message displayed

  @U&G_A_CON_014
  Scenario: Edit Rule with selecting Tags Multiple
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
    And user click on "1" icon
    Then user able to see "Access Control Rule Creation Wizard"
    And User select multiple "selecteddept" from the drop down "0" and "1"
    When user clicks on "next" button
    Then the Current Class Should be "Confirm Content"
    And Clicks on next button
    #Then Message displayed
  @U&G_A_CON_015
  Scenario: Edit Rule with selecting Tags with Check Box
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
    And user click on "1" icon
    Then user able to see "Access Control Rule Creation Wizard"
    And User select "selecteddept" from the drop down "0"
    And User clicks on Check box
    When user clicks on "next" button
    Then the Current Class Should be "Confirm Content"
    And Clicks on next button
    #Then Message displayed
  @U&G_A_CON_016
  Scenario: Cancel Delete the Rule
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
    And user click on "2" icon
    And User click Alert Cancel button
  @U&G_A_CON_017
  Scenario: Delete the particular Rule
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
    And user click on Delete icon
    And User click Alert Ok button
  @U&G_A_CON_018
  Scenario: Cancel The Create Rule
    When user click on "Users and Groups"
    When user click on "Access Control"
    Then user able to see "Access Control"
    And click on the "Create Rule" button
    When user clicks on "cancel" button
    #Then Message displayed
