package com.intradyn.EmailArchive;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.Maintenance;

public class MaintenanceDef extends BasePage {

	@When("^user clicks on the visit this page link$")
	public void user_clicks_on_the_visit_this_page_link() throws Throwable {

		Maintenance.clickOnVisitThisSite();
	}

	@Then("^User able to see the Maintanence Key Contract details$")
	public void user_able_to_see_the_Maintanence_Key_Contract_details() throws Throwable {

		Maintenance.getMaintenanceKeyContract();
	}

	@Then("^The information displayed is read-only$")
	public void the_information_displayed_is_read_only() throws Throwable {

	}

	@When("^Select \"([^\"]*)\" from the drop down menu$")
	public void select_from_the_drop_down_menu(String sText) throws Throwable {

		Maintenance.selectImportEmailSource(sText);
	}

	@Then("^Select \"([^\"]*)\" from the drop down$")
	public void select_from_the_drop_down(String sText) throws Throwable {
		Maintenance.selectTextNotification(sText);
	}

	@Then("^Select \"([^\"]*)\" in the Data Retention field$")
	public void select_in_the_Data_Retention_field(String data) throws Throwable {
		Maintenance.clickOnDataRetentionfield(data);
	}

	@When("^Select FileType \"([^\"]*)\" for Filesystem type on host$")
	public void select_FileType_for_Filesystem_type_on_host(String data) throws Throwable {

		Maintenance.selectFileSystemTypeOnHost(data);
	}

	@When("^Select FileType \"([^\"]*)\" for Filesystem type$")
	public void select_FileType_for_Filesystem_type(String data) throws Throwable {
		Maintenance.selectFileSystemType(data);
	}

	@When("^Select \"([^\"]*)\" for Filesystem type on host$")
	public void select_for_Filesystem_type_on_host(String arg1) throws Throwable {

	}

	@When("^Enter the Hostname\"([^\"]*)\" or IP\"([^\"]*)\" Address of server form which the emails are to be migrated$")
	public void enter_the_Hostname_or_IP_Address_of_server_form_which_the_emails_are_to_be_migrated(String arg1,
			String arg2) throws Throwable {

	}

	@When("^Enter the path on the host server where the emails reside$")
	public void enter_the_path_on_the_host_server_where_the_emails_reside() throws Throwable {

	}

	@When("^click on Save and Test$")
	public void click_on_Save_and_Test() throws Throwable {

	}

	@When("^User click On the submit Button$")
	public void user_click_On_the_submit_Button() throws Throwable {
		Maintenance.clickOnSubmit();

	}

	@When("^User Clicks on Click here$")
	public void user_Clicks_on_Click_here() throws Throwable {
		Maintenance.clickOnClickHere();
	}

	@Then("^User clicks on Choose files$")
	public void user_clicks_on_Choose_files() throws Throwable {
		Maintenance.clickOnChooseFiles();
	}

	@Then("^click on Cancel Button$")
	public void click_on_Cancel_Button() throws Throwable {
		Maintenance.ClickonCancel();
	}

	@Then("^The files in the uploaded file page are listed in the Select Files option$")
	public void the_files_in_the_uploaded_file_page_are_listed_in_the_Select_Files_option() throws Throwable {
		Assert.assertTrue(Maintenance.isSelectFiles());
	}

	@When("^Clicks on Cancel Button$")
	public void clicks_on_Cancel_Button() throws Throwable {
		Maintenance.clickOnCancelButton();
	}

	@Then("^User click Alert Ok button$")
	public void user_click_Alert_Ok_button() throws Throwable {
		driver.switchTo().alert().accept();
	}

	@When("^User click On Run Migration$")
	public void user_click_On_Run_Migration() throws Throwable {
		Maintenance.clickOnRunMigration();
	}

	@When("^Select Any Address Discovery \"([^\"]*)\"$")
	public void select_Any_Address_Discovery(String data) throws Throwable {
		Maintenance.selectAnyAddressDiscovery(data);
	}

