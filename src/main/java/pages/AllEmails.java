package pages;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllEmails extends BasePage {

	public static final By byYearSection = findBy("(//*[@class='dateNav']/ul/li)[1]");
	public static final By byMonthSection = findBy("(//*[@class='dateNav']/ul/li)[2]");
	public static final By byReceivedMailsPerDay = findBy("//*[@class='calendar']/tbody/tr[3]/td[3]/div[2]/span[1]");
	public static final By byParsingFailuresPerDay = findBy("//*[@class='calendar']/tbody/tr[3]/td[3]/div[2]/span[2]");
	public static final By byParsingFailuresCount = findBy("//*[@class='calendar']/tbody/tr[3]/td[6]/div[2]/span");
	public static final By byCollapseIcon = findBy("//h3[@id='calendarBar']");
	public static final By byPFCollapse = findBy("//h3[@id='calendarBar'][@class='query-open']");
	public static final By byCollapseDisabled = findBy("//h3[@id='selectionBar']");
	public static final By byTotalEmailsCount = findBy("//*[@id='total_count']");

	/////////////////////////////////// CLICKERS
	/////////////////////////////////// //////////////////////////////////

	public static void clickOnCollapseIcon() {

		clickElement(byCollapseIcon, "Collapse Icon");
	}

	public static void clickOnExpandIcon() {

		clickElement(byCollapseDisabled, "Expand Icon");
	}

	public static void clickOnReceivedEmailsCount() {

		WebElement table = driver.findElement(By.xpath("//*[@class='calendar']/tbody"));
		List<WebElement> td = table.findElements(By.xpath("//*[@class='calendar']/tbody/tr/td/div[2]"));

		Iterator<WebElement> itr = td.iterator();

		while (itr.hasNext()) {
			WebElement dataBox = itr.next();
			String data = dataBox.getText();

			boolean b = data.isEmpty();

			if (b == true) {

			} else {
				dataBox.findElement(By.xpath("//*[@class='calendar']/tbody/tr/td/div[2]/span[1]")).click();
				System.out.println("Clicking on the Received Emails");
				break;
			}
		}

	}

	public static void clickOnParsingFailuresCount() {

		WebElement table = driver.findElement(By.xpath("//*[@class='calendar']/tbody"));
		List<WebElement> td = table.findElements(By.xpath("//*[@class='calendar']/tbody/tr/td/div[2]"));

		Iterator<WebElement> itr = td.iterator();

		while (itr.hasNext()) {
			WebElement dataBox = itr.next();
			String data = dataBox.getText();

			boolean b = data.isEmpty();

			if (b == true) {

			} else {
				dataBox.findElement(By.xpath("//*[@class='calendar']/tbody/tr/td/div[2]/span")).click();
				System.out.println("INFO: Clicking on the Parsing Emails");

				break;
			}
		}
	}

	/////////////////////////////////// VALIDATION
	/////////////////////////////////// /////////////////////////////////

	public static boolean isYearPresent() {

		String presentYear = driver.findElement(byYearSection).getText();
		return isElementPresent(byYearSection, presentYear);
	}

	public static boolean isMonthPresent() {

		String presentMonth = driver.findElement(byMonthSection).getText();
		return isElementPresent(byMonthSection, presentMonth);
	}

	public static void isReceivedMailsPerDayPresent() {

		String receivedMails = driver.findElement(byReceivedMailsPerDay).getText();

		System.out.println("Total received Emails Per Day: " + receivedMails);
	}

	public static void isParsingFailuresPerDayPresent() {

		String parsingFailures = driver.findElement(byParsingFailuresPerDay).getText();

		System.out.println("Parsing Failures per Day: " + parsingFailures);
	}

	public static boolean isAllFieldsDisabled() {

		return isElementPresent(byCollapseDisabled, "Collapse Plus Icon");
		// System.out.println("All Fields are minimised");
	}

	public static boolean isParsingFailureCollapse() {

		return isElementPresent(byPFCollapse, "Collapse");
		// System.out.println("All Fields are minimised");
	}

	public static void getTotalEmailsCount() {

		String totalEmails = driver.findElement(byTotalEmailsCount).getText();
		System.out.println("Total Emails Count: " + totalEmails);
	}

	public static void clickOnRecivedMailInCalender() {

		WebElement calender = driver.findElement(By.xpath("//*[@class='calendar']"));
		List<WebElement> rows = calender.findElements(By.xpath("//*[@class='calendar']/tbody/tr"));
		List<WebElement> cols = calender.findElements(By.xpath("//*[@class='calendar']/tbody/tr/td"));

		System.out.println("Num of rows : " + rows.size());
		System.out.println("Num of cols : " + cols.size());

	}

	public static void getEmailsCount() {

		WebElement table = driver.findElement(By.xpath("//*[@class='calendar']/tbody"));
		List<WebElement> td = table.findElements(By.xpath("//*[@class='calendar']/tbody/tr/td/div[2]"));

		Iterator<WebElement> itr = td.iterator();

		while (itr.hasNext()) {
			WebElement dataBox = itr.next();
			String data = dataBox.getText();

			boolean b = data.isEmpty();

			if (b == true) {

			} else {
				System.out.println("Number of emails : " + data);

				break;
			}
		}
	}

	public static void VerifyEmailsCount() {

		String totalEmails = driver.findElement(byTotalEmailsCount).getText();

		driver.findElement(By.xpath("//li[@class='check-all'][1]/label/span")).click();
		String slec = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();

		String ec[] = slec.split(" ");
		int totalEmails1 = Integer.parseInt(totalEmails);
		int totalEmails2 = Integer.parseInt(ec[1]);

		Assert.assertSame(totalEmails1, totalEmails2);
		System.out.println("INFO: No of emails displayed in list " + totalEmails1
				+ " is equal to total resulted emails " + totalEmails2);
		/*
		 * WebElement table =
		 * driver.findElement(By.xpath("//*[@id='emails-list']/div[3]/div"));
		 * List<WebElement> td= table.findElements(By.xpath(
		 * "//*[@id='emails-list']/div[3]/div/div/div[2]/div[1]/div[1]"));
		 * 
		 * int count = td.size(); int totalEmails1 =
		 * Integer.parseInt(totalEmails);
		 * 
		 * 
		 * System.out.println("Num of Emails Displayed in List: " +count);
		 * Assert.assertSame(totalEmails1, count);
		 * System.out.println("No of emails displayed in list " +count+
		 * " is equal to total resulted emails "+totalEmails1);
		 */
	}

}
