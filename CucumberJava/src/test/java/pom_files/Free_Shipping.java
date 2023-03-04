package pom_files;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class Free_Shipping {
WebDriver driver;
public Free_Shipping(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

By freeship=By.xpath("(//div[@class=\"sc-124al1g-3 bHJSNa\"])");

By freeship2=By.xpath("(//div[@class='sc-124al1g-1 csvtPz'])[3]");
@FindBy(xpath="//div[text()='Free shipping']")
@CacheLookup
List<WebElement> fscount;
String t1="Free shipping";
@SuppressWarnings("deprecation")
public void FreeShip() {
	String fs1=driver.findElement(freeship).getText();
	System.out.println(fs1);
	Assert.assertEquals(t1, fs1);
	System.out.println("Is Cropped Stay Groovy off white T-Shirt eligibible for free shipping: "+fs1.equalsIgnoreCase(t1));
	
}
public void FreeShip2() {
	String fs2=driver.findElement(freeship2).getText();
	//Assert.assertEquals(t1, fs2);
	System.out.println("Is Skater Black Sweatshirt eligible for free shipping: "+fs2.equalsIgnoreCase(t1));
}
List<WebElement>freeshippingcount;
public void freeshipcount() {
	freeshippingcount=fscount;
	System.out.println("Number of products eligible for free shipping is: "+freeshippingcount.size());
}
}
