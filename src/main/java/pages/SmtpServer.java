package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SmtpServer extends BasePage {

	public final static By bySMTPServer = findBy("//div//li//*[contains(text(),'SMTP Server')]");
	public final static By byResetButton = findBy("//*[contains(@name, 'reset')]");
	public final static By byDomains = findBy("//*[contains(@id, 'id_domains')]");
	public final static By bySmtpServerRunning = findBy("//*[@id='main']/div/div/div/div[1]/fieldset/form/dl/dt");
	public final static By bySMTPTimeOut = findBy("//*[@id=\"id_timeout\"]");
	public final static By byDomain = findBy("//*[@id=\"id_domains\"]");
	public final static By byADDServer = findBy("//*[@id=\"id_newName\"]");
	public final static By byADDServerButton = findBy("//*[@id=\"main\"]/div/div/div/div[3]/div/form/input[2]");
	public final static By byADDServerListButton = findBy("//*[@class='button1'][@value='Add Server List']");
	public final static By byChooseFile = findBy("//*[@id=\"id_listfile\"]");
	public final static By bycrossIcon = findBy("//*[@id='main']//table/tbody/tr[2]/td[2]/form/input[2]");

	public static void clickOnSmtpServer() {

		clickElement(bySMTPServer, "SMTP Server");
	}

	public static void clickOnADDServerButton() {

		clickElement(byADDServerButton, "ADD Server Button");
	}

	public static void clickOnResetbutton() {

		clickElement(byResetButton, "Reset Button");
	}

	public static void clickOnADDServerListButton() {

		clickElement(byADDServerListButton, "ADD Server List Button");
	}

	public static void getSmtpRunning() {

		String message = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div[1]/fieldset/form/dl/dt"))
				.getText();
		System.out.println(message);
	}

	public static void getADDServerError() {

		String message = driver.findElement(By.xpath("//*[@class='errorlist']/li")).getText();
		System.out.println(message);
	}

	public static void isErrorMessageDisplayed() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@class,'error')]")).isDisplayed());
		String message = driver.findElement(By.xpath("//*[contains(@class,'error')]")).getText();
		System.out.println(message);
	}

	public static void setSMTPTimeOut() {

		clearText(bySMTPTimeOut, "SMTP Time Out");

		String st = getRandomIntiger(2);
		setText(bySMTPTimeOut, "SMTP Time Out", st);
	}

	public static void setInvalidFormateSMTPTimeOut() {

		clearText(bySMTPTimeOut, "SMTP Time Out");

		String st = getRandomStringsmallchr(2);
		setText(bySMTPTimeOut, "SMTP Time Out", st);
	}

	public static void setInvalidSMTPTimeOut() {

		clearText(bySMTPTimeOut, "SMTP Time Out");

		driver.findElement(By.xpath("//*[@id='id_timeout']")).sendKeys("0");
		System.out.println("the SMTP TimeOut Time Is ZERO");
	}

	public static void setValidDomain() {

		clearText(byDomain, "Domain");

		driver.findElement(By.xpath("//*[@id=\"id_domains\"]")).sendKeys("b.com");
		System.out.println("Domain is given as b.com");
	}

	public static void setNoSMTPTimeOut() {

		clearText(bySMTPTimeOut, "SMTP Time Out");

	}

	public static void getThisFieldIsReq() {

		String st = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/form/fieldset/dl[1]/dd[2]/ul/li"))
				.getText();
		System.out.println(st);
	}

	public static void setExistingUserName() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']//tbody"));
		List<WebElement> row = table
				.findElements(By.xpath("//*[@id=\"main\"]/div/div/div/div[3]/table/tbody/tr/td[1]"));
		Thread.sleep(2000);

		Iterator<WebElement> itr = row.iterator();

		while (itr.hasNext()) {
			WebElement dataBox = itr.next();
			String data = dataBox.getText();

			System.out.println("Existing UserName: " + data);

			driver.findElement(byADDServer).clear();

			driver.findElement(byADDServer).sendKeys(data);

			break;
		}
	}

	public static void addServerList() throws InterruptedException, AWTException {

		driver.findElement(By.xpath("//*[@id='id_listfile']")).click();
		Thread.sleep(500);

		setClipboardData("C:\\Users\\jackie\\Desktop\\work.txt");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(500);
	}

	public static void addServerList1() throws InterruptedException, AWTException {

		driver.findElement(By.xpath("//*[@id='id_listfile']")).click();
		Thread.sleep(500);

		setClipboardData("C:\\Users\\jackie\\Pictures\\intradyn1");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(500);
	}

	public static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public static void getMessage() {

		String success = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/form/fieldset/dl/dd[2]/ul/li"))
				.getText();
		System.out.println(success);

	}

	public static void clickOnCrossDeleteIcon() {

		String delete = driver.findElement(bycrossIcon).getAttribute("title");

		clickElement(bycrossIcon, "Delete Icon");

		System.out.println(delete + " is ready for delete");
	}
}
