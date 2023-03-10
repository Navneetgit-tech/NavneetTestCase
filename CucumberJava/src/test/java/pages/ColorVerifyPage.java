package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ColorVerifyPage {
WebDriver driver;
public ColorVerifyPage(WebDriver driver) {
	this.driver=driver;
}

By button=By.cssSelector("button.sc-124al1g-0");
String backColor;
Actions act;
public void buttonColor() {
	act=new Actions(driver);
	WebElement E=driver.findElement(button);
	act.moveToElement(E).perform();
   backColor=E.getCssValue("background-color");
   
}
String hexBackColor;
public void amberColor() {
	System.out.println(backColor);
	hexBackColor=Color.fromString(backColor).asHex();
	System.out.println(hexBackColor);
}
public String amberColorAssert() {
	return backColor;
}

}
