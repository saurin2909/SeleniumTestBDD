Feature: Free CRM Login Feature

Without Example
Scenario: Free CRM Login Test Scenario

Given User is already on login page 
When title of login page is Freecrm
Then user enters username and password 
Then user enters "Test" and "123" 
Then User clicks on login page 
Then User is on Home page
And Accept alert


With Example
Scenario Outline: Free CRM Login Test Scenario

Given User is already on login page 
When title of login page is Freecrm
Then user enters "<username>" and "<password>" 
Then user enters "Test" and "123"
Then user enters username and password
| Test | 123 |
| Saurin | Rathod |
Then user enters username and password
| username | password |
| Saurin | Rathod |
| Test     |  123      |
Then User clicks on login page 
Then User is on Home page
And Accept alert

Examples: 
	#   username | password  |
		#  Test     |  123      |
		 # Saurin   |  Rathod   | 

