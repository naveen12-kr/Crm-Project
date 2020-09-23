package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dashboardpage extends BasePage {
	public static final By byLogout=findBy("//a[@class='logout']");
	public static final By bySigninPage=findBy("//*[contains(text(),'Sign in with your userid')]");
	public static final By byhelpicon=findBy("//a[@class='help']");
	public static final By byMoreLink=findBy("//h3[contains(text(),'Email Fetch')]/following::a[1]");
	public static final By byOkbutton=findBy("//div[@class='ui-dialog-buttonset']//*[contains(text(),'Ok')]");
	public static final By bycloseButton=findBy("//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']");
	public static final By byViewCount=findBy("//img[@title='View Counts']");
	public static final By byLeftArrow=findBy("//div[@class='col-xs-1 canleft']/a/img");
	public static final By bySettingIcon=findBy("//a[@class='settings']");
	public static final By byAddCountPopup=findBy("//div[@class='modal-content']");
	public static final By bydisableLeftArrow=findBy("//div/div[1]/img[@src='/media/reports/imgs/left_disabled.png']");
	public static final By byCollapseIcon=findBy("//a[@id='menu-collapse']");
	public static final By byReportDasboard=findBy("//h1[contains(text(),'Reports - Dashboard')]");
	public static final By byAccSetting=findBy("//h1[contains(text(),'Account Settings')]");
	public static final By byDownloadAddres=findBy("//table/tbody/tr/th[2]/following::tr/td[2]");
	public static final By byDownloadCounts=findBy("//table/tbody/tr/th[2]/following::tr/td[3]");
	public static final By byOkButton=findBy("//button[contains(text(),'Ok')]");
	/////////////////////////////VALIDATOR//////////////////////////////////////////////////////////////
	 /////////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean isAddCountPopupPresent() {
		return isElementPresent(byAddCountPopup, "Address count pop up");
	}
	public static boolean isSigninPagePresent() {
	return	isElementPresent(bySigninPage,"signUpPage");
	}
	public static boolean isEmailActivityPagePresent(String verify) {
		return isElementPresent(findBy("//div[@class='dashboard']/div/div/h1[contains(text(),'"+verify+"')]"),"Email Activity Page");
	}
	
	public static boolean isLeftArrowEnable() {
		return isElementEnabled(byLeftArrow,"Left arrow");
	}
	public static boolean isLeftArrowDisable() {
		return isElementPresent(bydisableLeftArrow,"Address View Left Arrow");
	}
	public static boolean isReportDasPresent() {
		return isElementPresent(byReportDasboard,"Report Dashboard");
	}
	public static boolean isAccoutnSettingPresent() {
		return  isElementPresent1(byAccSetting,"Account Setting Page");
	}
	/////////////////////////////Clicker///////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void clickOnOkbutton() {
		clickElement(byOkButton,"Ok button");
	}
	public static void clickOnAddressDownload() {
		clickElement(byDownloadAddres,"Address zip");
		sleepApplication(5000);
	}
	public static void clickOnDownloadCounts() {
		clickElement(byDownloadCounts,"Counts zip");
		sleepApplication(5000);
	}
	public static void clickOnHelpIcon() {
		clickElement(byhelpicon,"Help Icon");
	}
	public static void clickOnLogOutButton() {
		clickElement(byLogout,"Logout Button");
		
	}
	public static void clickOnMoreLink(String data) {
		clickElement(findBy("//h3[contains(text(),'"+data+"')]/following::a[1]"), "More Link");
	}
	
	 public static void clickOnDomainDownloadCount() {
		 List<WebElement>list=driver.findElements(findBy("//a[@class='domains-counts']/img"));
		 list.get(0).click();
	 }
	 public static void clickOnDownloadTimePeriod() {
		 List<WebElement>list=driver.findElements(findBy("//*[@id='domainscounts_form']/input"));
		 list.get(2).click();	 
	 }
	 public static void clickOnOkButton() {
		 clickElement(byOkbutton, "Ok Button");
	 }
	 public static void clickOncloseButton() {
		 clickElement(bycloseButton, "close button");
	 }
	 public static void clickOnViewCount() {
		 List<WebElement>list=findElements(byViewCount,"View Count Magnify");
		 list.get(0).click();
	 }
	 public static void clickElementOnleftArrow() {
		 clickElement(byLeftArrow,"Left Arrow");
		 sleepApplication(5000);
	 }
	 public static void clickOnSettingIcon() {
		 clickElement(bySettingIcon,"Out side popup");
		 sleepApplication(10000);
	 }
	 public static void clickOnCollapseIcon() {
		 clickElement(byCollapseIcon,"Collapse Icon");
	 }
	 public static void clickOntimePeriod(String time) {
		 clickElement(findBy("//input[@id='countsperiod-"+time+"']"),time +"time period");
	 }
	 
}
