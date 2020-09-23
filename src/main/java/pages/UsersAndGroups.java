package pages;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UsersAndGroups extends BasePage {

	public final static By byUserAndGroupsTab = findBy("//*[contains(@class,'users-and-groups')]");
	public final static By byAddUserText = findBy("//*[@id=\"id_newName\"]");
	public final static By byAddUserButton = findBy("//*[@class='button1']");
	public final static By byImportUserFromexcelFile = findBy("");
	public final static By byUserName = findBy("//*[@id=\"id_username\"]");
	public final static By byAddOveride = findBy("//*[@id=\"add\"]");
	public final static By byMessage = findBy("//*[@id='main']/div[1]");
	public final static By byPassword = findBy("//*[@id=\"id_password\"]");
	public final static By byConfirmPassword = findBy("//*[@id=\"id_confirmPw\"]");
	public final static By byPhoneNumber = findBy("//*[@id=\"id_phone\"]");
	public final static By byFullName = findBy("//*[@id=\"id_fullname\"]");
	public final static By byEmailAddresses = findBy("//*[@id=\"id_email\"]");
	public final static By bySessionTimeOut = findBy("//*[@id=\"id_timeout\"]");
	public final static By byActiveAccountCheckBox = findBy("//*[@id=\"id_active\"]");
	public final static By byLanguage = findBy("//*[@id=\"id_language\"]");
	public final static By byTimeZone = findBy("//*[@id=\"id_timezone\"]");
	public final static By byPrevButton = findBy("//*[@id='prev']");
	public final static By byNextButton = findBy("//*[@name='submit-next']");
	public final static By byCancelButton = findBy("//*[@id=\"cancel\"]");
	public final static By bySmtpServerStatus1 = findBy("//*[contains(text(),'SMTP Server is currently stopped.')]");
	public final static By byConfigureBasicOptionsVerify = findBy("/html/body/div/div/div[2]/div/div/div/div/ol/li[2]");
	public final static By byConfigureBasicOptionsUserName = findBy(
			"/html/body/div/div/div[2]/div/div/div/div/div/form/fieldset/dl[1]/dd");
	public final static By byGroupMembership = findBy("//input[starts-with(@id,'id_groups_')]");
	public final static By byPermissionsHRLegal = findBy(".//*[@id='HR/legal']/a/u");
	public final static By byPermissionsAdmin = findBy(".//*[@id='admin']/a/u");
	public final static By byPermissionsEndUser = findBy("//*[@id='end-user']/a/u");
	public final static By byUserPersonalInfoText = findBy("/html/body/div/div/div[2]/div/div/div/div/ol/li[1]");
	public final static By bySetGroupMembershipText = findBy("//li[contains(text(),'Set group membership')]");
	public final static By bySelectPermissionsText = findBy(".//*[@id='wizardsteps']/li[4]");
	public final static By bySetHomePageText = findBy("//div//li[contains(text(), 'Set homepage')]");
	public final static By byUserHomePage = findBy(
			"/html/body/div/div/div[2]/div/div/div/div/div/form/fieldset/dl[2]/dd/ul/li[1]/ul/li[2]/ul/li[1]/input");
	public final static By bySetGeneralSearchRuleText = findBy("//*[contains(text(),'Set general search rule')]");
	public final static By byDepartmentalSearchRule = findBy("//*[@id=\"id_rule\"]");
	public final static By bySearchResultLimit = findBy("//*[@id=\"id_maxResults\"]");
	public final static By bySetallowedsearchaddressesText = findBy(
			"//div//li[contains(text(), 'Set allowed search addresses')]");
	public final static By byImportUsersFromExcelFile = findBy("/html/body/div/div/div[2]/div/div/div[2]/div/div/p/a");
	public final static By byLocalUserAccounts = findBy("//*[@id=\"main\"]/div/div[2]/div/div/table/tbody/tr[1]/th[1]");
	public final static By byExampleUserImportFile = findBy(
			"//*[@id=\"main\"]/div/div/div/div/form/fieldset/dl[1]/dd/a");
	public final static By byExcelBasedUserCreationText = findBy("/html/body/div/div/div[2]/div/div/div/div/h1");
	public final static By byBrowse = findBy("//*[@id=\"id_excel\"]");
	public final static By byTotalUsers = findBy("//*[contains(text(),'The Excel parser found')]");
	public final static By byExistingUser = findBy(
			"/html/body/div/div/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li");
	public final static By byPasswordError = findBy(
			"//div//*[contains(text(),'Password and confirmation password did not match')]");
	public final static By byLookUpSearch = findBy("//*[contains(text(),'Look Up')]");
	public final static By byAddSelectionsButton = findBy("//input[@value='add selections']");
	public final static By byDeleteIconUnderExclusionOverides = findBy("//*[@class=\"row1 evenRow\"]/td[3]");
	public static String p;
	public static String list;
	public static String user;
	public static String user1;
	public static String excAddress;
	public static String excAddress1;
	public static String excAddress2;

	// ***********************User Info
	// Edit***************************************************************************
	public final static By byEdituserIcon = findBy("//table/tbody/tr[2]/td/a");
	public final static By bySaveButton = findBy("//*[@id='submit']");
	public final static By byPersonalInfo = findBy("//*[contains(text(),'personal info')]");
	public final static By byChangePassword = findBy("//*[@id=\"id_password\"]");
	public final static By byConfirmPasswrd = findBy("//*[@id=\"id_confirmPw\"]");
	public final static By byNewFetcherName = findBy("//input[@id='id_newName']");
	public final static By byAddFetcher = findBy("//input[@value='Add Fetcher']");
	public final static By byServerAddress = findBy("//input[@id='id_saddr']");
	public final static By byserverDescription = findBy("//input[@id='id_desc']");
	public final static By byUsername = findBy("//input[@id='id_uname']");
	public final static By bypasswrd = findBy("//input[@id='id_pword']");
	public final static By byCheckbox = findBy("//input[@type='checkbox']");
	public final static By byCreateFetcher = findBy("//input[@id='submit']");
	public final static By byServerUsername = findBy("//input[@id='id_uname']");
	public final static By bysuccessmsg = findBy("//*[@class='success']");
	public final static By bySMTPServer = findBy("//li//*[contains(text(),'SMTP Server')]");
	public final static By bySmtpServerStatus = findBy("//*[contains(text(),'SMTP Server is currently running')]");
	public final static By byStopServer = findBy("//*[@value='Stop Now']");
	public final static By byStartServer = findBy("//*[@value='Start Now']");
	public final static By byStopedServer = findBy("//*[contains(text(),'SMTP Server is currently stopped')]");
	public final static By byRunningServer = findBy("//*[contains(text(),'SMTP Server is currently running.')]");
	public final static By bySelectProtocol = findBy("//select[@id='id_proto']");
	public final static By byOutgoingSmtp = findBy("//a[contains(text(),'Outgoing SMTP')]");
	public final static By byPencileIcon = findBy("//*[@class='bordered-table']/tbody/tr[2]/td[3]/a");
	public final static By byCurrentClass = findBy("//*[@class='current']");
	public final static By byGroup = findBy("//*[@id='id_groups_0']");
	public final static By byPermissions = findBy("//*[@src='/media/webcore/imgs/treecheckbox/iconCheckAll.gif']");
	public final static By byAnyRadioButton = findBy("//*[@value='/search/saved/']");
	public final static By byUserSearchableDepartments = findBy("//*[@class=\"dashboard\"]/h3[1]");
	public final static By byUserSearchableAddresses = findBy("//*[@class=\"dashboard\"]/h3[2]");
	public final static By byAddDepartment = findBy("//*[@name=\"addDept\"]");
	public final static By byEnteredEmailAddress = findBy("//*[@name='newAddrs']");
	public final static By byNewDepartments = findBy(
			"//*[@id=\"main\"]/div/div/div/div/div/div[1]/table/tbody/tr[2]/td/em");
	public final static By byNewAddresses = findBy(
			"//*[@id=\"main\"]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td/em");
	public final static By byAddGroup = findBy("//*[@value='Add Group']");
	public final static By byGroupCreation = findBy("//*[@class='col-xs-12']/h1");
	public final static By byGroups = findBy("//*[@id=\"left-menu\"]/ul[1]/li[2]/a");
	public final static By byFetcherConfiguration = findBy("//*[@id=\"main\"]/div/div[1]/div/h1");
	public final static By byExclusionAddresses = findBy("//*[@id='id_emailaddrs']");
	public final static By bySearchTearms = findBy("//*[@id='searchterm']");

	// **********************************CLICKER************************************************************************
	// ****************************************************************************************************************
	public static void getCurrentClass(String gText) {
		sleepApplication(5000);
		String data = getText(byCurrentClass, "Current Class");
		sleepApplication(2000);
		Assert.assertTrue(gText.contains(data));
		System.out.println(gText + " is displayed under User Creation Wizard");

	}

	public static void clickAddGroup() {
		clickElement(byAddGroup, "Add Group");
	}

	public static void clickGroups() {
		clickElement(byGroups, "Groups Icon");
	}

	public static void clickOnSaveButton() {
		clickElement(bySaveButton, "Save button");
	}

	public static void clickOnAnyRadioButton() {
		clickElement(byAnyRadioButton, "Any Radio Button");
	}

	public static void clickOnGroup() {
		clickElement(byGroup, "Group");
	}

	public static void clickOnPreButton() {
		clickElement(byPrevButton, "Prev Button");
	}

	public static void clickOnOutgoingSmtp() {
		clickElement(byOutgoingSmtp, "Outgoing SMTP");
	}

	public static void clickOnPencileIcon(int data) {
		sleepApplication(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[2]"));
		for (int i = 0; i <= list.size(); i++) {
			System.out.println(list.get(i).getText());
			String p = list.get(i).getText();
			int K = Integer.parseInt(p);
			sleepApplication(1000);
			if (data == 1) {
				if (K != 0) {
					List<WebElement> list1 = driver
							.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[3]"));
					list1.get(i).click();

					System.out.println("INFO: clicking on pencile icon");
					break;
				}
			} else {
				sleepApplication(1000);
				if (K == 0) {
					List<WebElement> list1 = driver
							.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[3]"));
					list1.get(i).click();
					System.out.println("INFO: clicking on pencile icon");
					break;
				}
			}
		}
	}

	public static void clickOnStopServer() {
		clickElement(byStopServer, "Stop Server");
	}

	public static void clickOnStartServer() {
		clickElement1(byStartServer, "Start Server");
	}

	public static void clickOnSMTPServer() {
		clickElement(bySMTPServer, "SMTP Server");
	}

	public static void clickOnCreateFetcher() {
		clickElement(byCreateFetcher, "Create Fetcher");
	}

	public static void clickOnEditIcon() {
		clickElement(byEdituserIcon, "Edit icon");
	}

	public static void clickOnchekbox() {
		clickElement(byCheckbox, "checkbox");
	}

	public static void clickUsersAndGroups() {

		clickElement(byUserAndGroupsTab, "UserAndGroups");
		waitForPageLoad(30);
	}

	public static void clickOnAddFetcher() {
		clickElement(byAddFetcher, "Add Fetcher");
	}

	public static void clickImportUsersFromExcel() {

		clickElement(byImportUsersFromExcelFile, "Import Users from excel file");
		sleepApplication(3000);
		waitForPageLoad(30);
	}

	public static void clickExampleUserImportFile() {

		clickElement(byExampleUserImportFile, "users.xls");
		waitForPageLoad(30);
	}

	public static void clickHRLegalPermissions() {

		clickElement(byPermissionsHRLegal, "HR/Legal Permissions");
	}

	public static void clickAdminPermissions() {

		clickElement(byPermissionsAdmin, "Admin Permissions");
	}

	public static void clickEndUserPermissions() {

		clickElement(byPermissionsEndUser, "EndUser Permissions");
	}

	public static void clickUserHomePage() {

		clickElement(byUserHomePage, "User home Page");
	}

	public static void clickOntext(String data) {
		clickElement(findBy("//*[contains(text(),'" + data + "')]"), data);
		sleepApplication(5000);
	}
	// **********************************VALIDATION************************************************************************
	// ****************************************************************************************************************

	public static boolean isFetcherConfiguration() {
		return isElementPresent(byFetcherConfiguration, "Fetcher Configuration");
	}

	public static boolean isGroupCreation() {
		return isElementPresent(byGroupCreation, "Group Creation");
	}

	public static boolean isUserSearchableDepartments() {
		return isElementPresent(byUserSearchableDepartments, "User Searchable Departments");
	}

	public static boolean isUserSearchableAddresses() {
		return isElementPresent(byUserSearchableAddresses, "User Searchable Addresses");
	}

	public static boolean isAddDepartment() {
		return isElementPresent(byAddDepartment, "Add Department list");
	}

	public static boolean isEnteredEmailAddress() {
		return isElementPresent(byEnteredEmailAddress, "Entered Email Address");
	}

	public static boolean isServerStopedPresent() {
		return isElementPresent(byStopedServer, "Server is stop currently");
	}

	public static boolean isSavebuttonPresent() {
		return isElementPresent(bySaveButton, "Save Button");
	}

	public static boolean isPersonalInfoPresent() {
		return isElementPresent(byPersonalInfo, "Personal info");
	}

	public static boolean isSuccessmsgPresent() {
		return isElementPresent(bysuccessmsg, "Success msg");
	}

	public static boolean isSmtpServerStatus() {
		return isElementPresent(bySmtpServerStatus, "Smtp Server");
	}

	public static boolean isServerRunning() {
		return isElementPresent(byRunningServer, "Server is running");
	}

	public static boolean isSmtpServerStatus1() {
		return isElementPresent(bySmtpServerStatus1, "Smtp Server");
	}

	public static boolean isPrevButtonEnabled() {

		return isElementEnabled(byPrevButton, "Prev Button");
	}

	public static boolean isPrevButtonDisabled() {

		boolean V = isElementDisabled(byPrevButton, "Prev Button");
		return !V;
	}

	// **********************************SETTER************************************************************************
	// ****************************************************************************************************************
	public static void setServerUserName(String sText) {
		setText(byServerUsername, "user name", sText);
	}

	public static void setChangePassword(String pswd) {
		setText(byChangePassword, "password", pswd);
	}

	public static void setConfirmPassWord(String cnfrmPswd) {
		setText(byConfirmPassword, "confirm password", cnfrmPswd);
	}

	public static void setUsersFileUpload() {

		/*
		 * String Epath = EnvironmentUtils.getConfig().getProperty("users");
		 * String path = System.getProperty("user.dir") +
		 * "\\AddNewUser\\" + Epath + ".xls"; System.out.println(path);
		 * sleepApplication(3000); FileUpload(byBrowse, "Excel File", path);
		 */
		clickElement(byBrowse, "Excel File");

	}

	public static void setNewFetcherName(String fetchername) {
		setText(byNewFetcherName, "Fatcher Name", fetchername);
	}

	public static void setServerAddress(String address) {
		setText(byServerAddress, "Server addres", address);
	}

	public static void setServerDescription(String description) {
		setText(byserverDescription, "Server Description", description);
	}

	public static void setServerpassword(String pswd) {
		setText(bypasswrd, "Server password", pswd);
	}

	public static void setAddUserText(String sText) {

		setText(byAddUserText, "UserName", sText);
	}

	public static void selectProtocol(String sText) {
		setSelectBoxText(bySelectProtocol, sText, sText);
	}

	public static void SetGeneralSearchRule() {

		setSelectBoxText(byDepartmentalSearchRule, "Departmental Search Rule", "User can search on user addresses within the Department(s) they belong to");
	}

	public static void getTotalUsers() {
		sleepApplication(3000);
		getText(byTotalUsers, "Total Users");
	}

	public static void setLanguage() {

		setSelectBoxText(byLanguage, "Language", "English");

		clickElementFromList(byLanguage, "Language", 0);
	}

	public static void setDepartmentalSearchRule() {

		WebElement selectElement = driver.findElement(By.xpath("//*[@id='id_rule']"));
		Select select = new Select(selectElement);
		select.selectByIndex(1);
	}

	public static void setDepartmentalSearchRules() {

		setSelectBoxText(byDepartmentalSearchRule, "Departmental Search Rule", "No default search addresses");

		clickElementFromList(byDepartmentalSearchRule, "Departmental SearchRule", 0);
	}

	public static void setDepartmentalSearchRule1() {

		setSelectBoxText(byDepartmentalSearchRule, "Departmental Search Rule",
				"User can search on user addresses within the Department(s) he belongs to");

		clickElementFromList(byDepartmentalSearchRule, "Departmental SearchRule", 2);
	}

	public static void setDepartmentalSearchRul() {

		setSelectBoxText(byDepartmentalSearchRule, "Departmental Search Rule", "User can search on all addresses");

		// clickElementFromList(byDepartmentalSearchRule, "Departmental
		// SearchRule", 3);
	}

	public static void setExclisionAddresses(String sText) {

		clearText(byExclusionAddresses, "");
		setText(byExclusionAddresses, "Exclusion Addresses", sText);
	}

	public static void getPermissions() {

		// WebElement table =
		// driver.findElement(By.xpath("//*[@src='/media/webcore/imgs/treecheckbox/iconCheckAll.gif']"));
		List<WebElement> mg = findElements(By.xpath("//*[@src='/media/webcore/imgs/treecheckbox/iconCheckAll.gif']"),
				"Permissions");

		if (mg.size() == 14) {
			System.out.println("HR/legal related permissions is enabled for the new user with checked symbol");
		}
		if (mg.size() == 24) {
			System.out.println("admin related permissions is enabled for the new user with checked symbol");
		}
		if (mg.size() == 4) {
			System.out.println("end-user related permissions is enabled for the new user with checked symbol");
		}

	}

	public static void clearSearchResultLimitValue() {

		clearText(bySearchResultLimit, "Search Result Limit Value");
	}

	public static void clickTimeZone() {

		clickElementFromList(byTimeZone, "TimeZone", 0);
	}

	public static void clickDepartmentalSearchRule() {

		clickElementFromList(byDepartmentalSearchRule, "Departmental Search Rule", 1);
	}

	public static void isActiveAccountEnabled() {

		isElementEnabled(byActiveAccountCheckBox, "ActiveAccount");
		waitForPageLoad(30);
	}

	public static void clickAddUserButton() {

		clickElement(byAddUserButton, "Add User");
		waitForPageLoad(30);
	}

	public static void clickGroupsTab() {

		driver.findElement(By.xpath("//*[@id=\"left-menu\"]/ul[1]/li[2]/a")).click();
	}

	public static void clickFinish() {

		clickElement(byNextButton, "Finish");
		waitForPageLoad(30);
	}

	public static void clickNextButton() {

		clickElement(byNextButton, "Next Button");
		waitForPageLoad(30);
		//System.out.println("....." + driver.getCurrentUrl());
	}

	public static void clickGroupMembership() {

		List<WebElement> totalgroupmembers = findElements(byGroupMembership, "Group Membership");
		System.out.println("INFO: Total groups avaialable is " + totalgroupmembers.size());
		clickElement(byGroupMembership, "Group Membership");

	}

	public static boolean isUserPersonalInfoText() {
		return isElementPresent(byUserPersonalInfoText, "User Personal Information");
	}

	public static boolean isExcelBaserdUserCreation() {
		return isElementPresent(byExcelBasedUserCreationText, "Excel-Based User Creation Wizard ");
	}

	public static boolean isSetGeneralSearchRuleText() {
		return isElementPresent(bySetGeneralSearchRuleText, "Set General Search Rule");
	}

	public static boolean isSetGroupMembershipText() {
		return isElementPresent(bySetGroupMembershipText, "Set Group Membership");
	}

	public static boolean isSelectPermissionsText() {

		return isElementPresent(bySelectPermissionsText, "Select Permissions");
	}

	public static boolean isSetHomepagedetails() {

		return isElementPresent(bySetHomePageText, "Set Home Page");
	}

	public static boolean isSetallowedsearchaddressesText() {

		return isElementPresent(bySetallowedsearchaddressesText, "Set allowed search addresses");
	}

	public static boolean isConfigureOptionsVerifiedPresent() {
		return isElementPresent(byConfigureBasicOptionsVerify, "Configure basic options");
	}

	public static String getUserName() {

		return getText(byUserName, "UserName");

	}

	public static String getMessage() {

		return getText(byExistingUser, "User already exists");

	}

	public static void setPassword(String sText) {

		setText(byPassword, "Password", sText);
	}

	public static void setClipboardData(String string) {

		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

	public static void setSearchResultLimit(String sText) {

		setText(bySearchResultLimit, "Search Result Limit", sText);
	}

	public static void setSessionTimeOut(String sText) throws InterruptedException {
		Thread.sleep(5000);
		clearText(bySessionTimeOut, "Session Timeout");
		Thread.sleep(5000);

		setText(bySessionTimeOut, "SessionTimeOut", sText);
	}

	public static void getUserFromTable() {

		WebElement table_element = driver.findElement(By.xpath("//*[@class='bordered-table']"));
		List<WebElement> tr_collection = table_element.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr"));

		System.out.println("INFO: NUMBER OF ROWS IN THIS TABLE = " + tr_collection.size());

	}

	public static void setConfirmPassword(String sText) {

		setText(byConfirmPassword, "ConfirmPassword", sText);
	}

	public static void setFullName(String sText) {

		setText(byFullName, "FullName", sText);
	}

	public static void setPhoneNumber(String sText) {

		setText(byPhoneNumber, "PhoneNumber", sText);
	}

	public static void setEmailAddresses(String sText) {

		setText(byEmailAddresses, "EmailAddresses", sText);
	}

	public static void clickOnElement(String ele) {
		clickElement(findBy("//*[contains(text(),'" + ele + "')]"), ele);
	}

	public static void setTexteOnElement(String ele, String sText) {

		setText(findBy("//*[contains(text(),'" + ele + "')]"), "EmailAddresses", sText);
	}

	public static void setExistingUserName() throws InterruptedException {

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

	public static void getFieldIsRequired() {

		WebElement table = driver.findElement(By.xpath("//*[@class='nomargin']"));

		List<WebElement> row1 = table.findElements(By.xpath("//*[@class='nomargin']//*[@class='errorlist']"));

		System.out.println("The message displayed: ");
		System.out.println("---------------------");

		for (int i = 1; i < row1.size(); i++) {

			List<WebElement> dt = table
					.findElements(By.xpath("//*[@class='nomargin']//*[@class='errorlist']/dt['" + i + "']"));
			String s = dt.get(i).getText();

			List<WebElement> dd = table
					.findElements(By.xpath("//*[@class='nomargin']//*[@class='errorlist']/dd/ul['" + i + "']"));
			String s1 = dd.get(i).getText();

			System.out.println(s + ": -->" + s1);
		}
		System.out.println("");
	}

	public static void getRunTestResult() {
		sleepApplication(10000);
		for (int i = 1; i <= 6; i++) {

			String s = driver.findElement(By.xpath("//*[@id='" + i + "']/dd/a")).getText();
			if (s.equals("pass")) {
				Assert.assertEquals(s, "pass");
				if (i == 6) {
					System.out.println("INFO: The final status is " + s);
				}
			} else {
				System.out.println("INFO: The final status is " + s);

			}
		}

	}

	public static void getRunTestResult1() {
		sleepApplication(10000);

		List<WebElement> list = driver.findElements(By.xpath("//*[@id='teststructholder']/fieldset/dl"));
		for (int i = 1; i < list.size(); i++) {

			String s = driver.findElement(By.xpath("//*[@id='" + i + "']/dd/a")).getText();
			if (s.equals("pass")) {
				Assert.assertEquals(s, "pass");
				if (i == 6) {
					System.out.println("INFO: The final status is " + s);
				}
			} else {
				System.out.println("INFO: The final status is " + s);
			}
		}

	}

	public static void getErrorMessagePassword() {

		getText(byPasswordError, "Password Error");
	}

	public static void getNewDepartments() {

		getText(byNewDepartments, "Message Under New Departments is ");
	}

	public static void getNewAddresses() {

		getText(byNewAddresses, "Message Under New Addresses is ");
	}

	public static void clickOnLookUpLink() {

		clickElement(byLookUpSearch, "LookUp Search");
	}

	public static void getLookUpNewWindow() throws InterruptedException {

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
	}

	public static void setSearchTerms(String sText) throws InterruptedException {
		clearText(bySearchTearms, "Search Terms");
		setText(bySearchTearms, "Search Tearms", sText);
		Thread.sleep(3000);
	}

	public static void selectOneInSelectableList() {

		WebElement list = driver.findElement(By.xpath("//*[@id=\"selectedEmails\"]"));

		Select s = new Select(list);
		p = driver.findElement(By.xpath("//*[@id=\"selectedEmails\"]/option[1]")).getText();
		s.selectByIndex(0);
		System.out.println("INFO: First one is Selected in the list");

	}

	public static void selectMultipleInSelectableList() {

		WebElement list = driver.findElement(By.xpath("//*[@id=\"selectedEmails\"]"));

		Select s = new Select(list);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		System.out.println("INFO: Multiple are Selected in the list");

	}

	public static void getSelectedAddresses() throws InterruptedException {

		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//*[contains(@id,'emailaddrs')]")).getAttribute("value");
		System.out.println("INFO: Selected Addresses is " + text);

		driver.findElement(By.name("ok")).click();

		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();

		Iterator<String> I1 = s1.iterator();
		while (I1.hasNext()) {

			String child_window = I1.next();
			if (!parent.equals(child_window)) {

				driver.switchTo().window(child_window);

				String tt = driver.findElement(By.xpath("//*[contains(@id,'addrs')]")).getAttribute("value");

				System.out.println("INFO: The selected " + tt + " is successfully added in Exclusion Addresses box");
			}

		}

	}

	public static void clickOnAddSelectionsButton() {

		clickElement(byAddSelectionsButton, "Add Selections Button");
	}

	public static void getExclusionOverrides() {

		String ea = driver.findElement(By.xpath("//*[@class='row1 evenRow']/td[1]")).getText();

		System.out.println("INFO: Added email address are shown into Exclusion Addresses is : " + ea);

		clearText(byExclusionAddresses, " ");

		setText(byExclusionAddresses, "Exclusion Addresses", ea);
	}

	public static void getExclusionOverridesDetails() {

		WebElement ea = driver.findElement(By.xpath("//*[@id='id_emailAddr']"));

		Select s = new Select(ea);
		s.selectByIndex(0);
		String s1[] = s.getFirstSelectedOption().getText().split("@", 8);
		s.selectByIndex(1);
		String s2[] = s.getFirstSelectedOption().getText().split("@", 8);
		s.selectByIndex(2);
		String s3[] = s.getFirstSelectedOption().getText().split("@", 8);

		Assert.assertTrue(excAddress.equals(s1[0]));
		System.out.println("INFO: Email address " + s1[0] + "@gmail.com is added successfully");
		Assert.assertTrue(excAddress1.equals(s2[0]));
		System.out.println("INFO: Email address " + s2[0] + "@gmail.com is added successfully");
		Assert.assertTrue(excAddress2.equals(s3[0]));
		System.out.println("INFO: Email address " + s3[0] + "@gmail.com is added successfully");
	}

	public static void setExclusionOverrides() {

		String ea = driver.findElement(By.xpath("//*[@class='row1 evenRow']/td[1]")).getText();

		setText(byExclusionAddresses, "Exclusion Addresses", ea);
	}

	public static void selectEmailAddressesFromDropdown() {

		WebElement table = driver.findElement(By.xpath("//*[@id='id_emailAddr']"));

		Select s = new Select(table);
		s.selectByIndex(0);
		System.out.println("INFO: Selected email addresses from the drop down");
	}

	public static void selectUserNameFromDropdown() {

		WebElement list = driver.findElement(By.xpath("//*[@id=\"id_user\"]"));

		Select s = new Select(list);
		s.selectByIndex(0);
		System.out.println("INFO: Selected user name from the drop down");
	}

	public static void clickOnAddOverideButton() {

		clickElement(byAddOveride, "Add Overide");
	}

	public static void clickOnDeleteUnderExclusionOverrides() {

		clickElement(byDeleteIconUnderExclusionOverides, "Delete Icon Under Exclusion Overides");
		System.out.println("INFO: Email address is deleted successfully");
	}

	public static void clickOnUpTestLevel() {

		driver.findElement(By.xpath("//*[@id='main']/div/div/p[2]/a[1]")).click();

	}

	public static void setExclusionAddresses(String sText) throws InterruptedException {
		excAddress = getRandomStringsmallchr(9);
		excAddress1 = getRandomStringsmallchr(9);
		excAddress2 = getRandomStringsmallchr(9);
		clearText(byExclusionAddresses, " ");
		Thread.sleep(2000);
		setText(byExclusionAddresses, "Exclusion Addresses",
				excAddress + "" + sText + ";" + excAddress1 + "" + sText + ";" + excAddress2 + "" + sText + ";");
		Thread.sleep(2000);
	}

	public static void isMessageDisplayed() {
		isElementPresent(byMessage, "Message The group intradyn was edited successfully");

	}

	public static void getMemberName() {
		user = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[2]/td[1]")).getText();
		user1 = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[3]/td[1]")).getText();
	}

	public static void clickOnMembersLink() {

		driver.findElement(By.xpath("//*[@class='col-xs-12']/a[2]/u")).click();
		System.out.println("Members link is clicked");
	}

	public static void setMemberName() {

		driver.findElement(By.xpath("//*[@id='newMembers']")).sendKeys(user);
		System.out.println("member name " + user + "is given in text field");
	}

	public static void setMultipleMemberName() {

		driver.findElement(By.xpath("//*[@id='newMembers']")).sendKeys(user + ";" + user1);
		System.out.println("member name " + user + "is given in text field");
	}

	public static void isMemberAdded() {
		List<WebElement> member = driver.findElements(By.xpath("//*[@name='currentMembers']/option"));

		for (int i = 0; i <= member.size(); i++) {
			if (member.get(i).getText().equals(user)) {
				System.out.println("member name " + user + "is added as member");
				break;
			}
		}

	}

	public static void selectAnyMemberName() {
		sleepApplication(3000);
		List<WebElement> member = driver.findElements(By.xpath("//*[@name='currentMembers']/option"));
		sleepApplication(2000);
		member.get(0).click();
		System.out.println("member name " + member.get(0).getText() + "is selected from members");

	}

	public static void clickOnCrossIcon() {
		sleepApplication(2000);
		list = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[2]/td[1]")).getText();

		driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[2]/td[4]")).click();
		driver.switchTo().alert().accept();
	}

	public static void isGroupDeleted() {

		List<WebElement> groups = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));
		for (int i = 0; i < groups.size(); i++) {
			Assert.assertTrue(!groups.get(i).getText().equals(list));
			if (i == groups.size()) {

				System.out.println(" The Group name is removed from the list");
			}
		}

	}

	public static void setGroupName() {

		driver.findElement(By.xpath("//*[@id='id_newName']")).sendKeys(list);
		System.out.println("Group name " + list + "is given in text field");
	}

	public static void isGoodUsersFoundNone() {

		boolean value = driver.findElement(By.xpath("//*[contains(text(),'none')]")).isDisplayed();
		Assert.assertTrue(value);
		System.out.println("Good users Found: none");
	}

	public static void isNextButtonDisabled() {

		boolean value = driver.findElement(By.xpath("//*[contains(@value,'next')]")).isEnabled();
		Assert.assertTrue(!value);
		System.out.println("next button is disable");
		driver.findElement(By.xpath("//*[@id='left-menu']/ul[1]/li[1]/a")).click();
		sleepApplication(3000);
		List<WebElement> groups = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));
		for (int i = 0; i < groups.size(); i++) {
			System.out.println(groups.get(i).getText());
			if (groups.get(i).getText().equals("zz1") || groups.get(i).getText().equals("zz2")) {
				int j = i + 2;
				System.out.println(j);
				driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + j + "]/td[7]")).click();
				sleepApplication(2000);
				driver.switchTo().alert().accept();
				driver.navigate().refresh();
				sleepApplication(2000);
				driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + j + "]/td[7]")).click();
				sleepApplication(2000);
				driver.switchTo().alert().accept();

				break;
			}

		}
	}

	public static void isData() {
		sleepApplication(3000);
		List<WebElement> groups = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));
		sleepApplication(3000);
		for (int i = 0; i < groups.size(); i++) {

			if (groups.get(i).getText().equals("zz1") || groups.get(i).getText().equals("zz2")) {
				int j = i + 2;
				System.out.println(j);
				driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + j + "]/td[7]")).click();
				sleepApplication(2000);
				driver.switchTo().alert().accept();
				driver.navigate().refresh();
				sleepApplication(2000);
				driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + j + "]/td[7]")).click();

				driver.switchTo().alert().accept();
				sleepApplication(1000);

				break;
			}

		}

	}

}