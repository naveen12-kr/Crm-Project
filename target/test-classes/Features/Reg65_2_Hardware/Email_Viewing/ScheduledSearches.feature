@ScheduledSearch
Feature: Scheduled Searches

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
  @EMV_SCH_SEARCH_001
  Scenario: Hide Scheduled Searches Queries
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User clicks on collapse icon
    Then Scheduled Search List disappears.
  @EMV_SCH_SEARCH_002
  Scenario: Check the Disable icon
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "4" Icon
    Then Saerch Name is added in Disabled Searches
  @EMV_SCH_SEARCH_003
  Scenario: Check the View icon
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "5" Icon
    Then Scheduled Search List disappears.
    Then Scheduled search runs should be opend with Search run time and Hits list
  @EMV_SCH_SEARCH_004
  Scenario: Check the view icon for search run
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "5" Icon
    Then Scheduled Search List disappears.
    #Then Scheduled search runs should be opend with Search run time and Hits list
    #And User  Clcik on magnifying glass of search run
    #Then Total mail count should show
    #And Email count should be matched with Hits count 
  @EMV_SCH_SEARCH_005
  Scenario: Delete the search runs
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "5" Icon
    Then Scheduled Search List disappears.
    #Then Scheduled search runs should be opend with Search run time and Hits list
    #And user select "Single" Search run and click on Delete Icon
    #And user clicks on Ok button
    #Then search run should be deleted
  @EMV_SCH_SEARCH_006
  Scenario: Delete the search runs with Cancel button
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "5" Icon
    Then Scheduled Search List disappears.
    #Then Scheduled search runs should be opend with Search run time and Hits list
    #And user select "Single" Search run and click on Delete Icon
    #And user clicks on Cancel button
    #Then search run should be displayed
  @EMV_SCH_SEARCH_007
  
  Scenario: Delete multiple search runs
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "5" Icon
    Then Scheduled Search List disappears.
    #Then Scheduled search runs should be opend with Search run time and Hits list
    #And user select "Multiple" Search run and click on Delete Icon
   # And user clicks on Ok button
    #Then search run should be deleted
  @EMV_SCH_SEARCH_008
  
  Scenario: Delete Scheduled Search Runs list
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "5" Icon
    Then Scheduled Search List disappears.
    #Then Scheduled search runs should be opend with Search run time and Hits list
    #And user select "" Search run and click on Delete Icon 
    #Then The message "No emails have been selected" is displayed
  @EMV_SCH_SEARCH_009
  Scenario: Check on edit icon
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "6" Icon
    Then User able to see the "Scheduling search"
  @EMV_SCH_SEARCH_010 
  
  Scenario: Edit the scheduled Searches
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "6" Icon
    Then User able to see the "Scheduling search"
    And Configure "weekdays" Scheduling Searches1 "mon"
    And enter data "id_runtime" in Scheduling Searches"6:00"
    And enter data "id_email" in Scheduling Searches"cosmo@c.com"
    And Configure tags in Scheduling Searches
    And User click On the submit Button
    Then Message displayed
  @EMV_SCH_SEARCH_011
 
  Scenario: Edit the scheduled Searches with multiple options
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "6" Icon
    Then User able to see the "Scheduling search"
    And Configure "weekdays" Scheduling Searches1 "sun mon fri"
    And enter data "id_runtime" in Scheduling Searches"6:00"
    And enter data "id_email" in Scheduling Searches"cosmo@c.com"
    And Configure tags in Scheduling Searches
    And User click On the submit Button
    Then Message displayed
  @EMV_SCH_SEARCH_012
  Scenario: Delete the scheduled search
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "7" Icon
    And User click Alert Ok button
    Then Message displayed
  @EMV_SCH_SEARCH_013
  Scenario: Check the Enable icon of Disabled Search
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "4" Icon
    Then Saerch Name is added in Disabled Searches
    When User Clicks on any "4" Icon2
    Then Saerch Name is added in Enabled Searches
  @EMV_SCH_SEARCH_014
  Scenario: Check the View icon of Disabled Search
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "5" Icon2
    Then Scheduled Search List disappears2.
    Then Scheduled search runs should be opend with Search run time and Hits list
  @EMV_SCH_SEARCH_015
  Scenario: Check the View icon of Disabled Search
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "5" Icon2
    Then Scheduled Search List disappears2.
    #Then Scheduled search runs should be opend with Search run time and Hits list
    #And User  Clcik on magnifying glass of search run
    #Then Total mail count should show
    #And Email count should be matched with Hits count
  @EMV_SCH_SEARCH_016
  Scenario: Delete Scheduled Search Runs list
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "5" Icon2
    Then Scheduled Search List disappears2.
    #Then Scheduled search runs should be opend with Search run time and Hits list
    #And user select "" Search run and click on Delete Icon 
    #Then The message "No emails have been selected" is displayed 
  @EMV_SCH_SEARCH_017
  Scenario: Check on edit icon of Disabled Search
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "6" Icon2
    Then User able to see the "Scheduling search"
  @EMV_SCH_SEARCH_018
  Scenario: Edit the scheduled Searches - Selecting one week day
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "6" Icon2
    Then User able to see the "Scheduling search"
    And Select the one day "Sunday" from week days list "weekdays"
    And enter data "id_runtime" in Scheduling Searches"6:00"
    And enter data "id_email" in Scheduling Searches"cosmo@c.com"
    And Configure tags in Scheduling Searches
    And User click On the submit Button
    Then Message displayed
  @EMV_SCH_SEARCH_019
  Scenario: Edit the scheduled Searches - Selecting multiple week day and emails
    When User clicks on "Email Viewing"
    When User clicks on "Scheduled Searches" tab
    Then User able to see header "Scheduled Search List"
    When User Clicks on any "6" Icon2
    And Select the multiple days "Sunday" from week days list "weekdays"
    And enter data "id_runtime" in Scheduling Searches"6:00"
    And enter data "id_email" in Scheduling Searches"cosmo@c.com; bob@b.com"
    And Configure tags in Scheduling Searches
    And User click On the submit Button
    Then Message displayed
  @EMV_SCH_SEARCH_020
  Scenario: Delete the scheduled search
   # When User clicks on "Email Viewing"
   # When User clicks on "Scheduled Searches" tab
   # Then User able to see header "Scheduled Search List"
   # When User Clicks on any "7" Icon2
   # And pop up alert message displayed
   # And click on ok button
   # Then File deleted Succesfully

  @EMV_SCH_SEARCH_021
  Scenario: Delete Scheduled Search Runs list
   # When User clicks on "Email Viewing"
   # When User clicks on "Scheduled Searches" tab
   # Then User able to see header "Scheduled Search List"
   # When User Clicks on any "5" Icon
   # Then User able to see header "Scheduled Search List"
   # And Click on Delete icon without selecting checkbox
   # Then Message displayed
