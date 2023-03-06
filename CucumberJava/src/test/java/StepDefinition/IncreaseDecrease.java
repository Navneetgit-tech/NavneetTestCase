package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
public void user_clicks_on_add_to_cart_to_purchase_white_t_shirt() {
    incdec=new IncreaseDecreasePage(driver);
    incdec.whiteTSHirt();
}

@And("user increase quantity of product")
public void user_increase_quantity_of_product() {
    incdec.add_Product();
    incdec.add_Product();
}

@Then("fetch count of product")
public void fetch_count_of_product() {
    incdec.check_Quantity();
    incdec.Total_Amount();
}

@Then("user decrease quantity of product")
public void user_decrease_quantity_of_product() {
    incdec.remove_Product();
    incdec.removed_Quantity();
}

@Then("user clicks Checkout")
public void user_clicks_checkout() {
    incdec.checkOut();
}

@Then("user clicks on ok to alert button")
public void user_clicks_on_ok_to_alert_button() {
    incdec.Alert_Handle();
}
}
