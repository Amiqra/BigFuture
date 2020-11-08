@wip
Feature: Add User

Background:
  Given the user logged in as a "librarian"
  When navigate the page to "Users" module
  @wip
Scenario:As a librarian, I should be able to add users from Users page.

  Then click the "Add User" button
  And  create new user using following information
    | Full Name  | Sarah White                     |
    | Password   | 1234                            |
    | Email      | shwhiter@gmail.com               |
    | User Group | Student                         |
    | Status     | Active                          |
    | Start Date | 2020-11-11                      |
    | End Date   | 2025-10-10                      |
    | Address    | Spring st, New York, USA, 20002 |
  Then click the "Save Changes" button
@wip
Scenario:As a librarian, I should be able to close Add User page.

  Then click the "Add User" button
  And click the "Close" button

Scenario:As a librarian, I should be able to edit user info.

  Then click the "Edit User" button
  And edit user info using following information
    | Full Name  | Selma White                    |
    | Password   | 12345                          |
    | Email      | smwhite@gmail.com              |
  Then click the "Save changes" button