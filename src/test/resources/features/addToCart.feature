Feature: Add To Cart Functionality
  Background:
    Given User already logged in with "miaa@gmail.com" and "123456"
  @addToCart
  Scenario: Add To Cart
    When The user search "hisense"
    Then Verify that the user is able to see product name as "hisense"
    When The user adds "Hisense 50A7GQTUK" to cart
    Then Verify that "Hisense 50A7GQTUK" has been added to cart
