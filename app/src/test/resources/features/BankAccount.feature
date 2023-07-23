#language: en
#encoding: utf-8

Feature: Bank Account
  As a user
  I want to create and manipulate bank account data

  Background:
    When I access the bank account index

  Scenario Outline: Create a bank account
    When click on create button
    And fill in the fields nameAccount <nameAccount>
    And select the bank <bank>
    And select the type bank account <bankAccountType>
    And fill in the fields agency <agency>
    And fill in the fields number <number>
    And fill in the fields digit <digit>
    Given click on save button
    Then the bank account must be saved with <bank>, <bankAccountType>, <agency>, <number>, <digit>

    Examples:
      | nameAccount | bank                       | bankAccountType | agency | number    | digit |
      | Nubank      | Nu Pagamentos S.A (Nubank) | Conta Corrente  | 1234   | 123456789 | 0     |

  Scenario Outline: Edit a bank account
    When I have a bank account created
    And click on edit button
    And fill in the fields nameAccount <nameAccount>
    And select the bank <bank>
    And select the type bank account  <bankAccountType>
    And fill in the fields agency <agency>
    And fill in the fields number <number>
    And fill in the fields digit <digit>
    Given click on save button
    Then the bank account must be saved with <bank>, <bankAccountType>, <agency>, <number>, <digit>

    Examples:
      | nameAccount | bank             | bankAccountType | agency | number    | digit |
      | Banco Safra | Banco Safra S.A. | Conta Corrente  | 4321   | 987654321 | 1     |

  Scenario: Delete a bank account
    When I have a bank account created
    Given click on delete button
    Then the bank account must be deleted