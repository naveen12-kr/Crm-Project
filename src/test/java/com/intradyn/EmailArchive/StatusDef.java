package com.intradyn.EmailArchive;

import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.Status;

public class StatusDef extends BasePage {
	public static String Data;

	@Then("^Clicks on MoreLinkText on  \"([^\"]*)\"$")
	public void clicks_on_MoreLinkText_on(String arg1) throws Throwable {
		Status.clickMoreLink(arg1);
	}

	@Then("^Result$")
	public void result() throws Throwable {
		Status.getDaTa();
	}

	@Then("^user click on any page number \"([^\"]*)\"$")
	public void user_click_on_any_page_number(int data) throws Throwable {
		Status.clickonAnyNumber(data);

	}

	@Then("^user respected page is selected \"([^\"]*)\"$")
	public void user_respected_page_is_selected(int data) throws Throwable {
		Assert.assertTrue(Status.isPageSelected(data));
	}

	@Then("^user clicks on Install Date end arrow \"([^\"]*)\"$")
	public void user_clicks_on_Install_Date_end_arrow(int data) throws Throwable {
		Status.clickonInstallDate(data);
	}

	@Then("^user clicks on Install Date end arrow \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_clicks_on_Install_Date_end_arrow_and(int data, String sText) throws Throwable {
		Status.clickonInstallDate1(data, sText);
	}

	@Then("^names are arranged \"([^\"]*)\" and \"([^\"]*)\"$")
	public void names_are_arranged_and(String data, String sText) throws Throwable {
		Status.getOrder(data, sText);
	}

	@Then("^names are arranged in \"([^\"]*)\" and \"([^\"]*)\"$")
	public void names_are_arranged_in_and(String data, String sText) throws Throwable {
		Status.getOldestToNewestOrder(data, sText);
	}

	@Then("^size are arranged in \"([^\"]*)\" and \"([^\"]*)\"$")
	public void size_are_arranged_in_and(String data, String sText) throws Throwable {
		Status.getOldestToNewestOrder1(data, sText);
	}

	@Then("^History results should be displayed with difault number \"([^\"]*)\"$")
	public void history_results_should_be_displayed_with_difault_number(int data) throws Throwable {
		Status.getDefultValue(data);
	}

	@Then("^user select Any radio button Dates Range \"([^\"]*)\"$")
	public void user_select_Any_radio_button_Dates_Range(String data) throws Throwable {
		Status.clickonDatesRange(data);
	}

	@Then("^History results should be displayed with difault number$")
	public void history_results_should_be_displayed_with_difault_number() throws Throwable {
		Status.checkUpdateHistoryDefaultPage();
	}

	@Then("^user change the number of history results$")
	public void user_change_the_number_of_history_results() throws Throwable {
		Status.setUpdateHistoryNumber();
	}

	@Then("^user change the number of Audit Log results$")
	public void user_change_the_number_of_Audit_Log_results() throws Throwable {
		Status.setAuditLogNumber();
	}

	@Then("^user able to see the total number of results in single page$")
	public void user_able_to_see_the_total_number_of_results_in_single_page() throws Throwable {
		Status.getTotalResults();
	}

	@Then("^user select Any radio button Dates \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_select_Any_radio_button_Dates_Range_and(int data, int sText) throws Throwable {
		Status.selectAnyEmail(data, sText);
	}

	@Then("^Enter From/To dates in input fields \"([^\"]*)\" To \"([^\"]*)\"$")
	public void enter_From_To_dates_in_input_fields_To(String data, String sText) throws Throwable {
		Status.setDatesRange(data, sText);
	}

	@Then("^user Enters data in the input field \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_Enters_data_in_the_input_field_as(String data, String sText) throws Throwable {
		String user = getRandomString(3);
		Status.setData(data, sText + "_" + user);
		Data = sText + "_" + user;
	}

	@Then("^user Enters data in the input Field \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_Enters_data_in_the_input_Field_as(String data, String sText) throws Throwable {
		Status.setData(data, sText);

	}

	@Then("^the data is added in the table$")
	public void the_data_is_added_in_the_table() throws Throwable {
		Status.isDataPresent();

	}

	@Then("^user click on \"([^\"]*)\" Icon$")
	public void user_click_on_Icon(String data) throws Throwable {
		Status.ClickOnIcon(data);
	}

	@Then("^Emails Fetched Graph should be displayed with current date$")
	public void emails_Fetched_Graph_should_be_displayed_with_current_date() throws Throwable {
		Status.isDateSame();
	}

	@When("^Click on backward arrow symbol$")
	public void click_on_backward_arrow_symbol() throws Throwable {
		Status.ClickOnBackwardArrow();
	}

