package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom_files.githubLogin;
import pom_files.starcount;

public class loginverify {
	public starcount start1;
	WebDriver driver;
	@Given("user is on cart site")
	public void user_is_on_cart_site() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
	}

	@When("user clicks on star button")
	public void user_clicks_on_star_button() {
		start1 = new starcount(driver);
		start1.star_click();
//		start1.SIGNIN();
	}
	githubLogin git;
	@Then("user is redirected to login page")
	public void user_is_redirected_to_login_page() {
		git=new githubLogin(driver);
		git.GitHubUsername();
	}

	@And("user enters credential")
	public void user_enters_credential() {
		
		git.GitHubPassword();
	}

	@Then("user is logged into github")
	public void user_is_logged_into_github() {
	    git.GitHubSignIn();
	}
}
