package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutPage;

public class Checkout {
	WebDriver driver;
	CheckoutPage check;
	@Given("user opens webpage URL {string}")
	public void user_opens_webpage(String url) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get(url);
	}
	@When("user clicks on XL Size")
	public void userClicksOnXlSize() {
		
		check=new CheckoutPage(driver);
		check.xlSize();
		
	}

	@Then("user Clicks on Add to Cart for the cloth of preference")
	public void userClicksOnAddToCartForTheClothOfPreference() {
	   check.offWhite();
	   check.blueTShirt();
	}

	@Then("fetch the cost")
	public void fetchTheCost() {
	    check.subTotal();
	}

	@And("Click on Checkout")
	public void clickOnCheckout() {
	    check.checkOut();
	}

	@Then("Click on Ok on the alert button")
	public void clickOnOkOnTheAlertButton() {
	   check.alertButton();
	}
	
}
