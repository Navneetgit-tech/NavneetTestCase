package pom_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class colorVerify {
WebDriver driver;
public colorVerify(WebDriver driver) {
	this.driver=driver;
//	PageFactory.initElements(driver, this);
}
//@FindBy(how=How.CSS,using="button.sc-124al1g-0")
//WebElement E;
By button=By.cssSelector("button.sc-124al1g-0");
String backColor;
Actions act;
public void buttonColor() {
	act=new Actions(driver);
	WebElement E=driver.findElement(button);
	act.moveToElement(E).perform();
   backColor=E.getCssValue("background-color");
}
public void amberColor() {
	System.out.println(backColor);
	String hexBackColor=Color.fromString(backColor).asHex();
	System.out.println(hexBackColor);
}
}
