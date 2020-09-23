package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SavedSearches extends BasePage {

	public static final By byRunIcon = findBy("//*[@class='saved-table']/tbody/tr[2]/td[4]/input");
	public static final By byEditIcon = findBy("//*[@class='saved-table']/tbody/tr[2]/td[6]");
	public static final By byDeleteCrossIcon = findBy("//*[@id='main']//table/tbody/tr[2]/td[7]/input");
	public static final By byCalenderIcon = findBy("//*[@id='main']//table/tbody/tr[2]/td[5]/input");
	public static final By byDeleteCross = findBy("//*[@id=\"delete\"]");
	public static final By bySavedSearchCriteria = findBy("//*[@id='save_search']/span");
	public static final By byUserName = findBy("//*[@id='save_searchterm']/input[@id='save_name']");
	public static final By byDesc = findBy("//*[@id='save_description']");
	public static final By bySSCSaveButton = findBy("//*[@id='save_searchterm']/div/button");
	public static final By byscheduleIcon = findBy("//table[@class='saved-table']/tbody/tr[2]/td[5]/input");

	public static String L;
	public static String S;
	public static String searchRunData;

	////////////////////////////// CLICKERS
	////////////////////////////// /////////////////////////////////////

	public static void clickOnIcon(int data) {

		L = driver.findElement(By.xpath("//*[@id='schedPane']/table[1]/tbody/tr[2]/td[1]")).getText();

		clickElement(findBy("//*[@id='schedPane']/table[1]/tbody/tr[2]/td[" + data + "]"), "Disable down arrow");
	}

	public static void clickOnEnableIcon(int data) {

		S = driver.findElement(By.xpath("//*[@id='schedPane']/table[2]/tbody/tr[2]/td[1]")).getText();

		clickElement(findBy("//*[@id='schedPane']/table[2]/tbody/tr[2]/td[" + data + "]"), "Enable up arrow");
	}

	public static void clickOnRunIcon() {

		getHandOverText();
		clickElement(byRunIcon, "Run Icon");
	}

	public static void clickOnEditIcon() {
		clickElement(byEditIcon, "Edit Icon");
		sleepApplication(3000);
	}

	public static void clickOnSaveChangesButton() {
		clickElement(findBy("//*[@id='save_edits']"), "Save Changes Button");

	}

	public static void clickOnClearFieldsIcon() {
		clickElement(findBy("//*[@id='reset_format']"), "Clear Fields");

	}

	public static void isRequiredMessageDisplayed(String data) {
		String text = getText(findBy("//*[contains(text(),'" + data + "')]"), "Message");
		System.out.println(text);
		Assert.assertTrue(text.contains(data));

	}

	public static void isMessageDisplayed(String data) {
		String text = getText(findBy("//*[@class='error']"), "Message");
		System.out.println(text);
		Assert.assertTrue(text.contains(data));

	}

	public static void isMessageSentDisplayed(String data) {
		String text = getText(findBy("//*[@id='main']/div[1]"), "Message");
		System.out.println(text);
		Assert.assertTrue(text.contains(data));

	}

	public static void isFieldsCleared() {
		String text = getText(findBy("//*[@id='name']"), "Data");
		Assert.assertTrue(text.contains(""));

	}

	public static void clickOnDeleteIcon() {

		clickElement(byDeleteCrossIcon, "Delete");
	}

	public static void isSuccessMessageDisplayed(String data) {
		String text = getText(findBy("//*[@id='main']/div[1]"), "Message");
		System.out.println(text);
		Assert.assertTrue(text.contains(data));
	}

	public static void clickOnMagnifyingGlassIcon() {

		clickElement(findBy("//*[@class='scheduled-table']/tbody/tr[2]/td[4]"), "Magnifying Glass");
	}

	public static void isEmailCountMatched() {
		String emailCount = driver.findElement(By.xpath("//*[@id='total_count']")).getText();
		clickElement(findBy("//*[@id='schedRunBar']"), "plus Icon");
		sleepApplication(2000);
		String hits = driver.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[2]/td[3]")).getText();
		Assert.assertTrue(emailCount.contains(hits));
	}

	public static void clickOnDelete() {

		clickElement(byDeleteCross, "Delete");
	}

	public static void clickOnCalenderIcon() {

		clickElement(byCalenderIcon, "CalenderIcon");
	}

	public static void clickOnCalenderIconSame() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//table[@class='saved-table']"));
		List<WebElement> rows = table.findElements(By.xpath("//table[@class='saved-table']/tbody/tr/td[1]"));
		System.out.println("********************" + rows.size());
		String name1 = SavedSearches.setUser();
		System.out.println("------" + name1);
		for (int i = 0; i <= rows.size(); i++) {
			System.out.println("****" + rows.get(i).getText());
			String[] s = rows.get(i).getText().split(" ", 0);
			System.out.println("******" + s[0]);

			if (s[0].equals(name1)) {
				driver.findElement(By.xpath("//table[@class='saved-table']/tbody/tr['" + i + "']/td[5]/input")).click();
				System.out.println("INFO: Clicking on " + s);
			}
		}
	}

	public static void clickOnCollapseIcon() {

		driver.findElement(By.xpath("//div//h3[@id='schedBar']")).click();
	}

	public static void clickOnSavesSearchCriteria() {

		clickElement(bySavedSearchCriteria, "Saved search criteria");
	}

	public static void clickOnSSCSaveButton() {

		clickElement(bySSCSaveButton, "Saved search criteria Save Button");
	}

	public static void clickOnSavedsearchQueriesIcons(String name) throws InterruptedException {

		List<WebElement> list = driver.findElements(By.xpath("//table[@class='saved-table']/tbody/tr[1]/th"));
		for (int i = 0; i < list.size(); i++) {

			String s = list.get(i).getText();

			String data = "0";
			if (s.equals(name)) {

				switch (s) {

				case "Schedule":
					data = "5";
					break;
				case "run":
					data = "3";
					break;
				case "edit":
					data = "5";
					break;
				}

				driver.findElement(By.xpath("//table[@class='saved-table']/tbody/tr[2]/td[" + data + "]/input"))
						.click();
				System.out.println("INFO: User clicks on " + s + " icon");
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(5000);
			}
		}
	}

	public static void clickOnScheduleIconInSS() throws InterruptedException {

		clickElement(byscheduleIcon, "Schedule Icon");

	}

	public static void clickOnDeleteOption(String data) {
		searchRunData = getText(findBy("//*[@class='scheduled-table']/tbody/tr[2]/td[2]"), "Search Run Data");
		if (data.equals("Multiple")) {
			clickElement(findBy("//*[@class='scheduled-table']/tbody/tr[2]/td[1]"), "Check Box");
			clickElement(findBy("//*[@class='scheduled-table']/tbody/tr[3]/td[1]"), "Check Box");
		}
		if (data.equals("Single")) {
			clickElement(findBy("//*[@class='scheduled-table']/tbody/tr[2]/td[1]"), "Check Box");
		}
		clickElement(findBy("//*[@id='delete']"), "Delete Option");

	}

	////////////////////////////// Getters and Setters
	////////////////////////////// /////////////////////////////////////

	public static void getHandOverText() {

		String tname = driver.findElement(By.xpath("//*[@class='saved-table']/tbody/tr[2]/td[4]/input"))
				.getAttribute("title");
		System.out.println("INFO: " + tname + " is successfully");
	}

	public static void getDisabledSearches() {

		WebElement table = driver.findElement(By.xpath("//*[@id='schedPane']/table[2]/tbody/tr/td[1]"));

		List<WebElement> row1 = table.findElements(By.xpath("//*[@id='schedPane']/table[2]/tbody/tr/td[1]"));

		for (int i = 0; i <= row1.size(); i++) {

			int j = i + 2;
			String s = driver.findElement(By.xpath("//*[@id='schedPane']/table[2]/tbody/tr[" + j + "]/td[1]"))
					.getText();

			if (s.equals(L)) {

				Assert.assertEquals(s, L);

				System.out.println("INFO: search name " + L + " is added into Disabled Searches");
				break;
			} else {
				System.out
						.println("INFO: The filename and its upload information are not displayed in the table below.");
			}
		}

	}

	public static void setSchedulingSearch(String data, String sText) {
		WebElement selectElement = driver.findElement(By.xpath("//*[@id='id_" + data + "']"));
		Select select = new Select(selectElement);
		select.selectByValue(sText);
	}

	public static void setSchedulingSearchData(String data, String sText) {
		WebElement selectElement = driver.findElement(By.xpath("//*[contains(@name,'" + data + "')]"));
		Select s = new Select(selectElement);

		List<WebElement> ss = s.getAllSelectedOptions();

		for (int i = 0; i < ss.size(); i++) {
			String text = ss.get(i).getText();
			System.out.println("INFO: Selected weekly days are : " + text);
		}
		
		s.selectByValue(sText);

	}
	public static void getEnabledSearches() {

		WebElement table = driver.findElement(By.xpath("//*[@id=\"schedPane\"]/table[1]/tbody/tr/td[1]"));

		List<WebElement> row1 = table.findElements(By.xpath("//*[@id=\"schedPane\"]/table[1]/tbody/tr/td[1]"));

		for (int i = 0; i <= row1.size(); i++) {

			int j = i + 2;
			String s = driver.findElement(By.xpath("//*[@id=\"schedPane\"]/table[1]/tbody/tr[" + j + "]/td[1]"))
					.getText();

			if (s.equals(S)) {

				Assert.assertEquals(s, S);

				System.out.println("INFO: search name " + S + " is added into Disabled Searches");
				break;
			} else {
				System.out.println(
						"INFO: The filename and its upload information are  not displayed in the table below.");
			}
		}
	}

	public static String setUser() throws InterruptedException {
		Thread.sleep(2000);
		String name = getRandomStringsmallchr(8);
		clearText(byUserName, "");
		Thread.sleep(2000);
		setText(byUserName, "User Name", name);
		return name;
	}

	public static void setDesc(String arg1) throws InterruptedException {
		String name = getRandomStringsmallchr(8);
		clearText(byDesc, "");
		Thread.sleep(2000);
		setText(byDesc, "Description", name);
	}

	////////////////////////////// VALIDATION ///////////////////////////////

	public static void isScheduledSearchesPresent() {
		sleepApplication(3000);
		Assert.assertFalse(
				driver.findElement(By.xpath("//*[@id='schedPane']/table[1]/tbody/tr[2]/td[1]")).isDisplayed());
		System.out.println("INFO: Scheduled Search List disappears");
	}

	public static void isScheduledSearchesPresent2() {
		Assert.assertTrue(
				//driver.findElement(By.xpath("//*[@id=\"schedPane\"]/table[2]/tbody/tr[1]/th[1]")).isDisplayed());
		     driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[4]/div[1]/div[1]/table[1]")).isDisplayed());
		
		System.out.println("INFO: Scheduled Search List 2 is disappears");
	}

	public static void isScheduledsearchRunsPresent() {
		sleepApplication(3000);
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id='schedRunPane']/table/tbody/tr[2]")).isDisplayed());
		System.out.println("INFO: Scheduled search runs is opend with Search run time and Hits list");
	}

	public static boolean isRequiredDataPresent() {
		boolean V = driver.findElement(By.xpath("//*[@id='id_weekdays']")).isDisplayed();
		Assert.assertTrue(V);
		System.out.println("INFO: week days, Run time, Notification email addresses, Tags options should be visible");
		return V;
	}

	public static void selectOneDayFromWeekdays(String sText, String data) {

		// setSelectBoxText(byTag, "Tag", Maintenance.P)
		WebElement selectElement = driver.findElement(By.xpath("//*[contains(@name,'" + data + "')]"));
		Select select = new Select(selectElement);
		select.selectByVisibleText(sText);
		System.out.println("INFO: Day of the weekto run search on: " + sText);

	}

	public static void selectMultipleDaysFromWeekdays(String sText, String data) {
		WebElement selectElement = driver.findElement(By.xpath("//*[contains(@name,'" + data + "')]"));
		Select select = new Select(selectElement);
		select.selectByVisibleText(sText);
		select.selectByVisibleText("Friday");
		System.out.println("INFO: Days of the week to run search on: " + sText + " and Friday");

	}

	public static void selectTag() {
		WebElement table = driver.findElement(By.xpath("//*[@id='id_tags']"));
		List<WebElement> row1 = table.findElements(By.xpath("//*[@id='id_tags']/option"));
		row1.get(1).click();
	}

	public static void isSearchRunDataDeleted() {
		sleepApplication(3000);
		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[2]"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[2]"));
		for (int i = 0; i < row.size(); i++) {
			String data = row.get(i).getText();
			Assert.assertTrue(!data.equals(searchRunData));
			if (i == (row.size()) - 1) {
				break;
			}
		}
	}

	public static void isSearchRunDataDisplayed() {
		sleepApplication(3000);
		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[2]"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[2]"));
		String data = row.get(0).getText();
		Assert.assertTrue(data.equals(searchRunData));
	}

	public static void isFeildsAreEditable(String data, String sText, String text) throws InterruptedException {
		Thread.sleep(5000);
		String sr = driver.findElement(By.xpath("//*[@id='total_count']")).getText();

		int a = Integer.parseInt(sr);
		if (a == 0) {
			System.out.println(
					"INFO : Here no of mails for this search are 0. So, here we can't verify the respective search ");
		} else {
			List<WebElement> row = driver.findElements(By.xpath("//*[@id='emails-list']/div[3]/div/div/div[3]/div[1]"));

			row.get(0).click();
			Thread.sleep(5000);
			if (data.equals("email body")) {
				MyLabels.startDate1 = driver.findElement(By.xpath("(//*[contains(@style,'padding')])[1]")).getText();
			} else {

				List<WebElement> row1 = driver.findElements(By.xpath("//*[@id='msgView']/tbody/tr/td[1]"));

				for (int i = 0; i < row1.size(); i++) {

					if (data.equals("Email From/To")) {
						int j = i + 1;
						MyLabels.startDate1 = driver
								.findElement(By.xpath("//*[@id='msgView']/tbody/tr[" + j + "]/td[2]")).getText();
						if (sText.contains("none")) {
							if (i == 1) {
								break;
							}
						} else {
							if (MyLabels.startDate1.contains("adam")) {
								break;
							}
						}

					} else {
						if (row1.get(i).getText().equals(data)) {
							if (row1.get(i).getText().equals("To:")) {
								int j = i + 1;
								int k = j + 1;
								MyLabels.startDate1 = driver
										.findElement(By.xpath("//*[@id='msgView']/tbody/tr[" + j + "]/td[2]")).getText()
										+ driver.findElement(By.xpath("//*[@id='msgView']/tbody/tr[" + k + "]/td[2]"))
												.getText();
								break;
							} else {
								int j = i + 1;
								MyLabels.startDate1 = driver
										.findElement(By.xpath("//*[@id='msgView']/tbody/tr[" + j + "]/td[2]"))
										.getText();
								break;
							}
						}
					}
				}
			}
			System.out.println(MyLabels.startDate1);
			sleepApplication(3000);
			if (text.contains("stopover satiate inadvertent") || text.contains("curvature dairyman")) {
				Assert.assertTrue(MyLabels.startDate1.contains(text));
				System.out.println("Search successfully");
			} else {
				Assert.assertFalse(MyLabels.startDate1.contains("zzz"));
				System.out.println("Search successfully");
			}
		}

	}

}
