
Feature: Add User

Background:
  Given the user logged in as a "librarian"
  When navigate the page to "Users" module
@EUG2-167
Scenario:As a librarian, I should be able to add users from Users page.
    Given user clicks the "Add User" button
    When  create new user using following information
    | Full Name  | Maria Black                     |
    | Password   | 1234                            |
    | Email      | mra@gmail.com                   |
    | User Group | 3                               |
    | Status     | ACTIVE                        |
    | Start Date | 2020-11-11                      |
    | End Date   | 2025-10-10                      |
    | Address    | Spring st, New York, USA, 20002 |
    Then user able to click the "Save Changes" button
@EUG2-176
Scenario:As a librarian, I should be able to close Add User page.
  When librarian clicks the "Add User" button
  Then librarian click the "Close" button
@EUG2-175
Scenario:As a librarian, I should be able to edit user info.
    Given librarian able to click the "Edit User" button
    When edit user info using following information
    | Full Name  | Nick Smith                   |
    | Password   | 12345                        |
    | Email      | nicks@gmail.com              |
    Then librarian click "Save Changes" button