@wip
Feature: Register Functionality

  Scenario: Check for the presence of the registration link
    Given The user is on the homepage
    Then The user should see a register link

  Scenario: Click the register link
    Given The user is on the homepage
    When The user click the registration link
    Then The user should be on the registration page

  Scenario: Fill in all necessary fields to register successfully
    Given The user is on the registration page
    When The user fill in all necessary registration fields
    And The user accept the Privacy Policy
    And The user click the Continue button
    Then The user should see a success message

  Scenario: Check for warning messages when necessary fields are not filled(NEGATİVE)
    Given The user is on the registration page
    When The user click the Continue button without filling necessary fields
    Then The user should see warning messages


  Scenario: Attempt to register without accepting Privacy Policy(NEGATİVE)
    Given The user is on the registration page
    When The user fill in all necessary registration fields
    And The user do not accept the Privacy Policy
    And The user click the Continue button
    Then The user should see a warning message about Privacy Policy acceptance


  Scenario: Validate First Name field(NEGATİVE)
    Given The user is on the registration page
    When The user enter a First Name that is too long
    And The user accept the Privacy Policy
    And The user click the Continue button
    Then The user should see a warning message about First Name length


  Scenario: Validate Last Name field(NEGATİVE)
    Given The user is on the registration page
    When The user enter a Last Name that is too long
    And The user accept the Privacy Policy
    And The user click the Continue button
    Then The user should see a warning message about Last Name length


  Scenario: Validate Email Address field
    Given The user is on the registration page
    When The user enter an invalid Email Address
    And The user accept the Privacy Policy
    And The user click the Continue button
    Then The user should see a warning message about Email Address format


  Scenario: Validate Telephone Number field
    Given The user is on the registration page
    When The user enter a Telephone Number that is too long
    And The user accept the Privacy Policy
    And The user click the Continue button
    Then The user should see a warning message about Telephone Number length


  Scenario: Validate Password field
    Given The user is on the registration page
    When The user enter a Password that is too short
    And The user accept the Privacy Policy
    And The user click the Continue button
    Then The user should see a warning message about Password length






