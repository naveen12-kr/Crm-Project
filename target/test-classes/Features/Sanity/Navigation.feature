@Navigation
Feature: Navigation

  Background: Navigation
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in the New-UI app

  Scenario: Email Viewing
    When User clicks on "Email Viewing" tab
    Then User able to see header "Searching"
    When User clicks on "Search" tab
    Then User able to see header "Query Terms"
    When User clicks on "Saved Searches" tab
    Then User able to see header "Saved Search Queries"
    When User clicks on "Scheduled Searches"
    Then User able to see header "Scheduled Search List"
    When User clicks on "My Mailbox" tab
    Then User able to see header "Mailbox"
    When User clicks on "My Labels" tab
    Then User able to see header "Current Labels"
    When User clicks on "My Contacts" tab
    Then User able to see header Contacts
    When User clicks on "My Exported Results" tab
    Then User able to see the "Browse Exported Search Results"
    When User clicks on "All Emails" tab
    Then User able to see header "Total Emails per day, Parsing Failures"
    When User clicks on "Parsing Failures" tab
    Then User able to see header "Parsing Failures"
    When User clicks on "All Tags" tab
    Then User able to see header "Current Email Tags"
    When User clicks on "Advanced Reports" tab
    Then User able to see the "360° Communication View – See the potential of your data."

  Scenario: Users and Groups
    When user click on "Users and Groups"
    Then user should see header "Local Accounts"
    When user click on "User"
    Then user able to see "Local User Accounts"
    When user click on "Groups"
    Then user able to see Groups
    When user click on "Import Users from Excel"
    Then user able to see "Excel-Based User Creation Wizard"
    When user click on "Department Setup"
    Then user able to see "Departmental Email Address Configuration"
    When user click on "Search Exclusions"
    Then user able to see "Global Search Exclusions"
    When user click on "Access Control"
    Then user able to see "Access Control"
    When user click on "LDAP / Active Directory"
    Then user able to see "LDAP User Authenticators"

  Scenario: Status
    When user click on the "Status"
    Then user should able to see header "Reports"
    When user click on the "Dashboard"
    Then user should able to see the "Dashboard"
    When user click on the "System Summary"
    Then user should able to see the "System Summary"
    When user click on the "System Status"
    Then user should able to see the "System Status"
    When user click on the "Summary Counts"
    Then user should able to see the "Email Summary Counts"
    When user click on the "Full System Health Checkup"
    Then user should able to see the "Full System Health Checkup"
    When user click on the "Email Activity"
    Then user should able to see the "Graph of Emails Fetched over Time"
    When user click on the "System Activity - Current"
    Then user should able to see the "System Activity - Current"
    When user click on the "System Activity - Historic"
    Then user should able to see the "System Activity - Historic"
    When user click on the "Audit Log"
    Then user should able to see the "Audit Log"
    When user click on the "View Update History"
    Then user should able to see the "Package Update History"
    When user click on the "Data Purge History"
    Then user should able to see the "Data Purge History"
    When user click on the "View Backup History"
    Then user should able to see the "Remote Backup History"
    When user click on the "Notification Email History"
    Then user should able to see the "Notification Email History"
    When user click on the "Migration History"
    Then user should able to see the "Migration Entries"
    When user click on the "Email Deletion Log"
    Then user should able to see the "Enable Per-Email Deletion"

  Scenario: Backup
    When user clicks Backup tab
    Then user have to see header "Warm Standby"
    When user clicks "Configuration" tab
    Then user have to see the "Warm Standby Overview"
    When user clicks "View Backup History" tab
    Then user have to see the "Remote Backup History"
    When user clicks "Remote Host Config" tab
    Then user have to see the "Remote Backup Host Configuration"
    When user clicks "Remote Backup Schedule" tab
    Then user have to see the "Remote Backup Schedule"
    When user clicks "Backup Now" tab
    Then user have to see the "Backup Now"
    When user clicks "Restore Previous Backup" tab
    Then user have to see the "Restore Previous Backup"
    When user clicks "Initialize" tab
    Then user have to see the "Cloud Connected Appliance"

  Scenario: Maintenance
    When User Click On "Maintenance" tab
    Then User able to See header "Product Updates"
    When User Click On "View Update History" tab
    Then User able to see the "Package Update History"
    When User Click On "Update Now" tab
    Then User able to see the "Update Now"
    When User Click On "Download Tools" tab
    Then User able to see the "Download Tools"
    When User Click On "Import Email" tab
    Then User able to see the "Email Import"
    When User Click On "Migrate Email" tab
    Then User able to see the "Email Migration"
    When User Click On "Maintenance Key" tab
    Then User able to see the "Maintenance Key Contract"
    When User Click On "Active Monitoring" tab
    Then User able to see the "Active Monitoring"
    When User Click On "Reboot/Shutdown" tab
    Then User able to see the "Reboot/Shutdown"
    When User Click On "Data Retention Policy" tab
    Then User able to see the "Configure Data Retention Policy"
    When User Click On "Email Deletion Configuration" tab
    Then User able to see the "Enable Per-Email Deletion"

  Scenario: Configuration
    When user click on "Configuration" Tab
    Then user ables to see header "Settings"
    When user click on "System Settings" Tab
    Then user able to see the header "System Settings"
    When user click on "Outgoing SMTP" Tab
    Then user able to see the header "Outgoing SMTP Server"
    When user click on "Email Notification" Tab
    Then user able to see the header "Email Notification and Text Alerts"
    When user click on "Network Server Control" Tab
    Then user able to see the header "Network Server Control"
    When user click on "Federated Configuration" Tab
    Then user able to see the header "Federated Search Configuration"
    When user click on "POP or IMAP Fetcher" Tab
    Then user able to see the header "Email Fetcher Configurations"
    When user click on "SMTP Server" Tab
    Then user able to see the header "SMTP Configuration"
    When user click on "Advanced Reports" Tab
    Then user able to see the header "Message Intelligence Configuration"
    When user click on "MS EWS Services" Tab
    Then user able to see the header "MS Exchange Services"
    When user click on "Legal Holds" Tab
    Then user ables to see header "Current Legal Holds"
    When user click on "Tags" Tab
    Then user ables to see header "Current Email Tags"
    When user click on "IP Access Control" Tab
    Then user able to see the header "IP Access Control"
    When user click on "SSL Certificate Control" Tab
    Then user able to see the header "SSL Certificate Control"
    When user click on "Save Configuration" Tab
    Then user able to see the header "Save Configuration"
    #When user click on "Upload Configuration" Tab
    #Then user able to see the header "Upload Configuration"
    When user click on "Register Product" Tab
    Then user able to see the header "Product Registration"