	@When("^Emails Fetched Graph should be displayed with Previous date$")
	public void emails_Fetched_Graph_should_be_displayed_with_Previous_date() throws Throwable {
		Status.isDateisPrevious();
	}

	@When("^Click on Magnifying glass symbol$")
	public void click_on_Magnifying_glass_symbol() throws Throwable {
		Status.ClickOnMagnifyingGlass();
	}

	@When("^Emails Fetched Graph During the Week should be displayed\\.$")
	public void emails_Fetched_Graph_During_the_Week_should_be_displayed() throws Throwable {
		Status.isWeeklyGraphDisplayed();
	}

	@When("^Emails Sent Graph During the Week should be displayed$")
	public void emails_Sent_Graph_During_the_Week_should_be_displayed() throws Throwable {
		Status.isGraphAltered();
	}

	@When("^Emails Sent Graph During the Day should be displayed$")
	public void emails_Sent_Graph_During_the_Day_should_be_displayed() throws Throwable {
		Status.isGraphChangedtoDay();
	}

	@When("^Emails Sent Graph During the Month should be displayed$")
	public void emails_Sent_Graph_During_the_Month_should_be_displayed() throws Throwable {
		Status.isGraphChangedtoMonth();
	}

	@When("^Emails Sent Graph During the Year should be displayed$")
	public void emails_Sent_Graph_During_the_Year_should_be_displayed() throws Throwable {
		Status.isGraphChangedtoYear();
	}

	@When("^Emails Sent Graph During the All Time should be displayed$")
	public void emails_Sent_Graph_During_the_All_Time_should_be_displayed() throws Throwable {
		Status.isGraphChangedtoAllTime();
	}

	@When("^Emails with procesing failures Graph During the All Time should be displayed$")
	public void emails_with_procesing_failures_Graph_During_the_All_Time_should_be_displayed() throws Throwable {
		Status.isGraphofFailedEmailstoAllTime();
	}

	@When("^Emails with Tags Set Graph During the All Time should be displayed$")
	public void emails_with_Tags_Set_Graph_During_the_All_Time_should_be_displayed() throws Throwable {
		Status.isTagsSetOverAllTimeGraphDisplayed();
	}

	@When("^Emails with Tags Over Graph During the All Time should be displayed$")
	public void emails_with_Tags_Over_Graph_During_the_All_Time_should_be_displayed() throws Throwable {
		Status.isEmailsWithTagsOverAllTimeGraphDisplayed();
	}

	@When("^Emails by Fetch Date Graph During the All Time should be displayed$")
	public void emails_by_Fetch_Date_Graph_During_the_All_Time_should_be_displayed() throws Throwable {
		Status.isEmailsbyFetchDateAllTimeGraphDisplayed();
	}

	@When("^Emails with Comments written Graph During the All Time should be displayed$")
	public void emails_with_Comments_written_Graph_During_the_All_Time_should_be_displayed() throws Throwable {
		Status.isEmailsWithCommentsWrittenAllTimeGraphDisplayed();
	}

	@When("^Emails with Comments Graph During the All Time should be displayed$")
	public void emails_with_Comments_Graph_During_the_All_Time_should_be_displayed() throws Throwable {
		Status.isEmailsWithCommentsAllTimeGraphDisplayed();
	}

	@When("^user click on magnifing glass$")
	public void user_click_on_magnifing_glass() throws Throwable {
		Status.clickonMagnifingGlass();
	}

	@Then("^perform action on Data of respective month According to the presence of data$")
	public void perform_action_on_Data_of_respective_month_According_to_the_presence_of_data() throws Throwable {
		Status.performActionAccordingToData();
	}

	@Then("^user clicks on linktext details in \"([^\"]*)\"$")
	public void user_clicks_on_linktext_details_in(String sText) throws Throwable {
		Status.clickonDetailsLink(sText);
	}

	@When("^Click the blue arrow next to a \"([^\"]*)\" test level$")
	public void click_the_blue_arrow_next_to_a_test_level(String sText) throws Throwable {
		Status.clickonBlueArrow(sText);
	}

	@Then("^The corresponding Health checkup page of \"([^\"]*)\" is returned$")
	public void the_corresponding_Health_checkup_page_of_is_returned(String sText) throws Throwable {
		Status.isCorrespondingHealthCheckupPageDisplayed(sText);
	}

	@Then("^the status of all the tests is displayed$")
	public void the_status_of_all_the_tests_is_displayed() throws Throwable {
		sleepApplication(3000);
		Status.isFinalStatusDisplayed();
	}

	@Then("^the status of all the tests is displayed as pending$")
	public void the_status_of_all_the_tests_is_displayed_as_pending() throws Throwable {

		Status.isCurrentStatusDisplayed();
	}

