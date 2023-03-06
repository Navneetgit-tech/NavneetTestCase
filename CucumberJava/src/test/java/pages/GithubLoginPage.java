package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GithubLoginPage {
	WebDriver driver;
   public GithubLoginPage(WebDriver driver){
	this.driver=driver;
}
   By username=By.xpath("//input[@id=\"login_field\"]");
   By password=By.xpath("//input[@id=\"password\"]");
   By signin=By.xpath("//input[@class=\"btn btn-primary btn-block js-sign-in-button\"]");
   
   public void GitHubUsername() {
	   driver.findElement(username).sendKeys("Navneetgit-tech");	   
   }
   public void GitHubPassword() {
	   driver.findElement(password).sendKeys("Spidyn@vb763");
   }
   public void GitHubSignIn() {
	   driver.findElement(signin).click();
   }
}
