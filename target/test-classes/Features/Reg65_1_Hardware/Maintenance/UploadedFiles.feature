@UploadedFiles
Feature: UploadedFiles

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
   
    Scenario: Upload a valid file format
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "aaa.pst" file from the system
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    #When User Click On "Uploaded Files" tab
    #And The filename "aaa.pst" and its upload information are displayed in the table below
  
  Scenario: Upload Zip file with valid file format
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "ccc.rar" file from the system
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    #When User Click On "Uploaded Files" tab
    #And The filename "ccc.rar" and its upload information are displayed in the table below
  
  Scenario: Cancel an upload
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "eee.txt" file from the system
    And User click On the submit Button
    And User click Alert Cancel button

  Scenario: Upload an empty file
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "eee.txt" file from the system
    And User click On the submit Button
    And User click Alert Ok button
    #Then Error message displayed
    
  Scenario: Upload an empty zip file
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "fff.zip" file from the system
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
  
  Scenario: Upload an existing file
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And get the Existing file
    And User clicks on Choose files
    And Select Existing file from the system
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed

  Scenario: Missing to choose file before upload
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User click On the submit Button
    And User click Alert Ok button
    #Then This field is required message is displayed

  Scenario: Upload a deleted/moved file
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "bbb.pst" file from the system
    And Removing the "bbb.pst"Uploaded file
    And User click On the submit Button
    And User click Alert Ok button
    And Restore the "bbb.pst"Removed file
    #Then Message displayed
  
  Scenario: Choose files twice before uploading
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "aaa.pst" file from the system
    And Select "ccc.rar" file from the system
    And Select "fff.zip" file from the system
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    #When User Click On "Uploaded Files" tab
    #And The filename "fff.zip" and its upload information are displayed in the table below

  Scenario: Close the browser while uploading
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "ccc.rar" file from the system
    And User click On the submit Button
    And User click Alert Ok button
    Then Close the browser while uploading
 
  Scenario: No text notification
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "aaa.pst" file from the system
    And Select "No Notification" from the drop down
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    #When User Click On "Uploaded Files" tab
    #And The filename "aaa.pst" and its upload information are displayed in the table below
  
  Scenario: Set valid phone number for text alert
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "fff.zip" file from the system
    #And Select "8073829963" from the drop down
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    #When User Click On "Uploaded Files" tab
    #And The filename "fff.zip" and its upload information are displayed in the table below
 
  Scenario: Set a valid email address for email alert
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "ccc.rar" file from the system
    And User enters email addresse "ramkumardkr@gmail.com"
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    #When User Click On "Uploaded Files" tab
    #And The filename "ccc.rar" and its upload information are displayed in the table below
  
  Scenario: Set multiple email addresses for email alert
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "ttt.eml" file from the system
    And User enters email addresse "ramkumardkr@gmail.com;babi.1479.babi@gmail.com"
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    #When User Click On "Uploaded Files" tab
    #And The filename "ttt.eml" and its upload information are displayed in the table below
  
  Scenario: Set an invalid email address format
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "aaa.pst" file from the system
    And User enters email addresse "ramkumar"
    And User click On the submit Button
    And User click Alert Ok button
    #Then Message displayed
    #When User Click On "Uploaded Files" tab
    #And The filename "aaa.pst" and its upload information are displayed in the table below
 #
  Scenario: Sort by file name-descending order
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And Click the down arrow next to File "1"
    #Then The table is sorted in ascending order of file name "1"

  Scenario: Sort by file name-ascending order
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And Click the Up arrow next to File "1"
    #Then The table is sorted in descending order of file name "1"

  Scenario: Sort by uploaded date-ascending
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And Click the down arrow next to File "3"
    Then The table is sorted in ascending order of file name "3"
  
  Scenario: Sort by uploaded date-descending
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And Click the Up arrow next to File "3"
    Then The table is sorted in descending order of file name "3"

  Scenario: Delete an uploaded file
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And user Clicks on delete icon
    #Then Message displayed

  Scenario: Check for Submit button
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user able to see the header "Uploaded Files"
    And User clicks on Choose files
    And Select "aaa.pst" file from the system

  Scenario: Hide Side Menu
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link (Uploaded Emails)
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout Link (Uploaded Emails)
    When User Click On "Maintenance" tab
    When User Click On "Uploaded Files" tab
    Then user click on Logout Icon
    Then user able to see Login Page
