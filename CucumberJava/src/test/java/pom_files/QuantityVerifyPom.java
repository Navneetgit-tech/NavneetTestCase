package pom_files;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuantityVerifyPom {
WebDriver driver;
public QuantityVerifyPom(WebDriver driver) {
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
public void Product_count() {
	Number=Prodc.getText();
}
public void Fetch_integer() {
	System.out.println("Product Found "+Number.replaceAll("[^0-9]", ""));
}
List<WebElement> productCount;
public void Cloth_count() {
	productCount=Dispc;
	
}
public void Display_Cloth_count() {
	System.out.println("Number of Image Products found :"+productCount.size());
}

}
