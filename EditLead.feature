Feature: Lead Edit Functionality

Scenario Outline: Edit Lead Function
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
Given Click the lead ID
Given Click the Edit Link
Given Enter the companyName in EditLead Page <cmp>
When Click the Submit Button to Create Lead
Then Lead Status should be assigned
Given Close the browser

Examples:
|username|password|phoneNumber|cmp|
|'Demosalesmanager'|'crmsfa'|'99'|'RRR'|
|'DemoCSR'|'crmsfa'|'99'|'HCL'|
