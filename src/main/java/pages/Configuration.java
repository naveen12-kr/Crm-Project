package pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Configuration extends BasePage {

	public final static By byDataRetentionpolicyLink = findBy("//*[@class='col-xs-12']/p/a");
	public final static By byDataRetentionpolicy = findBy("//*[@class='col-xs-12']/h1");
	public final static By byConfiguration = findBy("/html/body/div/header/div/div[2]/ul/li[6]/a");
	public final static By byTags = findBy("//div//li//*[contains(text(), 'Tags')]");
	public final static By byLegalHolds = findBy("//li//*[contains(text(), 'Legal Holds')]");
	public final static By byLegalHoldsDetails = findBy("//div//h1[contains(text(), 'Legal Hold Details')]");
	public final static By byAddTagTextBox = findBy("//input[contains(@name, 'newName')]");
	public final static By byAddTagButton = findBy("//*[@value='Add Tag']");
	public final static By byTagName = findBy("//input[contains(@name,'cname')]");
	public final static By byDescription = findBy("//textarea[@id='id_desc']");
	public final static By byEditDescription = findBy("//textarea[@id='id_desc']");
	public final static By byMagnifyingGlassList = findBy("//*[@class='scheduled-table']/tbody/tr[i]/td[4]/a/img");
	public final static By byLegalHoldCheckBox = findBy("//input[contains(@name,'legalhold')]");
	public final static By byCreateTagButton = findBy("//input[contains(@value, 'Create Tag')]");
	public final static By byNewTagConfigurationHeader = findBy("//div//h1[contains(text(), 'New Tag Configuration')]");
	public final static By byPenIcon = findBy("//*[@class='scheduled-table']/tbody/tr[3]/td[5]/a/img");
	public final static By byDelete = findBy("//*[@class='scheduled-table']/tbody/tr[2]/td[6]/form/input[2]");
	public final static By byMagnifyingGlass = findBy("//*[@class='scheduled-table']/tbody/tr[3]/td[4]/a/img");
	public final static By byEmptyTag = findBy("//div//li[contains(text(),'This field is required')]");
	public final static By byCurrentEmailTagsHeader = findBy("//div//h3[contains(text(), 'Current Email Tags')]");
	public final static By bySaveChanges = findBy("//*[@id='submit']");
	public final static By byConfigIdAlreadyExists = findBy("//*[@id='main']/div[2]/div/div[2]/div/div/form/ul/li");
	public final static By bycrossIcon = findBy("//*[@id='main']//table/tbody/tr[2]/td[6]/form/input[2]");
	public final static By bycrossIcon1 = findBy("//*[@id='main']//table/tbody/tr[2]/td[5]/form/input[2]");
	public final static By byEmailView = findBy("(//*[@class='firstRowEmailData'])[2]");
	public final static By byEmailDisplay = findBy("(//*[contains(@style,'padding')])[1]");
	public final static By byEmailCheckBox = findBy("//*[@class='check-all']/label/span");
	public final static By byForwardPopup = findBy("//span[contains(text(),'Forward')]");
	public static final By byForwardOkbutton = findBy("//div[4]//*[contains(text(),'Ok')]");
	//public static final By byForwardSecondWindowOk = findBy("/html/body/div[11]/div[3]/div/button");
	public static final By byForwardSecondWindowOk = findBy("//div[12]//div[3]//button[1]");
	public static final By byPrintToPDFOKButton = findBy("/html/body/div[3]/div[3]/div/button");
	public static final By byPDFOKButton = findBy("/html/body/div[7]/div[3]/div/button");
	//public static final By byTagOKButton = findBy("/html/body/div[11]/div[3]/div/button");
	public static final By byTagOKButton = findBy("//div[12]//div[3]//button[1]");
	public static final By byEmailDisplayed = findBy("//*[@id='emailDisplayContent']");
	public static final By byIncludeAttachments = findBy("//*[@id=\"pdf_attach\"]");
	public static final By byEntireTag = findBy("//*[@name='redact'][@id='tag-redact']");
	public static final By byIntradynLogo = findBy("/html/body/div/header/div/div[1]/a/img");
	public static final By byDashboadPage = findBy("//*[@id='main']/div/div[1]/div/h1");
	public static final By bySearchPage = findBy("//*[contains(text(),'Query Terms')]");
	public static final By byAccountSettingsIcon = findBy("/html/body/div/header/div/div[3]/ul/li[1]/a");
	public static final By byAccountSettingsPage = findBy("//*[@id='content']/h1");
	public static final By byHelpIcon = findBy("/html/body/div/header/div/div[3]/ul/li[2]/a");
	public static final By byLogoutIcon = findBy("/html/body/div/header/div/div[3]/ul/li[3]/a");
	public static final By byLoginPage = findBy("//*[contains(@id,'submit')]");
	public static final By byHomeLogoCollapseIcon = findBy("//*[@id='menu-collapse']");
	public static final By bySettingsDisplay = findBy("//*[@id='left-menu']/h3[1]");
	public static final By byPencilIconForEditingServerDetails = findBy(
			"//*[@id='inactiveForm']/table/tbody/tr[2]/td[3]/a[1]");
	public static final By byTestIconForTestingServerDetails = findBy(
			"//*[@id='inactiveForm']/table/tbody/tr[2]/td[3]/a[2]");
	public static final By byActivityName = findBy("//*[@id='id_name']");
	public static final By byDeleteIconForTestingServerDetails = findBy(
			"//*[@id='inactiveForm']/table/tbody/tr[2]/td[3]/a[3]");
	public static final By byDeleteIconForTestingActivityDetails = findBy(
			"//*[@id='main']/div/div[3]/div/div/form/table/tbody/tr[2]/td[5]/a[3]/img");
	public static final By byPencilIconForEditingTheActivityDetails = findBy(
			"//*[@id='main']/div/div[3]/div/div/form/table/tbody/tr[2]/td[5]/a[2]");

	public static String oldVersion;
	public static String NewVersion;
	public static String PreName;
	public static String PreData;
	public static String Pre;
	public static String subject;

	//////////////////////////// CLICKERS ///////////////////////

	public static void clickOnForwardOKbutton() {
		clickElement(byForwardOkbutton, "Ok button");
		sleepApplication(3000);
	}

	public static void clickOnDataRetentionpolicyLink() {
		clickElement(byDataRetentionpolicyLink, "Data Retention policy Link");
		sleepApplication(3000);
	}

	public static void clickOnSecondForwardOKbutton() {
		clickElement(byForwardSecondWindowOk, "Ok button");
		sleepApplication(3000);
	}

	public static void clicksOnLinkTab(String data) {
		clickElement(findBy("//li//*[contains(text(), '" + data + "')]"), data);
	}

	public static void clicksOnSecondWindow(String data) {

		clickElement(findBy("//div//*[@class='" + data + "']"), data);

	}

	public static void clickOnConfiguration() {

		clickElement(byConfiguration, "Configuration");
	}

	public static void clickOnPDFCheckBox() {

		clickElement(findBy("//*[@id='pdf_attach']"), "Include Attachments");
	}

	public static void clickOnLegalHoldCheckBox() {

		clickElement(byLegalHoldCheckBox, "Legal Hold CheckBox");
	}

	public static void clickOnTags() {

		clickElement(byTags, "Tags");
	}

	public static void clickOnLegalHolds() {

		clickElement(byLegalHolds, "Legal Holds");
	}

	public static void clickOnCreateTagButton() {

		clickElement(byCreateTagButton, "Create New Tag");
	}

	public static void clickOnMgToViewEmails() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> mg = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[4]"));
		//List<WebElement> mg = table.findElements(By.xpath("//tr[2]//td[3]//a[1]//img[1]"));

		Iterator<WebElement> itr = mg.iterator();

		while (itr.hasNext()) {

			WebElement row = itr.next();
			row.click();
			Thread.sleep(3000);

			String sr = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();
			
			Thread.sleep(3000);

			String[] r = sr.split(" ");

			String total_count = r[3];
			total_count.replaceAll(",", "");
            System.out.println(">>>>" +  total_count);
			
			//int a = Integer.parseInt(total_count);
            int a = Integer.parseInt(total_count.replaceAll(",", ""));

			try {
				if (a == 0) {

					clickONCurrentEmailTagsHeader1();
					Thread.sleep(3000);
				}

			} catch (Exception e) {
				System.out.print(e);
			} finally {
				if (a != 0) {
					System.out.println("INFO: Total number of emails in a tag: " + a);
					Thread.sleep(3000);
					break;
				}
			}
		}

	}

	public static void clickOnMgToViewEmailsCount() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> mg = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[4]"));

		Iterator<WebElement> itr = mg.iterator();

		while (itr.hasNext()) {

			WebElement row = itr.next();
			row.click();
			Thread.sleep(3000);

			String sr = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();
			Thread.sleep(3000);

			String[] r = sr.split(" ");
			String total_count = r[3];
			total_count.replaceAll(",", "");
            System.out.println(">>>>" +  total_count);
			
			//int a = Integer.parseInt(total_count);
            int a = Integer.parseInt(total_count.replaceAll(",", ""));

			try {
				if (a <= 2) {

					clickONCurrentEmailTagsHeader1();
					Thread.sleep(3000);

				}

			} catch (Exception e) {
				System.out.print(e);
			} finally {
				if (a > 2) {
					System.out.println("INFO: Total number of emails in a tag: " + a);

					Thread.sleep(3000);
					break;
				}
			}
		}

	}

	public static void clickOnMgNoEmailsUnderTag() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> mg = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[4]"));

		Iterator<WebElement> itr = mg.iterator();

		while (itr.hasNext()) {

			WebElement row = itr.next();
			row.click();
			Thread.sleep(3000);

			String sr = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();
			Thread.sleep(3000);

			String[] r = sr.split(" ");
			String total_count = r[3];
			total_count.replaceAll(",", "");
            System.out.println(">>>>" +  total_count);
			
			//int a = Integer.parseInt(total_count);
            int a = Integer.parseInt(total_count.replaceAll(",", ""));
			//int a = Integer.parseInt(total_count);

			try {
				if (a == 0) {

					System.out.println("INFO: Total number of emails in a tag: " + a);
					clickONCurrentEmailTagsHeader1();
					Thread.sleep(3000);

				}
			} catch (Exception e) {
				System.out.print(e);
			} finally {
				if (a != 0) {

					clickONCurrentEmailTagsHeader1();
					Thread.sleep(3000);
				}
			}
		}

	}

	public static void getValidLegalHoldsFromTable() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
		List<WebElement> pencil = table
				.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[3]"));
		Thread.sleep(2000);

		System.out.println(pencil.size());

	}

	public static void clickOnPencilAndEditDesc() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> pencil = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[5]/a"));
		Thread.sleep(2000);

		for (int l = 1; l <= pencil.size();) {

			WebElement table1 = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr['" + l + "']/td[5]/a"));
			Thread.sleep(2000);
			row.get(l).click();

			boolean i = isLegalHoldCheckBoxSelected();

			if (i == true) {
				driver.findElement(By.xpath("//*[@id='ok']")).click();
				break;
			} else {

				driver.findElement(byDescription).clear();
				Thread.sleep(2000);

				String newDesc = getRandomString(10);
				driver.findElement(byDescription).sendKeys(newDesc);
				Thread.sleep(2000);

				clickOnSaveChanges();
				System.out.println("INFO: Description edited successfully");
				Thread.sleep(10000);
				break;
			}
		}

	}

	public static void getValidLeagalHold() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> row1 = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[3]"));
		Thread.sleep(2000);

		String[] nameArray = new String[row1.size()];

		for (int i = 0; i < row1.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr['" + i + "']/td[3]"));

			nameArray[i] = row.get(i).getText();

			if (nameArray[i].equals("True")) {

				List<WebElement> name = table1
						.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr['" + i + "']/td[1]"));
				System.out.println("INFO: Current Legal Hold Tag Nmae: " + name.get(i).getText());
				break;
			}

		}

	}

	public static List<WebElement> getValidLeagalHoldList() throws InterruptedException {
		List<WebElement> name = null;
		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
		List<WebElement> row1 = table
				.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[3]"));
		Thread.sleep(2000);

		String[] nameArray = new String[row1.size()];

		for (int i = 0; i < row1.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['" + i + "']/td[3]"));

			nameArray[i] = row.get(i).getText();

			if (nameArray[i].equals("True")) {

				name = table1.findElements(
						By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['" + i + "']/td[1]"));

			}
		}
		return name;

	}

	public static void clickOnPencilIcon() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//table[@class='scheduled-table']"));
		List<WebElement> pencil = table.findElements(By.xpath("//table[@class='scheduled-table']/tbody/tr/td[5]/a"));
		Thread.sleep(2000);

		String[] nameArray = new String[pencil.size()];

		for (int i = 0; i <= pencil.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//table[@class='scheduled-table']"));
			List<WebElement> row = table1
					.findElements(By.xpath("//table[@class='scheduled-table']/tbody/tr['" + i + "']/td[3]"));

			nameArray[i] = row.get(i).getText();

			if (nameArray[i].equals("True")) {
				List<WebElement> name = table1
						.findElements(By.xpath("//table[@class='scheduled-table']/tbody/tr['" + i + "']/td[1]"));
				System.out.println("INFO: Legal Hold Tag Nmae: " + name.get(i).getText());

				List<WebElement> lp = table1
						.findElements(By.xpath("//table[@class='scheduled-table']/tbody/tr['" + i + "']/td[5]/a"));
				Thread.sleep(2000);
				lp.get(i).click();
				break;

			}
		}

		/*
		 * String page1 = driver.findElement(By.
		 * xpath("//div//h1[contains(text(),'Legal Hold Details')]")).getText();
		 * System.out.println("INFO: The defintion of the selected " + page1 +
		 * " displayed");
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//*[@id='ok']")).click();
		 * 
		 * String page = driver.findElement(By.
		 * xpath("//div//h3[contains(text(),'Current Legal Holds')]")).getText()
		 * ; System.out.println("INFO: " + page + " is returned");
		 */
	}

	public static void clickOnPencil() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> pencil = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[5]/a"));
		Thread.sleep(2000);

		String[] nameArray = new String[pencil.size()];

		for (int i = 0; i < pencil.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr['" + i + "']/td[3]"));

			nameArray[i] = row.get(i).getText();

			if (nameArray[i].equals("False")) {

				List<WebElement> name = table1
						.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr['" + i + "']/td[1]"));
				System.out.println("Legal Hold Tag Nmae: " + name.get(i).getText());

				List<WebElement> lp = table1
						.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr['" + i + "']/td[5]/a"));
				Thread.sleep(2000);
				lp.get(i).click();
				Thread.sleep(3000);

				sleepApplication(5000);
				break;
			}
		}

	}

	public static void clickONCurrentEmailTagsHeader() {

		clickElement(byCurrentEmailTagsHeader, "Current Email header");
	}

	public static void clickONCurrentEmailTagsHeader1() {

		clickElement1(byCurrentEmailTagsHeader, "Current Email header");
	}

	public static void clickOnAddTagsButton() {

		clickElement(findBy("//*[contains(@value,'Add')]"), "Add Tag Button");
	}

	public static void clickOnCrossDeleteIcon() {

		String delete = driver.findElement(bycrossIcon).getAttribute("title");

		clickElement(bycrossIcon, "Delete Icon");

		System.out.println(delete + " is ready for delete");
	}

	public static void clickOnCrossDeleteIcon1() {

		String delete = driver.findElement(bycrossIcon1).getAttribute("title");

		clickElement(bycrossIcon1, "Delete Icon");

		System.out.println(delete + " is ready for delete");
	}

	public static void clickOnEmailToView() {
		subject = getText(byEmailView, "Email");
		clickElement(byEmailView, "Email");
	}

	public static boolean isSameEmailOpened() {
		List<WebElement> row1 = driver.findElements(By.xpath("//*[@id='msgView']/tbody/tr/td[1]"));

		for (int i = 0; i < row1.size(); i++) {
			if (row1.get(i).getText().equals("Subject:")) {
				int j = i + 1;
				MyLabels.startDate1 = driver.findElement(By.xpath("//*[@id='msgView']/tbody/tr[" + j + "]/td[2]"))
						.getText();
				break;
			}
		}
		System.out.println(subject + " ===== " + MyLabels.startDate1);
		return subject.equals(MyLabels.startDate1);
	}

	public static void clickOnAnotherEmailToView() {

		clickElement(findBy("//*[@id='emails-list']/div[3]/div/div[2]/div[2]/div[1]/div[1]/b/u"), "Another Email");
	}

	public static void clickOnRightClickOpenHere() {
		
		WebElement link = driver
				.findElement(By.xpath("//*[@id='emails-list']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]"));
		Actions action = new Actions(driver);
		action.contextClick(link).build().perform();
		
		driver.findElement(By.xpath("//div[@id='jqContextMenu']//ul//li[@id='menu_open_here']")).click();
		System.out.println("Right click operation performed successfully");

	}

	public static void clickOnRightClickOpenNewTab() {

		WebElement link = driver
				.findElement(By.xpath("//*[@id='emails-list']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]"));
		Actions action = new Actions(driver);
		action.contextClick(link).build().perform();
		driver.findElement(By.xpath("//div[@id='jqContextMenu']//ul//li[@id='menu_open_there']")).click();
		System.out.println("Right click operation performed successfully");

	}

	public static void clickOnEmailsCheckBox() {

		clickElement(byEmailCheckBox, "Email Check Box");
	}

	public static void clickOnPrintToPDF() {
		Actions action = new Actions(driver);
		WebElement print = driver.findElement(By.xpath("//*[@id='print']"));
		action.moveToElement(print).moveToElement(driver.findElement(By.xpath("//*[@id='print_pdfs']"))).click().build()
				.perform();
	}

	public static void clickOnPDFOKbutton() {
		clickElement(byPrintToPDFOKButton, "Ok button");
		sleepApplication(5000);
	}

	public static void clickOnPDFOKbutton2() {
		clickElement(byPDFOKButton, "Ok button");
		sleepApplication(5000);
	}

	public static void clickOnTagOKbutton() {
		clickElement(byTagOKButton, "Ok button");
		sleepApplication(5000);
	}

	public static void clickOnSaveChanges() {

		clickElement(bySaveChanges, "Save Changes");

	}

	public static void clickOnRemoveTagTab() {
		Actions action = new Actions(driver);
		WebElement tag = driver.findElement(By.xpath("//*[@id='tag']"));
		action.moveToElement(tag).moveToElement(driver.findElement(By.xpath("//*[@id='delete_tag']"))).click().build()
				.perform();
	}

	public static void clickOnIntradynLogo() {

		clickElement(byIntradynLogo, "Intradyn Logo");
	}

	public static void clickOnAccountSettingsIcon() {

		clickElement(byAccountSettingsIcon, "Account Settings Icon");
	}

	public static void clickOnHelpIcon() {

		clickElement(byHelpIcon, "Help Icon");
	}

	public static void clickOnLogoutIcon() {

		clickElement(byLogoutIcon, "Logout Icon");
	}

	public static void clickOnHomeLogoCollapseIcon() {

		clickElement(byHomeLogoCollapseIcon, "Main Collapse Icon");
	}

	public static void clickOnPencilIconForEditingServerDetails() {

		clickElement(byPencilIconForEditingServerDetails, "Pencil Icon For Editing Server Details");
	}

	public static void clickOnEntireTag() {

		clickElement(byEntireTag, "Entire Tag");
	}

	public static void selectCurrentDocument() {
		// clickElement(findBy("//*[@id='document-redact']"), "Current
		// Document");
	}

	public static void clickOnRedactOKButton() {
		clickElement(findBy("//*[@id='ui-id-4']/following::button[4]"), "Redact OK Button");
	}

	public static void clickOnUnredactOKButton() {

		clickElement(findBy("/html/body/div[6]/div[11]/div/button"), "Unredact OK Button");
	}

	public static void clickOnUpArrow() {
		Configuration.Pre = driver
				.findElement(By.xpath("//*[@id='main']/div/div[3]/div/div/form/table/tbody/tr[2]/td[1]")).getText();
		boolean V = isElementPresent1(findBy("//*[contains(@title,('Activate " + Configuration.Pre + "'))]"),
				"UpArrow");
		System.out.println(V);
		if (V == true) {
			driver.findElement(By.xpath("//*[contains(@title,('Activate " + Configuration.Pre + "'))]")).click();
		} else {
			System.out.println("The Arrow is Already disabled");
			driver.findElement(By.xpath("//*[contains(@title,('Deactivate " + Configuration.Pre + "'))]")).click();
			driver.findElement(By.xpath("//*[contains(@title,('Activate " + Configuration.Pre + "'))]")).click();
		}
	}

	public static void clickOnDownArrow() {
		Configuration.Pre = driver
				.findElement(By.xpath("//*[@id='main']/div/div[3]/div/div/form/table/tbody/tr[2]/td[1]")).getText();
		boolean V = isElementPresent1(findBy("//*[contains(@title,('Deactivate " + Configuration.Pre + "'))]"),
				"UpArrow");
		System.out.println(V);
		if (V == true) {
			driver.findElement(By.xpath("//*[contains(@title,('Deactivate " + Configuration.Pre + "'))]")).click();
		} else {
			System.out.println("The Arrow is Already Active");
			driver.findElement(By.xpath("//*[contains(@title,('Activate " + Configuration.Pre + "'))]")).click();
			driver.findElement(By.xpath("//*[contains(@title,('Deactivate " + Configuration.Pre + "'))]")).click();
		}
	}

	public static void clickOnTestIconForTestingServerDetails() {

		clickElement(byTestIconForTestingServerDetails, "Test Icon For Testing Server Details");
	}

	public static void clickOnPencilIconForEditingTheActivityDetails() {
		String data = driver.findElement(By.xpath("//*[@id='main']/div/div[3]/div/div/form/table/tbody/tr[2]/td[4]"))
				.getText();
		String time[] = data.split(" ");
		Configuration.PreData = time[0];
		clickElement(byPencilIconForEditingTheActivityDetails, "Pencil Icon For Editing The Activity Details");
	}

	public static void clickOnDeleteIconForTestingServerDetails() {

		Configuration.PreName = driver.findElement(By.xpath("//*[@id='inactiveForm']/table/tbody/tr[2]/td[1]"))
				.getText();

		clickElement(byDeleteIconForTestingServerDetails, "Test Icon For Testing Server Details");
	}

	public static void clickOnDeleteIconForTestigActivityDetails() {

		Configuration.PreName = driver
				.findElement(By.xpath("//*[@id='main']/div/div[3]/div/div/form/table/tbody/tr[2]/td[1]")).getText();

		clickElement(byDeleteIconForTestingActivityDetails, "Test Icon For Testing Activity Details");
	}

	//////////////////////////////////////// VALIDATIONS
	//////////////////////////////////////// //////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////

	public static boolean isExportPopUpPresent() {

		return isElementPresent(byForwardPopup, "Forward PopUp");
	}

	public static boolean isLegalHoldCheckBoxPresent() {

		return isElementPresent(byLegalHoldCheckBox, "Legal Hold CheckBox");
	}

	public static boolean isTagAddSuccesfully() {

		WebElement message = driver.findElement(By.xpath("//*[@id='main']/div[1]"));
		String msg = message.getText();

		System.out.println("INFO: " + msg);
		return msg != null;

	}

	public static boolean isDescDisabled() {

		return isElementEnabled(byDescription, "Discription field");
	}

	public static boolean isEmailDisplay() throws InterruptedException {
		Thread.sleep(8000);
		return isElementPresent(byEmailDisplay, "Email Display");
	}

	public static boolean isCommentsPageDisplay() throws InterruptedException {

		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
			}
		}

		Thread.sleep(5000);

		boolean V = isElementPresent(findBy("//h1[contains(text(),'Message Tags and Comments')]"),
				"Message Tags and Comments Page");

		driver.switchTo().window(parent);
		return V;
	}

	public static boolean isEmailDisplayinNewWindow() throws InterruptedException {

		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
			}
		}

		Thread.sleep(5000);

		boolean V = isElementPresent(byEmailDisplay, "Email Display in New Window");

		driver.switchTo().window(parent);
		return V;
	}

	public static boolean isEmailDisplayedWith3SectionsNewWindow() throws InterruptedException {

		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);
				Assert.assertTrue(getText(findBy("//*[@id='msgView']/tbody/tr[1]/td[1]/b"), "").contains("Tags:"));
				System.out.println(driver.switchTo().window(child_window).getTitle());
			}
		}

		Thread.sleep(5000);

		boolean V = isElementPresent(byEmailDisplay, "Email Display in New Window");

		driver.switchTo().window(parent);
		return V;
	}

	public static boolean isDataRetentionPageDisplayinNewWindow() throws InterruptedException {

		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
			}
		}

		Thread.sleep(5000);

		boolean V = isElementPresent(byDataRetentionpolicy, "Data Retention policy Page Display in New Window");

		driver.switchTo().window(parent);
		return V;
	}

	public static void isPrintDisplayinNewWindow() throws InterruptedException {

		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);
				Thread.sleep(3000);

				System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
			}
		}

		driver.switchTo().window(parent);
		System.out.println("Successfully displayed in new window");

	}

	public static void isPDFDisplayinNewWindow() throws InterruptedException {

		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);
				Thread.sleep(3000);

				System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
			}
		}

		driver.switchTo().window(parent);
		System.out.println("Successfully displayed in new window");

	}

	public static boolean isDescriptionFieldEmpty() {

		WebElement message = driver.findElement(By.xpath("//*[@id='id_desc']"));
		boolean msg = message.getText().isEmpty();

		System.out.println("INFO: The Description field is empty :" + msg);
		return msg;
	}

	public static boolean isLegalHoldCheckBoxSelected() {

		return isElementSelected(byLegalHoldCheckBox, "Legal Hold CheckBox");
	}

	public static boolean isEmptyTag() {

		return isElementPresent(byEmptyTag, "This fied is required");
	}

	//////////////////////////////////////// SETTERS AND GETTERS
	//////////////////////////////////////// ////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void setDescription(String description) {

		setText(byDescription, "description", description);
	}

	public static void editDescription(String description) throws InterruptedException {

		driver.findElement(byDescription).clear();

		Thread.sleep(3000);
	}

	public static void setExistingTagName() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> pencil = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[5]/a"));
		Thread.sleep(2000);

		String[] nameArray = new String[pencil.size()];

		for (int i = 0; i < pencil.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr['" + i + "']/td[3]"));

			nameArray[i] = row.get(i).getText();

			List<WebElement> name = table1
					.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr['" + i + "']/td[1]"));

			String lhNames = name.get(i).getText();

			System.out.println("Legal Hold Tag Nmae: " + lhNames);

			driver.findElement(By.xpath("//*[@id='id_newName']")).clear();

			driver.findElement(By.xpath("//*[@id='id_newName']")).sendKeys(lhNames);

			clickOnAddTagsButton();

			Thread.sleep(3000);

			break;

		}

	}

	public static void setExistingTagNameAsUpperCase() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> pencil = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[5]/a"));
		Thread.sleep(2000);

		String[] nameArray = new String[pencil.size()];

		for (int i = 0; i < pencil.size(); i++) {
			WebElement table1 = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
			List<WebElement> row = table1
					.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr['" + i + "']/td[3]"));

			nameArray[i] = row.get(i).getText();

			List<WebElement> name = table1
					.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr['" + i + "']/td[1]"));

			String lhNames = name.get(i).getText();

			System.out.println("Legal Hold Tag Nmae: " + lhNames);

			driver.findElement(By.xpath("//*[@id='id_newName']")).clear();

			driver.findElement(By.xpath("//*[@id='id_newName']")).sendKeys(lhNames.toUpperCase());

			clickOnAddTagsButton();

			Thread.sleep(3000);

			// String text =
			// driver.findElement(By.xpath("//div//h1[contains(text(), 'New Tag
			// Configuration')]")).getText();
			// System.out.println(text);

			// driver.navigate().back();

			// Thread.sleep(3000);
			break;

		}

	}

	public static void isNewTagConfigurationPageOpened() {
		Assert.assertTrue(
				driver.findElement(By.xpath("//div//h1[contains(text(), 'New Tag Configuration')]")).isDisplayed());
	}

	public static void getMsgConfigIdAlreadyExists() {

		getText(byConfigIdAlreadyExists, "");

	}

	public static void selectDateinDescOrder(String data) throws InterruptedException {
		WebElement mb = driver.findElement(By.xpath("//*[@id='sort']"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println(data + " is selected");
	}

	public static void selectCheckBoxInTag() throws InterruptedException {
		/*
		 * String num = getRandomIntiger(1); int i = Integer.parseInt(num);
		 * 
		 * driver.findElement(By.xpath("//*[@id='lookup_items']/input['"+i+"']")
		 * ).click();
		 */

		List<WebElement> ele = driver.findElements(By.xpath("//*[@id='lookup_items']/input"));
		ele.get(0).click();
		sleepApplication(2000);
	}

	public static void getSelectedEmailsDisplay() {

		String name = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();

		System.out.println("Total Mails " + name);
	}

	public static boolean getLegalHoldDetails() {

		return isElementPresent(byLegalHoldsDetails, "Legal Holds Details");
	}

	public static void getEmailDisplayed() {
		String msg = driver.findElement(By.xpath("//*[@id='emailDisplayContent']")).getText();
		System.out.println(msg);
	}

	public static String setAddNewTagText(String Ram) {
		setText(byAddTagTextBox, "Add New Tag", Ram);
		return Ram;
	}

	public static void getDownload() {
		Actions action = new Actions(driver);
		WebElement toolBar = driver.findElement(By.xpath("//*[@id='toolbar']"));
		action.moveToElement(toolBar).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[@id='download']"))).click().build().perform();

	}

	public static void isArrowDirectionChangedUptoDown() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@title,('Deactivate " + Configuration.Pre + "'))]"))
				.isDisplayed());
		System.out.println("INFO: The Arrow is got disabled");

	}

	public static void isArrowDirectionChangedDowntoUp() {
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@title,('Activate " + Configuration.Pre + "'))]"))
				.isDisplayed());
		System.out.println("INFO: The Arrow is got Active");

	}

	public static void selectRemoveFromCurrentEmail() {

		clickElement(findBy("//*[@id='document-removeredact']"), "Remove From Current Email");
	}

	public static void selectRemoveFromEntireTag() {

		clickElement(findBy("//*[@id='tag-removeredact']"), "Remove From Entire Tag");
	}

	public static void selectRemoveAllRedactions() {

		clickElement(findBy("//*[@id='select-all']"), "Remove All Redactions");
	}

	public static void getCurrentEmailTags() throws InterruptedException {

		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> row1 = table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[3]"));
		Thread.sleep(2000);
		System.out.println("INFO: Number of rows in a table " + row1.size());
	}

	public static boolean isEmailsTagsTableDisplay() {

		boolean V = isElementPresent(findBy("//*[@id='main']/div[2]/div/div[2]/div[@style='display: none;']"),
				"Collapse Icon");
		System.out.println("INFO: Current Emails Tags Table is Minimised");
		return !V;
	}

	public static boolean isDashboardPage() {

		boolean V = isElementPresent(byDashboadPage, "Dashboard Page") || isElementPresent(bySearchPage, "Search Page");
		return V;
	}

	public static boolean isAccountSettingsPage() {

		return isElementPresent(byAccountSettingsPage, "Account Settings Page");
	}

	public static void getHelpDocumentation() throws InterruptedException {

		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);

				System.out.println("INFO: New Window Title: " + driver.switchTo().window(child_window).getTitle());
			}
			System.out.println("INFO: Help Documentation is displayed in new Window");
		}

		Thread.sleep(3000);
		driver.switchTo().window(parent);

	}

	public static boolean isLoginPageDisplay() {
		return isElementPresent(byLoginPage, "Login Page");

	}

	public static boolean isSettingsHeaderDisplay() {
		sleepApplication(3000);
		return isElementPresent(bySettingsDisplay, "Side Menu");
	}

	public static boolean isSideMenuDisplay() {

		boolean V = isElementPresent(findBy("//*[@id='left-menu'][@style='display: none;']"), "Collapse Icon");
		System.out.println("INFO: Side Menu is disappeared");
		return V;
	}

	public static void selectMakeThisDefault() {
		clickElement(findBy("//*[@id='make_default']"), "Make This The Default");
	}

	public static void selectEmailText() throws InterruptedException {
		Thread.sleep(3000);
		WebElement data = driver.findElement(By.xpath("(//*[contains(@style,'padding')])[1]"));

		Actions action = new Actions(driver);
		action.moveToElement(data, 10, 30).click().keyDown(Keys.SHIFT).moveToElement(data, 100, 100).click()
				.keyUp(Keys.SHIFT).build().perform();
	}

	public static void selectEmailBodyText() {

		WebElement data = driver.findElement(By.xpath("(//*[contains(@style,'padding')])[1]"));

		Actions action = new Actions(driver);
		action.moveToElement(data, 10, 30).click().keyDown(Keys.SHIFT).moveToElement(data, 60, 60).click()
				.keyUp(Keys.SHIFT).build().perform();
	}

	public static void selectHeaderValue() throws InterruptedException {

		WebElement data = driver.findElement(By.xpath("//*[@id='msgView']/tbody/tr[5]/td[2]"));

		Actions action = new Actions(driver);
		action.moveToElement(data, 100, 0).click().keyDown(Keys.SHIFT).moveToElement(data, 200, 0).click()
				.keyUp(Keys.SHIFT).build().perform();

	}

	public static void selectHeaderLabels() throws InterruptedException {

		WebElement data = driver.findElement(By.xpath("//*[@id=\"msgView\"]/tbody/tr[1]"));

		Actions action = new Actions(driver);
		action.moveToElement(data).doubleClick().build().perform();
		Thread.sleep(2000);

	}

	public static void selectEmailAttachment() throws InterruptedException {

		WebElement data = driver.findElement(By.xpath("//*[@id=\"msgView\"]/tbody/tr[6]/td[2]/a[1]"));

		Actions action = new Actions(driver);
		action.moveToElement(data, 100, 0).click().keyDown(Keys.SHIFT).moveToElement(data, 200, 0).click()
				.keyUp(Keys.SHIFT).build().perform();

	}

	public static void getEmailText() {
		String data = driver.findElement(By.xpath("//*[@id='plainBody']/div")).getText();
		System.out.println("INFO: Redacted Text is:" + data);
	}

	public static void getAnotherEmailText() {

		System.out.println("Pop Up window is not displayed.");
		String data = driver.findElement(By.xpath("//*[@id='plainBody']/div")).getText();
		System.out.println("Redacted Text is:" + data);
	}

	public static void getLabelText() {

		String data = driver.findElement(By.xpath("//*[@id='msgView']/tbody/tr[1]")).getText();
		System.out.println("INFO: Email Header Text :" + data);
	}

	public static void getTheResultOfTHeTest() {
		sleepApplication(8000);
		String Result = driver.findElement(By.xpath("//*[@id='1']/dd/a")).getText();
		if (Result.equals("pass")) {
			Assert.assertEquals(Result, "pass");
			System.out.println("INFO: The test got passed");
		} else {
			Assert.assertEquals(Result, "fail");
			System.out.println("INFO: The test got failed");
		}
	}

	public static void setActivityName(String sText) {

		setText(byActivityName, "Activity Name", sText);
	}

	public static void isActivityNameAddedInList() {

		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div/div[3]/div/div/form"));
		List<WebElement> name = table
				.findElements(By.xpath("//*[@id='main']/div/div[3]/div/div/form/table/tbody/tr/td[1]"));

		java.util.Iterator<WebElement> i = name.iterator();

		while (i.hasNext()) {
			WebElement row = i.next();
//			if (row.getText().equals(ConfigurationDef.newActivityName)) {
//				Assert.assertTrue(row.getText().equals(ConfigurationDef.newActivityName));
//				System.out.println(
//						"INFO: The Activity Name " + ConfigurationDef.newActivityName + " is Added in the List");
//			}

		}

	}

	public static void isServerNameAddedInList() {

		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div/div/form"));
		List<WebElement> name = table
				.findElements(By.xpath("//*[@id='main']/div/div[2]/div/div/form/table/tbody/tr/td[1]"));

		java.util.Iterator<WebElement> i = name.iterator();

		while (i.hasNext()) {
			WebElement row = i.next();
			System.out.println();
//			if (row.getText().equals(ConfigurationDef.newActivityName)) {
//				Assert.assertTrue(row.getText().equals(ConfigurationDef.newActivityName));
//				System.out
//						.println("INFO: The Server Name " + ConfigurationDef.newActivityName + " is Added in the List");
//			}
		}
	}

	public static void setEditingVersion() {

		Configuration.oldVersion = driver.findElement(By.xpath("//*[@id='inactiveForm']/table/tbody/tr[2]/td[1]"))
				.getText();
		driver.findElement(By.xpath("//*[@id='inactiveForm']/table/tbody/tr[2]/td[3]/a[1]")).click();

		driver.findElement(By.xpath("//*[@id='id_name']")).sendKeys("1");

	}

	public static void setEditingTime() {

		String t[] = Configuration.PreData.split(":");
		int time1 = Integer.parseInt(t[0]);
		int Time = time1 + 1;
		String Time1 = Integer.toString(Time);
		driver.findElement(By.xpath("//*[@id='id_run_time']")).clear();

		driver.findElement(By.xpath("//*[@id='id_run_time']")).sendKeys(Time1 + ":30");

	}

	public static void isVersionEditted() {
		List<WebElement> name = driver.findElements(By.xpath("//*[@id='inactiveForm']/table/tbody/tr/td[1]"));
		System.out.println(name.size());
		int j = name.size();
		int k = j + 1;
		String LatestVersion = driver.findElement(By.xpath("//*[@id='inactiveForm']/table/tbody/tr[" + k + "]/td[1]"))
				.getText();

		Assert.assertTrue(!Configuration.oldVersion.equals(LatestVersion));
		System.out.println("INFO: The version got Edited");

	}

	public static void isTimeGotEditted() {
		List<WebElement> name = driver
				.findElements(By.xpath("//*[@id='main']/div/div[3]/div/div/form/table/tbody/tr/td[4]"));
		System.out.println(name.size());
		int j = name.size();
		int k = j + 1;
		String LatestTime = driver
				.findElement(By.xpath("//*[@id='main']/div/div[3]/div/div/form/table/tbody/tr[" + k + "]/td[4]"))
				.getText();
		String T[] = LatestTime.split(" ");
		Assert.assertTrue(!Configuration.PreData.equals(T[0]));
		System.out.println("INFO: The version got Edited");

	}

	public static void isNameDeleted() {
		List<WebElement> name = driver.findElements(By.xpath("//*[@id='inactiveForm']/table/tbody/tr/td[1]"));
		System.out.println(name.size());
		int j = name.size();
		for (int i = 0; i < j; i++) {
			sleepApplication(2000);
			if (name.get(i).getText().equals(Configuration.PreName)) {
				sleepApplication(2000);
				Assert.assertTrue(!name.get(i).getText().equals(Configuration.PreName));
			} else {
				if (i == (j - 1)) {
					System.out.println("INFO: Name is deleted from the list");
				}
			}
		}

	}

	public static void isActivityNameDeleted() {
		List<WebElement> name = driver
				.findElements(By.xpath("//*[@id='main']/div/div[3]/div/div/form/table/tbody/tr/td[1]"));
		System.out.println(name.size());
		int j = name.size();
		for (int i = 0; i < j; i++) {

			if (name.get(i).getText().equals(Configuration.PreName)) {
				Assert.assertTrue(!name.get(i).getText().equals(Configuration.PreName));
			} else {
				if (i == (j - 1)) {
					System.out.println("INFO: Name is deleted from the list");
				}
			}
		}
	}

	public static void setDeletedTagAsTag() {
		String row1 = driver.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[2]/td[1]")).getText();

		driver.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[2]/td[6]")).click();
		sleepApplication(1000);
		driver.switchTo().alert().accept();
		sleepApplication(3000);
		driver.findElement(By.xpath("//*[@id='id_newName']")).sendKeys(row1);
		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

	public static void clickonMaginfingGlas() {
		List<WebElement> name = driver.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[4]/a"));
		System.out.println(name.size());
		int j = name.size();
		for (int i = 2; i < j; i++) {
			String count = driver.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[" + i + "]/td[4]/a"))
					.getText();

			String S[] = count.split("");
			System.out.println(S[1]);
			if (!count.equals("0")) {
				driver.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[" + i + "]/td[4]/a")).click();
				break;
			}
		}
	}

	public static void clickonMaginfingGlas1() {
		List<WebElement> name = driver.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[4]/a"));
		System.out.println(name.size());
		int j = name.size();
		for (int i = 2; i < j; i++) {
			String count = driver.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[" + i + "]/td[4]/a"))
					.getText();

			String S[] = count.split("");
			System.out.println(S[1]);
			if (count.equals("0")) {
				driver.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[" + i + "]/td[4]/a")).click();
				break;
			}
		}
	}

	public static void isSavedWithCurrentDate() {

		String data1 = driver.findElement(By.xpath("//*[@id='current-time']")).getText();

		String data2[] = data1.split(" ");

		List<WebElement> name = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));
		int j = name.size();
		for (int i = 1; i < j; i++) {
			String count = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + i + "]/td[1]"))
					.getText();

			if (count.contains(data2[0])) {
				Assert.assertTrue(count.contains(data2[0]));
				System.out.println("The recently saved configuration file with current date" + data2[0]
						+ " is added under the exported filename list");
				break;
			}
		}
	}

	public static void clickonDownloadIcon() {

		String data1 = driver.findElement(By.xpath("//*[@id='current-time']")).getText();

		String data2[] = data1.split(" ");

		List<WebElement> name = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));
		int j = name.size();
		for (int i = 1; i < j; i++) {
			String count = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + i + "]/td[1]"))
					.getText();

			if (count.contains(data2[0])) {
				Assert.assertTrue(count.contains(data2[0]));
				System.out.println("The recently saved configuration file with current date" + data2[0]
						+ " is added under the exported filename list");
				driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + i + "]/td[4]")).click();
				break;
			}
		}
	}

	public static void isFileDownloaded() {
		String data1 = driver.findElement(By.xpath("//*[@id='current-time']")).getText();
		String data2[] = data1.split(" ");
		String downloadPath = System.getProperty("user.dir") + "\\download\\";
		System.out.println(downloadPath);
		isFileDownloaded(downloadPath, data2[0]);
	}

	public static void isTagsAreInAccendingOrder() {
		sleepApplication(3000);
		List<WebElement> row = driver.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[1]"));
		String firstTag = row.get(1).getText();
		String lastTag = row.get((row.size()) - 1).getText();

		Assert.assertTrue(firstTag.compareTo(lastTag) < 0);

	}

	public static void isDisplayedWithThereSections() {
		for (int i = 1; i <= 3; i++) {
			sleepApplication(1000);
			String data = getText(findBy("(//*[@class='table-box']/h3)[" + i + "]"), "Section title");
			Assert.assertTrue(
					data.equals("Server Info") || data.equals("Active Machines") || data.equals("Inactive Machines"));
		}
	}

	public static void isServerInfoDisplayedWithRespectiveFields() {
		for (int i = 1; i <= 3; i++) {
			sleepApplication(1000);
			String data = getText(findBy("(//*[@class='bordered-table']/tbody/tr/th[1])[" + i + "]"), "Section title");
			Assert.assertTrue(
					data.equals("Federation Key") || data.equals("Product Key") || data.equals("6.4+ Environment"));
		}
	}

}
