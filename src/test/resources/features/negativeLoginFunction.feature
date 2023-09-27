Feature: Login with invalid credentials

  @negativeLogin
  Scenario Outline: Negative Login
    Given The user is on the login page
    When The user enter "<email>" and "<password>" and click the login button
    Then The user should get a "<message>"
    Examples:
      | email               | password | message                                               |
      | mi@gmail.com        | A%123456 | Warning: No match for E-Mail Address and/or Password. |
      | hilayse@hotmail.com | %123456  | Warning: No match for E-Mail Address and/or Password.|
      | hilays@hotmail.com  | %123456  | Warning: No match for E-Mail Address and/or Password. |
      |                     |          | Warning: No match for E-Mail Address and/or Password. |
      |                     | A%123456 | Warning: No match for E-Mail Address and/or Password. |
      | hilayse@hotmail.com |          | Warning: No match for E-Mail Address and/or Password. |
