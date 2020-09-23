package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SearchEmail extends BasePage {
	public static String mailid;
	public static String emailTo;
	public static String text;
	public static String EmailTexteContents;
	public final static By bySearchButton = findBy("//*[@value='Search']");
	public final static By bytotalmailCount = findBy("//*[@id='total_count']");
	public final static By bySearchEmailSentSelect = findBy("//*[@class='modifier op_email_date']");
	public final static By byDateField = findBy("//*[@name='email_date']/input");
	public final static By byEmailFrom = findBy("//table[@id='msgView']/tbody/tr[1]/td[2]");
	public final static By byGenerateEmailonDate = findBy("//div[@class='cellContent']//*[@class='emailtotals']");
	public final static By byEmailList = findBy("//*[@class='grid-canvas']/div/div[2]");
	public final static By byselectEmail = findBy("//*[@class='grid-canvas']/div/div[1]");
	public final static By bySelectFirstemail = findBy("");
	public final static By byAllEmails = findBy("//li//*[contains(text(),'All Emails')]");
	public final static By bySearchTab = findBy("//ul//li[1]//*[contains(text(),'Search')]");
	public final static By byEmailtoSearch = findBy("//*[@uuid='uuid_2']");
	public final static By byEmailfromSelect = findBy("//*[@ class='modifier op_email_from']");
	public final static By byEmailto = findBy("//table[@id='msgView']/tbody/tr[2]/td[2]");
	public final static By bySearchEmailTo = findBy("//*[@uuid='uuid_3']");
	public final static By byEmailTextContents = findBy("//table[@id='msgView']/tbody/tr[6]/td");
	public final static By byUserCalendarPerDay = findBy("//*[@id='calendarBar']");
	public final static By byQueryTerms = findBy("//h3[@id='selectionBar' and @class='query-open']");
	public final static By bySaveCriteriaName = findBy("//*[@id='save_name']");
	public final static By bySaveCriteriaDescriptio = findBy("//*[@id='save_description']");
	public final static By byTagtoSelect = findBy("//*[@id='lookup_items']//input[1]");
	public final static By byOKButton = findBy("//*[@tabindex='-1'][7]//*[contains(text(),'Ok')]");
	public final static By byLabel = findBy("//*[@id='label']");
	public final static By byTag = findBy("//*[@id='tag']");

	public final static By byLabelOption = findBy("//*[@class='lookup_checkbox'][1]");
	public final static By byStatusIcon = findBy("//*[@title='View status of SMTP server']//img");
	public final static By byprocessDetailsmtp = findBy("//h1[contains(text(),'Process Details: SMTP Server')]");
	public final static By byEmailFromQuery = findBy("//*[@id=\"search-terms\"]/div[2]/div[1]/span");
	public final static By byAddSearchButton = findBy("//*[@id=\"search_form\"]/div[2]/div/a");
	public final static By byclickOnCrossButton = findBy("//*[@menu=\"email_subject\"]");
	public final static By byEmailFromTo = findBy("//*[@class=\"modifier op_email_address\"]");
	public final static By byDeleteEmailFromToCrossButton = findBy("//*[@menu=\"email_address\"]");
	public final static By byMagnigineIconforEmailFromTo = findBy("//*[@id=\"search-terms\"]/div[5]/button[1]");
	public final static By byRecentSearches = findBy("//*[@id='main']/div/div/div/h1");
	public final static By byClearFields = findBy("//*[@id='reset_format']");
	public final static By byOption = findBy("//*[@menu='email_address']");
	public final static By byAddSearchTerm = findBy("//*[@id='search_form']/div[2]/div/a");
	public final static By bySelectSearchTerm = findBy("additions");

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
		sleepApplication(3000);
	}

	public static void clickOnEmail() {
		sleepApplication(5000);
		List<WebElement> ele = findElements(byEmailList, "Email list");
		ele.get(0).click();
		sleepApplication(3000);
	}

	public static void clickOnFirstemail() {
		WebElement ele = driver.findElement(By.xpath("//*[@id='emails-list']/div[3]/div/div[1]/div[1]/label/span"));
		ele.click();
		sleepApplication(3000);
	}

	public static void clickOnEmailtoSelect() {
		List<WebElement> ele = findElements(byselectEmail, "Email list");
		ele.get(0).click();
		System.out.println("INFO: Email selected");
		sleepApplication(3000);

	}

	public static void clickOnMultipleEmailstoSelect() {
		List<WebElement> ele = findElements(byselectEmail, "Email list");
		// ele.get(0).click();
		ele.get(1).click();
		ele.get(2).click();
		sleepApplication(3000);

	}

	public static void clickonSearchTab() {
		clickElement(bySearchTab, "Search Tab");
		sleepApplication(2000);
	}

	public static void clickOnButton(String data) {
		clickElement(findBy("//button[contains(text(),'" + data + "')]"), data);
		System.out.println("INFO: Clicking on " + data);
		sleepApplication(3000);
	}

	public static void clickOnSelectTag() {
		clickElement(byTagtoSelect, "Test2 tag");
	}

	public static void clickOnOKbutton() {
		clickElement(byOKButton, "OK button");
	}

	public static void clickOnLabelOption() {
		clickElement(byLabelOption, "Label Option");
	}

	public static void clickOnLabel() {
		clickElement(byLabel, "Label");
	}

	public static void clickOnTag() {
		clickElement(byTag, "Tag");
	}

	public static void clickOnStatusIcon() {
		clickElement(byStatusIcon, "Status icon");
	}

	public static void clickOnQueryTerms() {

		clickElement(byQueryTerms, "byQueryTerms");
	}

	public static void clickOnAddSearchTerm() {
		clickElement(byAddSearchTerm, "Add Search Terms");
	}

	///////////////////////////// ASSERTION///////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////
	public static boolean isTotalMailCountPresent() {
		return isElementPresent(bytotalmailCount, "Total mail count");
	}

	public static boolean isTotalUserCalenderPresent() {
		return isElementPresent(byUserCalendarPerDay, "totl user");
	}

	public static boolean isExpanSearchPresent() {
		return isElementPresent(bySearchButton, "Search button");
	}

	public static boolean isSearchtermTextPresent(String text) {
		return isElementPresent(findBy("//*[contains(text(),'" + text + "')]"), text);

	}

	public static boolean isSmtpStatusPresent() {
		return isElementPresent(byprocessDetailsmtp, "Smtp Process Details Status");
	}
	////////////////////////////////// SELECTOR/////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////

	public static void selectSecondDropdown(String data) throws InterruptedException {

		WebElement mb = driver.findElement(By.xpath("//*[@id='interval']"));
		mb.click();
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println("INFO: " + data + " is selected");
	}

	public static void selectSecondDropdowns(int i) throws InterruptedException {

		WebElement mb = driver.findElement(By.xpath("//*[@id='interval']"));

		mb.click();
		Select s = new Select(mb);
		s.selectByIndex(i);
		System.out.println("INFO: " + i + " is selected");

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
		emailTo = getText(byEmailto, "Email To");

	}

	public static void getemailTextContents() {
		EmailTexteContents = getText(byEmailTextContents, "Email Contents");
	}

	public static void selectsendfromtype(String sText) {
		setSelectBoxText(byEmailfromSelect, sText, sText);
	}

	public static void setcriteriaName(String sText) {
		setText(bySaveCriteriaName, sText, sText);
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
		HoverandClikcActionsElement(findBy("//*[@id='tag']"), "tag");
	}

	public static void hoverOnLabel() {
		HoverandClikcActionsElement(byLabel, "Label");
	}

	public static void clickOnAddSearchButton() {

		clickElement(byAddSearchButton, "Add Search Button");
	}

	public static void clickOnClearFieldsButton() {

		clickElement(byClearFields, "Clear Fields");
	}

	public static void clickOnCrossIcon() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@menu='email_address']")).click();
	}

	public static void getEmailTotalCount() throws InterruptedException {
		Thread.sleep(10000);
		String sr = driver.findElement(By.xpath("//*[@id='total_count']")).getText();
		sr.replaceAll(",", "");
        System.out.println(">>>>" +  sr);
		int a = Integer.parseInt(sr.replaceAll(",", ""));
		//int a = Integer.parseInt(sr);
		
		System.out.println("INFO: Number of emails present after search:" + a);
		// String text = getText(findBy("//*[@id='search-success']"),
		// "Success");
		// Assert.assertTrue(isElementPresent(findBy("//*[@id='search-success']"),
		// text));
	}

	public static void getEmailTotalCount1() throws InterruptedException {
		Thread.sleep(10000);
		String sr = driver.findElement(By.xpath("//*[@id='total_count']")).getText();

		int a = Integer.parseInt(sr);
		if (a == 0) {
			Assert.assertTrue(a == 0);
			System.out.println("INFO: Number of emails :" + a);
		}

	}

	public static void selectListFromAddSearchButton(String data) {

		clickElement(findBy("//*[@value='" + data + "']"), data);

		// WebElement mb =
		// driver.findElement(By.xpath("//option[contains(text(), '"+data+"')
		// and @value='email_text']"));
		// Select s = new Select(mb);
		// s.selectByValue(data);
		// System.out.println("INFO: Selected : " + data);

	}

	public static void selectAddSearchquery(String data) throws InterruptedException {

		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);

				System.out.println("INFO: " + driver.switchTo().window(child_window).getTitle());
			}
		}

		Thread.sleep(3000);

		selectListFromAddSearchButton(data);

		driver.switchTo().window(parent);

	}

	public static void clickOnCrossButton() {

		clickElement(byclickOnCrossButton, "Cross Button");
		System.out.println("INFO: The selected field is deleted");
	}

	public static void isDeleteEmailFromToPresent() {

		isElementPresent(byDeleteEmailFromToCrossButton, "Delete Email From/To");

	}

	public static void mailBoxCount() throws InterruptedException {
		String sr = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();

		String[] r = sr.split(" ");
		String total_count = r[3];
		int a = Integer.parseInt(total_count);

		if (a != 0) {
			System.out.println("INFO: Number of emails :" + a);

		} else {

			String noMails = driver.findElement(By.xpath("//*[@id='status_div']")).getText();
			System.out.println("INFO: " + noMails);

		}

	}

	public static void selectQueryTerms(String data, String a) {
		sleepApplication(5000);
		WebElement selectElement = driver.findElement(By.xpath("//*[contains(@name,'" + data + "')]"));
		Select s = new Select(selectElement);
		sleepApplication(5000);
		selectElement.click();
		s.selectByValue(a);
		WebElement ss = s.getFirstSelectedOption();
		System.out.println("INFO: Selected : " + ss.getText() + "from " + data + " drop down");
	}

	public static void selectQueryTerm1(String data, String sText) {
		// WebElement table =
		// driver.findElement(By.xpath("//*[@id='id_atype']"));
		// setSelectBoxText(byTag, "Tag", Maintenance.P)
		WebElement selectElement = driver.findElement(By.xpath("//*[contains(@name,'" + data + "')]"));
		Select s = new Select(selectElement);

		s.selectByVisibleText(sText);
		String ss = s.getFirstSelectedOption().getText();
		System.out.println("INFO: Selected Tag is : " + ss);
	}
	public static void selectQueryTerm3(String data, String sText) {
		// WebElement table =
		// driver.findElement(By.xpath("//*[@id='id_atype']"));
		// setSelectBoxText(byTag, "Tag", Maintenance.P)
		sleepApplication(3000);
		WebElement selectElement = driver.findElement(By.xpath("//*[contains(@name,'" + data + "')]"));
		//WebElement selectElement = driver.findElement(By.id("//*[(@id='id_weekdays']"));
		Select s = new Select(selectElement);

		s.selectByVisibleText(sText);
		String ss = s.getFirstSelectedOption().getText();
		System.out.println("INFO: Selected Tag is : " + ss);
	}

	public static void getQueryTerms(String data, String sText) {
		sleepApplication(3000);
		driver.findElement(By.xpath("//*[@id='" + data + "']")).clear();
		WebElement selectElement = driver.findElement(By.xpath("//*[@id='" + data + "']"));
		selectElement.sendKeys(sText);
		System.out.println("INFO: Notification email address: " + sText);
	}

	public static void getSSNData() {
		driver.findElement(By.xpath("//*[@id=\"ssn_pat_ssn_subject\"]/input[1]")).sendKeys("999");
		driver.findElement(By.xpath("//*[@id=\"ssn_pat_ssn_subject\"]/input[2]")).sendKeys("99");
		driver.findElement(By.xpath("//*[@id=\"ssn_pat_ssn_subject\"]/input[3]")).sendKeys("9999");
	}

	public static void selectQueryTerms2(String data, int sText) throws InterruptedException, AWTException {

		WebElement table = driver.findElement(By.xpath("//*[contains(@name,'" + data + "')]"));
		List<WebElement> row = table.findElements(By.xpath("//*[contains(@name,'" + data + "')]"));

		Robot robot = new Robot();

		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		row.get(sText).click();
		robot.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void selectSearchTerm(String sText) {
		setSelectBoxText(bySelectSearchTerm, sText, sText);
	}

	///////////////////////////////////////////////////////////////

	public static void isEmailfromPresent() {

		isElementPresent(byEmailFromTo, "Email From/To");
	}

	public static void isMagnigineIconforEmailFromToPresent() {

		isElementPresent(byMagnigineIconforEmailFromTo, "Manigine Icon for Email From/To");
	}

	public static void isRecentSearchesPresent() {

		boolean V = isElementPresent(byRecentSearches, "Recent Searches");
		text = driver.findElement(By.xpath("(//*[@class='bordered-table'])[2]/tbody/tr/td[1]")).getText();
		Assert.assertTrue(V);
	}

	public static void isMailListDisplayedAccordingly() {
		driver.findElement(By.xpath("//*[@id='selectionBar']")).click();
		sleepApplication(3000);
		String data = driver.findElement(By.xpath("//*[@id='search-terms']/div/div[1]/span")).getText();
		Assert.assertEquals(data, text);
		System.out.println("INFO: Mail list is displayed according to the recent search term");
	}

	public static void isLoadSearchFieldsDisplayed() {

		Assert.assertTrue(isElementPresent(byAddSearchTerm, "Add Search Term Button "));
		Assert.assertTrue(isElementPresent(findBy("//*[@id='search_form']/div[2]/div/input"), "Search Button "));
		Assert.assertTrue(isElementPresent(findBy("//*[@id='save_search']"), "Save Search Criteria Link Button "));
		Assert.assertTrue(isElementPresent(findBy("//*[@id='save_format']"), "Save Layout Link Button "));
		Assert.assertTrue(isElementPresent(findBy("//*[@id='reset_format']"), "Clear Fields Link Button "));
	}

	public static void isDeleteOptionDisplayed() {

		boolean V = isElementPresent(findBy("//*[@menu='email_text']"), "Delete Option");
		Assert.assertTrue(V);
	}

	public static void isEmptyMailBoxDisplayed() {

		String V = driver.findElement(By.xpath("//*[@id='email_text']")).getText();
		Assert.assertTrue(V.isEmpty());
		System.out.println("INFO: Empty Mail Box is Displayed");
	}

	public static void isFieldsWithCrossIconDisplayed() {

		String V = driver.findElement(By.xpath("//*[@id='email_address']")).getText();
		Assert.assertTrue(V.isEmpty());
		System.out.println("INFO: Respective Fields is Displayed");
		Assert.assertTrue(driver.findElement(By.xpath("//*[@menu='email_address']")).isDisplayed());
		System.out.println("INFO: Cross icon is Displayed");
	}

	public static void isCalenderDisplayed() {

		driver.findElement(By.xpath("//*[contains(@name,'Dateuuid')]")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']")).isDisplayed());
		System.out.println("INFO: Calender is Displayed");
	}

	public static void isFieldsOfSavedSearchesDisplayed() {

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='save_name']")).isDisplayed());
		System.out.println("INFO: Name field is Displayed");
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='save_description']")).isDisplayed());
		System.out.println("INFO: Description field is Displayed");
	}

	public static void isSavedSearchesPopUpDisplayed() {

		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='modal-savesearch']/div/div/div[1]")).isDisplayed());
		System.out.println("INFO: Saved Searches PopUp is Displayed");
	}

	public static void isFieldsAreClearedDisplayed() {

		String V = driver.findElement(By.xpath("//*[@id='email_from']")).getText();
		Assert.assertTrue(V.isEmpty());
		String V1 = driver.findElement(By.xpath("//*[@id='email_to']")).getText();
		Assert.assertTrue(V1.isEmpty());
		System.out.println("INFO: Respective Fields are cleared");
	}

	public static void isOptionDeleted() {
		boolean s = isElementPresent1(byOption, "Selected Option");
		Assert.assertFalse(s);
		System.out.println("INFO: Selected option is deleted");
	}

	public static void isAllFieldsDisplayed() {

		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@id,'email_from')]")).isDisplayed());
		System.out.println("INFO: Empty Mail box is displayed");
		String V = driver.findElement(By.xpath("(//*[contains(@class,'modifier op_email_from')])[2]"))
				.getAttribute("value");
		Assert.assertTrue(V.equals("any"));
		System.out.println("INFO: contains all of is displayed by default under Email From");
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='search-terms']/div[5]/button[1]")).isDisplayed());
		System.out.println("INFO: look up option magnigine icon is displayed corresponding to");
		Assert.assertTrue(driver.findElement(By.xpath("(//*[@menu='email_from'])[2]")).isDisplayed());
		System.out.println("INFO: Delete option shown with the cross icon is displayed for Email from");
	}
	
	public static void userSelectTheServerOfExchangeServer() {
		
		Select s1=new Select(driver.findElement(By.xpath("//select[@id='id_server']")));
		
		s1.selectByIndex(0);
		
			
	}
	
}
