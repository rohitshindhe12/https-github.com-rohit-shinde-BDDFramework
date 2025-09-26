package StepDefination;

import org.openqa.selenium.WebDriver;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	LoginPage lg; 
	@Given("Enter the URL")
	public void enter_the_url() {
		driver = Hooks.driver;
		lg = new LoginPage(driver);
		lg.browse("https://jpetstore.aspectran.com/");

	}
	@Given("Click on sign inbutton")
	public void click_on_sign_inbutton() {
	lg.signup();
	  
	}

	@Then("Enter the user name and password")
	public void enter_the_user_name_and_password() {
	  lg.Username();
	  lg.password();
	}

	@When("Click on login button")
	public void click_on_login_button() {
	   lg.login();
	}
	@Then("Select the type as fish")
	public void select_the_type_as_fish() throws InterruptedException {
	   lg.Fishoption();
	   Thread.sleep(2000);
	}
	@And("Select the fish as tiger shark")
	public void select_the_fish_as_tiger_shark() throws InterruptedException {
	   lg.fishtype();
	   Thread.sleep(2000);
	}

	@Then("Click on Add to cart")
	public void click_on_add_to_cart() {
	  lg.Addcart();
	}

	@And("take the quantity as {int}")
	public void take_the_quantity_as(Integer int1 ) {
		lg.quantiy();
	  
	}

	@Then("Click on update cart")
	public void click_on_update_cart() {
	    lg.update();
	}
	@When("Click on Checkout")
	public void click_on_checkout() {
	    lg.checkout();
	}
	@And("After checkout select the card type")
	public void after_checkout_select_the_card_type() {
	    lg.cardtype();
	}




}
