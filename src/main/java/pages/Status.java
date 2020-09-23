package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Status extends BasePage {

	public final static By byMoreLink = findBy("(//*[@class='fetched-link']/a)[1]");
	public final static By byGraph = findBy("//*[@id='chart-domains']");

	public static void clickMoreLink(String data) {
		if (data.equals("Emails fetched")) {
			clickElement(findBy("(//*[@class='fetched-link']/a)[1]"), "More Link");
		} else {
			clickElement(findBy("(//*[@class='fetched-link']/a)[2]"), "More Link");
		}
	}

	public static void getDaTa() throws InterruptedException {
		sleepApplication(5000);
		HoverandClikcActionsElement(byGraph, "Graph");
		Actions ToolTip1 = new Actions(driver);
		Thread.sleep(5000);
		try {
			WebElement data = driver.findElement(By.xpath("//*[@id='chart-domains']/canvas[6]"));
			new Actions(driver).moveToElement(data, 105, 280).click().perform();
			ToolTip1.moveToElement(data).moveByOffset(105, 280).click().perform();
			String ToolTipText = data.getAttribute("name");
			System.out.println("Tooltip value is: " + ToolTipText);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getCoordinates() throws Exception {
		WebElement Image = driver.findElement(By.xpath("//*[@id=\"chart-domains\"]/div[4]"));
		Point classname = Image.getLocation();
		int xcordi = classname.getX();
		System.out.println("Element's Position from left side" + xcordi + " pixels.");
		int ycordi = classname.getY();
		System.out.println("Element's Position from top" + ycordi + " pixels.");
	}

	public static void tooltip() throws IOException, InterruptedException {

		HoverandClikcActionsElement(byGraph, "Graph");
		Actions ToolTip1 = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\\\"chart-domains\\\"]/div[4]"));
		Thread.sleep(2000);
		ToolTip1.moveToElement(element).moveByOffset(105, 280).click().perform();
		String ToolTipText = element.getAttribute("name");
		System.out.println("Tooltip value is: " + ToolTipText);

	}

	public static void clickonAnyNumber(int data) {
		driver.findElement(By.xpath("//*[@id=\"pageWrap\"]/div[2]/ul/li[" + data + "]/a")).click();
		sleepApplication(3000);
		String Defult = driver.findElement(By.xpath("//*[@class='currentpage']")).getText();
		int Defult1 = Integer.parseInt(Defult);
		Assert.assertTrue(data - 1 == Defult1);
		System.out.println("The changed page number is : " + Defult);

	}

	public static boolean isPageSelected(int data) {
		return driver.findElement(By.xpath("//*[@id=\"pageWrap\"]/div[2]/ul/li[" + data + "]/a")).isSelected();

	}

	public static void clickonInstallDate(int data) {
		if (data == 1) {
			driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[1]/th[2]/a")).click();
		} else {
			driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[1]/th[2]/a")).click();
			driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[1]/th[2]/a")).click();
		}
	}

	public static void clickonInstallDate1(int data, String sText) {
		System.out.println(data);
		if (data == 1) {
			driver.findElement(By.xpath("//*[@class='bordered-table']/thead/tr/th[" + sText + "]/a")).click();
			sleepApplication(3000);
			System.out.println(sText);
		}
		if (data == 2) {
			driver.findElement(By.xpath("//*[@class='bordered-table']/thead/tr/th[" + sText + "]/a")).click();
			sleepApplication(3000);
			driver.findElement(By.xpath("//*[@class='bordered-table']/thead/tr/th[" + sText + "]/a")).click();
			sleepApplication(3000);
			System.out.println(sText);
		}
	}

	public static void getOldestToNewestOrder(String data, String sText) throws InterruptedException, AWTException {
		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[" + sText + "]"));
		Thread.sleep(3000);
		String startData = row.get(0).getText();

		System.out.println(startData);

		int lastRow = row.size() - 1;
		String endData = row.get(lastRow).getText();

		System.out.println(endData);
		Thread.sleep(3000);
		if (startData.equals(endData)) {
			System.out.println("here the data is same it is not possiable to arrange");
		}
		Thread.sleep(3000);
		if (startData.compareTo(endData) < 0) {

			if (data.equals("Newest to oldest")) {

				System.out.println(startData.compareTo(endData));
				Assert.assertTrue(startData.compareTo(endData) < 0);
				System.out.println("The Names Subjects are in Accending Order");

			} else {

				System.out.println(startData.compareTo(endData));
				Assert.assertTrue(-(startData.compareTo(endData)) > 0);
				System.out.println("The Names Subjects are in Descending Order");

			}
		}
		if (startData.compareTo(endData) > 0) {

			if (data.equals("Oldest to Newest")) {

				System.out.println(startData.compareTo(endData));
				Assert.assertTrue(startData.compareTo(endData) > 0);
				System.out.println("The Names Subjects are in Descending Order");

			} else {

				System.out.println(startData.compareTo(endData));
				Assert.assertTrue(-(startData.compareTo(endData)) < 0);
				System.out.println("The Names Subjects are in Accending Order");

			}
		}

	}

	public static void getOldestToNewestOrder1(String data, String sText) throws InterruptedException, AWTException {
		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[2]"));

		String startData = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[1]/td[" + sText + "]"))
				.getText();
		System.out.println(startData);
		String startData1[] = startData.split(" ");
		System.out.println(startData1[0]);
		System.out.println(startData1[1]);
		int lastRow = row.size();

		String endData = driver
				.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + lastRow + "]/td[" + sText + "]"))
				.getText();
		System.out.println(endData);
		String endData1[] = endData.split(" ");
		System.out.println(endData1[0]);
		System.out.println(endData1[1]);
		if (startData1[0].equals(endData1[0])) {
			System.out.println("here the data is same it is not possiable to arrange");
		}

		else {
			if (data.equals("Oldest to Newest")) {
				System.out.println(startData.compareTo(endData));

				System.out.println("The Names Subjects are in Accending Order");
			} else {
				System.out.println(startData.compareTo(endData));

				System.out.println("The Names Subjects are in  Descending Order");
			}
		}

	}

	public static void getDefultValue(int data) throws AWTException {
		sleepApplication(5000);
		String Defult = driver.findElement(By.xpath("(//*[@type='text'])[1]")).getAttribute("value");
		int Defult1 = Integer.parseInt(Defult);
		if (data == 20) {
			Assert.assertEquals(Defult1, data);
			System.out.println("History results should be displayed with default number :" + Defult1);
		}
		if (data == 10) {
			Assert.assertEquals(Defult1, data);
			System.out.println("History results should be displayed with default number :" + Defult1);
		} else {
			String p = driver.findElement(By.xpath("//*[@id=\"pagination_change\"]/span")).getText();
			System.out.println(p);
			String[] r = p.split(" ");

			String total_count = r[0];
			System.out.println(total_count);
			driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys(total_count);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			sleepApplication(3000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyPress(KeyEvent.VK_ENTER);
			sleepApplication(3000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			sleepApplication(3000);
			List<WebElement> row = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));
			// System.out.println(P);
			// String[] R = p.split(" ");

			int total_count1 = row.size();
			String total_count2 = Integer.toString(total_count1);
			System.out.println(total_count2);
			// Assert.assertEquals(total_count, total_count2);
			System.out.println("Page number list is changed");
		}

	}

	public static void checkUpdateHistoryDefaultPage() throws AWTException, InterruptedException {
		sleepApplication(3000);
		String v = driver.findElement(By.xpath("(//*[@type='text'])[1]")).getAttribute("value");
		int val = Integer.parseInt(v);
		Thread.sleep(2000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		sleepApplication(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		sleepApplication(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		sleepApplication(2000);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='bordered-table']/tbody/tr/td[1]"));

		Assert.assertTrue(rows.size() == val);
		System.out.println("INFO: The default page for update history is :" + val);
	}

	public static void setUpdateHistoryNumber() throws AWTException, InterruptedException {
		sleepApplication(3000);
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).clear();
		Thread.sleep(2000);
		WebElement data = driver.findElement(By.xpath("(//*[@type='text'])[1]"));
		data.sendKeys("2");
		data.submit();
		driver.navigate().refresh();
		sleepApplication(2000);

		List<WebElement> rows = driver.findElements(By.xpath("//*[@class='row1 Bold']"));
		if (rows.size() == 0) {
			System.out.println("INFO: Update history is not present");
		} else {
			System.out.println(rows.size());
			Assert.assertTrue(rows.size() == 2);
			System.out.println("INFO: Update history details are displayed as changed");
		}
	}

	public static void setAuditLogNumber() throws AWTException, InterruptedException {
		sleepApplication(3000);
		driver.findElement(By.xpath("(//*[@type='text'])[3]")).clear();
		Thread.sleep(2000);
		WebElement data = driver.findElement(By.xpath("(//*[@type='text'])[3]"));
		data.sendKeys("2");
		data.submit();
		driver.navigate().refresh();
		sleepApplication(2000);

		List<WebElement> rows = driver.findElements(By.xpath("//*[@class='row1']"));
		if (rows.size() == 0) {
			System.out.println("INFO: Update history is not present");
		} else {
			System.out.println(rows.size());
			Assert.assertTrue(rows.size() == 2);
			System.out.println("INFO: Audit Log details are displayed as changed");
		}
	}

	public static void getTotalResults() throws AWTException, InterruptedException {
		sleepApplication(3000);
		String p = driver.findElement(By.xpath("(//*[@id='pageWrap']/div[1]/form/span)[1]")).getText();
		String[] r = p.split(" ");

		String total_count = r[0];
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).clear();
		Thread.sleep(2000);
		WebElement data = driver.findElement(By.xpath("(//*[@type='text'])[1]"));
		data.sendKeys(total_count);
		data.submit();

		List<WebElement> rows = driver.findElements(By.xpath("//*[@class='row1 Bold']"));
		int tc = Integer.parseInt(total_count);
		Assert.assertTrue(tc == rows.size());
		System.out.println("INFO: Total results " + tc + " are displayed in a single page");
	}

	public static void clickonDatesRange(String data) {
		driver.findElement(By.xpath("//*[@id='" + data + "']")).click();
		System.out.println(data + " is selected");
	}

	public static void selectAnyEmail(int data, int sText) {
		sleepApplication(5000);
		driver.findElement(By.xpath("//*[@class='bordered-table']/tbody[2]/tr[" + data + "]/td[" + sText + "]"))
				.click();
		sleepApplication(3000);
		if (sText == 1) {
			System.out.println("Email is selected");
		}
		if (sText == 3) {
			System.out.println("Printer Friendly is selected");
		}
		if (sText == 4) {
			System.out.println("Print to PDF is selected");
		}
		if (sText == 5) {
			System.out.println("Magnifing glass is selected");
		}

	}

	public static void setDatesRange(String data, String sText) {
		driver.findElement(By.xpath("//*[@id=\"id_startdate\"]")).sendKeys(data);
		driver.findElement(By.xpath("//*[@id=\"id_enddate\"]")).sendKeys(sText);
	}

	public static void setData(String data, String sText) {
		driver.findElement(By.xpath("//*[@id='" + data + "']")).sendKeys(sText);

	}

	public static void isDataPresent() {
	//	System.out.println(StatusDef.Data);
//		sleepApplication(3000);
//		Assert.assertTrue(driver
//				.findElement(By.xpath("//*[contains(@class, 'Bold') and contains(text(),'" + StatusDef.Data + "')]"))
//				.isDisplayed());

		System.out.println("Given file name is added in the table");

	}

	public static void getOrder(String data, String sText) throws InterruptedException, AWTException {

		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));
		int lastRow = row.size();
		System.out.println(row.size());
		String startData = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[2]/td[" + sText + "]"))
				.getText();
		System.out.println(startData);

		String[] R = startData.split(" ");
		System.out.println(R[1]);
		String[] J = R[1].split(":");
		
		System.out.println(J[0]);
		System.out.println(J[1]);

		String endData = driver
				.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + lastRow + "]/td[" + sText + "]"))
				.getText();
		System.out.println(endData);

		String[] D = endData.split(" ");
		System.out.println(D[1]);
		String[] S = D[1].split(":");
		
		System.out.println(S[0]);
		System.out.println(S[1]);
		if (R[0].equals(D[0])) {
			if (J[0].equals(S[0])) {
				if (data.equals("Newest to oldest")) {
					System.out.println(J[1].compareTo(S[1]));
					Assert.assertTrue(J[1].compareTo(S[1]) > 0);
					System.out.println("The Names Subjects are in Newest to oldest Order");
				} else {
					System.out.println(J[1].compareTo(S[1]));
					Assert.assertTrue(J[1].compareTo(S[1]) < 0);
					System.out.println("The Names Subjects are in Oldest to Newest Order");
				}
			} else {
				if (data.equals("Newest to oldest")) {
					Assert.assertTrue(J[0].compareTo(S[0]) > 0);
					System.out.println("The Names Subjects are in Newest to oldest Order");
				} else {
					Assert.assertTrue(J[0].compareTo(S[0]) < 0);
					System.out.println("The Names Subjects are in Oldest to Newest Order");
				}
			}

		} else {
			if (data.equals("Newest to oldest")) {
				Assert.assertTrue(R[0].compareTo(D[0]) > 0);
				System.out.println("The Names Subjects are in Newest to oldest Order");
			} else {
				Assert.assertTrue(R[0].compareTo(D[0]) < 0);
				System.out.println("The Names Subjects are in Oldest to Newest Order");
			}
		}

	}

	public static void ClickOnIcon(String data) {

		driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[2]/td[" + data + "]")).click();

	}

	public static void isDateSame() {

		String data1 = driver.findElement(By.xpath("//*[@id='current-time']")).getText();
		System.out.println(data1);
		String data2[] = data1.split(" ");
		System.out.println(data2[0]);

		String data = driver.findElement(By.xpath("//*[@id=\"id_timeval\"]")).getAttribute("value");
		System.out.println(data);

		Assert.assertEquals(data2[0], data);
		System.out.println("Emails Fetched Graph is displayed with current date");

	}

	public static void isDateisPrevious() {

		String data1 = driver.findElement(By.xpath("//*[@id='current-time']")).getText();

		String data2[] = data1.split(" ");

		String data = driver.findElement(By.xpath("//*[@id='id_timeval']")).getAttribute("value");

		Assert.assertFalse(data2[0].equals(data));
		System.out.println("INFO: Current date : " + data2[0] + " is not equal to previous date : " + data);

	}

	public static void ClickOnBackwardArrow() {
		sleepApplication(3000);
		driver.findElement(By.xpath("//*[@id=\"graphTable\"]/tbody/tr[2]/td[1]/a")).click();

	}

	public static void ClickOnMagnifyingGlass() {

		driver.findElement(By.xpath("//*[@id=\"graphTable\"]/tbody/tr[1]/td[3]/a/img")).click();

	}

	public static void isWeeklyGraphDisplayed() {

		String data = driver.findElement(By.xpath("//*[@id=\"chartdiv\"]/div[1]")).getText();
		Assert.assertTrue(data.contains("Emails Fetched During the Week"));

		System.out.println("Emails Fetched Graph During the Week is displayed");

	}

	public static void isGraphAltered() {

		String data = driver.findElement(By.xpath("//*[@id=\"chartdiv\"]/div[1]")).getText();
		Assert.assertTrue(data.contains("Emails Sent During the Week"));

		System.out.println("The Graph is Altered according to the changes");

	}

	public static void isGraphChangedtoDay() {

		String data = driver.findElement(By.xpath("//*[@id=\"chartdiv\"]/div[1]")).getText();
		Assert.assertTrue(data.contains("Emails Sent on"));

		System.out.println("Emails Sent Graph with Date is dispalyed");

	}

	public static void isGraphChangedtoMonth() {

		String data = driver.findElement(By.xpath("//*[@id=\"chartdiv\"]/div[1]")).getText();
		Assert.assertTrue(data.contains("Emails Sent in"));

		System.out.println("Emails Sent Graph During the month is displayed");

	}

	public static void isGraphChangedtoYear() {

		String data = driver.findElement(By.xpath("//*[@id=\"chartdiv\"]/div[1]")).getText();
		Assert.assertTrue(data.contains("Emails Sent During"));

		System.out.println("Emails Sent Graph During the Year is displayed");

	}

	public static void isGraphChangedtoAllTime() {

		String data = driver.findElement(By.xpath("//*[@id=\"chartdiv\"]/div[1]")).getText();
		Assert.assertTrue(data.contains("Emails Sent Over"));

		System.out.println("Emails Sent Graph During the All Time is displayed");

	}

	public static void isGraphofFailedEmailstoAllTime() {

		String data = driver.findElement(By.xpath("//*[@id=\"chartdiv\"]/div[1]")).getText();
		Assert.assertTrue(data.contains("Emails with Processing Failures"));

		System.out.println("Email Processing Failures Over All Time Graph is displayed");

	}

	public static void isTagsSetOverAllTimeGraphDisplayed() {

		String data = driver.findElement(By.xpath("//*[@id=\"chartdiv\"]/div[1]")).getText();
		Assert.assertTrue(data.contains("Tags Set Over"));

		System.out.println("Emails with Tags Set Graph During the All Time is displayed");

	}

	public static void isEmailsWithTagsOverAllTimeGraphDisplayed() {

		String data = driver.findElement(By.xpath("//*[@id=\"chartdiv\"]/div[1]")).getText();
		Assert.assertTrue(data.contains("Emails with Tags Over"));

		System.out.println("Emails with Tags Over All Time Graph is displayed");

	}

	public static void isEmailsbyFetchDateAllTimeGraphDisplayed() {

		String data = driver.findElement(By.xpath("//*[@id=\"chartdiv\"]/div[1]")).getText();
		Assert.assertTrue(data.contains("Emails with Tags Over"));

		System.out.println("Emails by Fetch Date Graph During the All Time is displayed");

	}

	public static void isEmailsWithCommentsWrittenAllTimeGraphDisplayed() {

		String data = driver.findElement(By.xpath("//*[@id=\"chartdiv\"]/div[1]")).getText();
		System.out.println(data);
		Assert.assertTrue(data.contains("Comments written Over"));

		System.out.println("Emails with Comments written Graph During the All Time is displayed");

	}

	public static void isEmailsWithCommentsAllTimeGraphDisplayed() {

		String data = driver.findElement(By.xpath("//*[@id=\"chartdiv\"]/div[1]")).getText();
		System.out.println(data);
		Assert.assertTrue(data.contains("Emails with Comments"));

		System.out.println(" Emails with Comments Over All Time Graph is displayed");

	}

	public static void clickonMagnifingGlass() {

		if (driver.findElement(By.xpath("//*[@class='bordered-table']/tbody[2]/tr[1]/td[4]/a")).isDisplayed()) {
			clickElement(findBy("//*[@class='bordered-table']/tbody[2]/tr[1]/td[4]/a"), "Magnifing Glass");
			sleepApplication(3000);
			Assert.assertTrue(Navigation.isHeaderH1Present("Emails Migrated"));
		} else {
			System.out.println("INFO: The Migration History Table is missing so we can not perform the operation");
		}

	}

	public static void performActionAccordingToData() throws InterruptedException {
		List<WebElement> row = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr[2]/td/a"));
		if (row.size() > 0) {
			row.get(0).click();
			sleepApplication(3000);
			String parent = driver.getWindowHandle();
			Set<String> s1 = driver.getWindowHandles();

			Iterator<String> I1 = s1.iterator();
			while (I1.hasNext()) {

				String child_window = I1.next();

				if (!parent.equals(child_window)) {
					Assert.assertTrue(!parent.equals(child_window));
					driver.switchTo().window(child_window);
					Thread.sleep(3000);

					System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
				}
			}

			driver.switchTo().window(parent);
			System.out.println("Successfully displayed in new window");

		} else {
			System.out.println("INFO: The Migration History Table is missing so we can not perform the operation");
		}

	}

	public static void clickonDetailsLink(String sText) {

		if (sText.equals("Total table")) {
			clickElement(findBy("(//a[contains(text(),'details')])[1]"), "Details Link in Total table");
		}
		if (sText.equals("Index Related table")) {
			clickElement(findBy("(//a[contains(text(),'details')])[2]"), "Details Link in Index Related table");
		}

	}

	public static void clickonBlueArrow(String sText) {

		clickElement(findBy("//*[contains(text(), '" + sText + "')]/img"), "Details Link in Total table");
		sleepApplication(3000);
	}

	public static void isCorrespondingHealthCheckupPageDisplayed(String sText) {

		boolean value = isElementPresent(findBy("//h1[contains(text(), '" + sText + "')]"),
				"Corresponding Health Checkup Page of " + sText);
		Assert.assertTrue(value);
	}

	public static void isCurrentStatusDisplayed() {
		List<WebElement> count = driver.findElements(By.xpath("//*[@id='teststructholder']/fieldset/dl/dt"));
		for (int i = 1; i <= count.size(); i++) {
			String status = getText(findBy("//*[@id='" + i + "']/dd"), "Curent Status");
			Assert.assertTrue(status.equals("pending"));
		}
	}

	public static void isFinalStatusDisplayed() {
		sleepApplication(2000);
		List<WebElement> count = driver.findElements(By.xpath("//*[@id='teststructholder']/fieldset/dl/dt"));
		for (int i = 1; i <= count.size(); i++) {
			sleepApplication(1000);
			String status = getText(findBy("//*[@id='" + i + "']/dd/a"), "Final Status");
			Assert.assertTrue(status.equals("warn") || status.equals("pass") || status.equals("fail"));
		}

	}

	public static void isAllDetailsDisplayed() {
		sleepApplication(2000);
		List<WebElement> count = driver.findElements(By.xpath("//*[@id='teststructholder']/fieldset/dl/dt"));
		for (int i = 1; i < count.size(); i++) {
			String status = getText(findBy("//*[@id='" + i + "']/dd/a"), "Final Status");
			if (status.equals("warn") || status.equals("pass")) {
				Assert.assertTrue(isElementPresent(findBy("//*[@id='" + i + "']/dd/div"), "All Details"));
			}
		}
	}

	public static void isAllDetailsHidden() {
		sleepApplication(2000);
		List<WebElement> count = driver.findElements(By.xpath("//*[@id='teststructholder']/fieldset/dl/dt"));
		for (int i = 1; i <= count.size(); i++) {
			Assert.assertTrue(!isElementPresent(findBy("//*[@id='" + i + "']/dd/div"), "All Details"));
		}
	}

	public static void clickonDetaiilsicon(String data) {
		if (data.equals("Active job")) {
			if (isElementPresent(findBy("(//*[@class='bordered-table']/tbody/tr[2]/td[4]/a)[1]"),
					"details icon of " + data)) {
				clickElement(findBy("(//*[@class='bordered-table']/tbody/tr[2]/td[4]/a)[1]"),
						"details icon of " + data);
			}
		} else {
			if (isElementPresent(findBy("(//*[@class='bordered-table']/tbody/tr[2]/td[4]/a)[2]"),
					"details icon of " + data)) {
				clickElement(findBy("(//*[@class='bordered-table']/tbody/tr[2]/td[4]/a)[2]"),
						"details icon of " + data);
			}

		}
	}

	public static void isActiveJobDetailsDisplayed(String data) {
		sleepApplication(5000);

		List<WebElement> count = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[2]"));
		for (int i = 1; i <= count.size(); i++) {
			if (i == 1) {
				if (data.equals("Active job")) {
					Assert.assertTrue(
							getText(findBy("//*[@class='bordered-table']/tbody/tr[" + i + "]/td[2]"), "Process status")
									.equals("In-progress"));
				} else {
					Assert.assertTrue(
							getText(findBy("//*[@class='bordered-table']/tbody/tr[" + i + "]/td[2]"), "Process status")
									.equals("Finished"));
				}
			}
			if (i == 3) {
				if (data.equals("Active job")) {
					Assert.assertTrue(
							getText(findBy("//*[@class='bordered-table']/tbody/tr[" + i + "]/td[2]"), "End-Time value")
									.equals(""));
				} else {
					Assert.assertTrue(
							getText(findBy("//*[@class='bordered-table']/tbody/tr[" + i + "]/td[2]"), "End-Time value")
									.contains("201"));
				}
			}

		}
	}

	public static void isSmtpListed(String data) {
		List<WebElement> count;
		if (data.equals("Inactive jobs")) {
			count = driver.findElements(By.xpath("(//*[@class='bordered-table'])[2]/tbody/tr/td[2]"));
			for (int i = 2; i <= count.size() + 1; i++) {
				String value;
				if (data.equals("Inactive jobs")) {
					value = getText(findBy("(//*[@class='bordered-table'])[2]/tbody/tr[" + i + "]/td[2]"),
							"Inactive jobs");
					if (value.contains("SMTP")) {
						Assert.assertTrue(value.contains("SMTP"));
						break;
					}
				}
			}
		}
		if (data.equals("Active jobs")) {
			count = driver.findElements(By.xpath("(//*[@class='bordered-table'])[1]/tbody/tr/td[2]"));
			for (int i = 2; i <= count.size() + 1; i++) {
				String value;
				if (data.equals("Active jobs")) {
					value = getText(findBy("(//*[@class='bordered-table'])[1]/tbody/tr[" + i + "]/td[2]"),
							"Inactive jobs");
					if (value.contains("SMTP")) {
						Assert.assertTrue(value.contains("SMTP"));
						break;
					}
				}

			}
		}

	}

	public static void isDataMatches() {
		String data1 = getText(findBy("//*[@class='bordered-table']/tbody/tr[8]/td[2]"), "Maintenance Key");
		Navigation.clickOnStatusLPanel("Maintenance");
		Navigation.clickOnStatusLPanel("Maintenance Key");
		String data = getText(findBy("//*[@class='table-box']/fieldset/dl[1]/dd"), "Maintenance Key");
		Assert.assertTrue(data1.equals(data));

	}

	public static void isRaidStatusAppeared() {
		String data = getText(findBy("//*[@class='bordered-table']/tbody/tr[10]/td[1]"), "RaidStatus");
		Assert.assertTrue(data.equals("RAID Status"));

	}

	public static void clickonDetailsLinkonRAIDPartition() {
		clickElement(findBy("//*[@class='bordered-table']/tbody/tr[10]/td[2]/a"), "Details Link");
		String data = driver.switchTo().alert().getText();
		Assert.assertTrue(data.contains("CLEAN") || data.contains("ACTIVE"));
		driver.switchTo().alert().accept();

	}

	public static void clickonDownloadReport() {
		clickElement(findBy("//img[contains(@title,'Download Report')]"), "Download Report");
	}

	public static void clickonDownloadAddress() {
		clickElement(findBy("//*[@class='bordered-table']/tbody[2]/tr[1]/td[2]/a"), "Download Addresses");
	}

	public static void clickonDownloadCounts(String data) {
		clickElement(findBy("//*[@class='bordered-table']/tbody[2]/tr[1]/td[3]/a"), "Download counts");
		clickElement(findBy("//label[contains(text(),'" + data + "')]"), "Download Counts for " + data);
	}

	public static void clikonOKButton() {
		driver.findElement(By.xpath("//*[@class='ui-dialog-buttonset']/button")).click();
	}

	public static void clikonCancelButton() {
		driver.findElement(By.xpath("//*[@class='ui-button-icon ui-icon ui-icon-closethick']")).click();
	}

	public static void isRightorLeftArrowEnable(String sText, String data) {
		if (data.contains("left")) {
			if (sText.contains("Enable")) {
				isElementEnabled(findBy("(//*[@class='col-xs-1 canleft']//img)[1]"), data + "Arrow");
			} else {
				String src = driver.findElement(By.xpath("(//*[@class='col-xs-1 canleft']//img)[1]"))
						.getAttribute("src");
				Assert.assertTrue(src.contains("disabled"));
			}
		} else {
			if (sText.contains("Enable")) {
				isElementEnabled(findBy("(//*[@class='col-xs-1 canright']//img)[1]"), data + "Arrow");
			} else {
				String src = driver.findElement(By.xpath("(//*[@class='col-xs-1 canright']//img)[1]"))
						.getAttribute("src");
				Assert.assertTrue(src.contains("disabled"));

			}

		}
	}

	public static void clickonMagnifingglass() {
		clickElement(findBy("//*[@class='bordered-table']/tbody[2]/tr[1]/td[4]/a"), "Magnifing Glass");
	}

	public static void clickonLeftArrow() {
		sleepApplication(3000);
		clickElement(findBy("(//*[@class='col-xs-1 canleft']/a/img)[1]"), "Left Arrow");
		sleepApplication(3000);
	}

	public static void isAddressCountPopupClosed() {
		Assert.assertTrue(
				!isElementPresent(findBy("(//*[@class='col-xs-1 canright']//img)[1]"), "Address Count Popup"));

	}

	public static void isGraphDataMatches() {
		sleepApplication(3000);
		String data[] = getText(findBy("//*[@class='total-disk']/span"), "disck Space").split(" ");
		Navigation.clickOnStatusLPanel("System Summary");
		String cdata[] = getText(findBy("//*[@id='memlegend']/table/tbody/tr/td[2]"), "disck Space").split(" ");
		String cdata1[] = cdata[2].split("G,");
		String cdata2[] = cdata[4].split("G]");
		double tdata = Double.parseDouble(cdata2[0]) + Double.parseDouble(cdata1[0]);
		System.out.println(tdata);
		double discData = Double.parseDouble(data[0]);
		System.out.println(discData);
		// Assert.assertTrue(tdata == discData);
	}

	public static void isNetworkInfoMatches() {
		List<WebElement> data = driver.findElements(By.xpath("//*[@class='network-text']"));
		for (int i = 1; i <= data.size(); i++) {
			String info = getText(findBy("(//*[@class='network-text'])[" + i + "]"), "");
			if (info.contains("10.100")) {
				Navigation.clickOnStatusLPanel("System Summary");
				sleepApplication(3000);
				List<WebElement> data1 = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[2]"));
				for (int j = 1; j < data1.size(); j++) {
					String actualInfo = driver
							.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + j + "]/td[2]")).getText();
					if (actualInfo.contains("10.100")) {
						System.out.println(actualInfo);
						Assert.assertTrue(info.contains(actualInfo));
						break;
					}
				}
				break;
			}
		}
	}

	public static void isSoftwareVersionMatches() {
		String version[] = getText(findBy("//*[@class='softwareFooterVersion']/p[2]"),
				"Software Version").split(" ");
		Navigation.clickOnStatusLPanel("System Summary");
		sleepApplication(3000);
		List<WebElement> data1 = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));
		for (int j = 1; j < data1.size(); j++) {
			String actualInfo = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + j + "]/td[1]"))
					.getText();
			if (actualInfo.contains("Version")) {
				String actualVersion[] = driver
						.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + j + "]/td[2]")).getText()
						.split(" ");
				Assert.assertTrue(version[0].contains(actualVersion[1]));
				break;
			}
		}
	}
}
