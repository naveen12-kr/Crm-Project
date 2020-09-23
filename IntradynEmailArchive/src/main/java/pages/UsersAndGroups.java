package pages;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UsersAndGroups extends BasePage {
	
	public final static By byUserAndGroupsTab = findBy("//*[contains(@class,'users-and-groups')]");
	public final static By byAddUserText = findBy("//*[@id=\"id_newName\"]");
	public final static By byAddUserButton = findBy("//*[@class='button1']");
	public final static By byImportUserFromexcelFile = findBy("");
	public final static By byUserName = findBy("//*[@id=\"id_username\"]");
	public final static By byPassword = findBy("//*[@id=\"id_password\"]");
	public final static By byConfirmPassword = findBy("//*[@id=\"id_confirmPw\"]");
	public final static By byPhoneNumber = findBy("//*[@id=\"id_phone\"]");
	public final static By byFullName = findBy("//*[@id=\"id_fullname\"]");
	public final static By byEmailAddresses = findBy("//*[@id=\"id_email\"]");
	public final static By bySessionTimeOut = findBy("//*[@id=\"id_timeout\"]");
	public final static By byActiveAccountCheckBox = findBy("//*[@id=\"id_active\"]");
	public final static By byLanguage = findBy("//*[@id=\"id_language\"]");
	public final static By byTimeZone = findBy("//*[@id=\"id_timezone\"]");
	public final static By byPrevButton = findBy("//*[@id=\"prev\"]");
	public final static By byNextButton = findBy("//*[@id=\"next\"]");
	public final static By byCancelButton = findBy("//*[@id=\"cancel\"]");
	public final static By bySmtpServerStatus1=findBy("//*[contains(text(),'SMTP Server is currently stopped.')]");
	public final static By byConfigureBasicOptionsVerify = findBy("/html/body/div/div/div[2]/div/div/div/div/ol/li[2]");
	public final static By byConfigureBasicOptionsUserName = findBy("/html/body/div/div/div[2]/div/div/div/div/div/form/fieldset/dl[1]/dd");
	public final static By byGroupMembership = findBy("//input[starts-with(@id,'id_groups_')]");
	public final static By byPermissionsHRLegal = findBy(".//*[@id='HR/legal']/a/u");
	public final static By byPermissionsAdmin = findBy(".//*[@id='admin']/a/u");
	public final static By byPermissionsEndUser = findBy("//*[@id='end-user']/a/u");
	public final static By byUserPersonalInfoText = findBy("/html/body/div/div/div[2]/div/div/div/div/ol/li[1]");
	public final static By bySetGroupMembershipText = findBy("//li[contains(text(),'Set group membership')]");
	public final static By bySelectPermissionsText = findBy(".//*[@id='wizardsteps']/li[4]");
	public final static By bySetHomePageText = findBy("//div//li[contains(text(), 'Set homepage')]");
	public final static By byUserHomePage = findBy("/html/body/div/div/div[2]/div/div/div/div/div/form/fieldset/dl[2]/dd/ul/li[1]/ul/li[2]/ul/li[1]/input");
	public final static By bySetGeneralSearchRuleText = findBy("//*[contains(text(),'Set general search rule')]");
	public final static By byDepartmentalSearchRule = findBy("//*[@id=\"id_rule\"]");
	public final static By bySearchResultLimit = findBy("//*[@id=\"id_maxResults\"]");
	public final static By bySetallowedsearchaddressesText = findBy("//div//li[contains(text(), 'Set allowed search addresses')]");
	public final static By byImportUsersFromExcelFile = findBy("/html/body/div/div/div[2]/div/div/div[2]/div/div/p/a");
	public final static By byLocalUserAccounts = findBy("//*[@id=\"main\"]/div/div[2]/div/div/table/tbody/tr[1]/th[1]");
	public final static By byExampleUserImportFile = findBy("//*[@id=\"main\"]/div/div/div/div/form/fieldset/dl[1]/dd/a");
	public final static By byExcelBasedUserCreationText = findBy("/html/body/div/div/div[2]/div/div/div/div/h1");
	public final static By byBrowse = findBy("//*[@id=\"id_excel\"]");
	public final static By byTotalUsers = findBy("/html/body/div/div/div[2]/div/div/div/div/div/form/fieldset/dl/dd/span");
	public final static By byExistingUser = findBy("/html/body/div/div/div[2]/div/div/div[2]/div/div/div[2]/form/ul/li");
	public final static By byPasswordError = findBy("//*[@id=\"main\"]/div[1]/ul/li");
	
	//***********************User Info Edit***************************************************************************
	public final static By byEdituserIcon=findBy("//table/tbody/tr[2]/td/a");
	public final static By bySaveButton=findBy("//*[@id='submit']");
	public final static By byPersonalInfo=findBy("//*[contains(text(),'personal info')]");
	public final static By byChangePassword=findBy("//*[@id=\"id_password\"]");
	public final static By byConfirmPasswrd=findBy("//*[@id=\"id_confirmPw\"]");
	public final static By byNewFetcherName=findBy("//input[@id='id_newName']"); 
	public final static By byAddFetcher=findBy("//input[@value='Add Fetcher']");
	public final static By byServerAddress=findBy("//input[@id='id_saddr']");
	public final static By byserverDescription=findBy("//input[@id='id_desc']");
	public final static By byUsername=findBy("//input[@id='id_uname']");
	public final static By bypasswrd=findBy("//input[@id='id_pword']");
	public final static By byCheckbox=findBy("//input[@type='checkbox']");
	public final static By byCreateFetcher=findBy("//input[@id='submit']");
	public final static By byServerUsername=findBy("//input[@id='id_uname']");
	public final static By bysuccessmsg=findBy("//*[@class='success']");
	public final static By bySMTPServer=findBy("//li//*[contains(text(),'SMTP Server')]"); 
	public final static By bySmtpServerStatus=findBy("//*[contains(text(),'SMTP Server is currently running')]");
	public final static By byStopServer=findBy("//*[@value='Stop Now']");
	public final static By byStartServer=findBy("//*[@value='Start Now']");
	public final static By byStopedServer=findBy("//*[contains(text(),'SMTP Server is currently stopped')]");
	public final static By byRunningServer=findBy("//*[contains(text(),'SMTP Server is currently running.')]");
	public final static By bySelectProtocol=findBy("//select[@id='id_proto']");
	public final static By byOutgoingSmtp=findBy("//a[contains(text(),'Outgoing SMTP')]");
	
	//**********************************CLICKER************************************************************************
	//****************************************************************************************************************
	public static void clickOnSaveButton() {
		clickElement(bySaveButton, "Save button");
	}
	public static void clickOnOutgoingSmtp() {
		clickElement(byOutgoingSmtp,"Outgoing SMTP");
	}
	public static void clickOnStopServer() {
		clickElement(byStopServer,"Stop Server");
	}
	public static void clickOnStartServer() {
		clickElement1(byStartServer,"Start Server");
	}
	public static void clickOnSMTPServer(){
		clickElement(bySMTPServer, "SMTP Server");
	}
	public static void clickOnCreateFetcher() {
		clickElement(byCreateFetcher,"Create Fetcher");
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
		clickElement(findBy("//*[contains(text(),'"+data+"')]"),data);
		sleepApplication(5000);
	}
	//**********************************VALIDATION************************************************************************
	//****************************************************************************************************************
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
		return isElementPresent(bysuccessmsg,"Success msg");
	}
	public static boolean isSmtpServerStatus() {
		return isElementPresent(bySmtpServerStatus, "Smtp Server");
	}
	public static boolean isServerRunning() {
		return isElementPresent(byRunningServer,"Server is running");
	}
	public static boolean isSmtpServerStatus1() {
		return isElementPresent(bySmtpServerStatus1, "Smtp Server");
	}
	
	public static boolean isPrevButtonEnabled() {
		
		return isElementEnabled(byPrevButton, "Prev Button");
	}
	
	//**********************************SETTER************************************************************************
	//****************************************************************************************************************
	public static void setServerUserName(String sText) {
		setText(byServerUsername,"user name", sText);
	}
	public static void setChangePassword(String pswd) {
		setText(byChangePassword, "password", pswd);
	}
	public static void setConfirmPassWord(String cnfrmPswd) {
		setText(byConfirmPassword, "confirm password", cnfrmPswd);
	}
	public static void setUsersFileUpload() {
		
		String Epath = EnvironmentUtils.getConfig().getProperty("users");
		String path=System.getProperty("user.dir")+"\\AddNewUser\\"+Epath+".xls";
		FileUpload(byBrowse, "Excel File", path);
		
	}	
	public static void setNewFetcherName(String fetchername) {
		setText(byNewFetcherName,fetchername, fetchername);
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
		setSelectBoxText(bySelectProtocol,sText, sText);
	}
	public static void SetGeneralSearchRule() {
		
		setSelectBoxText(byDepartmentalSearchRule, "Departmental Search Rule", "User can search on all addresses");
	}
	
	public static void getTotalUsers() {
		
		getText(byTotalUsers, " ");
	}
	
	public static void setLanguage() {
		
		setSelectBoxText(byLanguage, "Language", "French");

		clickElementFromList(byLanguage, "Language", 0);
	}		
		
	public static void clearSearchResultLimitValue() {
		
		clearText(bySearchResultLimit, "Search Result Limit Value");
	}

	public static void clickTimeZone() {

		clickElementFromList(byTimeZone, "TimeZone", 0);
	}
	
	public static void clickDepartmentalSearchRule() {

		clickElementFromList(byDepartmentalSearchRule, "Departmental Search Rule", 3);
	}
	
	public static void isActiveAccountEnabled() {

		isElementEnabled(byActiveAccountCheckBox, "ActiveAccount");
		waitForPageLoad(30);
	}

	public static void clickAddUserButton() {

		clickElement(byAddUserButton, "Add User");
		waitForPageLoad(30);
	}
	
	public static void clickFinish() {

		clickElement(byNextButton, "Finish");
		waitForPageLoad(30);
	}
	
	public static void clickNextButton() {

		clickElement(byNextButton, "Personal Info");
		waitForPageLoad(30);
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
		
	
		clearText(bySessionTimeOut, "Session Timeout" );
		Thread.sleep(2000);
		
		setText(bySessionTimeOut, "SessionTimeOut", sText);
	}
	
	public static void getUserFromTable() {
		
		WebElement table_element = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/table"));
		List<WebElement> tr_collection=table_element.findElements(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[2]/div/div/table/tbody/tr"));

		        System.out.println("INFO: NUMBER OF ROWS IN THIS TABLE = "+tr_collection.size());
		       
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
  		
		while(itr.hasNext())
		{
			WebElement dataBox = itr.next();
			String data = dataBox.getText();
			
			System.out.println("Existing UserName: "+data);
			
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
	
	public static void getErrorMessagePassword() {
		
		getText(byPasswordError, "Password Error");
	}

}