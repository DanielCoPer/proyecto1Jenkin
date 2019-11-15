package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.When;

public class WhenLogin {
	
	WebDriver driver = GivenLogin.driver;
	
	@When("User enter valid email address {string}")
	public void user_enter_valid_email_address(String email) {
	  driver.findElement(By.id("email")).sendKeys(email);;
	}

	@When("User enter valid password {string}")
	public void user_enter_valid_password(String password) {
	   driver.findElement(By.id("passwd")).sendKeys(password);;
	}

	@When("User click sign in button")
	public void user_click_sign_in_button() {
	    driver.findElement(By.id("SubmitLogin")).click();
	}

	@When("User enter invalid password {string}")
	public void user_enter_invalid_password(String inpass) {
	    driver.findElement(By.id("passwd")).sendKeys(inpass);
	}

	@When("User click Sign in button without enter information")
	public void user_click_Sign_in_button_without_enter_information() {
	    driver.findElement(By.id("SubmitLogin")).click();
	}
}
