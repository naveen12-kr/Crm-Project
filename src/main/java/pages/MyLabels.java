package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyLabels extends BasePage {
	public static String startDate1;
	public static String endDate1;
	public static String newLabel;
	public static String firstSub;
	public static String lastSub;
	public final static By byAddLabelButton = findBy("//*[@value='Add Label']");
	public final static By byAddLabelTextBox = findBy("//*[@id='id_name']");
	public final static By byCurrentLabelsHeader = findBy("//div//h3[contains(text(), 'Current Labels')]");
	public static final By byThisFieldIsRequired = findBy(
			"//*[@id=\"main\"]/div/div/div/div/form/fieldset/dl[1]/dd[2]/ul/li");

	public static void clickOnAddLabelButton() {

		clickElement(byAddLabelButton, "Add Label Button");
	}

	public static void clickOnLabelHeader() {

		clickElement(byCurrentLabelsHeader, "Current Labels");
	}

	public static void setAddNewLabelText(String data) {

		newLabel = getRandomString(4);

		setText(byAddLabelTextBox, "Add New Label", data + "" + newLabel);
	}

	public static void getAddedLabelName() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> name = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[1]"));
		Thread.sleep(2000);

		for (int i = 0; i < name.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
			List<WebElement> row = table1.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[1]"));

			String text = row.get(i).getText();

			if (text.contains(newLabel)) {

				System.out.println("INFO: New Label Ram" + newLabel + "is added successfully");
			}
		}
	}

	public static void getCountOnMG() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> name = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[1]"));
		Thread.sleep(2000);

		for (int i = 0; i < name.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr[" + i + "]/td[3]/a"));
			String mgCount = row.get(i).getText();
			System.out.println("INFO: " + mgCount);
		}
	}

	public static void setExistingLabelName() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		String tagName = table.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[2]/td[1]")).getText();
		Thread.sleep(2000);

		System.out.println("INFO: Label Name: " + tagName);

		driver.findElement(By.xpath("//*[@id='id_name']")).clear();

		driver.findElement(By.xpath("//*[@id='id_name']")).sendKeys(tagName);
	}

	public static void deleteAddedLabelName() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> name = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[1]"));
		Thread.sleep(2000);

		for (int i = 0; i < name.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td/form/input[2]"));

			String text = row.get(i).getAttribute("title");

			if (text.contains(newLabel)) {

				int j = i + 2;
				driver.navigate().refresh();
				sleepApplication(3000);
				driver.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[" + j + "]/td[4]/form/input[2]"))
						.click();
				System.out.println("INFO: " + text + "id deleted from the table");
			}
		}
	}

	public static void clickOnMgLabelEmailsCount() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> mg = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[3]"));

		Iterator<WebElement> itr = mg.iterator();

		while (itr.hasNext()) {

			WebElement row = itr.next();
			row.click();
			Thread.sleep(3000);

			String sr = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();
			Thread.sleep(3000);

			String[] r = sr.split(" ");
			String total_count = r[3];
			int a = Integer.parseInt(total_count.replaceAll(",", ""));

			try {
				if (a <= 2) {

					clickOnLabelHeader();
					Thread.sleep(3000);
				}

			} catch (Exception e) {
				System.out.print(e);
			} finally {
				if (a > 2) {
					System.out.println("INFO: Total number of emails in a Label: " + a);

					Thread.sleep(3000);
					break;
				}
			}
		}

	}

	public static void getThisFieldRequired() {

		getText(byThisFieldIsRequired, "Message");
	}

	public static void getEmailsOrder(String data) throws InterruptedException {
		// WebElement table =
		// driver.findElement(By.xpath("//*[@class='grid-canvas']"));
		List<WebElement> row = driver.findElements(By.xpath("//*[@id='emails-list']/div[3]/div/div/div[3]/div[1]"));

		row.get(1).click();
		Thread.sleep(5000);

		List<WebElement> row1 = driver.findElements(By.xpath("//*[@id='msgView']/tbody/tr/td[1]"));

		for (int i = 0; i < row1.size(); i++) {
			if (row1.get(i).getText().equals("Date:")) {
				int j = i + 1;
				MyLabels.startDate1 = driver.findElement(By.xpath("//*[@id='msgView']/tbody/tr[" + j + "]/td[2]"))
						.getText();
				break;
			}
		}

		String[] R = MyLabels.startDate1.split(" ");
		String[] J = R[1].split(":");

		int lastRow = row.size() - 1;
		sleepApplication(3000);
		row.get(lastRow).click();
		Thread.sleep(5000);
		List<WebElement> row2 = driver.findElements(By.xpath("//*[@id='msgView']/tbody/tr/td[1]"));

		for (int i = 0; i < row2.size(); i++) {

			if (row2.get(i).getText().equals("Date:")) {
				int j = i + 1;
				MyLabels.endDate1 = driver.findElement(By.xpath("//*[@id='msgView']/tbody/tr[" + j + "]/td[2]"))
						.getText();
				break;
			}
		}
		System.out.println(MyLabels.endDate1);
		String[] D = MyLabels.endDate1.split(" ");
		String[] S = D[1].split(":");

		if (MyLabels.startDate1.equals(MyLabels.endDate1)) {
			System.out.println("INFO: The Dates of the emails are same");
		} else {

			if (R[0].equals(D[0])) {
				if (J[0].equals(S[0])) {
					if (data.equals("Newest to oldest")) {
						Assert.assertTrue(J[1].compareTo(S[1]) > 0);
						System.out.println("INFO: The Names Subjects are in Newest to oldest Order");
					} else {
						Assert.assertTrue(J[1].compareTo(S[1]) < 0);
						System.out.println("INFO: The Names Subjects are in Oldest to Newest Order");
					}
				} else {
					if (data.equals("Newest to oldest")) {
						Assert.assertTrue(J[0].compareTo(S[0]) > 0);
						System.out.println("INFO: The Names Subjects are in Newest to oldest Order");
					} else {
						Assert.assertTrue(J[0].compareTo(S[0]) < 0);
						System.out.println("INFO: The Names Subjects are in Oldest to Newest Order");
					}
				}

			} else {
				if (data.equals("Newest to oldest")) {
					Assert.assertTrue(R[0].compareTo(D[0]) > 0);
					System.out.println("INFO: The Names Subjects are in Newest to oldest Order");
				} else {
					Assert.assertTrue(R[0].compareTo(D[0]) < 0);
					System.out.println("INFO: The Names Subjects are in Oldest to Newest Order");
				}
			}
		}
	}

	public static void getEmailsOrder(String data, String sText) throws InterruptedException {

		List<WebElement> row = driver.findElements(By.xpath("//*[@id='emails-list']/div[3]/div/div/div[3]/div[1]"));

		row.get(0).click();
		Thread.sleep(3000);

		List<WebElement> row1 = driver.findElements(By.xpath("//*[@id='msgView']/tbody/tr/td[1]"));

		for (int i = 0; i < row1.size(); i++) {
			if (row1.get(i).getText().contains(sText)) {
				int j = i + 1;
				MyLabels.firstSub = driver.findElement(By.xpath("//*[@id='msgView']/tbody/tr[" + j + "]/td[2]"))
						.getText();
				break;
			}
		}
		System.out.println(MyLabels.firstSub);
		Thread.sleep(3000);
		int lastRow = row.size() - 1;
		System.out.println(lastRow);
		row.get(lastRow).click();
		Thread.sleep(3000);

		List<WebElement> row2 = driver.findElements(By.xpath("//*[@id='msgView']/tbody/tr/td[1]"));
		for (int i = 0; i < row2.size(); i++) {

			if (row2.get(i).getText().contains(sText)) {
				int j = i + 1;
				MyLabels.lastSub = driver.findElement(By.xpath("//*[@id='msgView']/tbody/tr[" + j + "]/td[2]"))
						.getText();
				break;
			}
		}
		System.out.println(MyLabels.lastSub);

		if (MyLabels.firstSub.equals(MyLabels.lastSub)) {
			System.out.println("INFO: Here the data is same it is not possiable to arrange");
		}

		else {
			if (data.equals("Oldest to Newest")) {
				Assert.assertTrue(MyLabels.firstSub.compareTo(MyLabels.lastSub) < 0);

				System.out.println("INFO: The " + sText + " are in Accending Order");
			} else {
				Assert.assertTrue(MyLabels.firstSub.compareTo(MyLabels.lastSub) > 0);

				System.out.println("INFO: The " + sText + " are in Decending Order");
			}
		}

	}

	public static void getEmailsfromOrder(String data, String sText) throws InterruptedException {

		List<WebElement> row = driver.findElements(By.xpath("//*[@id='emails-list']/div[3]/div/div/div[3]/div[1]"));
		

		row.get(0).click();
		Thread.sleep(3000);

		List<WebElement> row1 = driver.findElements(By.xpath("//*[@id='msgView']/tbody/tr/td[1]"));

		for (int i = 0; i < row1.size(); i++) {
			if (row1.get(i).getText().contains(sText)) {
				int j = i + 1;
				MyLabels.firstSub = driver.findElement(By.xpath("//*[@id='msgView']/tbody/tr[" + j + "]/td[2]"))
						.getText();
				break;
			}
		}
		System.out.println(MyLabels.firstSub);
		Thread.sleep(3000);
		int lastRow = row.size() - 1;
		System.out.println(lastRow);
		row.get(lastRow).click();
		Thread.sleep(3000);

		List<WebElement> row2 = driver.findElements(By.xpath("//*[@id='msgView']/tbody/tr/td[1]"));
		for (int i = 0; i < row2.size(); i++) {

			if (row2.get(i).getText().contains(sText)) {
				int j = i + 1;
				MyLabels.lastSub = driver.findElement(By.xpath("//*[@id='msgView']/tbody/tr[" + j + "]/td[2]"))
						.getText();
				break;
			}
		}
		System.out.println(MyLabels.lastSub);

		if (MyLabels.firstSub.equals(MyLabels.lastSub)) {
			System.out.println("INFO: Here the data is same it is not possiable to arrange");
		}

		else {
			if (data.equals("Oldest to Newest")) {

				System.out.println("INFO: The " + sText + " are in Accending Order");
			} else {

				System.out.println("INFO: The " + sText + " are in Decending Order");
			}
		}

	}

	public static void selectLabel() {
		List<WebElement> row = driver.findElements(By.xpath("//*[@id='lookup_items']/input"));
		for (int i = 0; i < row.size(); i++) {
			if (!row.get(i).isSelected()) {
				row.get(i).click();
				break;
			}
		}
		clickElement(findBy("//*[@id='lookup_items']//following::button"), "OK button");
	}

	public static void selectLegalHold() {
		String legalHold = null;
		clickElement(findBy("//*[@id='lookup_items']//following::button"), "OK button");
		clickElement(findBy("//*[contains(text(),'All Tags')]"), "");
		sleepApplication(3000);
		List<WebElement> row = driver.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[3]"));
		for (int i = 0; i < row.size(); i++) {
			if (row.get(i).getText().equals("True")) {
				int j = i + 2;
				legalHold = getText(findBy("//*[@class='scheduled-table']/tbody/tr[" + j + "]/td[1]"), "");
				break;
			}
		}
		UsersAndGroups.clickOntext("Email Viewing");
		sleepApplication(2000);
		SearchEmail.clickOnSearchButton();
		sleepApplication(10000);
		SearchEmail.clickOnEmailtoSelect();
		sleepApplication(2000);
		SearchEmail.clickOnTag();
		sleepApplication(2000);
		List<WebElement> row1 = driver.findElements(By.xpath("//*[@id='lookup_items']/span"));
		for (int i = 1; i < row1.size(); i++) {
			if (row1.get(i).getText().equals(legalHold)) {
				clickElement(findBy("//*[@id='lookup_items']/input[" + i + "]"), "");
				break;
			}
		}
		clickElement(findBy("//*[@id='lookup_items']//following::button"), "OK button");
	}

	public static void isEmailContains3Parts() {
		Assert.assertTrue(getText(findBy("//*[@id='msgView']/tbody/tr[1]/td[1]/b"), "").contains("Tags:"));

	}

}
