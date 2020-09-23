@SearchEmail
Feature: Search Email

  Background: 
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
    
    Scenario: 
    When User click on search
    Then Total mail count should show
    
    Scenario: 
    When User select search by "on" date
    And Date field is default
    And User click on search
    Then Total mail count should show
    
    Scenario: 
    When User select search by "before" date
    And Date field is default
    And User click on search
    Then Total mail count should show
    
    Scenario:
    When User select search by "after" date
    And User click on search
    Then Total mail count should show
    
    Scenario: Search By "Between" email sent date
    When User select search by "between" date
    And User click on search
    Then Total mail count should show
    
    
    Scenario: Search By Before with Email from default
    When User click on All Email
    Then Total email per day calender should show
    When User select mail to any date
    Then All email list should be shown
    When User open any mail
    Then Email content should be shown
    When User click on searchs
    When User select search by "before" date
    Then User enter email to search
    And User click on search
    Then Total mail count should show
    
    Scenario: Search By Before with Email from  contains all of
    When User click on All Email
    Then Total email per day calender should show
    When User select mail to any date
    Then All email list should be shown
    When User open any mail
    Then Email content should be shown
    When User click on searchs
    When User select search by "before" date
    Then User select "contains all of" Email from
    Then User enter email to search
    And User click on search
    Then Total mail count should show
    
    Scenario: Search By Before with Email from  contains all of
    When User click on All Email
    Then Total email per day calender should show
    When User select mail to any date
    Then All email list should be shown
    When User open any mail
    Then Email content should be shown
    When User click on searchs
    When User select search by "before" date
    Then User select "contains none of" Email from
    Then User enter email to search
    And User click on search
    Then Total mail count should show
    
    
    Scenario: Search By Before with Email from  contains all of
    When User click on All Email
    Then Total email per day calender should show
    When User select mail to any date
    Then All email list should be shown
    When User open any mail
    Then User open any mail to
    Then Email content should be shown
    When User click on searchs
    When User select search by "before" date
    Then User select "contains none of" Email from
    Then User select Email to "contains all of"
    Then User enter email to search
    And User click on search
    Then Total mail count should show
    
    
    
