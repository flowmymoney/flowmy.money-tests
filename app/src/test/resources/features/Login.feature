#language: en
#encoding: utf-8

Feature: Login
  As a user
  I want to login
  So that I can access my account

  Background:
    Given I am on the login page
    #And the following users exist:
    #  | email | password | password_confirmation |
    #  | test | test | test |

  Scenario: Login with valid credentials
    When type "test" in email field
    And type "test" in password field
    And click on login button
    Then I should see the authenticated user's main screen

