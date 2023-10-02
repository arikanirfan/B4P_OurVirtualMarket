Feature: Login with valid credentials

  @wip
    Scenario: Positive Login
      Given The user is on the login page
      When The user logged in with "miaa@gmail.com" and "123456"
      Then Verify that the user successfully logged in


    Scenario: Easy Way To Login
      Given User already logged in with "miaa@gmail.com" and "123456"




