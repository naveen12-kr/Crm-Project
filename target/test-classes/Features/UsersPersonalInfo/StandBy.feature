@WarmStandBy
Feature: Warm Stand By

  Background: StandBy Target
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Add a valid Add Standby Target
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And User enters valid stand by target "StandByTargetName"
    And User clicks on the Add Standby Target button
    Then Adding Warm Standby Target is displayed

  Scenario: Adding Warm Standby Target
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And User enters valid stand by target "StandByTargetName"
    And User clicks on the Add Standby Target button
    Then Adding Warm Standby Target is displayed
    And User enters the "product key"
    And User enters the "FQDN or IP"
    Then User clicks on Save button

  Scenario: Checking view status of warm standby
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And user clicks on "Magnifier" glass
    Then Process Details: standby is displayed

  Scenario: Schedule downtime for warm standby
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And user clicks on Calendar Icon
    Then Scheduling Warm Standby is displayed

  Scenario: Scheduling Warm Standby
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And user clicks on Calendar Icon
    Then Scheduling Warm Standby is displayed
    And select always option under Standby Target
    And user clicks on submit button
    Then The standby streaming schedule was changed successfully is displayed

  Scenario: Scheduling Warm Standby
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And user clicks on Calendar Icon
    Then Scheduling Warm Standby is displayed
    And select Schedule daily downtime under Standby Target
    Then "Week Days and Shutdown Time and Reactivation Time" are displayed

  Scenario: Scheduling Warm Standby
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And user clicks on Calendar Icon
    Then Scheduling Warm Standby is displayed
    And select Schedule daily downtime under Standby Target
    Then "Week Days and Shutdown Time and Reactivation Time" are displayed
    And user select single week Day
    And user clicks on submit button
    Then The standby streaming schedule was changed successfully is displayed

  Scenario: Scheduling Warm Standby
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And user clicks on Calendar Icon
    Then Scheduling Warm Standby is displayed
    And select Schedule daily downtime under Standby Target
    Then "Week Days and Shutdown Time and Reactivation Time" are displayed
    And user select Multiple week Days
    And user clicks on submit button
    Then The standby streaming schedule was changed successfully is displayed

  Scenario: Edit Configuration of Warm Standby target
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And user click on Pencil icon
    Then Updating Standby Target is displayed

  Scenario: Edit Configuration of Warm Standby target
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And user click on Pencil icon
    Then Updating Standby Target is displayed
    And Updating "TargetName"
    And Updating "Product Key"
    And Updating "IP Address"
    And click on Update button
    Then Updated target is displayed

  Scenario: Edit Configuration of Warm Standby target
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And user click on Pencil icon
    Then Updating Standby Target is displayed
    And click on Update button
    Then Updated target is displayed

  Scenario: Delete Target
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And user clicks on the Cross icon
    Then Pop Up window is displayed

  Scenario: Deletes Target
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And user clicks on the Cross icon
    Then Pop Up window is displayed
    Then user clicks on Cancel button

  Scenario: Deletes Target
    When user clicks Backup tab
    When user clicks "Configuration" tab
    And Warm Standby Overview is displayed
    And user clicks on the Cross icon
    And user clicks on Ok button
    Then target name is deleted successfully
