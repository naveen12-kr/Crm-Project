package com.intradyn.EmailArchive;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.Dashboardpage;

public class DashboardTest extends BasePage {
	
	@Then("^User verify the dashboard$")
	public void user_verify_the_dashboard(DataTable table) throws Throwable {
		List< List<String>>tile=table.raw();
		List<WebElement>dashHeader=findElements(findBy("//div[@class='separator']/h5"),"header");
		for(int i=0;i<dashHeader.size();i++) {
			Assert.assertEquals(dashHeader.get(i).getText(),tile.get(i).get(0) ,"Header Verification");
		}   
	}
	@When("^User click on Logout$")
	public void user_click_on_Logout() throws Throwable {
		Dashboardpage.clickOnLogOutButton();
	}
	
	@Then("^User Login page should be load$")
	public void user_Login_page_should_be_load() throws Throwable {
		Assert.assertTrue(Dashboardpage.isSigninPagePresent());
	}
	@When("^User click on Help Icon$")
	public void user_click_on_Help_Icon() throws Throwable {
		Dashboardpage.clickOnHelpIcon();
	}

	@Then("^User help page should be open$")
	public void user_help_page_should_be_open() throws Throwable {
	   
	}

	@Then("^\"([^\"]*)\" Page should open$")
	public void email_Activity_Page_should_open(String data) throws Throwable {
		Assert.assertTrue(Dashboardpage.isEmailActivityPagePresent(data));
	}
	@When("^User click on \"([^\"]*)\" more link$")
	public void user_click_on_more_link(String data) throws Throwable {
		Dashboardpage.clickOnMoreLink(data);
	}
	
	
	@When("^User click on domain download count dowload$")
	public void user_click_on_domain_download_count_dowload() throws Throwable {
		Dashboardpage.clickOnDomainDownloadCount();
	}

	@Then("^Download period popup should be open$")
	public void download_period_popup_should_be_open() throws Throwable {
	   
	}

	@When("^User choose \"([^\"]*)\" in the time period$")
	public void user_choose_in_the_time_period(String arg1) throws Throwable {
		Dashboardpage.clickOnDownloadTimePeriod();
	}
	@Then("^User close the downloads popup$")
	public void user_close_the_downloads_popups() {
		Dashboardpage.clickOncloseButton();
	}
	
	@When("^User click on Domain View count$")
	public void user_click_on_Domain_View_count() throws Throwable {
		Dashboardpage.clickOnViewCount();
		sleepApplication(2000);
		Assert.assertTrue(Dashboardpage.isAddCountPopupPresent());
	}
	@Then("^User count domain Popup left arrow should be enable and right arrow should be disable$")
	public void user_count_domain_Popup_left_arrow_should_be_enable_and_right_arrow_should_be_disable() throws Throwable {
	   Assert.assertTrue(Dashboardpage.isLeftArrowEnable());
	}
	@When("^User click on left Arrow$")
	public void user_click_on_left_Arrow() throws Throwable {
		Dashboardpage.clickElementOnleftArrow();
	}

	@Then("^Left Arrow should be disable$")
	public void left_Arrow_should_be_disable() throws Throwable {
		 Assert.assertTrue(Dashboardpage.isLeftArrowDisable());
	}
	
	@When("^User click on outside the popup of address count view$")
	public void user_click_on_outside_the_popup_of_address_count_view() throws Throwable {
		Dashboardpage.clickOnSettingIcon();
		sleepApplication(3000);
		Assert.assertFalse(Dashboardpage.isAddCountPopupPresent());
	}
	@When("^User click on Collapse icon$")
	public void user_click_on_Collapse_icon() throws Throwable {
		Dashboardpage.clickOnCollapseIcon();
		sleepApplication(10000);
	}

	@Then("^Side menu bar should be collapse$")
	public void side_menu_bar_should_be_collapse() throws Throwable {
	  Assert.assertTrue(Dashboardpage.isReportDasPresent());
	}

	@When("^User click on Expand icon$")
	public void user_click_on_Expand_icon() throws Throwable {
		Dashboardpage.clickOnCollapseIcon();
		sleepApplication(10000);
	}

	@Then("^Side menu bar should be Expand$")
	public void side_menu_bar_should_be_Expand() throws Throwable {
		Assert.assertTrue(Dashboardpage.isReportDasPresent());
	}
	
	@When("^User click on Setting icon$")
	public void user_click_on_Setting_icon() throws Throwable {
		Dashboardpage.clickOnSettingIcon();
	}

	@Then("^Setting page should be shown$")
	public void setting_page_should_be_shown() throws Throwable {
		Assert.assertTrue(Dashboardpage.isAccoutnSettingPresent());
	}
	@When("^Click on Help icon of Dashboard$")
	public void click_on_Help_icon_of_Dashboard() throws Throwable {
		Dashboardpage.clickOnHelpIcon();
	}

	@Then("^Help page should open in new window$")
	public void help_page_should_open_in_new_window() throws Throwable {
		 // Get current window handle
        String parentWinHandle = driver.getWindowHandle();
        // Locate 'Click to open a new browser window!' button using id
		 Set<String> winHandles = driver.getWindowHandles();
	        // Loop through all handles
	        for(String handle: winHandles){
	            if(!handle.equals(parentWinHandle)){
	            driver.switchTo().window(handle);
	            Thread.sleep(1000);
	           Assert.assertEquals("Help", driver.getTitle());
	            driver.close();
	            }
	        }
	        // Switching the control back to parent window
	        driver.switchTo().window(parentWinHandle);	   
	}
	@Then("^User click on download Address zip$")
	public void user_click_on_download_Address_zip() throws Throwable {
		Dashboardpage.clickOnAddressDownload();
	}  
	@Then("^User click on Ok button$")
	public void user_click_on_ok_button() throws Throwable {
		Dashboardpage.clickOnOkbutton();
		sleepApplication(5000);
	}
	@Then("^User click on download counts zip$")
	public void user_click_on_download_counts_zip() throws Throwable {
		Dashboardpage.clickOnDownloadCounts();
	}
	@Then("^User choose \"([^\"]*)\" Month time period$")
	public void user_choose_Month_time_period(String time) throws Throwable {
		Dashboardpage.clickOntimePeriod(time);
		sleepApplication(5000);
	}

}
