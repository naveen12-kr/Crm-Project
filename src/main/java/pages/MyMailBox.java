package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyMailBox extends BasePage {

	public final static By byMailBoxDropdown = findBy("//*[@id='search_form']/select");
	public final static By byCollapseMailbox = findBy("//*[@id='calendarBar']");
	public final static By byCollapseAllMails = findBy(
			"//*[@id='treeboxbox_tree']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[1]/img");
	public final static By byAllMailsCheckBox = findBy(
			"//*[@id='treeboxbox_tree']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]/img");
	public final static By byViewButton = findBy("//*[@id='submit']");
	public final static By byReceivedMailCheckbox = findBy(
			"//*[@id='treeboxbox_tree']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/img");
	public final static By bysentMailcheckbox = findBy(
			"//*[@id='treeboxbox_tree']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/img");

	/************************************** CLICKERS ************************************************/

	public static void clickOnCollapseMailbox() {

		clickElement(byCollapseMailbox, "Mailbox");

	}

	public static void clickOnCollapseAllReceivedandSent() {

		clickElement(byCollapseAllMails, "All Received And Sent");
	}

	public static void clickOnAllReceivedAndSentCheckbox() {

		clickElement(byAllMailsCheckBox, "All received and sent Checkbox");
	}

	public static void clickOnReceivedMailCheckbox() {

		clickElement(byReceivedMailCheckbox, "Receved Mail");
	}

	public static void clickOnSentMailCheckbox() {

		clickElement(bysentMailcheckbox, "Sent Mail");
	}

	public static void getMailBoxDropdown(String data) throws InterruptedException {
		Thread.sleep(5000);
		WebElement mb = driver.findElement(By.xpath("//*[@id='search_form']/select"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println("INFO: Selected : " + data);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void clickOnViewButton() throws InterruptedException {

		clickElement(byViewButton, "View Button");
		Thread.sleep(10000);
	}

	/********************** Validation ****************************/

	public static void getReceivedAndSentMails(String sText) throws InterruptedException {
		Thread.sleep(3000);
		String sr = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();

	String[] r = sr.split(" ");
		String total_count = r[3].replace(",", "");

		int a = Integer.parseInt(total_count);

		System.out.println("INFO: Total no of emails are : " + a);
		
		

	}

}
