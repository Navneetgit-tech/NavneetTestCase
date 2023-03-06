package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GithubLoginPage;
import pages.StarCountPage;

public class StarCount {
	public StarCountPage start;

	WebDriver driver;
	@Given("user is on web page {string}")
	public void user_is_on_login_page(String url) {
		System.out.println("Inside Step - user is on login page");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.get(url);
	}

	@When("user clicks on star")
	public void user_enters_username_and_password() {
		start = new StarCountPage(driver);
		start.star_click();

	}

	@And("fills the github login page")
	public void clicks_on_login_button()  {
		System.out.println("Inside Step - User is clicking on login button");

		GithubLoginPage git=new GithubLoginPage(driver);
		git.GitHubUsername();
		git.GitHubPassword();
		git.GitHubSignIn();
	}
	@Then("fetches star count")
	public void fetches_star_count() throws InterruptedException{
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));

		start.star_count();//navigate to star count

		start.old_count();//fetches star count before clicking star

		start.star_button();//clicks star button

		w.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='repos']/div[2]/nav/a[1]/span"))));

		driver.navigate().refresh();//refreshes page


		start.new_count();//fetches count of star after clicking star

		start.de_select_star();//de-selects star button


	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		start.back_to_web_page();
	}
}
