@RecentSearch
Feature: RecentSearch

  Background: 
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    
  @EMV_RE_S_001
  Scenario: View Recent Searches
    When User clicks on "Email Viewing" tab
    Then User able to see header "Searching"
    When User clicks on "Recent Searches" tab
    Then User able to see header Recent Searches
  @EMV_RE_S_002
  Scenario: Check with Run Search
    When User clicks on "Email Viewing" tab
    Then User able to see header "Searching"
    When User clicks on "Recent Searches" tab
    Then User able to see header Recent Searches
    And click on the "Run Search" button
    Then User able to see header "Query Terms"
    And Mail list is displayed according to the recent search term
  @EMV_RE_S_003
  
  Scenario: Check with Load Search
    When User clicks on "Email Viewing" tab
    Then User able to see header "Searching"
    When User clicks on "Recent Searches" tab
    Then User able to see header Recent Searches
    And click on the "Load Search" button
    Then User able to see header "Query Terms"
    And Load Search fields should be displayed
      | Button and Link | Values               |
      | Button          | Add Search Term      |
      | Button          | Search               |
      | Link Button     | Save Search Criteria |
      | Link Button     | Save Layout          |
      | Link Button     | Clear Fields         |
  @EMV_RE_S_004
  Scenario: search option in Load Search
    When User clicks on "Email Viewing" tab
    Then User able to see header "Searching"
    When User clicks on "Recent Searches" tab
    Then User able to see header Recent Searches
    And click on the "Load Search" button
    Then User able to see header "Query Terms"
    And User click on search
    Then Total mail count should show
  @EMV_RE_S_005
  
  Scenario: Edit Load search query list
    When User clicks on "Email Viewing" tab
    Then User able to see header "Searching"
    When User clicks on "Recent Searches" tab
    Then User able to see header Recent Searches
    And click on the "Load Search" button
    Then User able to see header "Query Terms"
    When User clicks on "Search" tab
    And user selects from Add Search Term "email_text".
    And Delete option shown with the cross icon is displayed
    And Empty Mail box for email text is displayed
  @EMV_RE_S_006
  Scenario: Check with no.of results
    When User clicks on "Email Viewing" tab
    Then User able to see header "Searching"
    When User clicks on "Recent Searches" tab
    Then User able to see header Recent Searches
    And History results should be displayed with difault number "10"
  @EMV_RE_S_007
  
  Scenario: Edit no.of results list
    When User clicks on "Email Viewing" tab
    Then User able to see header "Searching"
    When User clicks on "Recent Searches" tab
    Then User able to see header Recent Searches
    And History results should be displayed with difault number "100"
  @EMV_RE_S_008

  Scenario: dispalys the no.of results in one page
    When User clicks on "Email Viewing" tab
    Then User able to see header "Searching"
    When User clicks on "Recent Searches" tab
    Then User able to see header Recent Searches
    And History results should be displayed with difault number "163"
  @EMV_RE_S_009
  
  Scenario: Check with pages list
    When User clicks on "Email Viewing" tab
    Then User able to see header "Searching"
    When User clicks on "Recent Searches" tab
    Then User able to see header Recent Searches
    And user click on any page number "3"
