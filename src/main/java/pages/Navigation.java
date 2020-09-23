package pages;

import org.openqa.selenium.By;

public class Navigation extends BasePage {

	public final static By byContacts = findBy("//div//h3//*[contains(text(), 'Contacts')]");
	public final static By byGroupsHeader = findBy("//*[@id='main']/div/div[1]/div/h1");
	public final static By byBackUpTab = findBy("/html/body/div/header/div/div[2]/ul/li[4]/a");

	// ********************* Clicker
	// *********************************************
	public static void clickOnEmailViewingLPanel(String data) {
		clickElement(findBy("//li//*[contains(text(),'" + data + "')]"), data);
		sleepApplication(3000);
	}

	public static void clickOnUserandGroupsLPanel(String usersAndGroups) {
		clickElement(findBy("//li//*[contains(text(),'" + usersAndGroups + "')]"), usersAndGroups);
		sleepApplication(3000);
	}

	public static void clickOnStatusLPanel(String status) {
		clickElement(findBy("//li//*[contains(text(),'" + status + "')]"), status);
		sleepApplication(3000);
	}

	public static void clickOnBackupLPanel(String backup) {
		clickElement(findBy("//li//a[contains(text(),'" + backup + "')]"), backup);
		//driver.findElement(By.xpath("//ul[2]//li[4]//a[1]")).click();
		sleepApplication(3000);
		
	}

	public static void clickOnBackUpTab() {

		clickElement(byBackUpTab, "Backup");

	}

	public static void clickOnMaintenanceLPanel(String maintenance) {
		clickElement(findBy("//li//*[contains(text(),'" + maintenance + "')]"), maintenance);
		sleepApplication(3000);
	}

	public static void clickOnConfigurationLPanel(String configuration) {
		clickElement(findBy("//li//*[contains(text(),'" + configuration + "')]"), configuration);
		sleepApplication(3000);
	}

	// ****************** Validation
	// ************************************************
	public static boolean isH3Present(String data) {

		boolean V = isElementPresent(findBy("//div//h3[contains(text(), '" + data + "')]"), data);
		sleepApplication(3000);
		return V;
	}

	public static boolean isContactsHeader() {

		return isElementPresent(byContacts, "Contacts");
	}

	public static boolean isGroupsHeader() {

		return isElementPresent(byGroupsHeader, "Groups");
	}

	public static boolean isHeaderH1Present(String data) {

		sleepApplication(3000);
		boolean V = isElementPresent(findBy("//div//h1[contains(text(), '" + data + "')]"), data);

		return V;
	}

}
