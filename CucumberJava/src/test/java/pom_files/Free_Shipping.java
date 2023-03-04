package pom_files;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Free_Shipping {
WebDriver driver;
public Free_Shipping(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

By freeship=By.xpath("(//div[@class='sc-124al1g-1 csvtPz'])[1]");
By freeship2=By.xpath("(//div[@class=\"sc-124al1g-1 csvtPz\"])[3]");
@FindBy(xpath="//div[text()='Free shipping']")
@CacheLookup
List<WebElement> fscount;

public void FreeShip() {
	System.out.println("Is Off White T-Shirt eligible for free shipping: "+driver.findElement(freeship).isDisplayed());
	
}
public void FreeShip2() {
	System.out.println("Is Skater Black Sweatshirt eligible for free shipping"+driver.findElement(freeship2).isDisplayed());
}
List<WebElement>freeshippingcount;
public void freeshipcount() {
	freeshippingcount=fscount;
	System.out.println("Number of products eligible for free shipping is: "+freeshippingcount.size());
}
}
