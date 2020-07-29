Feature: Client should be able to login

Scenario Outline: Client should be able to login with credentials

Given user is already in Login Page
When user enter "<username>" and "<password>"
Then AFter Login close the browser

Examples:
|username| password|
|techfiosdemo@gmail.com|abc123|
