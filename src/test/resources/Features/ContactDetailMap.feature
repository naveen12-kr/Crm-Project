Feature: Create of Contact details with fields 

Scenario: Check to create a new contact details of following fields 

	Given user is on login page 
	When user enter username and password 
		|username|password|
		|naveenwell@gmail.com|Wait@123|
	And user click on login button 
	Then user view a home page 
	When user move to click contact page 
	And user click on new tab 
	Then user enter contact detais firstname and lastname and company 
	
	
		|firstname|lastname|company|
		|Tony|Weck|TCS|
		|David|Warne|INFY|
