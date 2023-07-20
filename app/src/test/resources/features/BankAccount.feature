#language: en
#encoding: utf-8

Feature: Bank Account
  As a user
  I want to create and manipulate bank account data

  Scenario: Create a bank account
    When I access the bank account index
    And click on create button
    And fill in the fields with valid information
    And click on save button
    Then the bank account must be saved
