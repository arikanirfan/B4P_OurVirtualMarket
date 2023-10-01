Feature: Billing Details Checks

 Background:
  Given User already logged in with "nilda3@hotmail.com" and "12345"
  And The user search "hisense"
  And The user adds "Hisense 50A7GQTUK" to cart
  When The user navigates to Shopping Cart page
  And The user clicks on the CHECKOUT button


  Scenario: Positive Billing Details Menu
  When If the user sees the form,fills it out with "Nilda","ARSLAN","Krafttech","Adalet Mah.no2 Bayraklı","mansuroğlu Mah.no2 Bayraklı","İzmir","35040","Turkey","İzmir";if not,chooses existing address
  When The user taps on CONTINUE button
  Then The user should be able to see "Step 3: Delivery Details" menu

 @billingDtls
  Scenario Outline: Negative Billing Details Menu
   When If the user sees the form,fills it out with "<First Name>","<Last Name>","<Company>","<Address 1>","<Address 2>","<City>","<Post Code>","<Country>","<Region / State>";if not,chooses new address
   When The user taps on CONTINUE button
   Then The user should be able to see "<warning message>"
   Examples:
    | First Name | Last Name | Company  | Address 1          | Address 2         | City  | Post Code | Country | Region / State | warning message                                 |
    |            | Arslan    | Kraftech | Manolya sok. İzmir | Sakarya Cad.İzmir | İzmir | 35040     | Turkey  | İzmir          | First Name must be between 1 and 32 characters! |
    | Nilda      |           | Kraftech | Manolya sok. İzmir | Sakarya Cad.İzmir | İzmir | 35040     | Turkey  | İzmir          | Last Name must be between 1 and 32 characters!  |
    | Nilda      | Arslan    | Kraftech |                    | Sakarya Cad.İzmir | İzmir | 35040     | Turkey  | İzmir          | Address 1 must be between 3 and 128 characters! |
    | Nilda      | Arslan    | Kraftech | Manolya sok. İzmir | Sakarya Cad.İzmir |       | 35040     | Turkey  | İzmir          | City must be between 2 and 128 characters!      |
