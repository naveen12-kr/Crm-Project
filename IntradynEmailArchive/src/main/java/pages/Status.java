package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Status extends BasePage {

	public final static By byMoreLinkText = findBy("//*[@id=\"main\"]/div/div[2]/div[1]/div/div[1]/a");
	public final static By byMoreLinkDistinctAddress = findBy("//*[@id=\"main\"]/div/div[2]/div[2]/div/div[1]/a");
	public final static By byEmailActivityPage = findBy(
			"//div//h1[contains(text(), 'Graph of Emails Fetched over Time')]");
	public final static By byDomainsPresent = findBy("//div//h1[contains(text(), 'Domains')]");
	public final static By byDownloadReport = findBy("//*[@id=\"main\"]/div/div/div/div[1]/table/tbody/tr/td[2]/a/img");
	public final static By byMagGlassActiveJobs = findBy(
			"//*[@id=\"main\"]/div/div[2]/div/div[1]/table/tbody/tr[2]/td[4]/a");
	public final static By byMagGlassInActiveJobs = findBy(
			"//*[@id=\"main\"]/div/div[2]/div/div[2]/table/tbody/tr[2]/td[4]");
	public final static By byLinkTextDetailTable = findBy("//a[@href='/emails/calendar/emails/']");
	public final static By byIndexRelatedTable = findBy("//a[@href='/emails/calendar/failedemails/']");
	public final static By byRunTests = findBy("//*[@id='startTest']");
	public final static By byCancelTests = findBy("//*[@id='cancelTest']");
	public final static By byShowAllDetails = findBy("//*[contains(text(), 'Show all Details')]");
	public final static By byHideAllDetails = findBy("//*[contains(text(), 'Hide all Details')]");
	public final static By byUpaTestLevel = findBy("//*[@id='main']/div/div/p[2]/a[1]/img");
	public final static By byNoTestToRunArrow = findBy("//*[contains(text(), 'LDAP Authentication ')]");
	public final static By byRefreshSeconds = findBy("//*[@id=\"interval\"]");
	public final static By byHoverTheGraph = findBy("//*[@id=\"tip\"]");

	public static void clickOnMoreLinkText() {

		clickElement(byMoreLinkText, "More Link Text");
	}

	public static void isGraphsOfEmailFetchedPresent() {

		isElementPresent(byEmailActivityPage, "Email Activity Page");
	}

	public static void clickOnMoreLinkDistinctAddress() {

		clickElement(byMoreLinkDistinctAddress, "More Link Distinct Address");
	}

	public static void isDomainsPresent() {

		isElementPresent(byDomainsPresent, "Domains Present");
	}

	public static void isCancelTestsPresent() {
		isElementPresent(byCancelTests, "Cancel Tests Button");
	}

	public static void isRunTestsPresent() {
		isElementPresent(byRunTests, "Run Tests Button");
	}

	public static void clickOnCancelTestsButton() {

		clickElement(byRunTests, "Run Tests");
		clickElement(byCancelTests, "Cancel Tests Button");
	}

	public static void clickOnCancelTestsButtonForAll() {

		clickElement(byCancelTests, "Cancel Tests Button");
	}

	public static void clickOnUpaTestLevel() {

		clickElement(byUpaTestLevel, "Up a Test Level");
	}

	public static void getStatus() {

		WebElement table = driver.findElement(By.xpath("//*[@id='teststructholder']/fieldset"));

		List<WebElement> row1 = table.findElements(By.xpath("//*[@id='teststructholder']/fieldset/dl/dt"));

		System.out.println("Tests status after running completed:");
		System.out.println("---------------------");

		for (int i = 0; i < row1.size(); i++) {

			List<WebElement> dt = table
					.findElements(By.xpath("//*[@id='teststructholder']/fieldset/dl/dt['" + i + "']"));
			String s = dt.get(i).getText();

			List<WebElement> dd = table
					.findElements(By.xpath("//*[@id='teststructholder']/fieldset/dl/dd['" + i + "']"));
			String s1 = dd.get(i).getText();

			System.out.println(s + ": -->" + s1);
		}
		System.out.println("");
	}

	public static void getDomainsList() {

		WebElement table = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/table"));
		List<WebElement> mg = table
				.findElements(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/table/tbody[2]/tr/td[1]"));

		Iterator<WebElement> itr = mg.iterator();

		while (itr.hasNext()) {

			WebElement row = itr.next();
			System.out.println(row.getText());
		}
	}

	public static void getActiveJobs() {

		String activeJobs = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[1]/table/tbody/tr/td[2]"))
				.getText();
		System.out.println("The active jobs in system status: " + activeJobs);
	}

	public static void clickOnMagnifyGlassActiveJob() {

		clickElement(byMagGlassActiveJobs, "Magnifing Glass for Active Jobs");
	}

	public static void clickOnMagnifyGlassInActiveJob() {

		clickElement(byMagGlassInActiveJobs, "Magnifing Glass for In-active Jobs");
	}

	public static void getProcessStatus() {

		String status = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/table/tbody/tr[1]/td[2]"))
				.getText();
		System.out.println("Process: " + status);
	}

	public static void getInactiveProcessStatus() throws InterruptedException {

		String status = driver.findElement(By.xpath("//table[@class='bordered-table']/tbody/tr[1]/td[2]")).getText();
		System.out.println("Process: " + status);
	}

	public static void getEndTime() {

		String status = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/table/tbody/tr[3]/td[2]"))
				.getText();
		System.out.println("End Time: " + status);
	}

	public static void getInactiveJobs() {

		WebElement table = driver.findElement(By.xpath("//table[@class='bordered-table']"));
		List<WebElement> ij = table
				.findElements(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/table/tbody/tr/td[2]"));

		Iterator<WebElement> itr = ij.iterator();

		while (itr.hasNext()) {

			WebElement row = itr.next();

			System.out.println("In-active Jobs are : " + row.getText());
		}
	}

	public static void clickOnLinkTextDetailsTotalTable() {

		clickElement(byLinkTextDetailTable, "Link Text Detail in Table");

	}

	public static void getAllEmailsPageUrl() {

		String allEmailUrl = driver.getCurrentUrl();
		System.out.println(allEmailUrl);
		System.out.println("All Emails page under Viewers module is returned");
	}

	public static void getParsingFailuresPageUrl() {

		String pfUrl = driver.getCurrentUrl();
		System.out.println(pfUrl);
		System.out.println("Parsing Failures page under Viewers modulel is returned");
	}

	public static void summaryCountAndTotalMailsMatching() throws InterruptedException {

		driver.findElement(By.xpath("//div//li//a//span[contains(text(), 'Email Viewing')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div//li//a[contains(text(), 'All Emails')]")).click();
		Thread.sleep(2000);

		WebElement table = driver.findElement(By.xpath("//*[@class='calendar']/tbody/tr/td"));
		List<WebElement> td = table
				.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td/div[2]/span[1]"));

		Iterator<WebElement> itr = td.iterator();

		while (itr.hasNext()) {
			WebElement dataBox = itr.next();
			String cal = dataBox.getText();
			System.out.println("Total mails in the calender " + cal);

			boolean b = cal.isEmpty();

			if (b == true) {

			} else {

				driver.findElement(By.xpath("//div//li//a//span[contains(text(), 'Status')]")).click();
				Thread.sleep(3000);

				driver.findElement(By.xpath("//div//li//a[contains(text(), 'Summary Count')]")).click();
				Thread.sleep(2000);

				String totals = driver.findElement(By.xpath("//*[@class='table-box totals']/table/tbody/tr[1]/td[2]"))
						.getText();
				String tot = totals.substring(0, 6);

				String s = tot.replaceAll("[,]", "");
				System.out.println("Email summary count is " + s);

				if (s.equals(cal)) {

					System.out.println("The Summary counts totals is " + s
							+ " information displayed matches with the actual data " + cal);
				}

				break;
			}
		}
	}

	public static void clickOnIndexRelatedTable() {

		clickElement(byIndexRelatedTable, "Index Related Table");
	}

	public static void getStatusOfAllTheTest() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='healthtest']"));

		List<WebElement> row1 = table.findElements(By.xpath("//*[@class='nomargin testlist']/dl/dt"));

		System.out.println(row1.size());

		for (int i = 0; i < row1.size(); i++) {

			List<WebElement> dt = table.findElements(By.xpath("//*[@class='nomargin testlist']/dl/dt['" + i + "']"));
			String s = dt.get(i).getText();

			List<WebElement> dd = table.findElements(By.xpath("//*[@class='nomargin testlist']/dl/dd['" + i + "']"));
			String s1 = dd.get(i).getText();

			System.out.println(s + ": -->" + s1);
		}
	}

	public static void clickOnBlueArrow() {

		WebElement arrow = driver.findElement(By.xpath("//*[@id=\'teststructholder']"));
		List<WebElement> arrowList = arrow.findElements(By.xpath("//*[@id='teststructholder']/h2/a"));
		System.out.println(arrowList.size());
		Iterator<WebElement> itr = arrowList.iterator();

		while (itr.hasNext()) {

			WebElement row = itr.next();
			row.click();

			break;
		}
	}

	public static void clickOnBlueArrow2() {

		clickElement(findBy("//*[@id='teststructholder']/h2[2]/a"), "Blue Arrow");
	}

	public static void getStatusOfSpecificTest() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='healthtest']"));

		List<WebElement> row1 = table.findElements(By.xpath("//*[@class='nomargin testlist']/dl/dt"));

		System.out.println(row1.size());

		for (int i = 0; i < row1.size(); i++) {

			List<WebElement> dt = table.findElements(By.xpath("//*[@class='nomargin testlist']/dl/dt['" + i + "']"));
			String s = dt.get(i).getText();

			List<WebElement> dd = table.findElements(By.xpath("//*[@class='nomargin testlist']/dl/dd['" + i + "']"));
			String s1 = dd.get(i).getText();

			System.out.println(s + ": -->" + s1);
		}
	}

	public static void clickOnRunTests() {

		clickElement(byRunTests, "Run Tests");
	}

	public static void clickOnLinkShowAllDetails() {

		clickElement(byShowAllDetails, "Show All Details");
	}

	public static void clickOnLinkHideAllDetails() throws InterruptedException {

		clickElement(byHideAllDetails, "Hide All Details");
		Thread.sleep(3000);
	}

	public static void getShowAllDetails() throws InterruptedException {

		String sd = driver.findElement(By.xpath("//*[@class='nomargin testlist']")).getText();
		System.out.println(sd);
		Thread.sleep(3000);
	}

	public static void getAllDetailedInfo() throws InterruptedException {

		getStatusOfSpecificTest();
		Thread.sleep(3000);
	}

	public static void isTestDetailsHidden() {

		if (driver.findElement(By.xpath("//*[@class='testExplanation'] [@style='display: none;']")).isDisplayed())

		{
			System.out.println("The detailed information is displayed");
		} else {
			System.out.println("The detailed information is hidden");
		}
	}

	public static void clickOnCancelTests() {

		driver.findElement(By.xpath("//*[@name='cancelTest']")).click();
	}

	public static void getStatusCancelledDetails() throws InterruptedException {

		String sd = driver.findElement(By.xpath("//*[@class='nomargin testlist']")).getText();
		System.out.println(sd);
		Thread.sleep(3000);
	}

	public static void ClickOnNotestToRunArrow() {

		clickElement(byNoTestToRunArrow, "No Test To Run Arrow");
	}

	public static void getCurrentSystemActivity() {

		List<WebElement> cs = driver.findElements(By.xpath("//*[@class='nomargin']/table/tbody/tr/td/h2"));

		String[] nameArray = new String[cs.size()];
		for (int i = 0; i < cs.size(); i++) {
			nameArray[i] = cs.get(i).getText();

			System.out.println("Current System activities : " + nameArray[i]);
		}
	}

	public static void selectSeconds(String text) throws InterruptedException {

		WebElement r = driver.findElement(By.xpath("//*[@id=\"interval\"]"));
		Select s = new Select(r);
		s.selectByVisibleText("1");

		System.out.println("Refresh every " + text + " Seconds");
	}

	

	public static void getToolTip() {

	}
}
