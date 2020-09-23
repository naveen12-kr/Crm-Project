@RemoteHostConfig
Feature: RemoteHostConfig

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Testing Remote Host Config - Page and Mandatory fileds
    When user clicks Backup tab
    When user clicks "Remote Host Config" tab
    Then user have to see the "Remote Backup Host Configuration"
    Then Remote Backup Host confiuration all fields are displayed

  Scenario: Checking - View key option
    When user clicks Backup tab
    When user clicks "Remote Host Config" tab
    Then user have to see the "Remote Backup Host Configuration"
    Then Enter encryption key
    Then click on view check box
    Then Entered Encryption Key is displayed

  Scenario: Checking - NFS option
    When user clicks Backup tab
    When user clicks "Remote Host Config" tab
    Then user have to see the "Remote Backup Host Configuration"
    #Then Enter encryption key
    #And Select Filesystem type on host
    #And Enter Host Name "10.100.3.52"
    #And Path on host "/nfs/dctvm1"
    And Click on Save and Test
    Then Remote backup location has been saved message is displayed
 
  Scenario: Checking - SMB/CIFS option
    When user clicks Backup tab
    When user clicks "Remote Host Config" tab
    Then user have to see the "Remote Backup Host Configuration"
    #Then Enter encryption key
    #And Select filesystem type on host
    #And Enter the Data "id_hostdomain" for Search "egncif02"
    #And Enter the Data "id_hostuser" for Search "rembkup2"
    #And Enter the Data "id_hostpass" for Search "intradyn123"
    #And Enter Host Name "10.100.3.52"
    #And Path on host "/Rembkup2/"
    And Click on Save and Test
    Then Remote backup location has been saved message is displayed
 
  #Scenario: Check with Wrong Host Name
    #When user clicks Backup tab
    #When user clicks "Remote Host Config" tab
    #Then user have to see the "Remote Backup Host Configuration"
    #Then Enter encryption key
    #And Select Filesystem type on host
    #And Enter Host Name "Intradyn"
    #And Path on host "/nfs/dctvm1"
    #And Click on Save and Test
    #Then message displayed
   
  #Scenario: Check with Wrong Path
    #When user clicks Backup tab
    #When user clicks "Remote Host Config" tab
    #Then user have to see the "Remote Backup Host Configuration"
    #Then Enter encryption key
    #And Select Filesystem type on host
    #And Enter Host Name "10.100.3.52"
    #And Path on host "zanjo"
    #And Click on Save and Test
    #Then message displayed

  #Scenario: Check with empty fields
    #When user clicks Backup tab
    #When user clicks "Remote Host Config" tab
    #Then user have to see the "Remote Backup Host Configuration"
    #When all the fields are kept Empty
    #And Click on Save and Test
    #Then This field is required message is displayed
