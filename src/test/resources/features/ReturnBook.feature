Feature: 

	#the student should be able to return the borrowed book 
	@EUG2-171
	Scenario: The student return the book
		Given the student in login page
		When the student should navigate to "Borrowing Books" module
		Then the student should be able to click "Return book" button
		Then "Not returned" should turn to "RETURNED" message.