Feature: Lead Merge Functionality

Scenario Outline: MergeLead Function
Given launch browser
And Navigate to URL
And Enter the UserName <username>
And Enter the Password <password>
When Click the Login Link
Then Home page should be displayed
Given Click the CRM link
When Click the Leads link
Then Leads page should be displayed
Given Click the Merge Lead
Given Click the fromLead link
Given Select the Window 1
Given Select the Lead <fromLeadName>
Given Select the Window 0
Given Click the toLead link
Given Select the Window 1
Given Select the Lead <toLeadName>
Given Select the Window 0
Given Click the Merge Button
Given Accept the alert
Given Click the Find Leads link
Given Enter the LeadID text
When Click the Find Lead Button
Then No records to display message displayed

Examples:
|username|password|fromLeadName|toLeadName|
|'Demosalesmanager'|'crmsfa'|'gopi'|'babu'|
