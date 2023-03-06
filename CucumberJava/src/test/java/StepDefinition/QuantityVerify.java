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
import pages.QuantityVerifyPage;

public class QuantityVerify {
	WebDriver driver;
	public QuantityVerifyPage qv;
	@Given("quantity displayed on {string} webpage")
	public void quantity_displayed(String url){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get(url);

	}
	@Then("fetch product count")
	public void fetch_product_count() {

		//Fetches Product Count Displayed
		qv=new QuantityVerifyPage(driver);
		qv.Product_count();

	}
	@Then ("Convert String to Integer")
	public void Convert_String_to_Integer() {

		//Fetches Integer number from String
		qv.Fetch_integer();
	}
	@When("quantity is same as displayed products")
	public void quantity_is_same_as_displayed_products() {
		//Fetches List Count of Products Displayed
		qv.Cloth_count();
		qv.Display_Cloth_count();

	}
	@Then("Product Quantity matches")
	public void Product_Quantity_matches() {

	}
}
