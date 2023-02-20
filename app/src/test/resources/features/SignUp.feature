#language: en
#encoding: utf-8

Feature: Sign up
  As a user
  I want to create a new account
  So that I can use the application

  Background:
    Given I am on the sign up page

  Scenario Outline: User can create a new account
    When I fill name with "<first_name>"
    And I fill lastname with "<last_name>"
    And I fill email with "<email>"
    And I fill password with "<password>"
    And I fill password confirmation with "<password_confirmation>"
    And I click on Sign up
    Then I must be authenticated

    Examples:
      | first_name | last_name   | email                           | password  | password_confirmation |
      | Rita       | A. Cheatham | RitddaACyddheatham@armywspy.com | 123456789 | 123456789             |

  Scenario Outline: User can't create a new account with invalid data
    When I fill name with "<first_name>"
    And I fill lastname with "<last_name>"
    And I fill email with "<email>"
    And I fill password with "<password>"
    And I fill password confirmation with "<password_confirmation>"
    And I click on Sign up
    Then I must not be authenticated

    Examples:
      | first_name | last_name | email                 | password         | password_confirmation |
      |            | Mockdata  | Mockdata@mockdata.com | Mockdata         | Mockdata              |
      | Mockdata   |           | Mockdata@mockdata.com | Mockdata         | Mockdata              |
      | Mockdata   | Mockdata  | Mockdata              | Mockdata         | Mockdata              |
      | Mockdata   | Mockdata  |                       | Mockdata         | Mockdata              |
      | Mockdata   | Mockdata  | Mockdata@mockdata.com |                  | Mockdata              |
      | Mockdata   | Mockdata  | Mockdata@mockdata.com | Mockdata         |                       |
      | Mockdata   | Mockdata  | Mockdata@mockdata.com | MockdataMockdata | Mockdata              |
      | Mockdata   | Mockdata  | Mockdata@mockdata.com | Mockdata         | MockdataMockdata      |