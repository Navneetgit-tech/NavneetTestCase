package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StarCount {


WebDriver driver;
	@Given("user is on web page")
	public void user_is_on_login_page() {
		System.out.println("Inside Step - user is on login page");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
	}

	@When("user clicks on star")
	public void user_enters_username_and_password() {
		driver.findElement(By.xpath("//a[@class=\"github-button\"]")).click();
		driver.findElement(By.xpath("(//a[@href=\"/login?return_to=%2FjeffersonRibeiro%2Freact-shopping-cart\"])[3]")).click();
	}

	@And("fills the github login page")
	public void clicks_on_login_button() throws InterruptedException {
		System.out.println("Inside Step - User is clicking on login button");
		//System.out.println("Previous Star Count is"+driver.findElement(By.xpath("(//span[@title=\"2,179\"])[1]")).getTagName());

		githubLogin git=new githubLogin(driver);
		git.GitHubLogin();
	
		//navigate to star count
		driver.findElement(By.xpath("(//a[@class=\"Link--muted\"])[2]")).click();

		//fetches star count before clicking star
		System.out.println("Star Count was "+driver.findElement(By.xpath("//*[@id=\"repos\"]/div[2]/nav/a[1]/span")).getText());
	
		//clicks star button
		driver.findElement(By.xpath("//button/span[@id=\"repo-stars-counter-star\"]")).click();
		Thread.sleep(1000);
		
		//refreshes page
		driver.navigate().refresh();
		
		//fetches count of star after clicking star
		Thread.sleep(1000);
		//WebElement starResult=new Web
		System.out.println("Star Count is "+driver.findElement(By.xpath("//*[@id=\"repos\"]/div[2]/nav/a[1]/span")).getText());
		driver.findElement(By.xpath("//button[@class=\"rounded-left-2 btn-sm btn BtnGroup-item\"]")).click();

		
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step - User is navigated to home page");
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
	}
}
