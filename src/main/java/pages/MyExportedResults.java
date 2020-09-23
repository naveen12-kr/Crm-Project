package pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MyExportedResults extends BasePage {

	public static final By byDownloadIcon = findBy("//*[@class='bordered-table']/tbody/tr[2]/td[4]/a/img");
	public static final By byShareIcon = findBy("//*[@class='bordered-table']/tbody/tr[1]/td[5]/button");
	public static final By byUnshareIcon = findBy("//*[@class='bordered-table']/tbody/tr[1]/td[6]/button");
	public static final By byUnshareSubmit = findBy("//*[@id='wrap']/div/div/div/div/div/input[1]");
	public static final By byDeleteIcon = findBy("//*[@class='bordered-table']/tbody/tr[1]/td[7]/a/img");
	public static final By byShareOKButton = findBy("//*[@id='wrap']/div/div/div/div[2]/div/input[1]");
	public static final By byAddSelectionsButton = findBy("//*[@id=\"wrap\"]/div/div/div/div[1]/div/input");

	public static final By byFilenameArrow = findBy("//*[@class='bordered-table']/thead/tr/th[1]/a");
	public static final By bySizeArrow = findBy("//*[@class='bordered-table']/thead/tr/th[2]/a");
	public static final By byDateArrow = findBy("//*[@class='bordered-table']/thead/tr/th[3]/a");
	public static final By bySearchTerms = findBy("//input[@id=\"searchterm\"]");

	/**********************************************
	 * CLICKERS
	 * 
	 * @throws IOException
	 *********************************************/

	public static void clickOnDownloadIcon() {

		clickElement(byDownloadIcon, "Download");
	}

	public static void clickOnShareIcon() throws InterruptedException {
		clickElement(byShareIcon, "Share");
		Thread.sleep(6000);
	}

	public static void filedownloaded() {

		String tname = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[1]/td[4]/a"))
				.getAttribute("title");
		System.out.println("INFO: " + tname + " is successfully");
	}

	public static void clickOnAddSelectionsButton() {
		clickElement(byAddSelectionsButton, "Add Selections");
	}

	public static void clickOnSharedOKButton() {

		clickElement(byShareOKButton, "OK Button");

	}

	public static void clickOnUnShareIcon() {
		clickElement(byUnshareIcon, "Unshare");
	}

	public static void clickOnUnshareSubmitButton() throws InterruptedException {
		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);

				System.out.println("INFO: " + driver.switchTo().window(child_window).getTitle());
			}
		}

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id='selectedUsers']/option")).click();

		clickElement(byUnshareSubmit, "Submit Button");

		Thread.sleep(2000);

		driver.switchTo().window(parent);
	}

	public static void clickOnDeleteIcon() {
		String fileName = driver.findElement(By.xpath("//*[@id='main']/div/div/div/div/table/tbody/tr[1]/td[7]/a"))
				.getAttribute("title");
		// System.out.println(fileName);

		clickElement(byDeleteIcon, "Delete");

		System.out.println("INFO: " + fileName + " is ready for delete");
	}

	public static void clickOnAccendingFilenameArrow() {
		clickElement(byFilenameArrow, "Accending Filename");
	}

	public static void clickOnDecendingFilenameArrow() throws InterruptedException {
		clickElement(byFilenameArrow, "Decending Filename");
		Thread.sleep(5000);
		clickElement1(byFilenameArrow, "Decending Filename");
	}

	public static void clickOnAccendingSizeArrow() {
		clickElement(bySizeArrow, "Accending Size");
	}

	public static void clickOnDecendingSizeArrow() throws InterruptedException {
		clickElement(bySizeArrow, "Decending Size");
		Thread.sleep(5000);
		clickElement1(bySizeArrow, "Decending Size");
	}

	public static void clickOnAccendingDateArrow() {
		clickElement(byDateArrow, "Accending Date");
	}

	public static void clickOnDecendingDateArrow() throws InterruptedException {
		clickElement(byDateArrow, "Decending Date");
		Thread.sleep(5000);
		clickElement1(byDateArrow, "Decending Date");

	}

	/********************************************************** VALIDATION *****************************************/

	public static void isUnsortedOrder() {
		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));

		Iterator<WebElement> itr = row.iterator();

		while (itr.hasNext()) {
			WebElement file = itr.next();
			String filename = file.getText();
			System.out.println(filename);

		}
		System.out.println("INFO: Files are in unsorted order");
	}

	public static void isFilenamesortedOrder() {
		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));

		Iterator<WebElement> itr = row.iterator();
		WebElement row1 = itr.next();
		String name1 = row1.getText();

		while (itr.hasNext()) {
			WebElement row2 = itr.next();
			String name2 = row2.getText();

			if ((name1.compareTo(name2)) < 0) {
				Assert.assertTrue((name1.compareTo(name2)) < 0);
				System.out.println("INFO: Filenames are in accending Order");

			} else if ((name1.compareTo(name2)) > 0) {
				Assert.assertTrue((name1.compareTo(name2)) > 0);
				System.out.println("INFO: Filenames are in Decending Order");
			} else {
				System.out.print("INFO: Filename was not found correctly");
			}
			break;
		}
	}

	public static void isSizeSortedOrder() {
		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[2]"));

		Iterator<WebElement> itr = row.iterator();
		WebElement row1 = itr.next();
		String name1 = row1.getText();

		while (itr.hasNext()) {
			WebElement row2 = itr.next();
			String name2 = row2.getText();

			if ((name1.compareTo(name2)) < 0) {
				Assert.assertTrue((name1.compareTo(name2)) < 0);
				System.out.println("INFO: The file size are in accending Order");

			} else if ((name1.compareTo(name2)) > 0) {
				Assert.assertTrue((name1.compareTo(name2)) > 0);
				System.out.println("INFO: The file size are in Decending Order");
			} else {
				System.out.print("INFO: Both the file sizes are same");
			}
			break;
		}
	}

	public static void isDateSortedOrder() {
		WebElement table = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> row = table.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[3]"));

		Iterator<WebElement> itr = row.iterator();
		WebElement row1 = itr.next();
		String name1 = row1.getText();

		System.out.println(name1);

		while (itr.hasNext()) {
			WebElement row2 = itr.next();
			String name2 = row2.getText();

			if ((name1.compareTo(name2)) < 0) {
				Assert.assertTrue((name1.compareTo(name2)) < 0);
				System.out.println("INFO: Dates are in accending Order");

			} else if ((name1.compareTo(name2)) > 0) {
				Assert.assertTrue((name1.compareTo(name2)) > 0);
				System.out.println("INFO: Dates are in Decending Order");
			} else {
				System.out.print("INFO: Dates are equal");
			}
			break;
		}
	}

	public static void setSearchTerms() throws InterruptedException {

		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);

				System.out.println("INFO: " + driver.switchTo().window(child_window).getTitle());
			}
		}

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='searchterm']")).sendKeys("r");

		Thread.sleep(5000);

		UserNames();

		driver.switchTo().window(parent);

	}

	public static void UserNames() throws InterruptedException {
		WebElement mb = driver.findElement(By.xpath("//*[@id='selectedUsers']"));
		Select s = new Select(mb);
		s.selectByIndex(0);

		clickOnAddSelectionsButton();
		listOfSelectedUsers();
		clickOnSharedOKButton();
		Thread.sleep(2000);
	}

	public static void listOfSelectedUsers() {
		WebElement mb = driver.findElement(By.xpath("//*[@id='usernames']"));
		Select s = new Select(mb);

		List<WebElement> users = s.getOptions();
		for (WebElement we : users) {
			String s1 = we.getText();
			System.out.println("INFO: Selected User Name: " + s1);
		}
	}

	public static void fileSharedSuccessfully() {

		String share = driver.findElement(By.xpath("//*[@id='status_div']")).getText();
		System.out.println(share);
	}

	public static void fileUnsharedSuccessfully() {

		String unshare = driver.findElement(By.xpath("//*[@id='status_div']")).getText();
		System.out.println(unshare);
	}

	public static void getDeletePopUp() {

		String popMsg = driver.switchTo().alert().getText();
		System.out.println(popMsg);
	}

	public static void clickOnOkPopUp() {

		driver.switchTo().alert().accept();

		System.out.println("INFO: File deleted");

	}
}
