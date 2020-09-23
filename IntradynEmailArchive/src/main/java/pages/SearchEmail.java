package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchEmail extends BasePage {
	public static String mailid;
	public static String emailTo;
	public static String EmailTexteContents;
	public final static By bySearchButton = findBy("//*[@value='Search']");
	public final static By bytotalmailCount = findBy("//*[@id='total_count']");
	public final static By bySearchEmailSentSelect = findBy("//*[@class='modifier op_email_date']");
	public final static By byDateField = findBy("//*[@name='email_date']/input");
	public final static By byEmailFrom = findBy("//table[@id='msgView']/tbody/tr[1]/td[2]");
	public final static By byGenerateEmailonDate = findBy("//div[@class='cellContent']//*[@class='emailtotals']");
	public final static By byEmailList = findBy("//*[@class='grid-canvas']/div/div[2]");
	public final static By byselectEmail = findBy("//*[@class='grid-canvas']/div/div[1]");
	public final static By bySelectFirstEmail = findBy("//*[@id='emails-list']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/b/u");
	public final static By byAllEmails = findBy("//li//*[contains(text(),'All Emails')]");
	public final static By bySearchTab = findBy("//ul//li[1]//*[contains(text(),'Search')]");
	public final static By byEmailtoSearch = findBy("//*[@uuid='uuid_2']");
	public final static By byEmailfromSelect = findBy("//*[@ class='modifier op_email_from']");
	public final static By byEmailto = findBy("//table[@id='msgView']/tbody/tr[2]/td[2]");
	public final static By bySearchEmailTo =findBy("//*[@uuid='uuid_3']");
	public final static By byEmailTextContents=findBy("//table[@id='msgView']/tbody/tr[6]/td");
	public final static By byUserCalendarPerDay=findBy("//*[@id='calendarBar']");
	public final static By bySaveCriteriaName=findBy("//*[@id='save_name']");
	public final static By bySaveCriteriaDescriptio=findBy("//*[@id='save_description']");
	public final static By byTagtoSelect=findBy("//*[@id='lookup_dialog']/div/input[1]");
	public final static By byOKButton=findBy("//*[@tabindex='-1'][7]//*[contains(text(),'Ok')]");
	public final static By byLabel=findBy("//*[@id='label']");
	public final static By byLabelOption=findBy("//*[@class='lookup_checkbox'][1]");
	public final static By byStatusIcon=findBy("//*[@title='View status of SMTP server']//img");
	public final static By byprocessDetailsmtp=findBy("//h1[contains(text(),'Process Details: SMTP Server')]");
	public final static By byEmailFromQuery = findBy("//*[@id=\"search-terms\"]/div[2]/div[1]/span");
	public final static By byAddSearchButton = findBy("//*[@id=\"search_form\"]/div[2]/div/a");
	public final static By byclickOnCrossButton = findBy("//*[@menu=\"email_subject\"]");
	public final static By byEmailFromTo = findBy("//*[@class=\"modifier op_email_address\"]");
	public final static By byDeleteEmailFromToCrossButton = findBy("//*[@menu=\"email_address\"]");
	public final static By byMagnigineIconforEmailFromTo = findBy("//*[@id=\"search-terms\"]/div[5]/button[1]");
	
	//////////////////////// CLICKERS/////////////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////
	public static void clickOnSearchButton() {
		clickElement(bySearchButton, "Search button");
	}

	public static void clickOnAllEmail() {
		clickElement(byAllEmails, "All Email");
	}

	public static void clickOnDatetoEmail() {
		List<WebElement> ele = findElements(byGenerateEmailonDate, "mails of month");
		ele.get(0).click();
		sleepApplication(5000);
	}

	public static void clickOnEmail() {
		List<WebElement> ele = findElements(byEmailList, "Email list");
		ele.get(0).click();
		sleepApplication(5000);
	}
	
	public static void clickOnFirstEmail() {
		WebElement ele = driver.findElement(bySelectFirstEmail);
		ele.click();
		sleepApplication(3000);
	}
	public static void clickOnEmailtoSelect() {
		List<WebElement> ele = findElements(byselectEmail, "Email list");	
		ele.get(0).click();	
		sleepApplication(3000);
		
	}
	
	public static void clickOnMultipleEmailstoSelect() {
		List<WebElement> ele = findElements(byselectEmail, "Email list");	
		ele.get(0).click();	
		ele.get(1).click();
		ele.get(2).click();
		sleepApplication(5000);
		
	}

	public static void clickonSearchTab() {
		clickElement(bySearchTab, "Search Tab");
		sleepApplication(2000);
	}
	
	public static void clickOnButton(String data) {
		clickElement(findBy("//button[contains(text(),'"+data+"')]"), data);
		System.out.println("INFO: Clicking on "+data);
		sleepApplication(3000);
	}
	public static void clickOnSelectTag() {
		clickElement(byTagtoSelect,"Test2 tag");
	}
	public static void clickOnOKbutton() {
		clickElement(byOKButton,"OK button");
	}
	public static void clickOnLabelOption() {
		clickElement(byLabelOption,"Label Option");
	}
	public static void clickOnLabel() {
		clickElement(byLabel, "Label");
	}
	public static void clickOnStatusIcon() {
		clickElement(byStatusIcon,"Status icon");
	}
	///////////////////////////// ASSERTION///////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////
	public static boolean isTotalMailCountPresent() {
		return isElementPresent(bytotalmailCount, "Total mail count");
	}
	public static boolean isTotalUserCalenderPresent() {
		return isElementPresent(byUserCalendarPerDay,"totl user");
	}
	public static boolean isExpanSearchPresent() {
		return isElementPresent(bySearchButton,"Search button");
	}
	public static boolean isSearchtermTextPresent(String text) {
		return isElementPresent(findBy("//*[contains(text(),'"+text+"')]"), text);

	}
	public static boolean isSmtpStatusPresent() {
		return isElementPresent(byprocessDetailsmtp,"Smtp Process Details Status");
	}
	////////////////////////////////// SELECTOR/////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////
	
	public static void selectSecondDropdown(String data) throws InterruptedException {
		
		WebElement mb = driver.findElement(By.xpath("//*[@name=\"intervaluuid_1\"]"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println(data + " is selected");
	}
	
	
	
	public static void selectSearchEmailBy(String sText) {
		setSelectBoxText(bySearchEmailSentSelect, sText, sText);
	}
	
	public static void getDropdownDefaultValue(String data) {
		
		getDefaultValueDropdown(byEmailFromTo, data);
	}

	public static void setEmailtoSearch(String sText) {
		setText(byEmailtoSearch, "Email address", sText);
	}
	public static void setEmailToSearch(String sText) {
		setText(bySearchEmailTo, sText, sText);
	}
	public static void getEmailFrom() {	
		mailid = getText(byEmailFrom, "Email of Sender ");
	}
	
	public static void getEmailto() {
		emailTo = getText(byEmailto,"Email To");
		
	}
	public static void getemailTextContents() {
		EmailTexteContents=getText(byEmailTextContents,"Email Contents");
		//System.out.println(""+EmailTexteContents);
	}
	public static void selectsendfromtype(String sText) {
		setSelectBoxText(byEmailfromSelect, sText, sText);
	}
	
	public static void setcriteriaName(String sText) {
		setText(bySaveCriteriaName,sText, sText);
	}
	public static void setcriteriaDescription(String sText) {
		setText(bySaveCriteriaDescriptio, sText, sText);
	}
	/////////////////////////////////////////////////////////////////////////
	public static void setemailFrom() {
		setEmailtoSearch(mailid);
		sleepApplication(3000);
	}
	public static void setEmailTo() {
		setEmailToSearch(emailTo);
	}
	
	public static void clickOnRemoveTag() {
		HoverandClikcActionsElement(findBy("//*[@id='tag']"),"tag");
	}
	public static void hoverOnLabel() {
		HoverandClikcActionsElement(byLabel,"Label");
	}
	
	public static void byAddSearchButton() {
		
		clickElement(byAddSearchButton, "Add Search Button");
	}
	
	public static void isEmailTotalCount() throws InterruptedException
	{
		String sr = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();
		
	          
	     String[] r = sr.split(" ");
	     String total_count = r[3];
	     int a = Integer.parseInt(total_count);
	     
	     if(a!=0) {
	    	 
	    	 System.out.println("Number of emails :" +a);
	    	 
	     }
	     else {
	    	 
	    	 String noMails = driver.findElement(By.xpath("//*[@id='status_div']")).getText();
		 	 System.out.println(noMails);

	     }
		
			}
	
	public static void selectListFromAddSearchButton(String data) {
		
		WebElement mb = driver.findElement(By.xpath("//*[@id='additions']"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println("Selected : "+data);
		
	}
	
	public static void selectAddSearchquery(String data) throws InterruptedException {
		
		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> I1 = s1.iterator();
		while(I1.hasNext()) {
			
			String child_window = I1.next();
			if(!parent.equals(child_window)) {
				
				driver.switchTo().window(child_window);
				
				System.out.println(driver.switchTo().window(child_window).getTitle());
			}
		}
			
		Thread.sleep(3000);

		selectListFromAddSearchButton(data);
		
		driver.switchTo().window(parent);
		
	}


	public static void clickOnCrossButton() {
		
		clickElement(byclickOnCrossButton, "Cross Button");
		System.out.println("The selected field is deleted");
	}
	
	public static void isDeleteEmailFromToPresent() {
		
		isElementPresent(byDeleteEmailFromToCrossButton, "Delete Email From/To");
	
	}
	
	
	public static void mailBoxCount() throws InterruptedException
	{
		String sr = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();
		
	          
	     String[] r = sr.split(" ");
	     String total_count = r[3];
	     int a = Integer.parseInt(total_count);
	     
	     if(a!=0) {
	    	 
	    	 System.out.println("Number of emails :" +a);
	    	 
	     }
	     else {
	    	 
	    	 String noMails = driver.findElement(By.xpath("//*[@id='status_div']")).getText();
		 	 System.out.println(noMails);

	     }
		
			}
	
	///////////////////////////////////////////////////////////////
	
	public static void isEmailfromPresent() {
		
		isElementPresent(byEmailFromTo, "Email From/To");
	}
	
	public static void isMagnigineIconforEmailFromToPresent() {
		
		isElementPresent(byMagnigineIconforEmailFromTo, "Manigine Icon for Email From/To");
	}
}
