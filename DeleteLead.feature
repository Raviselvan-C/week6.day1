Feature: Lead Delete Functionality

Scenario Outline: Delete Lead Function
Given launch browser
And Navigate to URL
And Enter the UserName <username>
And Enter the Password <password>
When Click the Login Link
Then Home page should be displayed
Given Click the CRM link
When Click the Leads link
Then Leads page should be displayed
Given Click the Find Leads link
Given Click the phonetab
Given Enter the phone Number <phoneNumber>
Given Click the Find Leads button
Given manual wait
Given Get the LeadID text
Given Click the lead ID
Given delete the Lead
Given Click the Find Leads link
Given Enter the LeadID text
When Click the Find Lead Button
Then No records to display message displayed

Examples:
|username|password|phoneNumber|
|'Demosalesmanager'|'crmsfa'|'9'|
|'DemoCSR'|'crmsfa'|'9'|
