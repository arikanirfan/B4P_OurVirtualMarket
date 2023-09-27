Feature: Login with valid credentials

  @positiveLogin
  Scenario Outline: Positive Login
    Given The user already logged in by using "<email>" and "<password>"
    Examples:
      | email          | password |
      | miaa@gmail.com | 123456   |





