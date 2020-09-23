package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EmailNotification extends BasePage {

	public static final By byrecipientAddress = findBy("//*[@id=\"id_adminemail\"]");
	public static final By byCarrier = findBy("//*[@id=\"id_carrier\"]");
	public static final By byAddAddressbutton = findBy("//*[@name='addaddr']");
	public static final By byTestAll = findBy("//*[@name='testalladdrs']");

	//////////////////////////// CLICKERS
	//////////////////////////// ////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////

	public static void clickOnTestAll() {

		clickElement(byTestAll, "Test All");
	}

	public static void clickOnAddAddressButton() {

		clickElement(byAddAddressbutton, "Add Address button");
	}

	public static void clickOnRespectiveTestAddressIcon(String data) {
		List<WebElement> list = driver.findElements(findBy("//*[@class='bordered-table']/tbody/tr/td[3]/a[2]"));

		for (int i = 1; i <= list.size(); i++) {
			String text = getText(findBy("(//*[@class='bordered-table']/tbody/tr/td[1])[" + i + "]"), "value");
			if (text.contains(data)) {
				// clickElement(findBy("(//*[@class='bordered-table']/tbody/tr/td[3]/a[2])["
				// + i + "]"), "Test Icon");
				driver.findElement(By.xpath("(//*[@class='bordered-table']/tbody/tr/td[3]/a[2])[" + i + "]")).click();
				break;
			}
		}

	}

	//////////////////////////////////// SETTERS AND GETTERS
	//////////////////////////////////// ////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void setRecipientAddress(String sText) {
		clearText(byrecipientAddress, "Recipient Address");
		setText(byrecipientAddress, "Recipient Address", sText);
	}

	public static void setPhoneNumRecipientAddress(String sText) {

		setText(byrecipientAddress, "Phone Number", sText);
	}

	public static void selectCarrier(String a) throws InterruptedException {
		WebElement mb = driver.findElement(By.xpath("//*[@id='id_carrier']"));

		Select s = new Select(mb);
		s.selectByVisibleText(a);

	}

	public static void getMsgText() {

		WebElement message = driver.findElement(By.xpath("//*[@id='main']/div[1]/text()"));
		System.out.println(message);

	}

	public static void addedEmailAddress() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> address = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));
		Thread.sleep(2000);

		String[] nameArray = new String[address.size()];

		for (int i = 0; i < address.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@class='bordered-table']"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr['" + i + "']/td[1]"));

			nameArray[i] = row.get(i).getText();

		}

		for (int j = 0; j < address.size(); j++) {
			System.out.println(nameArray[j]);
		}
	}

	public static void getNotValidEmailMsg() {

		String invalid = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/form/dl/dd/ul/li")).getText();
		System.out.println(invalid);
	}

	public static void deletePhoneNumber() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> address = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));

		Thread.sleep(2000);

		String ra = driver.findElement(By.xpath("//*[@id='id_adminemail']")).getAttribute("value");

		for (int i = 1; i < address.size() - 1; i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@class='bordered-table']"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr['" + i + "']/td[1]"));
			String msg = row.get(i).getText();

			if (ra.equals(row.get(i).getText())) {

				driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr['" + i + "']/td[3]/a[1]")).click();
				System.out.println(msg + " is deleted");
			}
		}
	}

	public static void getErrorMsg() {

		String message = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]")).getText();
		System.out.println(message);
	}

	public static void isEmailFieldCleared() {
		String data = driver.findElement(By.xpath("//*[@id = 'id_adminemail']")).getText();
		Assert.assertTrue(data.equals(""));
	}

	public static void clickOnOutGoingSMTPLink() {
		clickElement(findBy("//p//a[@href='/net/outgoingsmtp/']"), "OutGoing SMTP Link");
	}

	public static void isNoEmailAddressAdded() {
		if (isElementPresent1(findBy("(//*[@title='Delete address'])[1]"), "")) {
			List<WebElement> list = driver.findElements(By.xpath("//*[@title='Delete address']"));
			for (int i = 1; i <= list.size(); i++) {
				driver.findElement(By.xpath("(//*[@title='Delete address'])[1]")).click();
				sleepApplication(2000);
				driver.navigate().refresh();
			}
		}
	}

}
