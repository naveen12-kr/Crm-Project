@RetentionPolicy_Config
Feature: Retention Policy

  Background: Login
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app
 
  Scenario: Set Data Retention as Forever
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select "0" in the Data Retention field
    And click on the "Save" button
    Then Special Message displayed"Purge schedule updated"

  Scenario: Retain email contents for minimum available period.(< 1 month)
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "0 months" in Retain email contents
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"A custom Data Retention Policy "

  Scenario: Retain email contents for valid allowed period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"

  
  Scenario: Extend a department forever
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "deptretentions"
    And user Clicks on the "Department"
    And selects "forever" in Department
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "deptretentions"Departments After"1"
    And User click On the submit Button
   
  Scenario: Extend a department for a valid period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "deptretentions"
    And user Clicks on the "Department"
    And selects "forever" in Department
    And Select "2 months" in retention period
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "deptretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend a department for zero years and zero months
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "deptretentions"
    And user Clicks on the "Department"
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Data Retention Policy must contain a non-zero email retention period"
    And close the "deptretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Miss department selection
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "deptretentions"
    And user Clicks on the "Department"
    And Select "2 months" in retention period
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "deptretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend a department more than one time
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "deptretentions"
    And user Clicks on the "Department"
    And get the Department available"2"
    And Select "2" in retention department
    And Select "2 months" in retention period
    And user Clicks on the "Department"
    And get the another Department available"2"
    And Select "2" in retention another department
    And Select "1 month" in another retention period
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"have a similar policy"
    And close the "deptretentions"Departments After"2"
    And User click On the submit Button
  
  Scenario: Extended a department for a period shorter than default minimum period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "2 months" in Retain email contents
    And close exctra if any "deptretentions"
    And user Clicks on the "Department"
    And get the Department available"2"
    And Select "2" in retention department
    And Select "1 month" in retention period
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Specific departments cannot be purged sooner than the default duration"
    And close the "deptretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend more than one department for a valid period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "deptretentions"
    And user Clicks on the "Department"
    And get the Department available"2"
    And Select "2" in retention department
    And Select "1 month" in retention period
    And user Clicks on the "Department"
    And get the another Department available"3"
    And Select "2" in retention another department
    And Select "2 months" in another retention period
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "deptretentions"Departments After"2"
    And User click On the submit Button

  Scenario: Extend a valid domain forever
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "deptretentions"
    And user Clicks on the "Department"
    And get the Department available"2"
    And Select "2" in retention department
    And selects "forever" in Department
    And Select "1 month" in retention period
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "deptretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend a valid domain for a valid period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "deptretentions"
    And user Clicks on the "Department"
    And get the Department available"2"
    And Select "2" in retention department
    And Select "2 months" in retention period
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "deptretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend a valid domain for zero years and zero months
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "deptretentions"
    And user Clicks on the "Department"
    And get the Department available"2"
    And Select "2" in retention department
    And Select "0 years" in Retain email contents Year
    And Select "0 months" in Retain email contents
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Data Retention Policy must contain a non-zero email retention period"
    And close the "deptretentions"Departments After"1"
    And User click On the submit Button

  Scenario: Missing domain field
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "domainretentions"
    And user Clicks on the "Domain"
    And Select "0 years" in Retain email contents Year in Domain
    And Select "1 month" in Retain email contents in Domain
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "domainretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend a domain more than one time
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "domainretentions"
    And user Clicks on the "Domain"
    And user enters "1"the Domain name"a.com"
    And Select "0 years" in Retain email contents Year in Domain
    And Select "1 month" in Retain email contents in Domain
    And user Clicks on the "Domain"
    And user enters "2"the Domain name"a.com"
    And Select "0 years" in another Retain email contents Year in Domain
    And Select "1 month" in another Retain email contents in Domain
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"have a similar policy"
    And close the "domainretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend a domain for a period shorter than default minimum period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "2 months" in Retain email contents
    And close exctra if any "domainretentions"
    And user Clicks on the "Domain"
    And user enters "1"the Domain name"a.com"
    And Select "0 years" in Retain email contents Year in Domain
    And Select "1 month" in Retain email contents in Domain
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Specific domains cannot be purged sooner than the default duration"
    And close the "domainretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend more than one domain for a valid period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "domainretentions"
    And user Clicks on the "Domain"
    And user enters "1"the Domain name"a.com"
    And Select "0 years" in Retain email contents Year in Domain
    And Select "1 month" in Retain email contents in Domain
    And user Clicks on the "Domain"
    And user enters "2"the Domain name"b.com"
    And Select "0 years" in another Retain email contents Year in Domain
    And Select "2 months" in another Retain email contents in Domain
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "domainretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Invalid input format for domain name
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "domainretentions"
    And user Clicks on the "Domain"
    And user enters "1"the Domain name"9999"
    And Select "0 years" in Retain email contents Year in Domain
    And Select "2 months" in Retain email contents in Domain
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "domainretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend a valid address forever
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "domainretentions"
    And user Clicks on the "Address"
    And Select "0 years" in Retain email contents Year in Address
    And Select "2 months" in Retain email contents in Address
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "addrretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend a valid address for a valid period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "addrretentions"
    And user Clicks on the "Address"
    And user enters "1"the Address Extensions"bob@b.com"
    And Select "0 years" in Retain email contents Year in Address
    And Select "2 months" in Retain email contents in Address
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "addrretentions"Departments After"1"
    And User click On the submit Button

  Scenario: Extend a valid address for zero years
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "addrretentions"
    And user Clicks on the "Address"
    And user enters "1"the Address Extensions"bob@b.com"
    And Select "0 years" in Retain email contents Year in Address
    And Select "0 months" in Retain email contents in Address
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Data Retention Policy must contain a non-zero email retention period"
    And close the "addrretentions"Departments After"1"
    And User click On the submit Button

  Scenario: Missing address field
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "addrretentions"
    And user Clicks on the "Address"
    And Select "0 years" in Retain email contents Year in Address
    And Select "2 months" in Retain email contents in Address
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "addrretentions"Departments After"1"
    And User click On the submit Button

  Scenario: Extend an address more than one time
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "addrretentions"
    And user Clicks on the "Address"
    And user enters "1"the Address Extensions"bob@b.com"
    And Select "0 years" in Retain email contents Year in Address
    And Select "2 months" in Retain email contents in Address
    And user Clicks on the "Address"
    And user enters "2"the Address Extensions"bob@b.com"
    And Select "0 years" in Retain email another contents Year in Address
    And Select "1 month" in Retain email another contents in Address
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"have a similar policy"
    And close the "addrretentions"Departments After"2"
    And User click On the submit Button
    And close the "addrretentions"Departments After"1"
    And User click On the submit Button

  Scenario: Extend an address for a period shorter than default minimum period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "addrretentions"
    And user Clicks on the "Address"
    And user enters "1"the Address Extensions"bob@b.com"
    And Select "0 years" in Retain email contents Year in Address
    And Select "0 months" in Retain email contents in Address
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"A custom Data Retention Policy must contain a non-zero email retention period"
    And close the "addrretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend more than one address for a valid period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "addrretentions"
    And user Clicks on the "Address"
    And user enters "1"the Address Extensions"bob@b.com"
    And Select "0 years" in Retain email contents Year in Address
    And Select "1 month" in Retain email contents in Address
    And user Clicks on the "Address"
    And user enters "2"the Address Extensions"adam@a.com"
    And Select "0 years" in Retain email another contents Year in Address
    And Select "1 month" in Retain email another contents in Address
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "addrretentions"Departments After"1"
    And User click On the submit Button
 
  Scenario: Invalid input format for email address field
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "addrretentions"
    And user Clicks on the "Address"
    And user enters "1"the Address Extensions"9999"
    And Select "0 years" in Retain email contents Year in Address
    And Select "2 months" in Retain email contents in Address
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "addrretentions"Departments After"1"
    And User click On the submit Button
   
  Scenario: Extend a tag forever
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "addrretentions"
    And close exctra if any "tagretentions"
    And click on the "Extend a Tag" button
    And get the Tag available"2"
    And Select "2" in retention Tag
    And Select "forever" in Retain email contents Year in Tag
    And Select "2 months" in Retain email contents Month in Tag
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "tagretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend a tag for a valid period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "tagretentions"
    And click on the "Extend a Tag" button
    And get the Tag available"2"
    And Select "2" in retention Tag
    And Select "0 years" in Retain email contents Year in Tag
    And Select "2 months" in Retain email contents Month in Tag
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "tagretentions"Departments After"1"
    And User click On the submit Button
   
  Scenario: Extend a tag for zero years
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "tagretentions"
    And click on the "Extend a Tag" button
    And get the Tag available"2"
    And Select "2" in retention Tag
    And Select "0 years" in Retain email contents Year in Tag
    And Select "0 months" in Retain email contents Month in Tag
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"custom Data Retention Policy must contain a non-zero email retention period"
    And close the "tagretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Missing tag
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "tagretentions"
    And click on the "Extend a Tag" button
    And Select "0 years" in Retain email contents Year in Tag
    And Select "1 month" in Retain email contents Month in Tag
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "tagretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend a tag more than one time
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "tagretentions"
    And click on the "Extend a Tag" button
    And get the Tag available"2"
    And Select "2" in retention Tag
    And Select "0 years" in Retain email contents Year in Tag
    And Select "1 month" in Retain email contents Month in Tag
    And click on the "Extend a Tag" button
    And Select "2" in retention Tag1
    And Select "0 years" in Retain email contents Year1 in Tag
    And Select "2 months" in Retain email contents Month in Tag1
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"have a similar policy"
    And close the "tagretentions"Departments After"2"
    And User click On the submit Button
  
  Scenario: Extend a tag for a period shorter than default minimum period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "2 months" in Retain email contents
    And close exctra if any "tagretentions"
    And click on the "Extend a Tag" button
    And get the Tag available"2"
    And Select "2" in retention Tag
    And Select "0 years" in Retain email contents Year in Tag
    And Select "1 month" in Retain email contents Month in Tag
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Specific tags cannot be purged sooner than the default duration"
    And close the "tagretentions"Departments After"1"
    And User click On the submit Button
  
  Scenario: Extend more than one tags for a valid period
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "tagretentions"
    And click on the "Extend a Tag" button
    And get the Tag available"2"
    And Select "2" in retention Tag
    And Select "0 years" in Retain email contents Year in Tag
    And Select "1 month" in Retain email contents Month in Tag
    And click on the "Extend a Tag" button
    And get the Tag available"3"
    And Select "3" in retention Tag1
    And Select "0 years" in Retain email contents Year1 in Tag
    And Select "2 months" in Retain email contents Month in Tag1
    And Select Valid frequency"0"
    And Enter the Data "notify" for Search "ramkumardkr@gmail.com"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
    And close the "tagretentions"Departments After"2"
    And User click On the submit Button
  
  Scenario: Set Frequency to be Never
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And close exctra if any "tagretentions"
    And Select Valid frequency"0"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"

  Scenario: Set Frequency to be Daily
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And Select Valid frequency"2"
    And Select "1" Time For Daily
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated."

  Scenario: Set Frequency as one day in a week
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And Select Valid frequency"3"
    And Select "3" Day For Weekly
    And Select "2" Time For Weekly
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
  
  Scenario: Set Frequency as more than a day in a week
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And Select Valid frequency"3"
    And Select "1" more than one Day For Weekly "3"
    And Select "4" Time For Weekly
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated"
  
  Scenario: Set Frequency as All days in a week
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And Select Valid frequency"3"
    And Select All days in Week
    And Select "4" Time For Weekly
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated."
  
  Scenario: Set monthly frequency
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And Select Valid frequency"4"
    And Select "weeknum" Monthly Config "1"
    And Select "weekday" Monthly Config "3"
    And Select "hour" Monthly Config "3"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated."
  
  Scenario: Configure notification with valid email address
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And User Enters Valid Email in Notify "ashwini.darade@zanjo.io"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated."
 
  Scenario: Configure notification with invalid email address format
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And Select Valid frequency"0"
    And User Enters Valid Email in Notify "ashwini"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"The following are not valid e-mail addresses"
  
  Scenario: Accept disclaimer
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And User click On the submit Button
    Then Special Message displayed"u must agree to the disclaimer to change these settings"
 
  Scenario: Set Data retention for Legal holds
    When User clicks on "Configuration"
    And user navigate to "Legal Holds"
    And user enters the valid tag name "Ram"
    And user click on Add Legal Holds
    And enter a valid "Description:"
    And user selcts the check box Legal Hold
    And user click on Create Legal hold
    Then Message displayed
    When User Click On "Maintenance" tab
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And user Clicks on the "Tag"
    And Verify added LegalHold Is Not Available in Tag
  
  Scenario: Miss Save button
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And Select Valid frequency"3"
    And Select All days in Week
    And Select "4" Time For Weekly
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    When User Click On "Data Retention Policy" tab
    Then The changes made were not saved
  
  Scenario: Set data retention for an email that maches more than one criteria
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "2 months" in Retain email contents
    And user Clicks on the "Domain"
    And user enters "1"the Domain name"a.com"
    And Select "0 years" in Retain email contents Year in Domain
    And Select "1 month" in Retain email contents in Domain
    And user Clicks on the "Address"
    And user enters "1"the Address Extensions"bob@b.com"
    And Select "0 years" in Retain email contents Year in Address
    And Select "1 month" in Retain email contents in Address
    And click on the "Extend a Tag" button
    And get the Tag available"2"
    And Select "2" in retention Tag
    And Select "0 years" in Retain email contents Year in Tag
    And Select "1 month" in Retain email contents Month in Tag
    And Select "1" in the Data Retention field
    And Select "0 years" in Retain email contents Year
    And Select "1 month" in Retain email contents
    And Select Valid frequency"4"
    And Select "weeknum" Monthly Config "1"
    And Select "weekday" Monthly Config "3"
    And Select "hour" Monthly Config "3"
    And Select the checkbox in the field I acknowledge and accept this disclaimer
    And User click On the submit Button
    Then Special Message displayed"Purge schedule updated."

  Scenario: Hide Side Menu
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    Then click on Collapse - icon on Home Logo for hide
    Then Side menu disappears

  Scenario: Display Side Menu
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    Then click on Collapse - icon on Home Logo for display
    Then Side menu is displayed

  Scenario: Check home link
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    Then user click on Intradyn Logo
    Then user able to see the Dashboard page

  Scenario: Check Account Settings link
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    Then user click on Account Settings Icon
    Then user able to see the Account Settings page

  Scenario: Check Help link
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    Then user click on Help Icon
    Then user able to see the Help Documentation for Tags

  Scenario: Check Logout Link
    When User clicks on "Configuration"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    Then user click on Logout Icon
    Then user able to see Login Page
