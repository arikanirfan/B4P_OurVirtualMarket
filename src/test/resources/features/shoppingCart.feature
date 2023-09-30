Feature: Shopping Cart Checks

  Background:
    Given User already logged in with "miaa@gmail.com" and "123456"
    And The user search "hisense"
    And The user adds "Hisense 50A7GQTUK" to cart
    When The user navigates to Shopping Cart page


  Scenario: User Views Products in The Shopping Cart
    Then The user should see "Hisense 50A7GQTUK" on the page previously added
    And  The user should see the "CHECKOUT" button on the Shopping cart page

  @shoppingCart
  Scenario: User Navigates to Billing Details on Checkout Click
    When The user clicks on the CHECKOUT button
    Then The user should be able to see "Step 2: Billing Details" menu
