Feature: Test the sign in page of GITHUB.com


#comments

@ddt	
	Scenario Outline: ddt Positive Signin Functionality
	
	Given User is on the GITHUB Homepage
	When User clicks on the Signin link
	And enters "<UName>" or emailaddress
	And Enter password as "<PWD>"
	And Click on Sign in button
	Then User should see Start a Project button
	

		
	
		Examples:

		|UName|PWD|
		|mannam9|sridharm9|
		|neelima706|sdettraining1|