package parallel;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
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
		ChromeOptions ops = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nvijayba\\git\\NavneetTestCase\\CucumberJava\\driver1\\chromedriver.exe");
		ops.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get(url);
	}

	@When("user clicks on star button")
	public void userClicksOnStarButton() {
		start1 = new StarCountPage(driver);
		start1.star_click();
//		start1.SIGNIN();
	}
	GithubLoginPage git;
	@Then("user is redirected to login page")
	public void userIsRedirectedToLoginPage() {
		git=new GithubLoginPage(driver);
		git.gitHubUsername();
	}

	@And("user enters credential")
	public void userEntersCredential() {
		
		git.gitHubPassword();
	}

	@Then("user is logged into github")
	public void userIsLoggedIntoGithub() {
	    git.gitHubSignIn();
	}
	
}
