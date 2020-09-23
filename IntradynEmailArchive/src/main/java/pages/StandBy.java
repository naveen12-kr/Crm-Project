package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StandBy extends BasePage {

	/*****************************
	 * Stand By Overview
	 **************************************/

	public final static By byConfiguration = findBy("//div//li//a[contains(text(),'Configuration')]");
	public final static By byStandByOverViewDisp = findBy("//h1[contains(text(),'Warm Standby Overview')]");
	public final static By byValidTargetName = findBy("//*[@id=\"id_newName\"]");
	public final static By byAddStandByTarget = findBy("//*[@class=\"button1\"]");
	public final static By byBackup = findBy("//span[contains(text(),'Backup')]");
	public final static By byAddingTargetDisp = findBy("//div//h1[contains(text(),'Adding Warm Standby Target')]");
	public final static By byProductKey = findBy("//*[@id=\"id_productkey\"]");
	public final static By byIPAddress = findBy("//*[@id=\"id_address\"]");
	public final static By bySaveButton = findBy("//*[@id=\"submit\"]");

	/***************************** Magnifier **************************************/

	public final static By byMagnifierIcon = findBy("//img[contains(@src, '/media/webcore/imgs/view.png')]");
	public final static By byProcessDetailsDisp = findBy("//div//h1[contains(text(),'Process Details: standby')]");

	/*****************************
	 * Calendar Icon
	 **************************************/

	public final static By byWarmStandByDisp = findBy("//div//h1[contains(text(),'Scheduling Warm Standby')]");
	public final static By byWeekdaysField = findBy("//*[@id=\"id_weekdays\"]");
	public final static By byShutdownField = findBy("//*[@id=\"id_starttime\"]");
	public final static By byReactivationField = findBy("//*[@id=\"id_endtime\"]");
	public final static By byEditTargetName = findBy("//*[@id='id_targetname']");
	public final static By byEditProductKey = findBy("//*[@id='id_productkey']");
	public final static By byEditIPAddress = findBy("//*[@id='id_address']");
	public final static By byUpdateButton = findBy("//*[@id='submit']");

	/******************************************
	 * CLICKER
	 *************************************/
	/********************* Pencil Icon***********************************/
	public final static By byTargetName = findBy("//*[@id=\"id_targetname\"]");
	public final static By byUpdatedisp = findBy("//div//h1[contains(text(),'Updating Standby Target')]");
	public final static By byUpdatingTarget = findBy("//*[@id='main']/div[1]");
	
	/********************* Delete Icon***********************************/
	public final static By byDeleteIcon = findBy("//*[@id=\"main\"]/div/div/div/div/table/tbody/tr[2]/td[5]/form/input[2]");
	

	public static void clickOnBackup() {

		clickElement(byBackup, "Backup");
	}
	
	public static void clickOnDeleteIcon() {

		clickElement(byDeleteIcon, "Delete");
	}
	
	public static void clickOnCancelForPopup() throws InterruptedException {
	
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		System.out.println("Canceled successfully");
	}
	
	public static void clickOnOKForPopup() throws InterruptedException {
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		System.out.println("  "); 
		System.out.println("Deleted successfully");
	}

	public static void clickOnConfiguration() {

		clickElement(byConfiguration, "Configuration");
	}

	public static void clickOnAddStandByTarget() {

		clickElement(byAddStandByTarget, "Add Stand By Target");
	}

	public static void clickOnSaveButton() {

		clickElement(bySaveButton, "Save Button");
	}
	
	public static void clickOnSubmitButton() {

		clickElement(bySaveButton, "Save Button");
	}
	
	public static void clickOnUpdateButton() {

		clickElement(bySaveButton, "Update Button");
	}


	public static void clickOnMagnifierIcon() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/table"));
		List<WebElement> mg = table
				.findElements(By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr//td[5]//a[1]"));

		System.out.println("No.of rows: "+mg.size());
		String[] nameArray = new String[mg.size()];

		for (int i = 0; i < mg.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/table"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr['" + i + "']//td[1]"));

			nameArray[i] = row.get(i).getText();

			System.out.println("Warm Standby Tag Nmae: " + row.get(i).getText());

			Thread.sleep(2000);

			List<WebElement> mg1 = table1.findElements(
					By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr['" + i + "']//td[5]//a[1]"));
			mg1.get(i).click();
			break;

		}

	}

	public static void clickOnCalendarIcon() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/table"));
		List<WebElement> mg = table
				.findElements(By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr//td[5]//a[2]"));

		System.out.println(mg.size());
		String[] nameArray = new String[mg.size()];

		for (int i = 0; i < mg.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/table"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr['" + i + "']//td[1]"));

			nameArray[i] = row.get(i).getText();

			System.out.println("Warm Standby Tag Nmae: " + row.get(i).getText());

			Thread.sleep(2000);

			List<WebElement> mg1 = table1.findElements(
					By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr['" + i + "']//td[5]//a[2]"));
			mg1.get(i).click();
			
			break;
		}
	}

	public static void clickOnAlwaysRadioButton() throws InterruptedException {

		
			driver.findElement(By.xpath("//*[@id='id_haveSched_0']")).click();
			System.out.println("Always (Preffered) option is selected");

			Thread.sleep(3000);
	}

	public static boolean isScheduledChengesSuccesfully() {

		WebElement message = driver.findElement(By.xpath("//*[@id='main']/div[1]"));
		String msg = message.getText();

		System.out.println(msg);
		return msg != null;

	}

	public static void clickOnScheduledDailyDowntime() throws InterruptedException {

			driver.findElement(By.xpath("//*[@id='id_haveSched_1']")).click();
			System.out.println("Sheduled Daily Downtime option is selected");
		
	}

	public static void getSingleDaySelected() throws InterruptedException {

		List<WebElement> itemsInDropdown = driver.findElements(By.xpath("//*[@id='id_weekdays']/option"));
		int daysSize = itemsInDropdown.size();
		int randNum = ThreadLocalRandom.current().nextInt(0, daysSize);

		System.out.println("Index number :" + randNum);

		String day = itemsInDropdown.get(randNum).getText();
		System.out.println("The current day :" + day);

		WebElement items = driver.findElement(By.xpath("//*[@id='id_weekdays']"));
		Select s = new Select(items);

		s.deselectAll();
		Thread.sleep(3000);

		s.selectByIndex(randNum);
		Thread.sleep(3000);

		boolean status = itemsInDropdown.get(randNum).isSelected();

		System.out.println(status);

	}

	public static void getMultipleDaysSelected() throws InterruptedException {

		List<WebElement> itemsInDropdown = driver.findElements(By.xpath("//*[@id='id_weekdays']/option"));

		WebElement items = driver.findElement(By.xpath("//*[@id='id_weekdays']"));

		int daysSize = itemsInDropdown.size();
		int randNum1 = ThreadLocalRandom.current().nextInt(0, daysSize);
		int randNum2 = ThreadLocalRandom.current().nextInt(0, daysSize);
		int randNum3 = ThreadLocalRandom.current().nextInt(0, daysSize);

		String day1 = itemsInDropdown.get(randNum1).getText();
		String day2 = itemsInDropdown.get(randNum2).getText();
		String day3 = itemsInDropdown.get(randNum3).getText();

		System.out.println("The week day selected :" + day1 + "," + day2 + " and " + day3);

		Select s = new Select(items);
		s.isMultiple();

		s.deselectAll();
		Thread.sleep(3000);

		if (s.isMultiple()) {
			s.selectByVisibleText(day1);
			s.selectByVisibleText(day2);
			s.selectByVisibleText(day3);

			System.out.println("Multiple selection is done");
			Thread.sleep(3000);
		} else {
			System.out.print("Not supported multiple selections");
		}
	}

	public static void clickOnPencilIcon() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/table"));
		List<WebElement> pc = table
				.findElements(By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr//td[5]//a[3]"));

		System.out.println(pc.size());
		String[] nameArray = new String[pc.size()];

		for (int i = 0; i < pc.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/table"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr['" + i + "']//td[1]"));

			nameArray[i] = row.get(i).getText();

			System.out.println("Warm Standby Tag Nmae: " + row.get(i).getText());

			Thread.sleep(2000);

			List<WebElement> pencil = table1.findElements(
					By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr['" + i + "']//td[5]//a[3]"));
			pencil.get(i).click();

			break;
		}

	}

	public static void clickOnEditPencilIcon() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/table"));
		List<WebElement> pc = table
				.findElements(By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr//td[5]//a[3]"));

		System.out.println(pc.size());
		String[] nameArray = new String[pc.size()];

		for (int i = 0; i < pc.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/table"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr['" + i + "']//td[1]"));

			nameArray[i] = row.get(i).getText();

			System.out.println("Warm Standby Tag Nmae: " + row.get(i).getText());

			Thread.sleep(2000);

			List<WebElement> pencil = table1.findElements(
					By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr['" + i + "']//td[5]//a[3]"));
			pencil.get(i).click();

			Thread.sleep(3000);

			isUpdateStandbyTargetDisp();

			driver.navigate().back();
			driver.navigate().refresh();

			Thread.sleep(2000);

		}

	}
	
	
	public static void clickOnPencilIconToUpdate() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/table"));
		List<WebElement> pc = table
				.findElements(By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr//td[5]//a[3]"));

		System.out.println("No.of rows: "+pc.size());
		String[] nameArray = new String[pc.size()];

		for (int i = 0; i < pc.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/table"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr['" + i + "']//td[1]"));

			nameArray[i] = row.get(i).getText();

			System.out.println("Warm Standby Tag Nmae: " + row.get(i).getText());

			Thread.sleep(2000);

			List<WebElement> pencil = table1.findElements(
					By.xpath("//*[@id='main']/div/div/div/div/table//tbody//tr['" + i + "']//td[5]//a[3]"));
			pencil.get(i).click();

			Thread.sleep(3000);

			isUpdateStandbyTargetDisp();
			
			clickOnUpdateButton();
			
			isUpdateTargetDisp();

			Thread.sleep(2000);

		}

	}



	/************************************************
	 * Validation
	 * @throws InterruptedException 
	 ************************************/

	
	public static void isPopupWindowDisp() throws InterruptedException {

		
		String alert = driver.switchTo().alert().getText();
		System.out.print(alert);
	
	}
	
	public static void isStandByOverViewDisp() {

		isElementPresent(byStandByOverViewDisp, "StandBy Over View");
	}

	public static void isScheduledownTimeFieldsPresent() {

		isElementPresent(byWeekdaysField, "Week Days");
		isElementPresent(byShutdownField, "Shutdown Time");
		isElementPresent(byReactivationField, "Reactivation Time");
	}

	public static void isAddingTargetDisp() {

		isElementPresent(byAddingTargetDisp, "Adding Target Name Display");
	}

	public static void isProcessDetailsDisp() {

		isElementPresent(byProcessDetailsDisp, "Process Details: Standby");
	}

	public static void isWarmStandByDisp() {

		isElementPresent(byWarmStandByDisp, "Sheduling Warm Standby");
	}

	public static void isUpdateStandbyTargetDisp() {

		isElementPresent(byUpdatedisp, "Update Standby Target");
	}
	
	public static void isUpdateTargetDisp() {
		
		String UpdatedTarget = driver.findElement(By.xpath("//*[@id='main']/div[1]")).getText();
		System.out.println(UpdatedTarget);

	}
	

	/************************************
	 * SETTERS
	 *********************************************/

	public static void setValidTargetName(String StandByTargetName) {
		setText(byValidTargetName, "Valid StandBy Target", StandByTargetName);

	}

	public static void setProductKey(String ProductKey) {
		setText(byProductKey, "Product Key", ProductKey);

	}
	
	public static void setTargetName(String targetName) {
		
		clearText(byTargetName, "Target Name");
		
		String StandByName = getRandomString(8);
		
		setText(byTargetName, "Target Name", StandByName);
	}

	
	public static void editProductKey(String ProductKey) throws InterruptedException {
		
		clearText(byProductKey, "Product Key");
		Thread.sleep(5000);
		
		String ProductKey1 = getRandomString(25);
				
		setText(byProductKey, "Product Key", ProductKey1);

	}
	
	public static void editIp(String ip) throws InterruptedException {
		
		clearText(byIPAddress, "Ip");
		Thread.sleep(5000);
		
		String IPAddress = getRandomIntiger(3);
		
		driver.findElement(By.xpath("//*[@id='id_address']")).sendKeys("10.100.1."+IPAddress);

	}


	public static void setIPAddress(String IPAddress) {
		setText(byIPAddress, "FQDN or IP Address", IPAddress);

	}

}
