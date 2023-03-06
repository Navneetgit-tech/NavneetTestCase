package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ColorVerifyPage;

public class ColourVerify {
WebDriver driver;
ColorVerifyPage colors;
@Given("user is on Add to cart webpage URL {string}")
	public void user_is_on_Add_to_cart_webpage(String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get(url);
	   
	}
	@When("user hovers over Checkout button")
	public void user_hovers_over_checkout_button(){
		colors=new ColorVerifyPage(driver);
		colors.buttonColor();  
	}

	@Then("Chekout button turns into amber colour")
	public void Chekout_button_turns_into_amber_colour()   {
	
		colors.amberColor();
		
	}

}