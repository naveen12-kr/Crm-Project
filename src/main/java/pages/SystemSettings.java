package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SystemSettings extends BasePage {

	public static final By bySetTimeManually = findBy("//*[@id='id_method_0']");
	public static final By bySynchronizeWithNTPServer = findBy("//*[@id='id_method_1']");

	public static void selectDefaultCharset(String data) throws InterruptedException {
		WebElement mb = driver.findElement(By.xpath("//*[@id='id_charset']"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println("INFO: " + data + " is selected");
	}

	public static void selectDefaultLanguage(String data) throws InterruptedException {
		WebElement mb = driver.findElement(By.xpath("//*[@id='id_language']"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println("INFO: " + data + " is selected");
	}

	public static void selectTimeZone(String data) throws InterruptedException {
		WebElement mb = driver.findElement(By.xpath("//*[@id='id_timezone']"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println("INFO: " + data + " is selected");
	}

	public static void selectPreselectedNTPServers(String data) throws InterruptedException {
		WebElement mb = driver.findElement(By.xpath("//*[@id='id_ntppreselects']"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println("INFO: " + data + " is selected");
	}

	/*************************************
	 * CLICKERS
	 * 
	 * @throws InterruptedException
	 ***************************************/

	public static void clickOnSetTimeManually() throws InterruptedException {

		clickElement(bySetTimeManually, "Set Time Manually");

	}

	public static void clickOnSynchrinizeWithNTPServer() throws InterruptedException {

		clickElement(bySynchronizeWithNTPServer, "Synchronize With NTP Server");

		Thread.sleep(2000);

	}

	public static void getDateAndTime() {

		String dateTime = driver.findElement(By.xpath("//*[@id='id_datetime']")).getAttribute("placeholder");
		System.out.println("INFO: Current time: " + dateTime + " is displayed");
	}

	public static void setDateAndTime(String data) throws InterruptedException {
		String date = getText(findBy("//*[@id='current-time']"), "Current time");
		String[] edate = date.split("UTC");
		driver.findElement(By.xpath("//*[@id='id_datetime']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='id_datetime']")).sendKeys(edate[0]);
	}

	public static void getMessage() throws InterruptedException {
		Thread.sleep(3000);
		//String success = driver.findElement(By.xpath("//*[@id='main']/div[1]/div")).getText();
		String success = driver.findElement(By.xpath("(//*[@class='x_remove_status'])[1]")).getText();
		// Assert.assertTrue(success.contains("System Settings"));
	}

	public static void isInvalidMessageDisplayed(String data) {

		String success = driver.findElement(By.xpath("//*[@id='main']/div[1]")).getText();
		Assert.assertTrue(success.contains(data));
	}

	public static void getListOfNTPServers() {

		String NTPServers = driver.findElement(By.xpath("//*[@id='id_ntpservers']")).getAttribute("name");
		System.out.println("INFO: List of NTP Servers: " + NTPServers);
	}

}
