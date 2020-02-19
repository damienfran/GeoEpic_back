Feature: Logging into GeoEpic


	Scenario: GeoEpic Log In
		Given The user is on the GeoEpic Home Page
		When The user inputs valid log in information and hits Submit
		Then The user should be logged in and take to the myStats page
		
	Scenario: Location Choice page
		Given The user is on the myStats page
		When The user clicks on Go To Location button
		Then The user gets to the Location Picker page
		
	Scenario: GeoLocation Location Picker
		Given The user is on the Location Picker Page
		When The user clicks on Location One
		Then The user is directed to the Location One Details Page
		
	Scenario: Treasure Swap Screen
		Given The user is on the Location Details Page
		When The user clicks on the treasure Box to open it
		Then The user is one the Treasure Swap Page
		
	Scenario: GeoEpic Logout 
		Given The user is on the Treasure Swap Page 
		When The user clicks on Logout
		Then The user is on the GeoEpic Home Page 