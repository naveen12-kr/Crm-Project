package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BackUp extends BasePage {

	public static final By byRemoteBackUpHistory = findBy("//*[@id=\"main\"]/div/div/div/div/table/tbody/tr/td");
	public static final By byStart = findBy("//*[@id='Start']/a");
	public static final By byFileSystemByTypeOnHost = findBy(
			"//*[@id='main']/div/div/div/div/form/fieldset/dl[2]/dt/label");
	public static final By byHostName = findBy("//*[@id='cifs_nfs_hostname']/dl/dt/label");
	public static final By byHostPath = findBy("//*[@id='cifs_nfs_hostpath']/dl/dt/label");
	public static final By byPauseRemoteBackupPresent = findBy("//*[contains(text(), 'Pause Remote Backup')]");
	public static final By bySubmit = findBy("//*[@id='submit']");
	public static final By byNeverIntenedCheckBox = findBy("//*[@id='id_schedule_never_ever']");
	public static final By byViewCheckBox = findBy("//*[@name='encryptionkey_1']");
	public static final By byFrequency = findBy("//*[@id=\"scheduleformdiv\"]/dl/dt[1]/label");
	public static final By byINeverIntendedToScheduleThisJob = findBy("//*[@id=\"scheduleformdiv\"]/dl/dt[2]/label");
	public static final By byremoteHostConfigLink = findBy("//p//a[contains(text(),'Remote Host Config')]");
	public static final By byPauseRemoteBackUpCheckBox = findBy("//*[@id=\"id_ispaused\"]");
	public static final By byProductKeyLabel = findBy("//*[@id=\"main\"]/div/div/div/div/form/fieldset/dl/dt/label");
	public static final By byEncryptionKey = findBy("//*[@id=\"main\"]/div/div/div/div/fieldset/dl[1]/dt");
	public static final By byWarning = findBy("//*[@id=\"main\"]/div/div/div/div/fieldset/dl[2]/dt/label");
	public static final By byEnterStandByMode = findBy("//*[@id=\"main\"]/div/div/div/div/fieldset/dl[3]/dt/label");
	public static final By byAlwaysPreferred = findBy("//*[@id=\"id_haveSched_0\"]");
	public static final By byScheduleDailyDowntime = findBy("//*[@id=\"id_haveSched_1\"]");
	public static final By byOtherOptions = findBy("//*[@id=\"id_starttime\"]");
	public static final By byAddUserName = findBy("//*[@id=\"id_targetname\"]");
	public static final By byClickHere = findBy("//*[@id=\"main\"]/div/div/div/div/fieldset/dl[3]/dd/a");
	public static final By byThisFieldIsRequired = findBy(
			"//*[@id=\"main\"]/div/div/div/div/form/fieldset/dl[1]/dd[2]/ul/li");
	public static final By byErrorMessage = findBy("//*[@class='error']");

	// *********************************** CLICKERS
	// ****************************************************
	// ************************************************************************************************

	public static void clickOnStartUPandDownArrow(String data) throws InterruptedException {

		driver.findElement(By.xpath("//*[@id='" + data + "']/a")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id='" + data + "']/a")).click();
		Thread.sleep(3000);

	}

	public static void clickOnNeverIntendCheckBox() {

		clickElement(byNeverIntenedCheckBox, "Never Intened CheckBox");
	}

	public static void clickOnViewCheckBox() {

		clickElement(byViewCheckBox, "View Check Box");
	}

	public static void clickOnClickHere() {

		clickElement(byClickHere, "Click Here");
	}

	public static void clickOnNFS() {

		boolean nfs = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/form/fieldset/dl[2]/dt/label"))
				.isSelected();

		if (nfs == true) {

			System.out.println("INFO: NFS is default selected");
		} else {
			driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/form/fieldset/dl[2]/dt/label")).click();
			System.out.println("INFO: NFS is selected");
		}
	}

	public static void clickOnSMBAndCIFS() {

		boolean smb = driver.findElement(By.xpath("//*[@id='id_fstype_1']")).isSelected();

		if (smb == true) {

			System.out.println("INFO: SMB is default selected");
		} else {
			driver.findElement(By.xpath("//*[@id='id_fstype_1']")).click();
			System.out.println("INFO: SMB is selected");
		}
	}

	public static void clickOnFrequencyHourly(String a) {

		driver.findElement(By.xpath("//*[@id='id_schedule_type_1']")).click();

		WebElement list = driver.findElement(By.xpath("//*[@id=\"id_schedule_every_hour\"]"));

		Select s = new Select(list);
		s.selectByValue(a);
		System.out.println("INFO: Selected hours : " + a);
		System.out.println("INFO: Every " + a + " hours");
	}

	public static void clickOnFrequencyDaily(String a, String b) {

		driver.findElement(By.xpath("//*[@id='id_schedule_type_2']")).click();

		WebElement list = driver.findElement(By.xpath("//*[@id=\"id_schedule_daily_hour\"]"));
		WebElement list1 = driver.findElement(By.xpath("//*[@id=\"id_schedule_daily_minute\"]"));

		Select s = new Select(list);
		s.selectByValue(a);

		Select s1 = new Select(list1);
		s1.selectByValue(b);

		System.out.println("INFO: at : " + a + " : " + b + " hh:mm");

	}

	public static void clickOnFrequencyWeekly(String a, String b, String c) throws InterruptedException {

		driver.findElement(By.id("id_schedule_type_3")).click();
		Thread.sleep(2000);

		WebElement list = driver.findElement(By.xpath("//*[@id=\"id_schedule_weekly_weekdays\"]"));
		WebElement list1 = driver.findElement(By.id("id_schedule_weekly_hour"));
		WebElement list2 = driver.findElement(By.id("id_schedule_weekly_minute"));

		Select s = new Select(list);
		s.selectByVisibleText(a);

		Thread.sleep(2000);

		Select s1 = new Select(list1);
		s1.selectByValue(b);

		Thread.sleep(2000);

		Select s2 = new Select(list2);
		s2.selectByValue(c);

		Thread.sleep(2000);

		System.out.println("INFO: Weekly on " + a + " at : " + b + " : " + c + " hh:mm");

	}

	public static void clickOnSaveAndTest() {

		clickElement(bySubmit, "Submit and Test");
	}

	public static void clickOnAlwaysPreferred() {
		if (isElementSelected(byScheduleDailyDowntime, "Schedule Daily Downtime") == false) {

			clickElement(byScheduleDailyDowntime, "Schedule Daily Downtime");

			sleepApplication(2000);

			clickElement(byAlwaysPreferred, "Always Preferred");
		} else {
			clickElement(byAlwaysPreferred, "Always Preferred");
		}
	}

	public static void clickOnRemoteHostConfigLink() {

		clickElement(byremoteHostConfigLink, "Remote Host Config Link");
	}

	public static void clickOnPauseRemoteBackUp() {

		clickElement(byPauseRemoteBackUpCheckBox, "Pause Remote BackUp CheckBox");
	}

	public static void clickOnWarmStandByMagGlass() {

		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> mg = table.findElements(By.xpath("//*[@class=\"bordered-table\"]/tbody/tr/td[5]/form/a[1]"));

		for (int i = 0; i <= mg.size();) {

			if (mg.size() == 0) {

				System.out.println("INFO: There are No Warm StandBy Target mechines");
			} else {

				mg.get(i).click();

				System.out.println("INFO: Clicked on Magnifying glass");
			}
			break;
		}

	}

	public static void clickOnWarmStandByCalander() {

		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> mg = table.findElements(By.xpath("//*[@class=\"bordered-table\"]/tbody/tr/td[5]/form/a[2]"));

		for (int i = 0; i <= mg.size();) {

			if (mg.size() == 0) {

				System.out.println("INFO: There are No Warm StandBy Target mechines");
			} else {

				mg.get(i).click();

				System.out.println("INFO: Clicked on calendar");
			}
			break;
		}

	}

	public static void clickOnStartDownArrow(String data) throws InterruptedException {

		driver.findElement(By.xpath("//*[@id='" + data + "']/a")).click();
		Thread.sleep(3000);
	}

	public static void clickOnWarmStandByPencil() {

		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> mg = table.findElements(By.xpath("//*[@class=\"bordered-table\"]/tbody/tr/td[5]/form/a[3]"));

		for (int i = 0; i <= mg.size();) {

			if (mg.size() == 0) {

				System.out.println("INFO: There are No Warm StandBy Target mechines");
			} else {

				mg.get(i).click();

				System.out.println("INFO: Clicked on Pencil");
			}
			break;
		}

	}

	public static void setEncyptionKey() {

		int length = 25;
		String ek = getRandomIntiger(length);

		driver.findElement(By.xpath("//*[@name='encryptionkey_0']")).clear();

		driver.findElement(By.xpath("//*[@name='encryptionkey_0']")).sendKeys(ek);
		System.out.println("INFO: Entered encryption key is : " + ek);
	}

	public static void getEncryptionKey() {

		String ek = driver.findElement(By.xpath("//*[@name='encryptionkey_0']")).getAttribute("Value");
		System.out.println("Encryption Key is : " + ek);
	}

	public static void setHostName(String data) {

		driver.findElement(By.xpath("//*[@id='id_hostname']")).clear();

		driver.findElement(By.xpath("//*[@id='id_hostname']")).sendKeys(data);
	}

	public static void setHostPath(String data) {
		driver.findElement(By.xpath("//*[@id=\"id_hostpath\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"id_hostpath\"]")).sendKeys(data);
	}

	public static void getRemoteBackUpMessage() {

		String s = driver.findElement(By.xpath("//*[@id='main']/div[2]")).getText();
		System.out.println("Message : " + s);
	}

	public static void getRBScheduleMessage() {

		String s = driver.findElement(By.xpath("//*[@id='main']/div[1]")).getText();
		System.out.println("Message : " + s);
	}

	// ****************************************** SETTERS AND GETTERS
	// ******************************
	// ***********************************************************************************************

	public static void getRBHistoryTableData() {

		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"main\"]/div/div/div/div/table/tbody/tr"));
		System.out.println("Start               End          Files    ErrorMessage");
		System.out.println("======           ============== =======   ============  ");
		for (int i = 0; i < list.size(); i++) {

			String tData = list.get(i).getText();
			System.out.println(tData);
		}

		MyExportedResults.isFilenamesortedOrder();
	}

	public static void getProcessDetails() {

		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"main\"]/div/div/div/div/table/tbody/tr"));
		Iterator<WebElement> it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next().getText());
		}
	}

	public static void getWarmStandByTarget() {

		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"main\"]/div/div/div/div/table/tbody/tr"));

		for (int i = 0; i < list.size(); i++) {

			String ws = list.get(i).getText();
			System.out.println(ws);
		}
	}

	public static void getWarmStandByMachines() {

		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"main\"]/div/div/div/div/table/tbody/tr/td[1]"));
		Iterator<WebElement> it = list.iterator();

		while (it.hasNext()) {

			String ws = it.next().getText();
			System.out.println("Warm StandBy Machines are : " + ws);
		}
	}

	public static void getSchedulingWarmStandByMadatoryFileds() {

		List<WebElement> list = driver
				.findElements(By.xpath("//*[@id=\"main\"]/div/div/div/div/form/fieldset/dl/dt/label"));
		Iterator<WebElement> it = list.iterator();

		while (it.hasNext()) {

			String s = it.next().getText();
			System.out.println("INFO: Scheduling Warm StandBy Madatory Fileds are : " + s);
		}
	}

	public static void setAddUserName(String sText) {

		setText(byAddUserName, "UserName", sText);
	}

	public static void selectMultipleDays(int a) throws InterruptedException {

	}

	public static void getThisFieldRequired() {

		getText(byThisFieldIsRequired, "Message");
	}

	// ******************************************* VALIDATIONS
	// ******************************************
	// ***************************************************************************************************

	public static void VerifyOtherOptions() {

		if (isElementPresent(byOtherOptions, "Other Options") == false) {
			System.out.println("Other option are minimised");
		} else {
			System.out.println("Other option are not minimised");
		}
	}

	public static void isRemoteHistorySortedOrder(String a) throws InterruptedException {
		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td['" + a + "']"));

		Iterator<WebElement> itr = row.iterator();
		WebElement row1 = itr.next();
		String name1 = row1.getText();
		System.out.println(name1);

		if (name1.contains("No remote backups have occurred")) {
			Assert.assertTrue(!name1.contains("No remote backups have occurred"));
		}

		while (itr.hasNext()) {
			WebElement row2 = itr.next();
			String name2 = row2.getText();

			System.out.println(name2);
			if ((name1.compareTo(name2)) < 0) {
				Assert.assertTrue((name1.compareTo(name2)) < 0);
				System.out.println("Filenames are in accending Order");

			} else if ((name1.compareTo(name2)) > 0) {
				Assert.assertTrue((name1.compareTo(name2)) > 0);
				System.out.println("Filenames are in Decending Order");
			} else {
				System.out.print("Filename was not found correctly");
			}
			break;
		}
	}

	public static boolean isRemoteHostConfigFielsPresent() {

		boolean encry = driver.findElement(By.name("encryptionkey_0")).isDisplayed();

		if (encry == true) {

			System.out.println("INFO: Encryption Key is present");
		} else {
			System.out.println("Encryption Key is not present");
		}

		isElementPresent(byFileSystemByTypeOnHost, "File System By Type On Host");

		isElementPresent(byHostName, "byHostName");

		isElementPresent(byHostPath, "Host Path");

		isElementPresent(byPauseRemoteBackupPresent, "Pause Remote Backup Present");

		isElementPresent(bySubmit, "Submit");
		return true;
	}

	public static boolean isFrequencyPresent() {

		return isElementPresent(byFrequency, "Frequency");
	}

	public static boolean isSubmitButtonPresent() {

		return isElementPresent(bySubmit, "Submit Button");
	}

	public static boolean isINeverIntendedToScheduleThisJob() {

		return isElementPresent(byINeverIntendedToScheduleThisJob, "I Never Intended To Schedule This Job");
	}

	public static boolean isBeginBackupPresent() {
		sleepApplication(2000);
		return isElementPresent(bySubmit, "Begin Backup");
	}

	public static boolean isProductKeyLabelPresent() {

		return isElementPresent(byProductKeyLabel, "Product Key Label");
	}

	public static boolean isEncryptionKeyPresent() {

		return isElementPresent(byEncryptionKey, "Encryption Key");
	}

	public static boolean isWarningPresent() {

		return isElementPresent(byWarning, "Warning");
	}

	public static boolean isBeginRestorationPresent() {

		return isElementPresent(bySubmit, "Begin Retoration");
	}

	public static boolean isEnterStandByModePresent() {

		return isElementPresent(byEnterStandByMode, "Enter StandBy Mode");
	}

	public static boolean isErrorMessageDisplayed() {

		return isElementPresent(byErrorMessage, driver.findElement(By.xpath("//*[@id='main']/div[1]")).getText());
	}

	public static boolean isMessageDisplayed() {

		return isElementPresent(findBy("//*[@id='main']/div[1]"),
				driver.findElement(By.xpath("//*[@id='main']/div[1]")).getText());
	}

	public static void setAllFieldsEmpty() {

		driver.findElement(By.xpath("//*[@id='id_encryptionkey_0']")).clear();
		driver.findElement(By.xpath("//*[@id='id_hostname']")).clear();
		driver.findElement(By.xpath("//*[@id='id_hostpath']")).clear();
	}

	public static void isCheckBoxStatus() {

		if (driver.findElement(By.xpath("//*[@id='id_schedule_never_ever']")).isSelected() == true) {
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='id_schedule_never_ever']")).isSelected() == true);
			System.out.println("Check Box is Selected");
		} else {
			Assert.assertTrue(driver.findElement(By.xpath("//*[@id='id_schedule_never_ever']")).isSelected() == false);
			System.out.println("Check Box is Not Selected");
		}
	}

}