	@Then("^the detailed information is displayed$")
	public void the_detailed_information_is_displayed() throws Throwable {
		Status.isAllDetailsDisplayed();
	}

	@Then("^the detailed information should be hidden$")
	public void the_detailed_information_should_be_hidden() throws Throwable {
		Status.isAllDetailsHidden();
	}

	@Then("^user clicks on Detaiils icon for an \"([^\"]*)\"$")
	public void user_clicks_on_Detaiils_icon_for_an(String data) throws Throwable {
		Status.clickonDetaiilsicon(data);
	}

	@Then("^To verify the Process status and the End-Time value for \"([^\"]*)\"$")
	public void to_verify_the_Process_status_and_the_End_Time_value_for(String data) throws Throwable {
		Status.isActiveJobDetailsDisplayed(data);
	}

	@Then("^To verify SMTP Server is listed under \"([^\"]*)\"$")
	public void to_verify_SMTP_Server_is_listed_under(String data) throws Throwable {
		Status.isSmtpListed(data);
	}

	@Then("^The system summary information matches with the actual data$")
	public void the_system_summary_information_matches_with_the_actual_data() throws Throwable {
		Status.isDataMatches();
	}

	@Then("^Raid Status  for each partition appears in the system summary$")
	public void raid_Status_for_each_partition_appears_in_the_system_summary() throws Throwable {
		Status.isRaidStatusAppeared();
	}

	@Then("^Click the details link on the failed RAID parrtition$")
	public void click_the_details_link_on_the_failed_RAID_parrtition() throws Throwable {
		Status.clickonDetailsLinkonRAIDPartition();
	}

	@Then("^Click on the Download Report link$")
	public void click_on_the_Download_Report_link() throws Throwable {
		Status.clickonDownloadReport();
	}

	@Then("^Click on the Download Addresses$")
	public void click_on_the_Download_Addresses() throws Throwable {
		Status.clickonDownloadAddress();
	}

	@Then("^Click on the Download Counts \"([^\"]*)\"$")
	public void click_on_the_Download_Counts(String data) throws Throwable {
		Status.clickonDownloadCounts(data);
	}

	@Then("^click on ok Button$")
	public void click_on_ok_Button() throws Throwable {
		Status.clikonOKButton();
	}

	@Then("^click on Cross Button$")
	public void click_on_Cross_Button() throws Throwable {
		Status.clikonCancelButton();
	}

	@Then("^The corresponding File \"([^\"]*)\" is Downloaded \"([^\"]*)\"$")
	public void the_corresponding_File_is_Downloaded(String arg1, String data) throws Throwable {

		String downloadPath = System.getProperty("user.dir") + "\\download\\";
		System.out.println(downloadPath);
		if (arg1.equals("1")) {
			String d1 = driver.findElement(By.xpath("(//*[@class='table-box']//tbody/tr/td[2]/a)[1]")).getText();
			String d2 = d1.substring(0, 3);
			isFileDownloaded(downloadPath, data + "-" + d2);
		}
		if (arg1.equals("2")) {
			String d1 = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody[2]/tr[1]/td[1]")).getText();
			isFileDownloaded(downloadPath, data + "-" + d1);
		}

	}

	@Then("^user clicks on Magnifingglass$")
	public void user_clicks_on_Magnifingglass() throws Throwable {
		Status.clickonMagnifingglass();
	}

	@Then("^the \"([^\"]*)\" Arrow is \"([^\"]*)\"$")
	public void the_Arrow_is(String sText, String data) throws Throwable {
		Status.isRightorLeftArrowEnable(data, sText);
	}

	@When("^user clicks on left Arrow$")
	public void user_clicks_on_left_Arrow() throws Throwable {
		Status.clickonLeftArrow();
	}

	@When("^Click outside the pop up$")
	public void click_outside_the_pop_up() throws Throwable {
		Status.clickonMagnifingglass();
	}

	@Then("^The Address count graph pop up is closed$")
	public void the_Address_count_graph_pop_up_is_closed() throws Throwable {
		Status.isAddressCountPopupClosed();
	}

	@Then("^The disk space information in the graph matches with the actual data$")
	public void the_disk_space_information_in_the_graph_matches_with_the_actual_data() throws Throwable {
		Status.isGraphDataMatches();
	}

	@Then("^The Network information in the graph matches with the actual data$")
	public void the_Network_information_in_the_graph_matches_with_the_actual_data() throws Throwable {
		Status.isNetworkInfoMatches();
	}

	@Then("^The software version information in the graph matches with the actual data$")
	public void the_software_version_information_in_the_graph_matches_with_the_actual_data() throws Throwable {
		Status.isSoftwareVersionMatches();
	}

}