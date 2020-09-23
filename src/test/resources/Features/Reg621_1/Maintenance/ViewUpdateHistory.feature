@ViewUpdateHistory
Feature: ViewUpdateHistory

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
    
    Scenario: Navigate to View Update History
    When User Click On "Maintenance" tab
    When User Click On "View Update History" tab
    Then user able to see the header "Package Update History"
    
    Scenario: Check with other page details
    When User Click On "Maintenance" tab
    When User Click On "View Update History" tab
    Then user able to see the header "Package Update History"
    And user click on any page number "3"
    
    Scenario: Arrange list with Oldest Install Date
    When User Click On "Maintenance" tab
    When User Click On "View Update History" tab
    Then user able to see the header "Package Update History"
    And user clicks on Install Date end arrow "1"
    Then names are arranged "Oldest to Newest" and "2"
    
    Scenario: Arrange list with Latest Install Date
    When user click on the "Maintenance"
    When user click on the "View Update History"
    Then user should able to see the "Package Update History"
    And user clicks on Install Date end arrow "2"
    Then names are arranged "Newest to oldest" and "2"
   
    Scenario: Check with Default History results
    When user click on the "Maintenance"
    When user click on the "View Update History"
    Then user should able to see the "Package Update History"
    And History results should be displayed with difault number
     
    Scenario: Change the no.of History results
    When user click on the "Maintenance"
    When user click on the "View Update History"
    Then user should able to see the "Package Update History"
    And user change the number of history results
   
    Scenario: Open total no.of results in single page
    When user click on the "Maintenance"
    When user click on the "View Update History"
    Then user should able to see the "Package Update History"
    And user able to see the total number of results in single page