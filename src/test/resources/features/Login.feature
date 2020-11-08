Feature:

  Scenario: The student should log in

              Given the student in login page


  @login
  Feature: user should be able to login
  @wip
  Scenario: Login as a student
    Given the user is on the login page
    When the user enters the student information
    Then the user should be able to login
  @wip
  Scenario: Login as a librarian
    Given the user is on the login page
    When the user enters the librarian information
    Then the librarian should be able to login

