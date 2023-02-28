package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class colourVerify {
WebDriver driver;
	@Given("user opens webpage")
	public void user_opens_webpage() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
	   
	}
	String backColor;
	@When("user hovers over Checkout button")
	public void user_hovers_over_checkout_button() throws InterruptedException {
	   //Thread.sleep(2000);
	   WebElement E=driver.findElement(By.className("sc-124al1g-0"));
	   backColor=E.getCssValue("background-color");
	   
	}

	@Then("Chekout button turns into amber colour")
	public void chekout_button_turns_into_amber_colour()   {
		System.out.println(backColor);
		String hexBackColor=Color.fromString(backColor).asHex();
		System.out.println(hexBackColor);
		
		
	}

}
