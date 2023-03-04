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
import pom_files.sSizeQuantity;

public class SizeSquanity {
	WebDriver driver;
	WebDriverWait waits;
	sSizeQuantity ssq;
	@Given("Clicks on size S")
	public void clicks_on_size_s() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
		//clicks on Size S
		ssq=new sSizeQuantity(driver);
		ssq.click_S_Size();
//	    driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();
		Thread.sleep(5000);

		
	}
	String Number2;
	@Then("fetch product count displayed for size S")
	public void fetch_product_count_displayed_for_size_s() {
		waits=new WebDriverWait(driver,Duration.ofSeconds(5));
		waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//main[@class='sc-ebmerl-4 iliWeY']/p[text()='2']")));
		ssq.product_COunt();;
//		Number2=driver.findElement(By.xpath("(//p[text()])[2]")).getText();
	}

	@Then("Convert from String to Integer")
	public void convert_from_string_to_integer() {
		 ssq.convert_To_String();
//		 System.out.println("Product found "+Number2.replaceAll("[^0-9]", ""));
	}

	@When("quantity equals displayed products")
	public void quantity_equals_displayed_products() {
		ssq.displayed_Product();
		ssq.displayed_Product_Count();
//		List<WebElement> productCount2=driver.findElements(By.xpath("//div[@tabindex=\"1\"]"));
//		System.out.println("Number of Image Products found for Size S :"+productCount2.size());
	}

	@Then("Product Quantity matches for S Size")
	public void product_quantity_matches_for_s_size() {
	    
	}
}
