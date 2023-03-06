package StepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SizeSQuantityPage;

public class SizeSQuanity {
	WebDriver driver;
	WebDriverWait waits;
	SizeSQuantityPage ssq;
	@Given("Clicks on size S displayed on {string} webpage")
	public void clicks_on_size_s(String url){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get(url);
		//clicks on Size S
		ssq=new SizeSQuantityPage(driver);
		ssq.click_S_Size();	
	}
	String Number2;
	@Then("fetch product count displayed for size S")
	public void fetch_product_count_displayed_for_size_s() {

		ssq.product_COunt();;
	}

	@Then("Convert from String to Integer")
	public void convert_from_string_to_integer() {
		 ssq.convert_To_String();
	}

	@When("quantity equals displayed products")
	public void quantity_equals_displayed_products() {
		ssq.displayed_Product();
		ssq.displayed_Product_Count();
	}

	@Then("Product Quantity matches for S Size")
	public void product_quantity_matches_for_s_size() {
	    
	}
}
