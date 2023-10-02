Feature: ContactUs Tests


  Background:
    Given User already logged in with "maho@hotmail.com" and "Maho123456789"
    When The user click on the Contact Us link at the bottom of the Home page.

  @contactUs
  Scenario: ContactUs Tests
    Then The user must see the Contact Form header


  @positive
  Scenario Outline: ContactUs positive Tests
    When Enter "<characters>" in the inquiry field
    When Tap on SubmitButton
    Then Validate that warning "<message>" appears
    Examples:
      | characters           | message                                                     |
      | slm nasilsin merhaba | Your enquiry has been successfully sent to the store owner! |


  @Boundary
  Scenario Outline: ContactUs Boundary Tests
    When Enter "<ENQUIRY>"
    When Tap on SubmitButton
    Then Validate that warning "<message>"
    Examples:
      | ENQUIRY | message                                         |
      | slm     | Enquiry must be between 10 and 3000 characters! |
      |         | Enquiry must be between 10 and 3000 characters! |
