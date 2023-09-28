Feature: Search

  @search
  Scenario: Search
    Given User already logged in with "jack@gmail.com" and "Jack12345"
    When The user search "smart"
