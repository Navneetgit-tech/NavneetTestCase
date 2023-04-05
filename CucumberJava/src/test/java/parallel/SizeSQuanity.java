package parallel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.SizeSQuantityPage;

public class SizeSQuanity {
	WebDriver driver;
	WebDriverWait waits;
	SizeSQuantityPage ssq;
	@Given("Clicks on size S displayed on {string} webpage")
	public void clicks_on_size_s(String url){
		ChromeOptions ops = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nvijayba\\git\\NavneetTestCase\\CucumberJava\\driver1\\chromedriver.exe");
		ops.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get(url);
		//clicks on Size S
		ssq=new SizeSQuantityPage(driver);
		ssq.clickSSize();	
	}
	String Number2;
	@SuppressWarnings("deprecation")
	@Then("fetch product count displayed for size S")
	public void fetchProductCountDisplayedForSizeS() {

		ssq.productCount();
		String co="2 Product(s) found";
		Assert.assertEquals(co, ssq.productCountAssert());;
	}

	@Then("Convert from String to Integer")
	public void convertFromStringToInteger() {
		 ssq.convertToString();
	}

	@When("quantity equals displayed products")
	public void quantityEqualsDisplayedProducts() {
		ssq.displayedProduct();
		ssq.displayedProductCount();
	}

	@SuppressWarnings("deprecation")
	@Then("Product Quantity matches for S Size")
	public void productQuantityMatchesForSSize() {
	    int n1=2;
	    Assert.assertEquals(n1, ssq.displayedProductCountAssert());
	}
	
}
