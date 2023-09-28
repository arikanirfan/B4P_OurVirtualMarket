@wip
Feature: Register Functionality

  Background:  Given The user is on the homepage


  Scenario: Check if the register link is present
    Then The user should see a register link


  Scenario:User goes to the Register page
    When The user click the registration link
    Then The user should be on the registration page


  Scenario: Registering a new user
    When The user click the registration link
    And The user enter  credentials
    And The user click the Continue button
    Then The user should see a confirmation message
