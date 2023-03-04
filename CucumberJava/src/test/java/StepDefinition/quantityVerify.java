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
import pom_files.QuantityVerifyPom;

public class quantityVerify {
	WebDriver driver;
	WebDriverWait wait;
	public QuantityVerifyPom qv;
	@Given("quantity displayed")
	public void quantity_displayed(){
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
	
	}
	@Then("fetch product count")
	public void fetch_product_count() {
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//main[@class='sc-ebmerl-4 iliWeY']/p[text()='16']")));
		//Fetches Product Count Displayed
		qv=new QuantityVerifyPom(driver);
		qv.Product_count();
//		String Number=driver.findElement(By.xpath("(//p[text()])[2]")).getText();
		
	}
	@Then ("Convert String to Integer")
	public void Convert_String_to_Integer() {
		
	//Fetches Integer number from String
		qv.Fetch_integer();
//	System.out.println("Product Found "+Number.replaceAll("[^0-9]", ""));
	}
	@When("quantity is same as displayed products")
	public void quantity_is_same_as_displayed_products() {
	//Fetches List Count of Products Displayed
		qv.Cloth_count();
		qv.Display_Cloth_count();
//	List<WebElement> productCount=driver.findElements(By.xpath("//div[@tabindex=\"1\"]"));
//	//Displays Count in Console
//	System.out.println("Number of Products found :"+productCount.size());
	}

	

	@Then("Product Quantity matches")
	public void Product_Quantity_matches() {
	    
	}
}
