package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuantityVerifyPage {
WebDriver driver;
WebDriverWait wait;
public QuantityVerifyPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="(//p[text()])[2]")
@CacheLookup
WebElement Prodc;

@FindBy(xpath="//div[@tabindex='1']")
@CacheLookup
List<WebElement> Dispc;

String Number;
public void productCount() {
	wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//main[@class='sc-ebmerl-4 iliWeY']/p[text()='16']")));
	Number=Prodc.getText();
}
public void fetchInteger() {
	System.out.println("Product Found "+Number.replaceAll("[^0-9]", ""));
}
List<WebElement> productCount;
public void clothCount() {
	productCount=Dispc;
	
}
public void displayClothCount() {
	System.out.println("Number of Image Products found :"+productCount.size());
}
public String productCountAssert() {
		return Number;
}
public String displayClothCountAssert() {
	return Integer.toString(productCount.size())   ;
}


}
