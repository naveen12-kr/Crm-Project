package com.intradyn.EmailArchive;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.TeletextBasePage;

import java.net.URL;

public class BrowserStack extends TeletextBasePage {
	
	
	public static final String USERNAME = "kranthi34";
	public static final String AUTOMATE_KEY = "CzzqWppLTpwwjTB3ttMH";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  @Test (dataProvider = "BrowserStackTestData")
	  public void openURL(Platform platform, String browserName, String browserVersion) throws Exception {

	    DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setPlatform(platform);
	    caps.setBrowserName(browserName);
	    caps.setVersion(browserVersion);
	    caps.setCapability("browserstack.debug", true);
	    
	    String path=System.getProperty("user.dir") + "/drivers";
    	System.setProperty("webdriver.chrome.driver", path+"\\chromedriver_windows.exe");
	    
	    //WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
    	WebDriver driver = new ChromeDriver();
	    driver.get("https://uat.teletextholidays.co.uk/");
	    
	    driver.manage().window().maximize();
    	driver.navigate().to("https://uat.teletextholidays.co.uk/");
    	
    	driver.findElement(By.xpath("//*[@id='searchDestination']")).clear();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id='searchDestination']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@class='spanDefaultDest'][contains(text(),'Tenerife')]")).click();
    	
    	driver.findElement(By.xpath("//*[@id='searchDepart']")).clear();
    	driver.findElement(By.xpath("//*[@id='searchDepart']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@class='spanAirport'][contains(text(),'Any South East')]")).click();
    	
    	driver.findElement(By.xpath("//*[@class='calendar-trigger pstn-abslt edge']")).click();
    	driver.findElement(By.xpath("//*[@id='20180703']")).click();
    	
    	driver.findElement(By.xpath("//*[@class='mobile-input-group-split-2 stay-trigger input-stayfor-box pstn-reltv flex-box-4 bgnd-white cursor-p']")).click();
    	driver.findElement(By.xpath("//*[@class='tth-col-md-4']//*[@class='mobile-btn-plus dinline']")).click();
    	driver.findElement(By.xpath("//*[@class='mobile-widget-footer done-trigger bgnd-green cursor-p txt-white dblock']")).click();
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//*[@class='mobile-input-group pstn-reltv guests-trigger input-guests-box flex-box-5 bgnd-white cursor-p']")).click();
    	driver.findElement(By.xpath("//*[@class='mobile-widget-footer done-trigger dblock txt-white cursor-p']")).click();
    	
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//*[@id='mobile-btn-search']")).click();
    	
    	Thread.sleep(10000);
    	
    	driver.close();
	    
	  }
	  
	  //{Platform.MAC, "safari", "6.2"}
	  
	  @DataProvider (name="BrowserStackTestData", parallel = true)
	  public Object[][] getData(){
		  Object[][] testData = new Object[][] {
			  {Platform.WIN8, "chrome", "62.0"},
			  
		  };
		  return testData;
	  }
	
}
