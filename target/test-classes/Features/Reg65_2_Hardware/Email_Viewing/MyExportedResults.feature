@MYExportResults
Feature: My Exported Results

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Browse Exported Search Results
    When User clicks on "Email Viewing" tab
    When User clicks on "My Exported Results" tab
    Then Browse Exported Search Results is displayed without sorting
  
  Scenario: Check Download .Zip File
    When User clicks on "Email Viewing" tab
    When User clicks on "My Exported Results" tab
    And User Click on download icon
    Then Downloaded the .zip file
  
  Scenario: Check Share the exported .zip file
    When User clicks on "Email Viewing" tab
    When User clicks on "My Exported Results" tab
    And User click on the share icon
    And Enter Search Terms for another user by entering their name or part of their name when the popup window appears
    And Add the list of selected users to share
    And Click OK to share the exported .zip file
    Then Shared the exported .zip file

  Scenario: Check Unshare the exported .zip file
    When User clicks on "Email Viewing" tab
    When User clicks on "My Exported Results" tab
    And User click on the share icon
    And Enter Search Terms for another user by entering their name or part of their name when the popup window appears
    And Add the list of selected users to share
    And Click OK to share the exported .zip file
    And click on the unshare icon
    And Click Submit to unshare the exported .zip file
    Then Unshared the exported .zip file
 
  Scenario: Check delete the exported .zip file
    When User clicks on "Email Viewing" tab
    When User clicks on "My Exported Results" tab
    And Click on delete icon
    And pop up alert message displayed
    And click on ok button
    Then Deleted the file
 
  Scenario: Show FileName in accending order
    When User clicks on "Email Viewing" tab
    When User clicks on "My Exported Results" tab
    And Click on Filename Sort by start arrow
    Then Filename list is displayed in accending order

  Scenario: Show FileName in decending order
    When User clicks on "Email Viewing" tab
    When User clicks on "My Exported Results" tab
    And Click on Filename Sort by end arrow
    Then Filename list is displayed in decending order

  Scenario: Show File Size in accending order
    When User clicks on "Email Viewing" tab
    When User clicks on "My Exported Results" tab
    And Click on Size Sort by start arrow
    Then File Size list is displayed in accending order

  Scenario: Show File Size in decending order
    When User clicks on "Email Viewing" tab
    When User clicks on "My Exported Results" tab
    And Click on Size Sort by end arrow
    Then File Size list is displayed in decending order

  Scenario: Show File Size in accending order
    When User clicks on "Email Viewing" tab
    When User clicks on "My Exported Results" tab
    And Click on Date Sort by start arrow
    Then Date list is displayed in accending order

  Scenario: Show File Size in decending order
    When User clicks on "Email Viewing" tab
    When User clicks on "My Exported Results" tab
    And Click on Date Sort by end arrow
    Then Date list is displayed in decending order
