
Feature:BookRecord

  Background:
    Given the user logged in as a "librarian"
    When navigate the page to "Users" module

  @record
  Scenario:As a librarian I should be able to see book records on user page
    Then librarian verify to see 10 record as a default

  @EUG2-test
  Scenario:As a librarian, I should be able to see count options.
    Then User should have to fallowing list

      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |
		