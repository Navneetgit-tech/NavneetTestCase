package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class githubLogin {
	WebDriver driver;
   public githubLogin(WebDriver driver){
	this.driver=driver;
}
   By username=By.xpath("//input[@id=\"login_field\"]");
   By password=By.xpath("//input[@id=\"password\"]");
   By signin=By.xpath("//input[@class=\"btn btn-primary btn-block js-sign-in-button\"]");
   
   public void GitHubLogin() {
	   driver.findElement(username).sendKeys("bandikattenavneet@gmail.com");
	   driver.findElement(password).sendKeys("Spidyn@vb763");
	   driver.findElement(signin).click();
	   //driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
   }
}
