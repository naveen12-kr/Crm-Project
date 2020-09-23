package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class POPorIMAPFetchers extends BasePage {

	public final static By byAddUserText = findBy("//*[@id='id_newName']");
	public final static By byRefreshIcon = findBy("//div//tbody/tr[2]/td[6]/form/a[3]");
	public final static By byConnectionIcon = findBy("//div//tbody/tr[2]/td[6]/form/a[5]");
	//public final static By byConnectionIcon = findBy("//a[5]//img[1]");
	public final static By byStatusIcon = findBy("//div//tbody/tr[2]/td[6]/form/a[2]");
	public final static By byRestartFetcherservice = findBy("//*[@id='id_reset_0']");
	public final static By byCompletelyResetFetcher = findBy("//*[@id='id_reset_1']");
	public final static By bySubmitbutton = findBy("//*[@id='submit']");
	public final static By byRunTests = findBy("//*[@id=\"startTest\"]");
	public final static By byUpaLevelTest = findBy("//*[@id=\"main\"]/div/div/p[2]/a[1]");
	public final static By byPencilIcon = findBy("//div//tbody/tr[2]/td[6]/form/a[6]");
	public final static By byServerDescription = findBy("//*[@id=\"id_desc\"]");
	public final static By bySaveButton = findBy("//input[@class='button1']");
	public final static By byDeleteIcon = findBy("//div//tbody/tr[2]/td[6]/form/input[2]");

	public static void setExistingFetcher() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']//tbody"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='bordered-table']//tbody//tr//td[1]"));
		Thread.sleep(2000);

		Iterator<WebElement> itr = row.iterator();

		while (itr.hasNext()) {
			WebElement dataBox = itr.next();
			String data = dataBox.getText();

			System.out.println("Existing UserName: " + data);

			driver.findElement(byAddUserText).clear();

			driver.findElement(byAddUserText).sendKeys(data);

			break;
		}
	}

	public static void getExistingFetcherErrorMsg() {

		String message = driver
				.findElement(By.xpath("//div//li[contains(text(), 'This configuration ID already exists')]")).getText();
		System.out.println("INFO: " + message);
	}

	public static void getPortNumber() {

		String port = driver.findElement(By.xpath("//*[@name='port']")).getAttribute("value");
		System.out.println("INFO: The port number field is populated as : " + port);
	}

	public static void getMailboxName() {

		String port = driver.findElement(By.xpath("//*[@name='mailbox']")).getAttribute("value");
		System.out.println("INFO: The port number field is populated as : " + port);
	}

	public static void clickOnRefreshButton() {

		clickElement(byRefreshIcon, "Refresh Icon");
	}

	public static void selectRestartfetcherservice() {

		clickElement(byRestartFetcherservice, "Restart Fetcher Service");
	}

	public static void selectCompletelyResetFetcher() {

		clickElement(byCompletelyResetFetcher, "Completely Reset Fetcher");
	}

	public static void clickOnSubmitButton() {

		clickElement(bySubmitbutton, "Submit");
	}

	public static void clickOnStatusIcon() {

		clickElement(byStatusIcon, "Status Icon");
	}

	public static void clickOnConnectionIcon() {

		clickElement(byConnectionIcon, "Connection Icon");
	}

	public static void getConnectionDetails() {

		String connection = driver.findElement(By.xpath("//*[@id='teststructholder']")).getText();
		System.out.println("INFO: " + connection);
	}

	public static void clickOnRunTests() {

		clickElement(byRunTests, "Run Tests");
	}

	public static void clickOnStatusConnection() {

		driver.findElement(By.xpath("//*[@id='1']/dd/a")).click();

	}

	public static void getStatusConnection() {

		String statusDesc = driver.findElement(By.xpath("//*[@id='1']/dd/div")).getText();
		System.out.println("INFO: " + statusDesc);

	}

	public static boolean isStatusDescPresent() {

		boolean V = driver.findElement(By.xpath("//*[@id='1']/dd/div")).isDisplayed();
		System.out.println("INFO: Element Status Description is not present on screen ");
		return V;
	}

	public static void clickOnUpaTestLevel() throws InterruptedException {

		clickElement(byUpaLevelTest, "Up a Level Test");
		Thread.sleep(2000);
	}

	public static void getFetchHealthCheckupPage() throws InterruptedException {

		String currentUrl = getCurrentPageURL();
		driver.get(currentUrl);
		Thread.sleep(2000);
		String page = driver.findElement(By.xpath("//div//h1[contains(text(), 'fetch Health Checkup')]")).getText();
		System.out.println("INFO: " + page + " page is loaded");

	}

	public static void clickOnPencilIcon() {

		clickElement(byPencilIcon, "Pencil Icon");
	}

	public static void setServerDescription(String sText) {

		clearText(byServerDescription, "Server Description");
		setText(byServerDescription, "Server Description", sText);
	}

	public static void clickOnsaveButton() {

		clickElement(bySaveButton, "Save Button");

	}

	public static void clickOnDeleteIcon() {

		clickElement(byDeleteIcon, "Delete Icon");
	}
}
