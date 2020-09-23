@ImportEmail
Feature: ImportEmail

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
    
    Scenario: Upload PST list file for uploaded with missing fields
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User click On the submit Button
    And User click Alert Ok button
    Then This field is required message is displayed
   
    Scenario: PST Migration Wizard-Select Access Method
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "aaa.pst" file from the system
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    When User Click On "Import Email" tab
    And Select "PST" from the drop down menu
    And User click On the submit Button
    And Select FileType "2" for Filesystem type on host
    And click on the "next" button
    Then The files in the uploaded file page are listed in the Select Files option
    
    Scenario: Cancel PST Migration
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "aaa.pst" file from the system
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    When User Click On "Import Email" tab
    And Select "PST" from the drop down menu
    And User click On the submit Button
    And Select FileType "2" for Filesystem type on host
    And Clicks on next button
    And Clicks on Cancel Button
    Then Message displayed
    
    Scenario: Cancel PST Migration at Find PST files page
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "aaa.pst" file from the system
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    When User Click On "Import Email" tab
    And Select "PST" from the drop down menu
    And User click On the submit Button
    And Select FileType "2" for Filesystem type on host
    And Clicks on next button
    And select respective File "aaa.pst" for migration1
    And Clicks on next button
    And Clicks on Cancel Button
    Then Message displayed
    
    Scenario: Import from Raw Email for Uploaded file type  Process Details: EmailMigration
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "ttt.eml" file from the system
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    When User Click On "Import Email" tab
    And Select "Raw Email" from the drop down menu
    And User click On the submit Button
    And Select FileType "2" for Filesystem type
    And select respective File "ttt.eml" for migration
    And click on the "Run Migration" button
    Then user able to see the header Process Details: EmailMigration
 
    Scenario: Valid file selection and Address Discovery Configuration
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "aaa.pst" file from the system
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    When User Click On "Import Email" tab
    And Select "PST" from the drop down menu
    And User click On the submit Button
    And Select FileType "2" for Filesystem type on host
    And Clicks on next button
    And select respective File "aaa.pst" for migration1
    And Clicks on next button
    And Select Any Address Discovery "0"
    And User enters email addresse "ramkumardkr@gmail.com"
    And Clicks on next button
    Then the Current Class Should be "confrim"
    
    Scenario: Select an invalid file format
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "ddd" file from the system
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    When User Click On "Import Email" tab
    And Select "PST" from the drop down menu
    And User click On the submit Button
    And Select FileType "2" for Filesystem type on host
    And Clicks on next button
    And select respective File "ddd" for migration1
    And Clicks on next button
    #Then Message displayed