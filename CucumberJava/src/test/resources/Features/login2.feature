Feature: feature to test React Shopping WebSite functionality

	
  @StarCount
  Scenario: Check star rating count increases
    Given user is on web page
    When user clicks on star
    And fills the github login page
    Then fetches star count
    Then user is navigated to the home page
    
  @GitHubLoginVerify
 	Scenario: Check if github is taking login credentials through react shopping cart Site
		Given user is on cart site
		When user clicks on star button
		Then user is redirected to login page
		And user enters credential
		Then user is logged into github
		
  @Quantity  
  Scenario: Check quantity display matches with available products
  	Given quantity displayed
  	Then fetch product count
  	Then Convert String to Integer
  	When quantity is same as displayed products
  	Then Product Quantity matches
  @SsizeQuantity	
	Scenario: Check quantity displayed for Size S matches with available products
		Given Clicks on size S
  	Then fetch product count displayed for size S
  	Then Convert from String to Integer 
  	When quantity equals displayed products
  	Then Product Quantity matches for S Size
  @Color1	
	Scenario: Check whether Checkout button colour is Amber after hovering on it
		Given user is on Add to cart webpage
		When user hovers over Checkout button
		Then Chekout button turns into amber colour
	@XL
	Scenario: Check if product gets purchased for Size XL
		Given user opens webpage
		When user clicks on XL Size
		Then user Clicks on Add to Cart for the cloth of preference
		Then fetch the cost
		And Click on Checkout
		Then Click on Ok on the alert button
	@Inc
	Scenario: Check if product quantity increases and decreases
		Given user opens main webpage
		Then user clicks on add to cart to purchase white TShirt
		And user increase quantity of product
		Then fetch count of product
		Then user decrease quantity of product
		Then fetch count of product
		Then user clicks Checkout
		Then user clicks on ok to alert button
	@FReeSHipping
	Scenario: Check whether Cropped Stay Groovy off white and Skater Black Sweatshirt is eligible for free shipping
	  Given user is on shopping cart
	  Then check if free shipping is displayed for Off White TSHirt
	  Then check if free shipping is diplayed for Skater Black Sweatshirt
	  Then fetch the count of product eligible for fress shipping
				
		
		
		

	
		