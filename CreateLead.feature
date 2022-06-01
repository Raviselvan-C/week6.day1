Feature: Create Lead Functionality




Scenario Outline: Create Lead Function
Given launch browser
And Navigate to URL
And Enter the UserName <username>
And Enter the Password <password>
When Click the Login Link
Then Home page should be displayed
Given Click the CRM link
When Click the Leads link
Then Leads page should be displayed
Given Click the Create Leads
Given Enter the CompanyName as <cmp>
And Enter the firstName as <Fname>
And Enter the LastName as <Lname>
When Click the Submit Button to Create Lead
Then Lead Status should be assigned
Given Close the browser

Examples:
|username|password|cmp|Fname|Lname|
|'Demosalesmanager'|'crmsfa'|'TTT'|'LIN'|'VIN'|
|'DemoCSR'|'crmsfa'|'TRN'|'LIK'|'NIK'|



