#language: en
#encoding: utf-8

Feature: Sign up
  As a user
  I want to create a new account
  So that I can use the application

  Background:
    Given I am on the sign up page

  Scenario: User can create a new account
    Given I fill out the form correctly
    When I click on Sign up
    Then I must be authenticated

  Scenario Outline: User can't create a new account with invalid data
    Given I fill name with "<first_name>"
    And I fill lastname with "<last_name>"
    And I fill email with "<email>"
    And I fill password with "<password>"
    And I fill password confirmation with "<password_confirmation>"
    When I click on Sign up
    Then I must not be authenticated
    And I should see an error message saying "<error_message>"

    Examples:
      | first_name | last_name | email                | password | password_confirmation | error_message                             |
      | Mockdata   |           | Mockdata@gmail.com   | Mockdata | Mockdata              | The last name field is required.          |
      |            | Mockdata  | Mockdata@gmail.com   | Mockdata | Mockdata              | The first name field is required.         |
      | Mockdata   | Mockdata  | Mockdata             | Mockdata | Mockdata              | The email must be a valid email address.  |
      | Mockdata   | Mockdata  | Mockdata@invalid.com |          | Mockdata              | The email must be a valid email address.  |
      | Mockdata   | Mockdata  |                      | Mockdata | Mockdata              | The email field is required.              |
      | Mockdata   | Mockdata  | Mockdata@gmail.com   |          | Mockdata              | The password field is required.           |
      | Mockdata   | Mockdata  | Mockdata@gmail.com   | Mockdata |                       | The password confirmation does not match. |
      | Mockdata   | Mockdata  | Mockdata@gmail.com   | Mockdata | MockdataMockdata      | The password confirmation does not match. |