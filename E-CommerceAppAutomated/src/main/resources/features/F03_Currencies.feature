@smoke
Feature: F03 | user could switch between available currencies
  Scenario: user could successfully select euro currency
    Given user navigates to home page
    When user select currency from dropdown list
    Then prices of shown items should be in euro currency
