package pom_files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class checkout {
WebDriver driver;
public checkout(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);	
}
By Xlsize=By.xpath("//span[text()='XL']");
By Off_white=By.xpath("(//button[text()='Add to cart'])[1]");
By blue_tshirt=By.xpath("(//button[text()='Add to cart'])[3]");
By cart=By.xpath("//div[@class='sc-1h98xa9-2 fGgnoG']");
By subTotal=By.xpath("//p[@class='sc-1h98xa9-9 jzywDV']");
By checkout=By.xpath("//button[text()='Checkout']");
public void XL_Size() {
	driver.findElement(Xlsize).click();
}
public void Off_WHite() {
	driver.findElement(Off_white).click();
}
public void Blue_TShirt() {
	driver.findElement(blue_tshirt).click();
}
public void Sub_Total() {
	System.out.println("SubTotal: "+driver.findElement(subTotal).getText());
}
public void CheckOut() {
	driver.findElement(checkout).click();
}
public void Alert() {
	driver.switchTo().alert().accept();
}

}
