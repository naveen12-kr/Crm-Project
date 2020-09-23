@SaveConfiguration
Feature: SaveConfiguration

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
    
  Scenario: Navigate to Save Configuration page
    When User clicks on "Configuration"
    When user click on the "Save Configuration"
    Then user should able to see the "Save Configuration"

  Scenario: Configuring Save Configuration
    When User clicks on "Configuration"
    When user click on the "Save Configuration"
    Then user should able to see the "Save Configuration"
    And click on the "Save" button
    Then Message displayed
   
    Scenario: Check with My Exported Results link
    When User clicks on "Configuration"
    When user click on the "Save Configuration"
    Then user should able to see the "Save Configuration"
    And user Clicks on the "My Exported Results"
    Then user should able to see the "Browse Exported Search Results"
    
    Scenario: View the recently saved configuration
    When User clicks on "Configuration"
    When user click on the "Save Configuration"
    Then user should able to see the "Save Configuration"
    And click on the "Save" button
    And user Clicks on the "My Exported Results"
    Then user should able to see the "Browse Exported Search Results"
    And The recently saved configuration file with current date
   
    Scenario: Download the Saved Configuration
    When User clicks on "Configuration"
    When user click on the "Save Configuration"
    Then user should able to see the "Save Configuration"
    And click on the "Save" button
    And user Clicks on the "My Exported Results"
    #Then user should able to see the "Browse Exported Search Results"
    #When Clcik on Download symbol of Config Filename
    #Then The config file should be downloaded into the local disk
    
     
    

  

  
