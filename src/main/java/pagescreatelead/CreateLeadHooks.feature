Feature: Creating a lead in Leaftaps

#Background: Load URL
#Given open the browser
#And Maximize the window 
#And Load the url
#And set the timeout 

Scenario Outline: Create Lead with all Mandatory values  
 
Given Enter the username as <username>
And Enter the password as <password>
And click Login Button 
And Click link Cmrsfa
And Click link Leads
And Click create Lead
And Enter the company Name as <cname>
And Enter the first Name as <fname>
And Enter the Last name as <lname>
When Click submit button
Then verify lead is created

Examples: 
|username|password|cname|fname|lname|
|DemoSalesManager|crmsfa|Infosys|Lavanya|R|
|DemoSalesManager|crmsfa|TCS|Sandhya|E|