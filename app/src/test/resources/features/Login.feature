#language: en
#encoding: utf-8

Feature: Login
  As a user
  I want to login
  So that I can access my account

  Background:
    Given I am on the login page

  Scenario: Login with valid credentials
    When type "RitaACyheatham@armywspy.com" in email field
    And type "123456789" in password field
    And click on login button
    Then I should see the authenticated user's main screen

