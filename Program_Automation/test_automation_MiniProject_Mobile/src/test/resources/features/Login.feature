@login
Feature: As a user i have be able to login so that i can see home screen

  @loginsuccess
  Scenario: As a user i can login
    Given user on home page
    When user click account info
    When user input valid email
    And user input valid password
    And user click login button
    Then user back to home page

  @loginwithinvalidemail
  Scenario: As a user i cant login because i input invalid email
    Given user on home page1
    When user click account info1
    When user input invalid email1
    And user input valid password1
    And user click login button1
    Then user cant login and see error message login1

  @loginwithinvalidpass
  Scenario: As a user i cant login because i input invalid password
    Given user on home page2
    When user click account info2
    When user input valid email2
    And user input invalid password2
    And user click login button2
    Then user cant login and see error message login2

  @loginwithinvalidemailandpass
  Scenario: As a user i cant login because i input invalid email and password
    Given user on home page3
    When user click account info3
    When user input invalid email3
    And user input invalid password3
    And user click login button3
    Then user cant login and see error message login3

  @loginwithoutemailandpass
  Scenario: As a user i cant login because no input anything
    Given user on home page4
    When user click account info4
    And user click login button4
    Then user cant login and see error message login4