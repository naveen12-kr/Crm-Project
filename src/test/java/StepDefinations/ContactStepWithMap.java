package StepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactStepWithMap {

	static WebDriver driver;

	@Before
	@Given("user is on login page")
	public void user_is_on_login_page() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://ui.freecrm.com/");

		driver.manage().window().maximize();

	}

	@When("user enter username and password")
	public void user_enter_username_and_password(DataTable table) throws InterruptedException {
		List<Map<String, String>> list = table.asMaps(String.class, String.class);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {

			driver.findElement(By.xpath("//input[@placeholder='E-mail address']"))
					.sendKeys(list.get(i).get("username"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(list.get(i).get("password"));
			Thread.sleep(3000);
		}

	}

	@When("user click on login button")
	public void user_click_on_login_button() {

		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

	}

	@Then("user view a home page")
	public void user_view_a_home_page() throws InterruptedException {

		System.out.println(driver.getTitle());

		Thread.sleep(5000);

	}

	@When("user move to click contact page")
	public void user_move_to_click_contact_page() throws InterruptedException {

		// driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		Thread.sleep(3000);

	}

	@When("user click on new tab")
	public void user_click_on_new_tab() throws InterruptedException {

		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		Thread.sleep(3000);

	}

	@Then("user enter contact detais firstname and lastname and company")
	public void user_enter_contact_detais_firstname_and_lastname_and_company(DataTable contactvalue)
			throws InterruptedException {

		List<Map<String, String>> lstr = contactvalue.asMaps(String.class, String.class);

		System.out.println(lstr.size());

		for (int j = 0; j < lstr.size(); j++) {

			driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(lstr.get(j).get("firstname"));

			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(lstr.get(j).get("lastname"));
			Thread.sleep(3000);

			driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
			Thread.sleep(3000);

			driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
			Thread.sleep(3000);

		}

	}

	@After

	public void teardown() {

		driver.quit();
	}

}