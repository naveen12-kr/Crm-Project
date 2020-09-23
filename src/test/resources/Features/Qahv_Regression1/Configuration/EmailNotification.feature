@EmailNotification
Feature: EmailNotification

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Configure single valid email recipient address
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "smriti@zanjo.io" field
    And Select "Email" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Message displayed

  Scenario: Configure multiple valid email recipient addresses
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "ramkumardkr@gmail.com;kramkumar.d@gmail.com;dramkumar@zanjo.io" field
    And Select "Email" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Message displayed
    Then Added email addresses and the carrier information is displayed under Email Notification

  Scenario: Configure single valid phone number for text alerts
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid phone number in "7799465089" field
    And Select "Cricket" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Message displayed
    Then Added email addresses and the carrier information is displayed under Email Notification

  Scenario: Configure multiple valid phone number that belong to the same carrier for text alerts
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid phone number in "3648934392, 5387276328, 3546352734" field
    And Select "Cricket" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Message displayed
    Then Added email addresses and the carrier information is displayed under Email Notification

  Scenario: Configure Email/Phone number when Outgoing SMTP server is not configured
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    Then User click on Disable Outgoing Email
    Then Pop Up window is displayed
    And user clicks on Ok button
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "ramkumardkr@gmail.com" field
    And Select "Email" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Message displayed

  Scenario: Configure single/multiple email recipient address with invalid input format
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "vsdjhfj" field
    And Select "Email" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Not valid email address is displayed

  Scenario: Configure single/multiple phone number for text alerts with invalid input format
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "vsdjhfj" field
    And Select "Cricket" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Not valid email address is displayed

  Scenario: Delete text address from email notification
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "8073829963" field
    And Select "Cricket" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Message displayed
    When Click on Delete Address X icon against the phone number to be deleted
    Then Message displayed

  Scenario: Delete email address from email notification
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "kumar@zanjo.io" field
    And Select "Email" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Message displayed
    When Click on Delete Address X icon against the phone number to be deleted
    Then Message displayed

  Scenario: Test valid existing email address
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "smriti@zanjo.io" field
    And Select "Email" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Message displayed
    And Enter a valid email address in "smriti@zanjo.io" field
    And Select "Email" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Message displayed

  Scenario: Test valid existing text address
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "8073829963" field
    And Select "Cricket" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Message displayed
    And Enter a valid email address in "8073829963" field
    And Select "Cricket" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then Message displayed

  Scenario: Test non-existing email address
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail server username
    #And user enters mail Server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "ncjksjshuihewkjn@gmail.com" field
    And Select "Email" from the dropdown menu on Carrier field
    And Click on Add Address button

  #And user clicks on respective "ncjksjshuihewkjn"  test address icon
  #Then Message "Message sent" is displayed
  
  Scenario: Test invalid SMTP server
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters invalid out going SMTP Server
    #And user enters mail server username
    #And user enters mail Server password
    And user enters invalid from address
    Then User click on Save
    #Then Message displayed
    Then The message "Enter a valid e-mail address" is displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "ncjksjshuihewkjn@gmail.com" field
    And Select "Email" from the dropdown menu on Carrier field
    And Click on Add Address button

  #And user clicks on respective "ncjksjshuihewkjn"  test address icon
  #Then The Message "Name or service not known" is displayed
  Scenario: Test All email addresses
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail server username
    #And user enters mail Server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "kumar@zanjo.io" field
    And Select "Email" from the dropdown menu on Carrier field

  #And click on Test All
  #Then Message "Message sent" is displayed
  Scenario: Missing required fields
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "" field
    And Select "Email" from the dropdown menu on Carrier field
    And Click on Add Address button
    Then This field is required message displayed

  Scenario: Add address button
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    And user enters from address
    Then User click on Save
    Then Message displayed
    When user click on "Email Notification" Tab
    And Enter a valid email address in "kumar@zanjo.io" field
    And Select "Email" from the dropdown menu on Carrier field
    When user click on "Outgoing SMTP" Tab
    When user click on "Email Notification" Tab
    Then The entered email address is not saved on Email Notifications page

  Scenario: Outgoing SMTP link
    When user click on "Configuration" Tab
    When user click on "Email Notification" Tab
    And user click on the Linktext Outgoing SMTP
    Then User able to see the "Outgoing SMTP Server"

  Scenario: Test All email addresses
    When user click on "Configuration" Tab
    When user click on "Outgoing SMTP" Tab
    And user enters out going SMTP Server
    #And user enters mail servfer username
    #And user enters mail server password
    #And user enters from address
    #Then User click on Save
    #Then User click on disable
    #Then Message displayed
    When user click on "Email Notification" Tab
    And No email address is added under Email Notification
    And click on Test All
    #Then error message displayed

  Scenario: Hide Side Menu
    When User clicks on "Configuration"
    When user click on "Email Notification" Tab
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When User clicks on "Configuration"
    When user click on "Email Notification" Tab
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When User clicks on "Configuration"
    When user click on "Email Notification" Tab
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When User clicks on "Configuration"
    When user click on "Email Notification" Tab
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When User clicks on "Configuration"
    When user click on "Email Notification" Tab
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout link
    When User clicks on "Configuration"
    When user click on "Email Notification" Tab
    Then user click on Logout Icon
    Then user able to see Login Page
