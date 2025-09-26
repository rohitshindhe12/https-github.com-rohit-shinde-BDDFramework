Feature:  Validate the login functionality

Scenario: Validate login page

Given Enter the URL
And Click on sign inbutton
Then Enter the user name and password
When Click on login button
Then Select the type as fish
And Select the fish as tiger shark
Then Click on Add to cart
And take the quantity as 10
Then Click on update cart
When Click on Checkout
And After checkout select the card type
