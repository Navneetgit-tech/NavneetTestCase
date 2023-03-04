package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_files.checkout;

public class Checkout {
	WebDriver driver;
	checkout check;
	@Given("user opens webpage")
	public void user_opens_webpage() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
	}
	@When("user clicks on XL Size")
	public void user_clicks_on_xl_size() {
		
		check=new checkout(driver);
		check.XL_Size();
		
	}

	@Then("user Clicks on Add to Cart for the cloth of preference")
	public void user_clicks_on_add_to_cart_for_the_cloth_of_preference() {
	   check.Off_WHite();
	   check.Blue_TShirt();
	}

	@Then("fetch the cost")
	public void fetch_the_cost() {
	    check.Sub_Total();
	}

	@And("Click on Checkout")
	public void click_on_checkout() {
	    check.CheckOut();
	}

	@Then("Click on Ok on the alert button")
	public void click_on_ok_on_the_alert_button() {
	   check.Alert();
	}
}
