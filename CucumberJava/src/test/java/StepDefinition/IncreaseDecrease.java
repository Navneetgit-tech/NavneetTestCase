package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.IncreaseDecreasePage;

public class IncreaseDecrease {
WebDriver driver;
IncreaseDecreasePage incdec;

@Given("user opens main webpage {string}")
public void user_opens_main_webpage(String url) {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	driver.get(url);
}

@Then("user clicks on add to cart to purchase white TShirt")
public void userClicksOnAddToCartToPurchaseWhiteTShirt() {
    incdec=new IncreaseDecreasePage(driver);
    incdec.whiteTSHirt();
}

@And("user increase quantity of product")
public void userIncreaseQuantityOfProduct() {
    incdec.addProduct();
    incdec.addProduct();
}

@Then("fetch count of product")
public void fetchCountOfProduct() {
    incdec.checkQuantity();
    incdec.Total_Amount();
}

@Then("user decrease quantity of product")
public void userDecreaseQuantityOfProduct() {
    incdec.remove_Product();
    incdec.removed_Quantity();
}

@Then("user clicks Checkout")
public void userClicksCheckout() {
    incdec.checkOut();
}

@Then("user clicks on ok to alert button")
public void userClicksOnOkToAlertButton() {
    incdec.Alert_Handle();
}

}
