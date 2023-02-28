package StepDefinition;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class quantityVerify {
	WebDriver driver;
	@Given("quantity displayed")
	public void quantity_displayed() throws InterruptedException {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
	Thread.sleep(5000);
	//Fetches Product Count Displayed
	String Number=driver.findElement(By.xpath("(//p[text()])[2]")).getText();
	//Fetches Integer number from String
	System.out.println("Product Found "+Number.replaceAll("[^0-9]", ""));
	//Fetches List Count of Products Displayed
	List<WebElement> productCount=driver.findElements(By.xpath("//div[@tabindex=\"1\"]"));
	//Displays Count in Console
	System.out.println("Number of Products found :"+productCount.size());
	}

	@When("quantity is same as displayed products")
	public void quantity_is_same_as_displayed_products() throws InterruptedException {
	//clicks on Size S
    driver.findElement(By.xpath("(//span[@class=\"checkmark\"])[2]")).click();
    Thread.sleep(5000);
    //Fetches Product Count Displayed for size S and stores in variable Number2
    String Number2=driver.findElement(By.xpath("(//p[text()])[2]")).getText();
    System.out.println("Product found "+Number2.replaceAll("[^0-9]", ""));
    List<WebElement> productCount2=driver.findElements(By.xpath("//div[@tabindex=\"1\"]"));
	System.out.println("Number of Products found for Size S :"+productCount2.size());
	
	}

	@Then("Product Quantity matches")
	public void Product_Quantity_matches() {
	    
	}
}
