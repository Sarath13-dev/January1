Feature: Validating the Facebook

Scenario Outline: Validating the Facebook with correct Username and password
Given User should launch the facebook url
When User should enter the "<username>" and "<password>"
And User should click the login button
Then User validates the home page

Examples: 
	
		|username|password|
		|ramsss|123456|
		|oiuytr|435678|
		|ewrteyr|456758|
		|mnbvcnbv|567890|
	
		
			