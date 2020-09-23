package pages;

import org.openqa.selenium.By;

public class Navigation extends BasePage {
	
    public final static By byContacts = findBy("//div//h3//*[contains(text(), 'Contacts')]");
    public final static By byGroupsHeader = findBy("//*[@id='main']/div/div[1]/div/h1");
    public final static By byBackUpTab = findBy("/html/body/div/header/div/div[2]/ul/li[4]/a");
    		
	
	//*********************  Clicker *********************************************
	public static void clickOnEmailViewingLPanel(String data) {
		clickElement(findBy("//li//*[contains(text(),'"+data+"')]"), data);
		sleepApplication(3000);
	}
	
	
	public static void clickOnUserandGroupsLPanel(String usersAndGroups) {
		clickElement(findBy("//li//*[contains(text(),'"+usersAndGroups+"')]"), usersAndGroups);
		sleepApplication(3000);
	}
	
	public static void clickOnStatusLPanel(String status) {
		clickElement(findBy("//li//*[contains(text(),'"+status+"')]"), status);
		sleepApplication(3000);
	}
	
	public static void clickOnBackupLPanel(String backup) {
		clickElement(findBy("//li//a[contains(text(),'"+backup+"')]"), backup);
		sleepApplication(3000);
	}
	
	public static void clickOnBackUpTab() {
		
		clickElement(byBackUpTab, "Backup");		
		
	}
	public static void clickOnMaintenanceLPanel(String maintenance) {
		clickElement(findBy("//li//*[contains(text(),'"+maintenance+"')]"), maintenance);
		sleepApplication(3000);
	}
	public static void clickOnConfigurationLPanel(String configuration) {
		clickElement(findBy("//li//*[contains(text(),'"+configuration+"')]"), configuration);
		sleepApplication(3000);
	}
	
	
	//****************** Validation  ************************************************
	public static void getEmailViewingH3(String data) {
		
		isElementPresent(findBy("//div//h3[contains(text(), '"+data+"')]"), data);
		sleepApplication(3000);
	}
	
	public static void getBackupH3(String backup) {
		
		isElementPresent(findBy("//div//h3[contains(text(), '"+backup+"')]"), backup);
		sleepApplication(3000);
	}

	public static void getMaintenanceH3(String maintenance) {
		
		isElementPresent(findBy("//div//h3[contains(text(), '"+maintenance+"')]"), maintenance);
		sleepApplication(3000);
	}
	
	public static void getConfigurationH3(String configuration) {
		
		isElementPresent(findBy("//div//h3[contains(text(), '"+configuration+"')]"), configuration);
		sleepApplication(3000);
	}
	
	public static void getUsersandGroupsH3(String usersAndGroups) {
		
		isElementPresent(findBy("//div//h3[contains(text(), '"+usersAndGroups+"')]"), usersAndGroups);
		sleepApplication(3000);
	}
	
    public static void getStatusH3(String status) {
		
		isElementPresent(findBy("//div//h3[contains(text(), '"+status+"')]"), status);
		sleepApplication(3000);
	}
	public static void getContactsHeader() {
		
		isElementPresent(byContacts, "Contacts");
	}
	
   public static void getGroupsHeader() {
		
		isElementPresent(byGroupsHeader, "Groups");
	} 
	
	public static void getEmailViewingHeaderH1(String data) {
		
		isElementPresent(findBy("//div//h1[contains(text(), '"+data+"')]"), data);
		sleepApplication(2000);
	}
	
	public static void getUsersandGroupsH1(String usersAndGroups) {
		
		isElementPresent(findBy("//div//h1[contains(text(), '"+usersAndGroups+"')]"), usersAndGroups);
		sleepApplication(2000);
	}	
	
		public static void getStatusH1(String status) {
		
		isElementPresent(findBy("//div//h1[contains(text(), '"+status+"')]"), status);
		sleepApplication(2000);
	}	

	public static void getBackupH1(String backup) {
	
		isElementPresent(findBy("//div//h1[contains(text(), '"+backup+"')]"), backup);
		sleepApplication(2000);
	}
	
	public static void getMaintenanceH1(String maintenance) {
		
	isElementPresent(findBy("//div//h1[contains(text(), '"+maintenance+"')]"), maintenance);
	sleepApplication(2000);
	}

	public static void getConfigurationH1(String configuration) {
	
	isElementPresent(findBy("//div//h1[contains(text(), '"+configuration+"')]"), configuration);
	sleepApplication(2000);
	}
	
}

