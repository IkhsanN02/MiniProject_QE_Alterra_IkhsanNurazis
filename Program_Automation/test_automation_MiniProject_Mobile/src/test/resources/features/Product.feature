@product
Feature: As a user i have be able to login so that i can see home screen

  @seeallproduct
  Scenario: As a user i can login
    Given user go on home page
    When user can click account info
    When user can input valid email
    And user can input valid password
    And user can click login button
    Then user back to home page andd see all product

  @addcart
  Scenario: As a user i can login
    Given user go on home page
    When user can click account info
    When user can input valid email
    And user can input valid password
    And user can click login button
    Then user back to home page andd see all product
    Then user can choose the product and add to cart