	@When("^User enters email addresse \"([^\"]*)\"$")
	public void user_enters_email_addresse(String sText) throws Throwable {
		Maintenance.setEmailAddresses(sText);
	}

	@Then("^the Current Class Should be \"([^\"]*)\"$")
	public void the_Current_Class_Should_be(String data) throws Throwable {
		Maintenance.getCurrentClass(data);
	}

	@When("^The filename \"([^\"]*)\" and its upload information are displayed in the table below$")
	public void the_filename_and_its_upload_information_are_displayed_in_the_table_below(String data) throws Throwable {
		Maintenance.getUploadInformation(data);
	}

	@Then("^User click Alert Cancel button$")
	public void user_click_Alert_Cancel_button() throws Throwable {
		driver.switchTo().alert().dismiss();
	}

	@Then("^Select \"([^\"]*)\" file from the system$")
	public void select_file_from_the_system(String data) throws Throwable {

		Maintenance.selectZIPFile(data);
	}

	@Then("^Select \"([^\"]*)\" excel file from the system$")
	public void select_excel_file_from_the_system(String data) throws Throwable {

		Maintenance.selectEXCELFile(data);
		Thread.sleep(8000);
	}

	@Then("^Select Existing file from the system$")
	public void select_Existing_file_from_the_system() throws Throwable {
		Maintenance.SelectExistingfile();
	}

	@Then("^Select Show All Dates$")
	public void select_Show_All_Dates() throws Throwable {
		Maintenance.clickonShowAllDates();
	}

	@Then("^get the Existing file$")
	public void get_the_Existing_file() throws Throwable {
		Maintenance.getExistingfile();
	}

	@Then("^Removing the \"([^\"]*)\"Uploaded file$")
	public void removing_the_Uploaded_file(String data) throws Throwable {
		Maintenance.MovingExistingfile(data);
	}

	@Then("^Restore the \"([^\"]*)\"Removed file$")
	public void restore_the_Removed_file(String data) throws Throwable {
		Maintenance.MovingExistingfile1(data);
	}

	@Then("^valid error message is displayed$")
	public void valid_error_message_is_displayed() throws Throwable {
		Maintenance.getErrorMessage();
	}

	@Then("^Close the browser while uploading$")
	public void close_the_browser_while_uploading() throws Throwable {
		driver.close();
	}

	@Then("^Click the Up arrow next to File \"([^\"]*)\"$")
	public void click_the_Up_arrow_next_to_File(String data) throws Throwable {
		Maintenance.clickOnUpArrow(data);
	}

	@Then("^Click the down arrow next to File \"([^\"]*)\"$")
	public void click_the_down_arrow_next_to_File(String data) throws Throwable {
		Maintenance.clickOnDownArrow(data);
	}

	@Then("^The table is sorted in descending order of file name \"([^\"]*)\"$")
	public void the_table_is_sorted_in_descending_order_of_file_name(String data) throws Throwable {
		Maintenance.getEmailsZToAOrder1(data);
		Thread.sleep(2000);
	}

	@Then("^The table is sorted in ascending order of file name \"([^\"]*)\"$")
	public void the_table_is_sorted_in_ascending_order_of_file_name(String data) throws Throwable {
		Maintenance.getEmailsAToZOrder(data);
		Thread.sleep(2000);
	}

	@Then("^user Clicks on delete icon$")
	public void user_Clicks_on_delete_icon() throws Throwable {
		Maintenance.clickOnDeleteButton();
	}

	@Then("^Select \"([^\"]*)\" in Retain email contents Year$")
	public void select_in_Retain_email_contents_Year(String data) throws Throwable {
		Maintenance.selectEmailRetainYears(data);
	}

	@Then("^Select \"([^\"]*)\" Time For Daily$")
	public void select_Time_For_Daily(String data) throws Throwable {
		Maintenance.selectTimeForDaily(data);
	}

