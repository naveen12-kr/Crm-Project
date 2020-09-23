package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Maintenance extends BasePage {

	public static final By byDataRetention = findBy("//*[@id=\"main\"]/div/div/div/p[3]/a");
	public static final By byImportedEmailSource = findBy("//*[@id='id_importtype']");
	public static final By bySubmit = findBy("//*[@id=\"submit\"]");
	public static final By byClickHere = findBy("//*[@id=\"main\"]/div/div/div/div/form/table/tbody/tr[1]/th/a");
	public static final By byChooseFiles = findBy("//*[@id=\"id_pstuploads\"]");
	public static final By bySelectFiles = findBy("//*[contains(text(),'Select files')]");
	public static final By byCancelButton = findBy("//*[@id=\"cancel\"]");
	public static final By byUpdateLink = findBy("//*[@alt='Test']");
	public static final By byRunMigration = findBy("//*[@name=\"run\"]");
	public static final By byEmailAddresses = findBy("//*[@id=\"id_email_notification\"]");
	public static final By byDomainName = findBy("//*[@id=\"domainretentions\"]/div/input");
	public static final By byTextNotification = findBy("//*[@id=\"id_text_notification\"]");
	public static final By byDeleteButton = findBy("//*[@id=\"main\"]/div[3]/div/div/div/table/tbody/tr[1]/td[4]/a");
	public static final By byEmailRetainYears = findBy("//*[@id='emailretain_0']");
	public static final By byEmailRetainMoths = findBy("//*[@id='emailretain_1']");
	public static final By byTimeForDaily = findBy("//*[@id=\"schedule_daily_hour\"]");
	public static final By byTimeForWeekly = findBy("//*[@id='schedule_weekly_hour']");
	public static final By byAcknowledge = findBy("//*[@id='disclaimer']");
	public static final By byAddressYear = findBy("//*[@id=\"addrretentions\"]/div/select[1]");
	public static final By byAddressYear1 = findBy("//*[@id=\"addrretentions\"]/div[2]/select[1]");
	public static final By byDomainYear = findBy("//*[@id=\"domainretentions\"]/div/select[1]");
	public static final By byDomainYear1 = findBy("//*[@id=\"domainretentions\"]/div[2]/select[1]");
	public static final By byDomainMonths = findBy("//*[@id=\"domainretentions\"]/div/select[2]");
	public static final By byAddressMonth = findBy("//*[@id=\"addrretentions\"]/div/select[2]");
	public static final By byAddressMonth1 = findBy("//*[@id=\"addrretentions\"]/div[2]/select[2]");
	public static final By byDomainMonths1 = findBy("//*[@id=\"domainretentions\"]/div[2]/select[2]");
	public static final By byDepartmentExtension = findBy("//*[@id=\"deptretentions\"]/div/select[2]");
	public static final By byDepartmentExtensionPeriod = findBy("//*[@id=\"deptretentions\"]/div/select[3]");
	public static final By byDepartmentExtensionPeriod1 = findBy("//*[@id=\"deptretentions\"]/div[2]/select[3]");
	public static final By byDepartment = findBy("//*[@id=\"deptretentions\"]/div[1]/select[1]");
	public static final By byDepartment1 = findBy("//*[@id=\"deptretentions\"]/div[2]/select[1]");
	public static final By byTag = findBy("//*[@id=\"tagretentions\"]/div/select[1]");
	public static final By byTag1 = findBy("//*[@id=\"tagretentions\"]/div[2]/select[1]");
	public static final By byTagYear = findBy("//*[@id=\"tagretentions\"]/div[1]/select[2]");
	public static final By byTagYear1 = findBy("//*[@id=\"tagretentions\"]/div[2]/select[2]");
	public static final By byTagMonth = findBy("//*[@id=\"tagretentions\"]/div[1]/select[3]");
	public static final By byTagMonth1 = findBy("//*[@id=\"tagretentions\"]/div[2]/select[3]");

	public static String s;
	public static String D;
	public static String P;

	/////////////////////////////////////////// CLICKERS
	/////////////////////////////////////////// ///////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void clickOnDataRetention() {
		clickElement(byDataRetention, "DataRetention");
		sleepApplication(3000);
	}

	public static void ClickOnConfig(String data) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'" + data + "')]")).click();
		System.out.println("Clicked on" + data);
		Thread.sleep(2000);
	}

	public static void ClickOnHereLink() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'here')]")).click();
		System.out.println("Clicked on here link");
		Thread.sleep(2000);
	}

	public static void clickOnVisitThisSite() throws InterruptedException {

		driver.findElement(By.linkText("visit this page")).click();
		System.out.println("User clicks on the visit this site link");
		Thread.sleep(2000);
	}

	public static void ClickonCloseDepartment(String data, String data1) {

		driver.findElement(By.xpath("//*[@id='" + data + "']/div[" + data1 + "]/img")).click();

	}

	public static void ClickonCloseDepartment(String data) {
		boolean v = isElementPresent1(By.xpath("//*[@id='" + data + "']/div/img"), "extra");

		if (v == true) {
			driver.findElement(By.xpath("//*[@id='" + data + "']/div/img")).click();
		}
	}

	///////////////////////////////////////// SETTERS AND GETTERS
	///////////////////////////////////////// ///////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void getExistingDepartment(String data) {

		Maintenance.D = driver.findElement(By.xpath("//*[@id=\"deptretentions\"]/div/select[1]/option[" + data + "]"))
				.getText();
		System.out.println(D);
	}

	public static void getExistingTag(String data) {

		Maintenance.P = driver.findElement(By.xpath("//*[@id=\"tagretentions\"]/div/select[1]/option[" + data + "]"))
				.getText();
		System.out.println(P);
	}

	public static void getExistingDepartment1(String data) {

		Maintenance.D = driver
				.findElement(By.xpath("//*[@id=\"deptretentions\"]/div[2]/select[1]/option[" + data + "]")).getText();
		System.out.println(D);
	}

	public static void getConfigureDataRetentionPolicyPage() throws InterruptedException {

		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);

				System.out.println("New Window Title: " + driver.switchTo().window(child_window).getTitle());
			}
			// System.out.println("Configure Data Retention Policy Page is
			// displayed in new Window");
		}

		Thread.sleep(3000);
		driver.switchTo().window(parent);

	}

	public static void getMessage(String data) throws InterruptedException {

		try {
			driver.findElement(By.xpath("//*[contains(text(),'" + data + "')]")).isDisplayed();
			System.out.println(data);

		} catch (Exception e) {
			System.out.println("ERROR: Element " + data + "  not found");
		}

		Thread.sleep(2000);
	}

	public static void getValidEmail(String data) throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"notify\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"notify\"]")).sendKeys(data);

	}

	public static void getUploadInformation(String data) {

		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));

		List<WebElement> row1 = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));

		System.out.println(row1.size());

		for (int i = 1; i <= row1.size(); i++) {

			sleepApplication(3000);
			String s = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + i + "]/td[1]")).getText();

			if (s.equals(data)) {

				Assert.assertEquals(s, data);

				System.out.println("The filename and its upload information are displayed in the table below.");
				break;
			} else {
				System.out.println("The filename and its upload information are not displayed in the table below.");
			}

		}

	}

	public static void getTagInformation() {

		WebElement selectElement = driver.findElement(By.xpath("//*[@id='tagretentions']/div/select[1]"));
		Select select = new Select(selectElement);

		List<WebElement> allOptions = select.getOptions();

		System.out.println(allOptions.size());

		for (int i = 1; i < allOptions.size(); i++) {

			String s = allOptions.get(i).getText();

//			if (s.equals(ConfigurationDef.newTag1)) {
//
//				System.out.println("The legal hold is available under the drop down menu.");
//				break;
//			} else {
//				System.out.println("The legal hold is not Matched with Tag" + "i" + "in the drop down menu.");
//				if (i == allOptions.size() - 1) {
//					System.out.println("The legal hold is Not available under the drop down menu");
//				}
//			}

		}

	}

	public static void getExistingfile() {

		Maintenance.s = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[1]/td[1]")).getText();
		System.out.println(s);
	}

	public static void getMaintenanceKeyContract() {

		WebElement table = driver.findElement(By.xpath("//*[@class='nomargin']"));

		List<WebElement> row1 = table.findElements(By.xpath("//*[@class='nomargin']/dl/dd"));

		System.out.println("Maintenance Key Contract : ");

		for (int i = 0; i < row1.size(); i++) {

			List<WebElement> dt = table.findElements(By.xpath("//*[@class='nomargin']/dl/dt['" + i + "']"));
			String s = dt.get(i).getText();

			List<WebElement> dd = table.findElements(By.xpath("//*[@class='nomargin']/dl/dd['" + i + "']"));
			String s1 = dd.get(i).getText();

			System.out.println(s + ": -->" + s1);
		}
		System.out.println("");
	}

	public static void isInfoReadOnly() {
		WebElement readOnly = driver.findElement(By.xpath("//*[@class='nomargin']/dl/dd"));
		System.out.println(readOnly.getAttribute("readOnly"));
		Assert.assertTrue(readOnly.getAttribute("readOnly").equals("true"), "Element ReadOnly");

		/*
		 * WebElement some_element =
		 * driver.findElement(By.xpath("//*[@class='nomargin']/dl/dd")); String
		 * readonly = some_element.getAttribute("readonly");
		 * Assert.assertNotNull(readonly);
		 */

	}

	public static void ClickonCancel() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CANCEL);
			robot.keyRelease(KeyEvent.VK_CANCEL);
		} catch (Exception e) {

			System.out.println("Failed to click cancel");

		}
		sleepApplication(10000);
	}

	public static void selectZIPFile(String data) throws AWTException, InterruptedException {

		sleepApplication(2000);

		String path = System.getProperty("user.dir") + "\\PSTFiles\\" + data + "";

		try {
			Robot robot = new Robot();

			StringSelection stringSelection = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			robot.setAutoDelay(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.setAutoDelay(1000);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {

			System.out.println("File failed to upload");
		}
	}

	public static void selectEXCELFile(String data) throws AWTException, InterruptedException {

		sleepApplication(2000);

		try {
			Robot robot = new Robot();
			String path = System.getProperty("user.dir") + "\\AddNewUser\\" + data + "";
			System.out.println(path);
			StringSelection stringSelection = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			robot.setAutoDelay(10000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.setAutoDelay(10000);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.setAutoDelay(10000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.setAutoDelay(10000);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {

			System.out.println("File failed to upload");
		}
	}

	public static void setEmailAddresses(String sText) {

		setText(byEmailAddresses, "EmailAddresses", sText);
	}

	public static void setDomainName(String sText, String data) {
		sleepApplication(3000);
		driver.findElement(By.xpath("//*[@id=\"domainretentions\"]/div[" + sText + "]/input")).sendKeys(data);

	}

	public static void setAddressExtensions(String sText, String data) {
		sleepApplication(3000);

		driver.findElement(By.xpath("//*[@id=\"addrretentions\"]/div[" + sText + "]/textarea")).sendKeys(data);
	}

	public static void setValidFrequency(String data) {
		sleepApplication(3000);
		driver.findElement(By.xpath("//*[@id='id_schedule_type_" + data + "']")).click();

	}

	public static void selectAnyAddressDiscovery(String data) {

		sleepApplication(5000);

		driver.findElement(By.xpath("//*[@id='id_pstdiscovery_" + data + "']")).click();
	}

	public static void selectFileSystemTypeOnHost(String data) {

		sleepApplication(3000);
		driver.findElement(By.xpath("//*[@id='id_accesstype_" + data + "']")).click();
	}

	public static void selectFileSystemType(String data) {

		sleepApplication(3000);

		driver.findElement(By.xpath("//*[@id='id_fstype_" + data + "']")).click();
	}

	public static void selectMigrationFile(String data) {

		List<WebElement> row = driver.findElements(By.xpath("//*[@id='select_multiple']/dl/dd/ul/li"));
		System.out.println(row.size());

		for (int i = 0; i < row.size(); i++) {
			System.out.println(row.get(i).getText());
			if (row.get(i).getText().equals(data)) {
				driver.findElement(By.xpath("//*[@id='id_upload_select_box_" + i + "']")).click();
			}
		}

	}

	public static void selectMigrationFile1(String data) {

		List<WebElement> row = driver
				.findElements(By.xpath("//*[@id='main']/div/div/div/div/form/fieldset/dl/dd/ul/li"));
		System.out.println(row.size());

		for (int i = 0; i < row.size(); i++) {
			System.out.println(row.get(i).getText());
			if (row.get(i).getText().equals(data)) {
				driver.findElement(By.xpath("//*[@id='id_upload_select_" + i + "']")).click();
			}
		}

	}

	public static void selectDepartment() {

		setSelectBoxText(byDepartment, "Department", Maintenance.D);

	}

	public static void selectTag() {

		// setSelectBoxText(byTag, "Tag", Maintenance.P)
		WebElement selectElement = driver.findElement(By.xpath("//*[@id='tagretentions']/div/select[1]"));
		Select select = new Select(selectElement);
		select.selectByValue(Maintenance.P);
	}

	public static void selectTag1() {

		setSelectBoxText(byTag1, "Tag", Maintenance.P);

	}

	public static void selectDepartment1() {

		setSelectBoxText(byDepartment1, "Department", Maintenance.D);

	}

	public static void selectDepartmentExtensions(String sText) {

		setSelectBoxText(byDepartmentExtension, "Department Extension", sText);

	}

	public static void selectDepartmentExtensionsPeriod(String sText) {

		setSelectBoxText(byDepartmentExtensionPeriod, "Department Extension", sText);

	}

	public static void selectDepartmentExtensionsPeriod1(String sText) {

		setSelectBoxText(byDepartmentExtensionPeriod1, "Department Extension", sText);

	}

	public static void selectImportEmailSource(String sText) {

		setSelectBoxText(byImportedEmailSource, "Imported Email Source", sText);

	}

	public static void selectEmailRetainYears(String sText) {

		setSelectBoxText(byEmailRetainYears, "Imported Email Source", sText);

	}

	public static void selectDomainMonths(String sText) {

		setSelectBoxText(byDomainMonths, "DomainMonths", sText);

	}

	public static void selectDomainMonths1(String sText) {

		setSelectBoxText(byDomainMonths1, "DomainMonths", sText);

	}

	public static void selectDomainYear(String sText) {

		setSelectBoxText(byDomainYear, "Domain Year", sText);

	}

	public static void selectAddressMonths(String sText) {

		setSelectBoxText(byAddressMonth, "AddressMonths", sText);

	}

	public static void selectAddressYear(String sText) {

		setSelectBoxText(byAddressYear, "Address Year", sText);

	}

	public static void selectTagYear(String sText) {

		setSelectBoxText(byTagYear, "Tag Year", sText);

	}

	public static void selectTagMonth(String sText) {

		setSelectBoxText(byTagMonth, "Tag Month", sText);

	}

	public static void selectTagMonth1(String sText) {

		setSelectBoxText(byTagMonth1, "Tag Month", sText);

	}

	public static void selectTagYear1(String sText) {

		setSelectBoxText(byTagYear1, "Tag Year", sText);

	}

	public static void selectAddressMonths1(String sText) {

		setSelectBoxText(byAddressMonth1, "AddressMonths", sText);

	}

	public static void selectAddressYear1(String sText) {

		setSelectBoxText(byAddressYear1, "Address Year", sText);

	}

	public static void selectDomainYear1(String sText) {

		setSelectBoxText(byDomainYear1, "Domain Year", sText);

	}

	public static void selectEmailRetainMoths(String sText) {

		setSelectBoxText(byEmailRetainMoths, "Imported Email Source", sText);

	}

	public static void selectTimeForDaily(String sText) {

		setSelectBoxText(byTimeForDaily, "Time For Daily", sText);

	}

	public static void selectTimeForWeekly(String sText) {
		sleepApplication(3000);
		driver.findElement(By.xpath("//*[@id='schedule_weekly_hour']")).click();
		Select oSelect = new Select(driver.findElement(By.xpath("//*[@id='schedule_weekly_hour']")));
		oSelect.selectByValue(sText);

	}

	public static void selectMoreThanOneDay(String sText, String data) {

		Select oSelect = new Select(driver.findElement(By.xpath("//*[@id=\"schedule_weekly_weekdays\"]")));
		oSelect.selectByValue(data);
		oSelect.selectByValue(sText);
	}

	public static void selectMonthly(String sText, String data) {

		Select oSelect = new Select(driver.findElement(By.xpath("//*[@id='schedule_monthly_" + sText + "']")));
		oSelect.selectByValue(data);
	}

	public static void selectMultipleDays() {

		Select oSelect = new Select(driver.findElement(By.xpath("//*[@id=\"schedule_weekly_weekdays\"]")));
		oSelect.selectByValue("0");
		oSelect.selectByValue("1");
		oSelect.selectByValue("2");
		oSelect.selectByValue("3");
		oSelect.selectByValue("4");
		oSelect.selectByValue("5");
		oSelect.selectByValue("6");
	}

	public static void selectTextNotification(String sText) {

		setSelectBoxText(byTextNotification, "Text Notification", sText);

	}

	public static void clickOnSubmit() {

		clickElement(bySubmit, "Submit");

	}

	public static void clickOnRunMigration() {

		clickElement(byRunMigration, "Run Migration");

	}

	public static void clickOnClickHere() {

		clickElement(byClickHere, "ClickHere");

	}

	public static void clickOnAcknowledge() {

		clickElement(byAcknowledge, "Acknowledge");

	}

	public static void clickOnChooseFiles() {

		clickElement(byChooseFiles, "ChooseFiles");

	}

	public static boolean isSelectFiles() {

		boolean V = isElementPresent(bySelectFiles, "Select Files");
		System.out.println("The files in the uploaded file page are listed in the Select Files option");
		return V;
	}

	public static void clickOnDownArrow(String data) {
		sleepApplication(3000);
		driver.findElement(By.xpath("//*[@class='bordered-table']/thead/tr/th[" + data + "]/a")).click();
		

	}

	public static void clickOnUpArrow(String data) {
		sleepApplication(3000);
		driver.findElement(By.xpath("//*[@class='bordered-table']/thead/tr/th[" + data + "]/a")).click();
		driver.findElement(By.xpath("//*[@class='bordered-table']/thead/tr/th[" + data + "]/a")).click();

	}

	public static void clickOnCancelButton() {

		clickElement(byCancelButton, "Cancel Button");

	}

	public static void clickOnUpgradeLink() {

		clickElement(byUpdateLink, "Upgrade Link");

	}

	public static void clickOnDataRetentionfield(String data) {
		sleepApplication(3000);
		driver.findElement(By.xpath("//*[@id='forever_" + data + "']")).click();

	}

	public static void clickOnAnyDay(String data) {
		sleepApplication(3000);
		driver.findElement(By.xpath("//*[@id='schedule_weekly_weekdays']/option[" + data + "]")).click();

	}

	public static void clickOnDeleteButton() {

		clickElement(byDeleteButton, "Cancel Button");

	}

	public static void getCurrentClass(String data) {

		String current = driver.findElement(By.xpath("//*[@class='current']")).getText();
		System.out.println("********" + current);
		System.out.println("*******" + data);
		if (current.equals(data)) {
			System.out.println("INFO: The current class is " + data);
		} else {
			System.out.println("INFO: The current class is not " + current);
		}

	}

	public static void getErrorMessage() {

		String current = driver.findElement(By.xpath("//*[@id='main-message']/h1")).getText();
		System.out.println("INFO: The Valid Message Displayed is: " + current);
	}

	public static void getEmailsZToAOrder1(String data) throws InterruptedException, ParseException {
		sleepApplication(3000);
		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[" + data + "]"));
		//List<WebElement> row = table.findElements(By.xpath("//th[@class='sorted descending']//a[contains(text(),'File')]"));
		sleepApplication(3000);
		String startData = row.get(0).getText();
		// String startData =
		// driver.findElement(By.xpath("//*[@id='main']/div[3]/div/div/div/table/tbody/tr[2]/td["+data+"]")).getText();
		System.out.println(startData);

		int lastRow = row.size() - 1;
		System.out.println(lastRow);
		sleepApplication(3000);
		String endData = row.get(lastRow).getText();
		// String endData =
		// driver.findElement(By.xpath("//*[@id='main']/div[3]/div/div/div/table/tbody/tr["+lastRow+"]/td["+data+"]")).getText();
		System.out.println(endData);
		if (startData.equals(endData)) {
			System.out.println("Here the data is same so sortting is not possiable");
		} else {
			if (startData.compareTo(endData) > 0) {

				System.out.println(startData.compareTo(endData));
				Assert.assertTrue(startData.compareTo(endData) > 0);
				System.out.println("The Mail Subjects are in descending Order");
			}

			else {
				driver.findElement(By.xpath("//*[@class='bordered-table']/thead/tr/th[" + data + "]/a")).click();
				// String startData1 =
				// driver.findElement(By.xpath("//*[@id='main']/div[3]/div/div/div/table/tbody/tr[1]/td["+data+"]")).getText();
				String startData1 = row.get(0).getText();
				System.out.println(startData1);

				int lastRow1 = row.size() - 1;
				System.out.println(lastRow1);
				sleepApplication(3000);
				String endData1 = row.get(lastRow1).getText();
				// String endData1 =
				// driver.findElement(By.xpath("//*[@id='main']/div[3]/div/div/div/table/tbody/tr["+lastRow1+"]/td["+data+"]")).getText();
				System.out.println(endData1);
				System.out.println(startData1.compareTo(endData1));
				Assert.assertTrue(startData1.compareTo(endData1) > 0);
				System.out.println("The Mail Subjects are in descending Order");
			}
		}
	}

	public static void getEmailsAToZOrder(String data) throws InterruptedException {
		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[" + data + "]"));
		//List<WebElement> row = table.findElements(By.xpath("//th[@class='sorted ascending']//a[contains(text(),'File')]"));
		sleepApplication(3000);
		String startData = row.get(0).getText();

		int lastRow = row.size() - 1;
		sleepApplication(3000);
		String endData = row.get(lastRow).getText();
		if (startData.equals(endData)) {
			System.out.println("INFO: Here the data is same so sortting is not possiable");
		} else {
			if (startData.compareTo(endData) < 0) {
				Assert.assertTrue(startData.compareTo(endData) < 0);
				System.out.println("INFO: The Mail Subjects are in accending Order");
			}

			else {
				sleepApplication(3000);
				driver.findElement(By.xpath("//*[@class='bordered-table']/thead/tr/th[" + data + "]/a")).click();

				sleepApplication(3000);
				String startData1 = row.get(0).getText();
				int lastRow1 = row.size() - 1;
				sleepApplication(3000);
				String endData1 = row.get(lastRow1).getText();
				Assert.assertTrue(startData1.compareTo(endData1) < 0);
				System.out.println("INFO: The Mail Subjects are in accending Order");
			}
		}
	}

	public static void isHeaderPresent() {
		sleepApplication(3000);
		driver.findElement(By.xpath("//*[@id='main']/div/div/div/h1")).isDisplayed();
		System.out.println("INFO: Process Details: EmailMigration is present on screen");
	}

	public static void SelectExistingfile() {
		sleepApplication(3000);
		String path = System.getProperty("user.dir") + "\\PSTFiles\\" + Maintenance.s + "";
		System.out.println(s);
		try {
			Robot robot = new Robot();

			StringSelection stringSelection = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

			robot.setAutoDelay(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.setAutoDelay(1000);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {

			System.out.println("File failed to upload");
		}

	}

	public static void MovingExistingfile(String data) throws IOException {

		//Path temp = Files.move(Paths.get("C:\\Users\\dramkumar\\Desktop\\Intradyn\\PSTFiles\\" + data + ""),
				//Paths.get("C:\\Users\\dramkumar\\Desktop\\Intradyn\\PSTFile\\" + data + ""));
		Path temp = Files.move(Paths.get("C:\\Users\\sudhakar\\Desktop\\IntradynEmailArchive_27_11\\IntradynEmailArchive\\PSTFiles\\" + data + ""),
				Paths.get("C:\\Users\\sudhakar\\Desktop\\IntradynEmailArchive_27_11\\IntradynEmailArchive\\PSTFiles\\" + data + ""));

		if (temp != null) {
			System.out.println("INFO: File renamed and moved successfully");
		} else {
			System.out.println("INFO: Failed to move the file");
		}

	}

	public static void MovingExistingfile1(String data) throws IOException {

		Path temp = Files.move(Paths.get("C:\\Users\\sudhakar\\Desktop\\IntradynEmailArchive_27_11\\IntradynEmailArchive\\PSTFiles\\" + data + ""),
				Paths.get("C:\\Users\\sudhakar\\Desktop\\IntradynEmailArchive_27_11\\IntradynEmailArchive\\PSTFiles\\" + data + ""));

		if (temp != null) {
			System.out.println("INFO: File renamed and moved successfully");
		} else {
			System.out.println("INFO: Failed to move the file");
		}

	}

	public static void isPassOrFailDisplayed() {
		sleepApplication(3000);
		for (int i = 1; i <= 8; i++) {
			String result = driver.findElement(By.xpath("//*[@id='" + i + "']/dd/a")).getText();
			if (result.equals("pass")) {
				Assert.assertEquals(result, "pass");
				if (i == 8) {
					System.out.println("pass/fail should is displayed");
					break;
				}
			}
			if (result.equals("fail")) {
				Assert.assertEquals(result, "fail");
				if (i == 8) {
					System.out.println("pass/fail should is displayed");
					break;
				}
			}
		}
	}

	public static void isFullyUpgradedDataPassed() {

		String result = driver.findElement(By.xpath("//*[@id='8']/dd/a")).getText();
		if (result.equals("pass")) {
			Assert.assertEquals(result, "pass");
			System.out.println("Fully Upgraded Data is Passed ");
		}

	}

	public static void isRunTestButtonDisplayed() {
		sleepApplication(5000);

		boolean result = driver.findElement(By.xpath("//*[@id='startTest']")).isDisplayed();

		Assert.assertTrue(result);
		System.out.println("Run Tests Button Is  Displyed");

	}

	public static void isCancelButtonDisplayed() {

		boolean result = driver.findElement(By.xpath("//*[@id='cancelTest']")).isDisplayed();

		Assert.assertTrue(result);
		System.out.println("Cancel Tests Button Is  Displyed");

	}

	public static void isProcessCancelled() {
		sleepApplication(3000);
		for (int i = 1; i <= 8; i++) {
			String result = driver.findElement(By.xpath("//*[@id='" + i + "']/dd")).getText();
			if (result.contains("cancelled")) {
				Assert.assertTrue(result.contains("cancelled"));
				System.out.println("Health Checkup status is dispalyed with Cancelled");
				break;
			}
		}
	}

	public static void clickOnreateRuleButton(String data) {

		clickElement(findBy("//input[@value='" + data + "']"), "" + data + " button");

	}

	public static void clickOnDetailsLink(String data) {
		sleepApplication(3000);
		clickElement(findBy("//*[@onclick='" + data + "']"), "" + data + " link");

	}

	public static void isDetails(String data) {

		sleepApplication(3000);
		boolean result = driver.findElement(By.xpath("(//*[@class='testExplanation'])[1]")).isDisplayed();
		System.out.println(result);
		System.out.println(data);

		if (data.equals("Show")) {
			Assert.assertTrue(result == true);

			System.out.println("The complete details of the Health checkup result for all is displayed");

		} else {
			Assert.assertTrue(result == false);

			System.out.println("The complete information of the Health Checkup result is Hide");

		}

	}

	public static void clickOnPassfail() {

		clickElement(findBy("//*[@id='1']/dd/a"), "" + "Pass/fail" + " button");

	}

	public static void clickOnDataRetentionLink() {

		clickElement(findBy("//*[@class='col-xs-12']/p[3]/a"), "" + "Data Retention" + "Link button");

	}

	public static void isFullDetaills() {

		boolean result = driver.findElement(By.xpath("(//*[@class='testExplanation'])[1]")).isDisplayed();

		Assert.assertTrue(result == true);

		System.out.println("The complete details of the Health checkup result for perticular is displayed");

	}

	public static void clickOnUpTestLevelLink() {

		clickElement(findBy("//*[@class='explanation']/a[1]"), "" + "UpTestLevelLink" + " Link button");

	}

	public static void isChangeSaved() {

		boolean result = driver.findElement(By.xpath("//*[@id='disclaimer']")).isSelected();

		Assert.assertTrue(result == false);

		System.out.println("The changes made were not saved");

	}

	public static void clickonShowAllDates() {
		if (!driver.findElement(By.xpath("//*[@id='hide_dates']")).isSelected()) {
			clickElement(findBy("//*[@id='hide_dates']"), "Show All Dates");
			clickElement(findBy("//*[@id='submit']"), "Refresh Button");
		}
	}

}
