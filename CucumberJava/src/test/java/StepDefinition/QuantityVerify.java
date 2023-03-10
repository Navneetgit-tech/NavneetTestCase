package StepDefinition;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
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
	@SuppressWarnings("deprecation")
	@Then("fetch product count")
	public void fetchProductCount() {
		String pro="16 Product(s) found";
		//Fetches Product Count Displayed
		qv=new QuantityVerifyPage(driver);
		qv.productCount();
		Assert.assertEquals(pro, qv.productCountAssert());

	}
	@Then ("Convert String to Integer")
	public void convertStringToInteger() {

		//Fetches Integer number from String
		qv.fetchInteger();
	}
	@When("quantity is same as displayed products")
	public void quantityIsSameAsDisplayedProducts() {
		//Fetches List Count of Products Displayed
		qv.clothCount();
		qv.displayClothCount();

	}
	@SuppressWarnings("deprecation")
	@Then("Product Quantity matches {string}")
	public void Product_Quantity_matches(String n) {
		Assert.assertEquals(n, qv.displayClothCountAssert());
	}
	
}
