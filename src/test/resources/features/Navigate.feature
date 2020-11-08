
Feature: : As a user,I should be able to see several modules once login.(LibraryCT-Ali)

 @wip
Scenario: Librarians  should have access to 3 modules
When user login as a librarian
Then The user should see following  options
| Dashboard      |
| Books          |
| Borrowing Books|
@wip
  Scenario: Students should have access to 3 modules
    When user login as a student
    Then The user should see following  options
      | Dashboard      |
      | Books          |
      | Borrowing Books|