	@Then("^Select \"([^\"]*)\" Time For Weekly$")
	public void select_Time_For_Weekly(String data) throws Throwable {
		Maintenance.selectTimeForWeekly(data);
	}

	@Then("^Select \"([^\"]*)\" Day For Weekly$")
	public void select_Day_For_Weekly(String data) throws Throwable {
		Maintenance.clickOnAnyDay(data);
	}

	@Then("^Select \"([^\"]*)\" in Retain email contents$")
	public void select_in_Retain_email_contents(String data) throws Throwable {
		Maintenance.selectEmailRetainMoths(data);
	}

	@Then("^Select Valid frequency\"([^\"]*)\"$")
	public void select_Valid_frequency(String data) throws Throwable {
		Maintenance.setValidFrequency(data);
	}

	@Then("^Select the checkbox in the field I acknowledge and accept this disclaimer$")
	public void select_the_checkbox_in_the_field_I_acknowledge_and_accept_this_disclaimer() throws Throwable {
		Maintenance.clickOnAcknowledge();
	}

	@Then("^The changes made were not saved$")
	public void the_changes_made_were_not_saved() throws Throwable {
		Maintenance.isChangeSaved();
	}

	@Then("^Special Message displayed\"([^\"]*)\"$")
	public void special_Message_displayed(String data) throws Throwable {
		Maintenance.getMessage(data);
	}

	@Then("^user Clicks on the \"([^\"]*)\"$")
	public void user_Clicks_on_the(String data) throws Throwable {
		Maintenance.ClickOnConfig(data);
	}

	@Then("^user Clicks on the here Link$")
	public void user_Clicks_on_the_here_Link() throws Throwable {
		Maintenance.ClickOnHereLink();
	}

	@Then("^selects \"([^\"]*)\" in Department$")
	public void selects_in_Department(String sText) throws Throwable {
		Maintenance.selectDepartmentExtensions(sText);
	}

	@Then("^Select \"([^\"]*)\" in retention period$")
	public void select_in_retention_period(String sText) throws Throwable {
		Maintenance.selectDepartmentExtensionsPeriod(sText);
	}

	@Then("^Select \"([^\"]*)\" in another retention period$")
	public void select_in_another_retention_period(String sText) throws Throwable {
		Maintenance.selectDepartmentExtensionsPeriod1(sText);
	}

	@Then("^Select \"([^\"]*)\" in retention department$")
	public void select_in_retention_department(String arg1) throws Throwable {
		Maintenance.selectDepartment();
	}

	@Then("^Select \"([^\"]*)\" in retention Tag$")
	public void select_in_retention_Tag(String arg1) throws Throwable {
		Maintenance.selectTag();
	}

	@Then("^Select \"([^\"]*)\" in retention Tag1$")
	public void select_in_retention_Tag1(String arg1) throws Throwable {
		Maintenance.selectTag1();
	}

	@Then("^Select \"([^\"]*)\" in retention another department$")
	public void select_in_retention_another_department(String arg1) throws Throwable {
		Maintenance.selectDepartment1();
	}

	@Then("^get the Department available\"([^\"]*)\"$")
	public void get_the_Department_available(String data) throws Throwable {
		Maintenance.getExistingDepartment(data);
	}

	@Then("^get the Tag available\"([^\"]*)\"$")
	public void get_the_Tag_available(String data) throws Throwable {
		Maintenance.getExistingTag(data);
	}

	@Then("^get the another Department available\"([^\"]*)\"$")
	public void get_the_another_Department_available(String data) throws Throwable {
		Maintenance.getExistingDepartment1(data);
	}

	@Then("^close the Departments After\"([^\"]*)\"$")
	public void close_the_Departments_After(String data) throws Throwable {
		// Maintenance.ClickonCloseDepartment(data);
	}

	@Then("^Select \"([^\"]*)\" in Retain email contents Year in Domain$")
	public void select_in_Retain_email_contents_Year_in_Domain(String sText) throws Throwable {
		Maintenance.selectDomainYear(sText);
	}

