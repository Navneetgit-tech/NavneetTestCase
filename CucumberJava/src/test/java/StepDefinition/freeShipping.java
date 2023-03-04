package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pom_files.Free_Shipping;

public class freeShipping {
	WebDriver driver;
	Free_Shipping fs;
	@Given("user is on shopping cart")
	public void user_is_on_shopping_cart() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
	}

	@Then("check if free shipping is displayed for Off White TSHirt")
	public void check_if_free_shipping_is_displayed_for_the_product() {
		fs=new Free_Shipping(driver);
	    fs.FreeShip();
	}
	@Then("check if free shipping is diplayed for Skater Black Sweatshirt")
	public void check_if_free_shipping_is_diplayed_for_Skater_Black_Sweatshirt() {
		fs.FreeShip2();
	}

	@Then("fetch the count of product eligible for fress shipping")
	public void fetch_the_count_of_product_eligible_for_fress_shipping() {
	    fs.freeshipcount();
	}
}
