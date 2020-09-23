package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AccessControl extends BasePage {

	public static final By byCreateRuleName = findBy("//*[@id=\"id_viewername\"]");
	// public static final String User =
	// driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[2]/td[1]")).getText();

	public static void clickOnreateRuleButton(String data) {
		sleepApplication(3000);
		clickElement(findBy("//input[@value='" + data + "']"), "" + data + " button");

	}

	public static void getUserFromList() {

		String name = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[2]/td[1]")).getText();

		driver.findElement(By.xpath("//li//*[contains(text(), 'Access Control')]")).click();
		sleepApplication(3000);

		driver.findElement(By.xpath("//*[@class=\"SubmitRow add-submit\"]/form/input")).click();
		sleepApplication(2000);

		setText(byCreateRuleName, "Create Rule Name", name);
	}

	public static void getUserFromList1() {

		driver.findElement(By.xpath("//*[@id=\"id_selectedowners\"]")).sendKeys("ramkumardkr@gmail.com");
	}

	public static void setEmail() {

		driver.findElement(By.xpath("//*[@id=\"id_selectedaddrs\"]")).sendKeys("ramkumardkr@gmail.com");
	}

	public static void setInvalidUser() {

		driver.findElement(By.xpath("//*[@id='id_viewername']")).sendKeys("#123*");
	}

	public static void selectTags(String data, int sText) {

		WebElement selectElement = driver.findElement(By.xpath("//*[contains(@name,'" + data + "')]"));
		Select select = new Select(selectElement);
		select.selectByIndex(sText);
	}

	public static void selectMultipleTags(String data, int sText, int Data) {

		WebElement selectElement = driver.findElement(By.xpath("//*[contains(@name,'" + data + "')]"));
		Select select = new Select(selectElement);
		select.selectByIndex(sText);
		select.selectByIndex(Data);
	}

	public static void ClickOnLookUp(String data) {

		driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/form/fieldset/dl[" + data + "]/dd/a")).click();

	}

	public static void ClickOnIcon(String data) {

		driver.findElement(
				By.xpath("//*[@id=\"main\"]/div/div/div/div/table/tbody/tr[2]/td[2]/form[" + data + "]/input[3]"))
				.click();

	}

	public static void ClickOnOk() {

		driver.findElement(By.xpath("//*[@name=\"ok\"]")).click();

	}

	public static void ClickOnCheckBox() {

		driver.findElement(By.xpath("//*[@id=\"id_untag\"]")).click();

	}

	public static void ClickOnDeleteIcon() {

		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/table/tbody/tr[2]/td[4]/form/input[4]")).click();

	}

	public static void Verify() {

		String P = driver.findElement(By.xpath("//*[@id=\"id_selectedowners\"]")).getAttribute("value");
		System.out.println(P);
		Assert.assertEquals(UsersAndGroups.p, P);
		System.out.println("Selected emails is added into Users text field");

	}

}
