package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class GivenLogin {

	public static WebDriver driver;

	
	@Given("User open the browser")
	public void user_open_the_browser() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\academia\\Desktop\\pruebasSG\\AcademyBC\\src\\test\\resources\\drivers\\chromedriver.exe");
	   driver = new ChromeDriver();
	   
	}

	@Given("User navigate to the following page {string}")
	public void user_navigate_to_the_following_page_http_automationpractice_com_index_php(String mainPage) {
		driver.get(mainPage);
		driver.findElement(By.className("login")).click();
	}

	@Given("User click on Sign in")
	public void user_click_on_Sign_in() {
		driver.findElement(By.className("login")).click();
	}
}