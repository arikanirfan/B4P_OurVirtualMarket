Feature: Add To Cart Functionality

  @addToCart
  Scenario: Add To Cart
    Given User already logged in with "miaa@gmail.com" and "123456"
    When The user search "hisense"
    Then Verify that the user is able to see product name as "hisense"
    When The user adds "Hisense 50A7GQTUK" to cart
    Then Verify that "Hisense 50A7GQTUK" has been added to cart


  @productDetails
  Scenario: Product Details and Add To Cart Button
    Given User already logged in with "miaa@gmail.com" and "123456"
    When The user search "hisense"
    When The user selects "Hisense 75A7GQTUK" product
    Then Verify that there is "Hisense 75A7GQTUK" name, "$491.00" price and add to cart button


  @multipleProduct
  Scenario: User Can Add Multiple Products To The Cart
    Given User already logged in with "miaa@gmail.com" and "123456"
    When The user search "hisense"
    When The user adds "Hisense 50A7100FTUK" to cart
    When The user navigates to back page
    And The user adds "Hisense 55U8GQTUK" to cart
    Then Verify that "Hisense 50A7100FTUK" has been added to cart
    Then Verify that "Hisense 55U8GQTUK" has been added to cart

  @wip
  Scenario Outline: User Can Add Multiple Products To The Cart
    Given User already logged in with "miaa@gmail.com" and "123456"
    When The user search "hisense"
    When The user adds "<productName>" to cart
    Then Verify that "<productName>" has been added to cart
    Examples:
      | productName         |
      | Hisense 50A7100FTUK |
      | Hisense 55U8GQTUK   |


  @quantityProduct
  Scenario Outline: Adding Multiple Quantities of a Product to the Cart
    Given User already logged in with "miaa@gmail.com" and "123456"
    When The user search "hisense"
    When The user selects "<PRODUCTNAME>" product
    When The user adds "<QUANTITY>" units of the product to the cart
    Then The user should see successfully added "<MESSAGE>"
    Examples:
      | PRODUCTNAME         | QUANTITY | MESSAGE                                   |
      | Hisense 50A7100FTUK | 10       | Added to cart successfully. What is next? |
      | Hisense 55U8GQTUK   | 5        | Added to cart successfully. What is next? |


    @withoutLogin
  Scenario: Add To Cart Without Login
    Given The user is on the our virtual market page
    When The user search "hisense"
    And The user adds "Hisense 55U8GQTUK" to cart
    Then Verify that "Hisense 55U8GQTUK" has been added to cart













