package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GithubLoginPage;
import pages.StarCountPage;

public class LoginVerify {
	public StarCountPage start1;
	WebDriver driver;
	@Given("user is on cart site {string}")
	public void user_is_on_cart_site(String url) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get(url);
	}

	@When("user clicks on star button")
	public void user_clicks_on_star_button() {
		start1 = new StarCountPage(driver);
		start1.star_click();
//		start1.SIGNIN();
	}
	GithubLoginPage git;
	@Then("user is redirected to login page")
	public void user_is_redirected_to_login_page() {
		git=new GithubLoginPage(driver);
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
