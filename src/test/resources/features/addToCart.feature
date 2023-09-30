Feature: Add To Cart Functionality


  Background:
    Given User already logged in with "miaa@gmail.com" and "123456"
    When The user search "hisense"


  @addToCart
  Scenario: Add To Cart
    Then Verify that the user is able to see product name as "hisense"
    When The user adds "Hisense 50A7GQTUK" to cart
    Then Verify that "Hisense 50A7GQTUK" has been added to cart


  @productDetails
  Scenario: Product Details and Add To Cart Button
    When The user selects "Hisense 75A7GQTUK" product
    Then Verify that there is "Hisense 75A7GQTUK" name, "$491.00" price and add to cart button


  @multipleProduct
  Scenario: User Can Add Multiple Products To The Cart
    When The user adds "Hisense 50A7100FTUK" to cart
    When The user navigates to back page
    And The user adds "Hisense 55U8GQTUK" to cart
    Then Verify that "Hisense 50A7100FTUK" has been added to cart
    Then Verify that "Hisense 55U8GQTUK" has been added to cart

  @wip
  Scenario Outline: User Can Add Multiple Products To The Cart
    When The user adds "<productName>" to cart
    Then Verify that "<productName>" has been added to cart
    Examples:
      | productName         |
      | Hisense 50A7100FTUK |
      | Hisense 55U8GQTUK   |


  @quantityProduct
  Scenario Outline: Adding Multiple Quantities of a Product to the Cart
    When The user selects "<PRODUCTNAME>" product
    When The user adds <QUANTITY> units of the product to the cart
    And The user adds "<PRODUCTNAME>" to cart
    Then The user should see <QUANTITY> units of "<PRODUCTNAME>" product in the cart

    Examples:
      | PRODUCTNAME         | QUANTITY |
      | Hisense 50A7100FTUK | 10       |
      | Hisense 55U8GQTUK   | 5        |
















