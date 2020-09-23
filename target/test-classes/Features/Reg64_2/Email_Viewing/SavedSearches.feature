@SavedSearch
Feature: Saved Search

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
  @EMV_S_SEARCH_001
  Scenario: Test Expand and Collapse icon
    When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User Click on Test Expand and Collapse icon
    Then All fields are minimised
  @EMV_S_SEARCH_002
  Scenario: check for Run Icon
    When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User clicks on Run icon
    Then Then User able to see All Emails
    @EMV_S_SEARCH_003
    Scenario: check for Edit Icon
    When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User clicks on Edit Icon
    And User clicks on save changes button
    #Then The message "Search updated successfully" is displayed
    @EMV_S_SEARCH_004
    Scenario: check for Edit Icon- check with Add search term
    When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User clicks on Edit Icon
    And user selects from Add Search Term "email_text".
    And User select "op_email_textuuid" from the second drop down "none"
    And Enter the Data "email_text" for Search "people is"
    And User click on search
    Then Total mail count should show
    #Then user able to get Search "email body" respective to "none" Edited Changes "people is"
    @EMV_S_SEARCH_005
    Scenario: check for Edit Icon- Check with clear fields
    When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User clicks on Edit Icon
    And User clicks on Clear Fields Icon
    #Then Saved Name and Saved description fields should be cleared
    @EMV_S_SEARCH_006
    Scenario: check for Edit Icon- Save changes with clear fields
    When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User clicks on Edit Icon
    And User clicks on Clear Fields Icon
    And User clicks on save changes button
    #Then The message "The name and description fields of a saved search must be populated" is displayed
    @EMV_S_SEARCH_007
    Scenario: check for Delete Icon
    When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User clicks on delete Icon
    And pop up alert message displayed
    And click on ok button
    Then File deleted Succesfully
  @EMV_S_SEARCH_008
  Scenario: check for Schedule Icon
    When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User clicks on schedule icon
    Then User able to see the "Scheduling"
    And User able to see week days, Run time, Notification email addresses
  @EMV_S_SEARCH_009
  Scenario: check for Schedule Icon and Configure
    When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User clicks on schedule icon
    Then User able to see the "Scheduling"
    And Configure "weekdays" Scheduling Searches "Monday"
    And enter data "id_runtime" in Scheduling Searches"6:00"
    And enter data "id_email" in Scheduling Searches"cosmo@c.com"
    And Configure tags in Scheduling Searches
    And User click On the submit Button
    Then Message displayed
  @EMV_S_SEARCH_0010
  Scenario: check for Schedule Icon multiple options
    When User clicks on "Email Viewing"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    And User clicks on schedule icon
    Then User able to see the "Scheduling"
    And Configure "weekdays" Scheduling Searches1 "sun"
    And enter data "id_runtime" in Scheduling Searches"8:00"
    And enter data "id_email" in Scheduling Searches"cosmo@c.com"
    And Configure tags in Scheduling Searches
    And User click On the submit Button
    Then Message displayed