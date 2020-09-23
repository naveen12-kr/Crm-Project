package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllEmails extends BasePage{
	
	public static final By byYearSection = findBy("//*[@id=\"main\"]/div[2]/div/div[2]/div/div[1]/ul/li/a");
	public static final By byMonthSection = findBy("//*[@id='main']/div[2]/div/div[2]/div/div[2]/ul/li/a");
	public static final By byReceivedMailsPerDay = findBy("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/div[2]/span[1]");
	public static final By byParsingFailuresPerDay = findBy("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/div[2]/span[2]");
	public static final By byParsingFailuresCount = findBy("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr[3]/td[6]/div[2]/span");
	public static final By byCollapseIcon = findBy("//*[@id='calendarBar']");
	public static final By byCollapseDisabled = findBy("//*[@class='query-open']");
	public static final By byTotalEmailsCount = findBy("//*[@id='total_count']");
	
	/////////////////////////////////// CLICKERS //////////////////////////////////
	
	public static void clickOnCollapseIcon() {
		
		clickElement(byCollapseIcon, "Collapse Icon");
	}
	
	public static void clickOnReceivedEmailsCount() {
		
		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody"));
		List<WebElement> td= table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td/div[2]"));
		
		Iterator<WebElement> itr = td.iterator();	
	
		while(itr.hasNext())
		{
			WebElement dataBox = itr.next();
			String data = dataBox.getText();
			
			boolean b= data.isEmpty();
			
			if(b==true)
			{
				
			}
			else
			{
				dataBox.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td/div[2]/span[1]")).click();
				System.out.println("Clicking on the Received Emails");
				break;
			}
		}
		
	}

	public static void clickOnParsingFailuresCount() {
		
		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody"));
		List<WebElement> td= table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td/div[2]"));
		
		Iterator<WebElement> itr = td.iterator();	
	
		while(itr.hasNext())
		{
			WebElement dataBox = itr.next();
			String data = dataBox.getText();
			
			
			boolean b= data.isEmpty();
			
			if(b==true)
			{
			

			}
			else
			{
				dataBox.findElement(By.xpath("//*[@class='calendar']/tbody/tr/td/div[2]/span")).click();
				System.out.println("Clicking on the Parsing Emails");
				break;
			}
		}
	}
	
	/////////////////////////////////// VALIDATION /////////////////////////////////
	
	public static void isYearPresent() {
		
		String presentYear = driver.findElement(byYearSection).getText();
		isElementPresent(byYearSection, presentYear);
	}
	
	public static void isMonthPresent() {
		
		String presentMonth = driver.findElement(byMonthSection).getText();
		isElementPresent(byMonthSection, presentMonth);
	}
	
	public static void isReceivedMailsPerDayPresent() {
		
		String receivedMails = driver.findElement(byReceivedMailsPerDay).getText();
		
		System.out.println("Total received Emails Per Day: "+receivedMails);
	}
	
	public static void isParsingFailuresPerDayPresent() {
		
		String parsingFailures = driver.findElement(byParsingFailuresPerDay).getText();
		
		System.out.println("Parsing Failures per Day: "+parsingFailures);
	}
	
	public static void isAllFieldsDisabled() {
		
		isElementPresent(byCollapseDisabled, "Collapse Plus Icon");
		System.out.println("All Fields are minimised");
	}
	
	public static void getTotalEmailsCount() {
		
		String totalEmails = driver.findElement(byTotalEmailsCount).getText();
		System.out.println("Total Emails Count: "+totalEmails);
	}
	
	public static void clickOnRecivedMailInCalender() {
		
		WebElement calender = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
		List<WebElement> rows = calender.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr"));
		List<WebElement> cols = calender.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td"));
		
		System.out.println("Num of rows : " +rows.size());
		System.out.println("Num of cols : " +cols.size());
		
	}
	
	public static void getEmailsCount() {
		
		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody"));
		List<WebElement> td= table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td/div[2]"));
		
		Iterator<WebElement> itr = td.iterator();	
	
		while(itr.hasNext())
		{
			WebElement dataBox = itr.next();
			String data = dataBox.getText();
			
			boolean b= data.isEmpty();
			
			if(b==true)
			{
				
			}
			else
			{
				System.out.println("Number of emails : " +data);
				
				break;
			}
		}
	}
	
	
}
