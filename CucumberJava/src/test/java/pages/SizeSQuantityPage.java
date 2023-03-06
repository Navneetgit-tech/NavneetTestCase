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

public class SizeSQuantityPage {
WebDriver driver;
public SizeSQuantityPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);

}
By S_Size=By.xpath("(//span[@class='checkmark'])[2]");
By P_Count=By.xpath("(//p[text()])[2]");
@FindBy(xpath="//div[@tabindex='1']")
@CacheLookup
List<WebElement> P_Disp;
@FindBy(xpath="//main[@class='sc-ebmerl-4 iliWeY']/p[text()='2']")
@CacheLookup
WebElement ProdCount;



String Number2;
public void click_S_Size() {
	driver.findElement(S_Size).click();;
}
public void product_COunt() {
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfAllElements(ProdCount));
	
	Number2=driver.findElement(P_Count).getText();
}
public void convert_To_String() {
	System.out.println("Product found "+Number2.replaceAll("[^0-9]", ""));
}
List<WebElement> productCount2;
public void displayed_Product() {
	productCount2=P_Disp;

}
public void  displayed_Product_Count() {
	System.out.println("Number of Image Products found for Size S :"+productCount2.size());

}
}