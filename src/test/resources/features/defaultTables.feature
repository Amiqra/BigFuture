Feature: As a student, I should be able to see tables with default info

  Background:
    Given the student in login page

  @defaultTable
  Scenario: Table columns names
    Then table should have following column names

      |Actions    |
      |ISBN       |
      |Name       |
      |Author     |
      |Category   |
      |Year       |
      |Borrowed By|
