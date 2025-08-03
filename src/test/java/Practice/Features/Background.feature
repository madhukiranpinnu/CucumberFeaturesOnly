Feature: Background Tests
  Background:
    Given In Test page
    Then  Database connection
    And   Conencted database
    @1
  Scenario: To Test home page
    Given On Background page
    Then  test on home page
      @2
  Scenario: To test carts
    Given On Background page
    Then  Click on home page
    And   To test carts