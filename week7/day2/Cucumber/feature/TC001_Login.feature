Feature: Login funtionality

Background:
Given Launch the browser
Given Load the url


Scenario: Login with Positive credentials

#Given Launch the browser
#Given Load the url
And Enter the username as 'demoSalesManager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then WelcomePage is displayed



Scenario: Login with Invalid credentials

#Given Launch the browser
#Given Load the url
And Enter the username as 'demo'
And Enter the password as 'crmsfa'
When Click on the Login button
But ErrorMessage is displayed