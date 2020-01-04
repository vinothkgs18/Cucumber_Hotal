Feature: to validate the login functionality
Scenario Outline: to verify the valid crediantials

Given user in lelong home page
When user has enter the "<productName>"
Then User has navigate to product details page
 Examples:
  |productName|
  |Samsung Mobile|
  |Apple Phone|
  |samsung TV|
  |Philps Trimmer|
  |HP Lattop|
  |Acer Laptop|
  |Sony TV|
  |DSLR Camera|
  |Vivo mobile|
 		
