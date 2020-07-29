Feature: Client should be able to add New Account

Scenario Outline: Client should be able to add New Account

Given user is already in Login Page
When user enter "<username>" and "<password>"
When user clicks New Account 
When user inputs "<title>" nad "<description>" nad "<balance>"
Then After Login close the browser

Examples:
|username| password| title| description|balance|
|techfiosdemo@gmail.com|abc123| Retirement| savings|10000|
