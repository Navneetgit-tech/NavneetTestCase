package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import pages.FreeShippingPage;

public class FreeShipping {
	WebDriver driver;
	FreeShippingPage fs;
	String t1="Free shipping";
	@Given("user is on shopping cart URL {string}")
	public void user_is_on_shopping_cart(String url) {
		ChromeOptions ops = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nvijayba\\git\\NavneetTestCase\\CucumberJava\\driver1\\chromedriver.exe");
		ops.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get(url);
	}

	@SuppressWarnings("deprecation")
	@Then("check if free shipping is displayed for Off White TSHirt")
	public void checkIfFreeShippingIsDisplayedForTheProduct() {
		
		fs=new FreeShippingPage(driver);
	    fs.FreeShip();
	    fs.freeShipAssert();
	    Assert.assertEquals(t1, fs.freeShipAssert());
	}
//	@SuppressWarnings("deprecation")
	@SuppressWarnings("deprecation")
	@Then("check if free shipping is diplayed for Skater Black Sweatshirt")
	public void checkIfFreeShippingIsDiplayedForSkaterBlackSweatshirt() {
		fs.FreeShip2();
		Assert.assertFalse(fs.freeShip2Assert(), false);;
		
	}

	@SuppressWarnings("deprecation")
	@Then("fetch the count of product eligible for free shipping")
	public void fetchTheCountOfProductEligibleForFreeShipping() {
	    int c=13;
		fs.freeshipcount();
	    Assert.assertEquals("count matches with the expected",c,fs.freeShipCountAssert() );
	}
	
}
