@BackUpNow
Feature: BackUpNow

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
    
     Scenario: Version Verification
	   When User got the version
  @BK
  Scenario: Testing Backup Now
    When user clicks Backup tab
    When user clicks "Backup Now" tab
    Then user have to see the "Backup Now"
    Then Begin Backup button is displayed

  Scenario: Checking Remote Host Config link
    When user clicks Backup tab
    When user clicks "Backup Now" tab
    Then user have to see the "Backup Now"
    Then click on Remote host Config
    Then user have to see the "Remote Backup Host Configuration"

  Scenario: Checking Pause Remote Backup option
    When user clicks Backup tab
    When user clicks "Backup Now" tab
    Then user have to see the "Backup Now"
    Then click on Remote host Config
    Then user have to see the "Remote Backup Host Configuration"
   #Then Enter encryption key
    #And Select Filesystem type on host
    #And Enter Host Name "10.100.3.52"
    #And Path on host "/nfs/dctvm1"
    And Select Pause Remote Backup check box
    And Click on Save and Test
    Then Remote backup schedule has been updated message is displayed
    When user clicks "Backup Now" tab
    Then click on submit button
    Then Process details in the status is displayed with start and end time

  Scenario: Checking by deselecting Pause Remote Backup option
    When user clicks Backup tab
    When user clicks "Backup Now" tab
    Then user have to see the "Backup Now"
    Then click on Remote host Config
    Then user have to see the "Remote Backup Host Configuration"
    #Then Enter encryption key
    #And Select Filesystem type on host
    #And Enter Host Name "10.100.3.52"
    #And Path on host "/nfs/dctvm1"
    And Select Pause Remote Backup check box
    And Click on Save and Test
    Then Remote backup schedule has been updated message is displayed
    When user clicks "Backup Now" tab
    Then click on submit button
    Then Process details in the status is displayed with start and end time


  Scenario: Testing Restore Previous Backup
    When user clicks Backup tab
    When user clicks "Backup Now" tab
    Then user have to see the "Backup Now"
    When user clicks "Restore Previous Backup" tab
    Then user have to see the "Restore Previous Backup"
    Then Product key option and Begin Restoration button is displayed
    
  Scenario: Testing Restore Previous Backup - Remote Host Config link
    When user clicks Backup tab
    When user clicks "Backup Now" tab
    Then user have to see the "Backup Now"
    When user clicks "Restore Previous Backup" tab
    Then user have to see the "Restore Previous Backup"
    Then click on Remote host Config
    Then user have to see the "Remote Backup Host Configuration"

  #Scenario: UnChecking Pause Remote Backup option
    #When user clicks Backup tab
    #When user clicks "Backup Now" tab
    #Then user have to see the "Backup Now"
    #Then click on Remote host Config
    #Then user have to see the "Remote Backup Host Configuration"
    #And Select Pause Remote Backup check box
    #And Click on Save and Test