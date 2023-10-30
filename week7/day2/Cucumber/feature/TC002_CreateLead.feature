Feature: CreateLead Functionality

Scenario Outline: CreateLead with mandatory fields

Given Launch the browser
Given Load the url
And Enter the username as 'demoSalesManager'
And Enter the password as 'crmsfa'
When Click on the Login button
When Click on 'CRM/SFA' link
When Click on 'Leads' link
When Click on 'Create Lead' link
When Enter the 'createLeadForm_companyName' as <companyName>
When Enter the 'createLeadForm_firstName' as <firstName>
When Enter the 'createLeadForm_lastName' as <lastName>
When Click on CreateLead button
Then ViewLeadPage is displayed

Examples:
|companyName|firstName|lastName|
|'Testleaf'|'Vidya'|'R'|
|'TCS'|'Sumit'|'Gupta'|
|'Wipro'|'Swetha'|'J'|
