Feature: 

	#*{color:#de350b}US:{color}*
	#
	#As a librarian, I should be able to see book records on user page
	#
	# 
	#
	#*{color:#de350b}AC:{color}*
	#
	#1. It should be as a default 10 records
	#2. It should show records for <count> options
	#Examples:
	#|count|
	#|5|
	#|10|
	#|15|
	#|50|
	#|100|
	@EUG2-169 @EUG2-164
	Scenario: As a librarian, I should be able to see book records on user page (LibraryCT-Akay))
		Background:
		    Given The librarian should be able to see book records on user page
		
		Scenario:As a librarian I should be able to see book records on user page 
		     When librarian on the Dashboard page
		     And librarian clicks the "Users" button
		     Then librarian verify to see 10 record as a default
		     
		Scenario:As a librarian, I should be able to close Add User page.
		     When librarian on the Dashboard page
		     And librarian clicks the "Users" button
		     Then librarian clicks "show records" button
		     And librarian verify to see count options
		