	@Then("^Select \"([^\"]*)\" in Retain email contents in Domain$")
	public void select_in_Retain_email_contents_in_Domain(String sText) throws Throwable {
		Maintenance.selectDomainMonths(sText);
	}

	@Then("^Select \"([^\"]*)\" in Retain email contents Year in Address$")
	public void select_in_Retain_email_contents_Year_in_Address(String sText) throws Throwable {
		Maintenance.selectAddressYear(sText);
	}

	@Then("^Select \"([^\"]*)\" in Retain email contents Year in Tag$")
	public void select_in_Retain_email_contents_Year_in_Tag(String sText) throws Throwable {
		Maintenance.selectTagYear(sText);
	}

	@Then("^Select \"([^\"]*)\" in Retain email contents Month in Tag$")
	public void select_in_Retain_email_contents_Month_in_Tag(String sText) throws Throwable {
		Maintenance.selectTagMonth(sText);
	}

	@Then("^Select \"([^\"]*)\" in Retain email contents Month in Tag1$")
	public void select_in_Retain_email_contents_Month_in_Tag1(String sText) throws Throwable {
		Maintenance.selectTagMonth1(sText);
	}

	@Then("^Select \"([^\"]*)\" in Retain email contents Year1 in Tag$")
	public void select_in_Retain_email_contents_Year1_in_Tag(String sText) throws Throwable {
		Maintenance.selectTagYear1(sText);
	}

	@Then("^Select \"([^\"]*)\" in Retain email another contents Year in Address$")
	public void select_in_Retain_email_another_contents_Year_in_Address(String sText) throws Throwable {
		Maintenance.selectAddressYear1(sText);
	}

	@Then("^Select \"([^\"]*)\" in Retain email contents in Address$")
	public void select_in_Retain_email_contents_in_Address(String sText) throws Throwable {
		Maintenance.selectAddressMonths(sText);
	}

	@Then("^Select \"([^\"]*)\" in Retain email another contents in Address$")
	public void select_in_Retain_email_another_contents_in_Address(String sText) throws Throwable {
		Maintenance.selectAddressMonths1(sText);
	}

	@Then("^close the \"([^\"]*)\"Departments After\"([^\"]*)\"$")
	public void close_the_Departments_After(String data, String data1) throws Throwable {
		Maintenance.ClickonCloseDepartment(data, data1);
	}

	@Then("^close exctra if any \"([^\"]*)\"$")
	public void close_exctra_if_any(String data) throws Throwable {
		Maintenance.ClickonCloseDepartment(data);
	}

	@Then("^Select \"([^\"]*)\" in another Retain email contents Year in Domain$")
	public void select_in_another_Retain_email_contents_Year_in_Domain(String sText) throws Throwable {
		Maintenance.selectDomainYear1(sText);
	}

	@Then("^Select \"([^\"]*)\" in another Retain email contents in Domain$")
	public void select_in_another_Retain_email_contents_in_Domain(String sText) throws Throwable {
		Maintenance.selectDomainMonths1(sText);
	}

	@Then("^user enters \"([^\"]*)\"the Domain name\"([^\"]*)\"$")
	public void user_enters_the_Domain_name(String sText, String data) throws Throwable {
		Maintenance.setDomainName(sText, data);
	}

	@Then("^user enters \"([^\"]*)\"the Address Extensions\"([^\"]*)\"$")
	public void user_enters_the_Address_Extensions(String sText, String data) throws Throwable {
		Maintenance.setAddressExtensions(sText, data);
	}

	@Then("^Select \"([^\"]*)\" more than one Day For Weekly \"([^\"]*)\"$")
	public void select_more_than_one_Day_For_Weekly(String sText, String data) throws Throwable {
		Maintenance.selectMoreThanOneDay(sText, data);
	}

	@Then("^Select \"([^\"]*)\" Monthly Config \"([^\"]*)\"$")
	public void select_Monthly_Config(String sText, String data) throws Throwable {
		Maintenance.selectMonthly(sText, data);
	}

