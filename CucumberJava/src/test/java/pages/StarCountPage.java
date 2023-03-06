package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class StarCountPage {
	
	WebDriver driver;
	public StarCountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath="//a[@class=\"github-button\"]") 
@CacheLookup
WebElement star1;

@FindBy(xpath="(//a[@href=\"/login?return_to=%2FjeffersonRibeiro%2Freact-shopping-cart\"])[3]")
@CacheLookup
WebElement star2;

@FindBy(how=How.XPATH,using="(//a[@class='Link--muted'])[2]")
@CacheLookup
WebElement starc;

@FindBy(how=How.XPATH,using="//*[@id='repos']/div[2]/nav/a[1]/span")
@CacheLookup
WebElement oldcount;

@FindBy(how=How.XPATH,using="//button/span[@id='repo-stars-counter-star']")
@CacheLookup
WebElement starbutton;

@FindBy(how=How.XPATH,using="//*[@id='repos']/div[2]/nav/a[1]/span")
@CacheLookup
WebElement newcount;

@FindBy(how=How.XPATH,using="//button[@class='rounded-left-2 btn-sm btn BtnGroup-item']")
@CacheLookup
WebElement deselectstar;

@FindBy(how=How.XPATH,using="//div/a[@href=\"/login?return_to=https%3A%2F%2Fgithub.com%2FjeffersonRibeiro%2Freact-shopping-cart\"]")
@CacheLookup
WebElement signin;

public void star_click() {
	star1.click();
	star2.click();
}
public void star_count() {
	starc.click();
}
public void SIGNIN() {
	signin.click();
}
public void old_count() {
	System.out.println("Star Count before giving rating: "+oldcount.getText());
}
public void star_button() {
	starbutton.click();
	

}
public void new_count() {

	System.out.println("Star Count after giving rating: "+newcount.getText());
}
public void de_select_star() {

	deselectstar.click();
}
public void back_to_web_page() {
	
	driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
}

}
