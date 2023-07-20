#language: en
#encoding: utf-8

Feature: Login
  As a user
  I want to be able to login
  So that I can access my account and check my personal finances

  Background:
    Given I am on the login page
     And I have a valid account

  Scenario: Login with valid credentials
    When type a valid email in email field
    And type a valid password in password field
    And click on login button
    Then I should see the authenticated user's main screen

