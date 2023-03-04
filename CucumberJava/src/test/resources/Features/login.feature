#Commenting
#Author
Feature: feature to test login functionality

	
 
  @StarCount
  Scenario: Check login is successful with valid credentials
    Given user is on web page
    When user clicks on star
    And fills the github login page
    Then user is navigated to the home page
  @Quantity  
  Scenario: Check quantity display matches with available products
  	Given quantity displayed
  	When quantity is same as displayed products
  	Then Product Quantity matches
  @Color	
	Scenario: Check whether Checkout button colour is Amber after hovering on it
		Given user opens webpage
		When user hovers over Checkout button
		Then Chekout button turns into amber colour
	@GitHubLoginVerify
	Scenario: Check if github is taking login credentials through react shopping cart Site
		Given user is on cart site
		When user clicks on star button
		Then user is redirected to login page
		And user enters credential
		Then user is logged into github

  
