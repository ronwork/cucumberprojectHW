Feature: Techfios login functionality validation


Scenario: User should be able to login with valid credentials 
	and open a new account
	Given user is on techfios login page	
	When User enters username as "demo@techfios.com"
	When User enters password as "abc123" 
	And User clicks on login
	Then User should land on Dashboard page  
	And User should clicks on bankCash
	And User clicks on newAccount
	And User enters accounttitle as "md roni"	
	And User enters description as the "IT JOB MONEY" field in accounts page
	And User enters initialBalance in the "10000" field in accounts page
	And User enters accountNumber in the "007" field in accounts page
	And User enters contactPerson in the "ME" field in accounts page
	And User enters Phone in the "347568900" field in accounts page
	And User enters internetBankingURL in the "https://www.w3schools.com/" field in accounts page
	And User clicks on submit
	
	
	
	