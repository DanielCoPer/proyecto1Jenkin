package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;

public class ThenLogin {

	WebDriver driver = GivenLogin.driver;
	
	@Then("User should be in profile page")
	public void user_should_be_in_profile_page() {
		Assert.assertEquals(driver.getCurrentUrl(),"http://automationpractice.com/index.php?controller=my-account", "Error");
		driver.quit();
	}
	
	@Then("User get a message notifying that credentials are wrong and user is not able to log in")
	public void user_get_a_message_notifying_that_credentials_are_wrong_and_user_is_not_able_to_log_in() {
	    Assert.assertEquals(true, driver.findElement(By.xpath("//div[@class = 'alert alert-danger']")).isDisplayed());
		driver.quit();
	}
	
	@Then("User get a message notifying about required information")
	public void user_ges_a_message_notifying_about_required_information() {
		Assert.assertEquals(true, driver.findElement(By.xpath("//div[@class = 'alert alert-danger']")).isDisplayed());
		driver.quit();
	}
}
