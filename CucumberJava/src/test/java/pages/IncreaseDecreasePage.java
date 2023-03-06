package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IncreaseDecreasePage {
WebDriver driver;
public IncreaseDecreasePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);	

}
By White_TShirt=By.xpath("(//button[text()='Add to cart'])[2]");
By Add=By.xpath("//button[text()='+']");
By Remove=By.xpath("//button[text()='-']");
By quantity=By.xpath("//p[text()='Quantity: ']");
By total_Amount=By.xpath("//p[@class='sc-1h98xa9-9 jzywDV']");
By Check_out=By.xpath("//button[text()='Checkout']");


public void whiteTSHirt() {
	driver.findElement(White_TShirt).click();
}
public void add_Product() {
	driver.findElement(Add).click();
}
public void check_Quantity() {
	System.out.println("Quantity after clicking add: "+driver.findElement(quantity).getText());
}
public void Total_Amount() {
	System.out.println("Cost of product"+driver.findElement(total_Amount).getText());
}
public void remove_Product() {
	driver.findElement(Remove).click();
}
public void removed_Quantity() {
	System.out.println("Quantity after clicking remove: "+driver.findElement(quantity).getText());
}
public void checkOut() {
	driver.findElement(Check_out).click();
}
public void Alert_Handle() {
	driver.switchTo().alert().accept();
}
}
