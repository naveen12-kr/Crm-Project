package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SystemSettings extends BasePage {
	
	public static final By bySetTimeManually = findBy("//*[@id='id_method_0']");
	public static final By bySynchronizeWithNTPServer = findBy("//*[@id='id_method_1']");
	
	
	
	
	public static void selectDefaultCharset(String data) throws InterruptedException
	{
		WebElement mb = driver.findElement(By.xpath("//*[@id='id_charset']"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println(data + " is selected");
		}

	public static void selectDefaultLanguage(String data) throws InterruptedException
	{
		WebElement mb = driver.findElement(By.xpath("//*[@id='id_language']"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println(data + " is selected");
		}
	
	public static void selectTimeZone(String data) throws InterruptedException
	{
		WebElement mb = driver.findElement(By.xpath("//*[@id='id_timezone']"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println(data + " is selected");
		}
	
	public static void selectPreselectedNTPServers(String data) throws InterruptedException
	{
		WebElement mb = driver.findElement(By.xpath("//*[@id='id_ntppreselects']"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println(data + " is selected");
		}
	
	/************************************* CLICKERS 
	 * @throws InterruptedException ***************************************/
	
	public static void clickOnSetTimeManually() throws InterruptedException {
		
		clickElement(bySetTimeManually, "Set Time Manually");
		
	}
	
	public static void clickOnSynchrinizeWithNTPServer() throws InterruptedException {
		
		clickElement(bySynchronizeWithNTPServer, "Synchronize With NTP Server");
		
		Thread.sleep(2000);
		
	}
	
	public static void getDateAndTime() {
		
		String dateTime = driver.findElement(By.xpath("//*[@id='id_datetime']")).getAttribute("placeholder");
		System.out.println("Current time: "+dateTime+" is displayed");
	}
	
	public static void getMessage() {
		
		String success = driver.findElement(By.xpath("//*[@id='main']/div[1]")).getText();
		System.out.println(success);
		
	}
	
	public static void getListOfNTPServers() {
		
		String NTPServers = driver.findElement(By.xpath("//*[@id='id_ntpservers']")).getAttribute("name");
		System.out.println("List of NTP Servers: "+NTPServers);
	}


}
