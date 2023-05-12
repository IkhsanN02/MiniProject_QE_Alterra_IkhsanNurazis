@register
Feature: New user can Create account and Registered

  @registersucces
  Scenario: As a new user, I have be able to create new account
    When New user click account
    When New user click register
    And New user input name on name field
    And New user input email on email field
    And New user input password on password field
    And New user click register button
    Then New user back to home page

  @registerwithoutusername
  Scenario: As a new user, I have be able to create new account without username
    When New user click account1
    When New user click register1
    And New user input email on email field1
    And New user input password on password field1
    And New user click register button1
    Then user see error message1

  @registerwithoutemail
  Scenario: As a new user, I have be able to create new account without email
    When New user click account2
    When New user click register2
    And New user input name on name field2
    And New user input password on password field2
    And New user click register button2
    Then user see error message2

  @registerwithoutpassword
  Scenario: As a new user, I have be able to create new account without password
    When New user click account3
    When New user click register3
    And New user input name on name field3
    And New user input email on email field3
    And New user click register button3
    Then user see error message3