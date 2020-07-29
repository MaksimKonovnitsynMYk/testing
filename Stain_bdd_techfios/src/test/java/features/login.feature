Feature: login Page
 	As a user I want a login page so that only 
 		authentic user can have access 
 		
 Scenario: Valid user should be able to login 
 Given a valid user 
 When user goes to techfios site 
 Then techfios site should display
 When user provides valid credentials 
 Then Dashboard page should be displayd 
 And username should match 