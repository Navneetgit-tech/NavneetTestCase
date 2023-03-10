package StepDefinition;

import java.time.Duration;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
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
	public void userHoversOverCheckoutButton(){
		colors=new ColorVerifyPage(driver);
		colors.buttonColor();  
	}

	@SuppressWarnings("deprecation")
	@Then("Chekout button turns into amber colour")
	public void chekoutButtonTurnsIntoAmberColour()   {
		String actual="rgba(218, 179, 2, 1)";
		colors.amberColor();
		Assert.assertEquals(actual, colors.amberColorAssert());
	}
	@After(order=1)
	public void takeScreenshotOnFailure(io.cucumber.java.Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] src=ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src,"image/png","embedded1");
			
		}
	}
	@After(order=0)
	public void tearDown() {
	}

}
