Feature: Login with valid credentials

  @wip
    Scenario: Positive Login
      Given The user is on the login page
      When The user logged in by using "miaa@gmail.com" and "123456"
      Then Verify that the user successfully logged in


    Scenario: Easy Way Login
      Given The user is already logged in and on the home page by using "miaa@gmail.com" and "123456"




