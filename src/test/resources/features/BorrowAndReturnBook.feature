Feature: 

	#the student should be able to return the borrowed book 

	Background:
		Given the student in login page

	@EUG2-171
	Scenario: The student should be able to return a book

		When the student should navigate to "Borrowing Books" module
		Then the student should be able to click "Return book" button and should display "RETURNED" message.



	@EUG2-170
	Scenario: The student should be able to borrow a book

		When the student is on the "Books" module
		When The borrowed by cell, which corresponds to book wanted to be borrowed should be empty
		Then the student should be able to click "Borrow book" button
		Then "Borrow book" button should be disabled.