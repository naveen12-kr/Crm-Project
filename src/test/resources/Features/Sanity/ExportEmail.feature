@ExportEmail
Feature: Export Email

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
  
  Scenario: Export Email
    When User clicks on "Email Viewing"
    When User click on search
    And User click on "export" tab
    Then Export pop-up should open

  Scenario: Export with Raw Email
    When User clicks on "Email Viewing"
    When User select search by "before" date
    When User click on search
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_zip" in "export_zipname"
    Then User Enter "intradyn.autotest@gmail.com" in "export_notify"
    And User click On Ok button

  Scenario: Export with Headers Only (CSV) Email
    When User clicks on "Email Viewing"
    When User select search by "before" date
    When User click on search
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_zip" in "export_zipname"
    Then User select "export_filetype" is "Headers Only (CSV)"
    Then User Enter "intradyn.autotest@gmail.com" in "export_notify"
    And User click On Ok button

  Scenario: Export with PDF Email
    When User clicks on "Email Viewing"
    When User select search by "before" date
    When User click on search
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_zip" in "export_zipname"
    Then User select "export_filetype" is "PDF"
    Then User Enter "intradyn.autotest@gmail.com" in "export_notify"
    And User click On Ok button

  Scenario: Export with Headers Only Email
    When User clicks on "Email Viewing"
    When User select search by "before" date
    When User click on search
    Then Select any number of Emails
    And User click on "export" tab
    Then Export pop-up should open
    Then User Enter "export_zip" in "export_zipname"
    Then User select "export_filetype" is "Headers Only"
    Then User Enter "intradyn.autotest@gmail.com" in "export_notify"
    And User click On Ok button
