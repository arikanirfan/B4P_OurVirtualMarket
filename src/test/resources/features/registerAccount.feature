Feature: Register Functionality

  @wip
  Scenario: Check if the register link is present
    Given I am on the homepage
    Then I should see a register link

  Scenario: Registering a new user
    Given I am on the homepage
    When I click the registration link
    Then I should be on the registration page


  Scenario: Registering a new user
    Given I am on the registration page
    When I enter my credentials
    And I click the Continue button
    Then I should see a confirmation message
