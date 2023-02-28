#Commenting
#Author
Feature: feature to test login functionality
 
  @Test1
  Scenario: Check login is successful with valid credentials
    Given user is on web page
    When user clicks on star
    And fills the github login page
    Then user is navigated to the home page
  @Test2and3  
  Scenario: Check quantity display matches with available products
  	Given quantity displayed
  	When quantity is same as displayed products
  	Then Product Quantity matches
  @Test4	
	Scenario: Check whether Checkout button colour is Amber after hovering on it
		Given user opens webpage
		When user hovers over Checkout button
		Then Chekout button turns into amber colour

  
