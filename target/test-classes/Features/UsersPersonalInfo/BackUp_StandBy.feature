 
 @BackUp_StandBy
Feature: BackUp_StandBY

 Scenario: Testing Warning Standby Target - View Staus
    When user clicks Backup tab
    Then user have to see the "Warm Standby Overview"
    Then Available Warm standby Target machines
    Then Click on magnifying icon displayed in the Warning Standby Target
    Then user have to see the "Process Details:"
 
  Scenario: Testing Warning Standby Target - Schedule downtime for warm standby
    When user clicks Backup tab
    Then user have to see the "Warm Standby Overview"
    Then Available Warm standby Target machines
    Then Click on calendar icon displayed in the Warning Standby Target
    Then user have to see the "Scheduling Warm Standby"
    Then Scheduling Warm Standby mandatory fields

  Scenario: Schedule downtime for warm standby - Submit page as Always Preferred
    When user clicks Backup tab
    Then user have to see the "Warm Standby Overview"
    Then Available Warm standby Target machines
    Then Click on calendar icon displayed in the Warning Standby Target
    Then user have to see the "Scheduling Warm Standby"
    Then user Set Target data sync as Always Preferred
    Then Other option is minimised and two option is visible
    And click on submit button
    Then Message displayed
    Then user have to see the "Warm Standby Overview"
    
    Scenario: Schedule downtime for warm standby - Submit page
    When user clicks Backup tab
    Then user have to see the "Warm Standby Overview"
    Then Available Warm standby Target machines
    Then Click on calendar icon displayed in the Warning Standby Target
    Then user have to see the "Scheduling Warm Standby"
    Then Select one or more week days, Enter Shutdown Time, Enter Reactivation Time
    And click on submit button
    Then Message displayed
    Then user have to see the "Warm Standby Overview"

  Scenario: Testing Warning Standby Target - Edit option
    When user clicks Backup tab
    Then user have to see the "Warm Standby Overview"
    Then Available Warm standby Target machines
    Then click on pencil icon displayed in the Warm StandBy
    Then user have to see the "Updating Standby Target"
    Then Scheduling Warm Standby mandatory fields
    And Submit button is present

  Scenario: Testing Warning Standby Target - Edit option
    When user clicks Backup tab
    Then user have to see the "Warm Standby Overview"
    Then Available Warm standby Target machines
    Then click on pencil icon displayed in the Warm StandBy
    Then user have to see the "Updating Standby Target"
    Then User enters the name "Jackie"
    And User enters the "product key"
    And User enters the "FQDN or IP"
    And click on submit button
    Then Message displayed
    Then user have to see the "Warm Standby Overview"

  Scenario: Testing here - Enter Standby Mode
    When user clicks Backup tab
    When user clicks on Click here option mentioned
    Then user have to see the "Standby Target Configuration"
    Then Scheduling Warm Standby mandatory fields
    And Submit button is present

  Scenario: Testing here - Enter Standby Mode missing mandatory fields
    When user clicks Backup tab
    When user clicks on Click here option mentioned
    Then user have to see the "Standby Target Configuration"
    And click on submit button
    Then Error message displayed
    Then This field is required message is displayed
    