	@Then("^Select All days in Week$")
	public void select_All_days_in_Week() throws Throwable {
		Maintenance.selectMultipleDays();
	}

	@Then("^User Enters Valid Email in Notify \"([^\"]*)\"$")
	public void user_Enters_Valid_Email_in_Notify(String data) throws Throwable {
		Maintenance.getValidEmail(data);
	}

	@Then("^Verify added LegalHold Is Not Available in Tag$")
	public void verify_added_LegalHold_Is_Not_Available_in_Tag() throws Throwable {
		Maintenance.getTagInformation();
	}

	@Then("^select respective File \"([^\"]*)\" for migration$")
	public void select_respective_File_for_migration(String data) throws Throwable {
		Maintenance.selectMigrationFile(data);
	}

	@Then("^select respective File \"([^\"]*)\" for migration1$")
	public void select_respective_File_for_migration1(String data) throws Throwable {
		Maintenance.selectMigrationFile1(data);
	}

	@Then("^user able to see the header Process Details: EmailMigration$")
	public void user_able_to_see_the_header_Process_Details_EmailMigration() throws Throwable {
		Maintenance.isHeaderPresent();
	}

	@Then("^Click on Upgrade Test Page link$")
	public void click_on_Upgrade_Test_Page_link() throws Throwable {
		Maintenance.clickOnUpgradeLink();
	}

	@Then("^The Health Checkup result with pass/fail should be displayed$")
	public void the_Health_Checkup_result_with_pass_fail_should_be_displayed() throws Throwable {
		Maintenance.isPassOrFailDisplayed();
	}

	@Then("^Fully upgraded data should be pass$")
	public void fully_upgraded_data_should_be_pass() throws Throwable {
		Maintenance.isFullyUpgradedDataPassed();

	}

	@Then("^Health Checkup status should be dispalyed with Cancelled$")
	public void health_Checkup_status_should_be_dispalyed_with_Cancelled() throws Throwable {
		Maintenance.isProcessCancelled();
	}

	@Then("^The cancelled process should be Running and cancel Tests button should be visible$")
	public void the_cancelled_process_should_be_Running_and_cancel_Tests_button_should_be_visible() throws Throwable {
		Maintenance.isCancelButtonDisplayed();
	}

	@Then("^The Running process should be cancelled and Run Tests button should be visible$")
	public void the_Running_process_should_be_cancelled_and_Run_Tests_button_should_be_visible() throws Throwable {
		Maintenance.isRunTestButtonDisplayed();
	}

	@Then("^click on the \"([^\"]*)\" Button$")
	public void click_on_the_Button(String data) throws Throwable {
		Maintenance.clickOnreateRuleButton(data);
	}

	@When("^user Clicks on \"([^\"]*)\" link$")
	public void user_Clicks_on_link(String data) throws Throwable {
		Maintenance.clickOnDetailsLink(data);
	}

	@Then("^The complete details of the Health checkup result for all \"([^\"]*)\"$")
	public void the_complete_details_of_the_Health_checkup_result_for_all(String data) throws Throwable {
		Maintenance.isDetails(data);
	}

	@Then("^user Click on any one of pass/fail text$")
	public void user_Click_on_any_one_of_pass_fail_text() throws Throwable {
		Maintenance.clickOnPassfail();
	}

	@Then("^The Status result with full information should be displayed$")
	public void the_Status_result_with_full_information_should_be_displayed() throws Throwable {
		Maintenance.isFullDetaills();
	}

	@Then("^Click on Upgrade Test Page Link$")
	public void click_on_Upgrade_Test_Page_Link() throws Throwable {
		Maintenance.clickOnUpTestLevelLink();
	}

	@When("^User Click on Data Retention Link$")
	public void user_Click_on_Data_Retention_Link() throws Throwable {
		Maintenance.clickOnDataRetentionLink();
	}

}
