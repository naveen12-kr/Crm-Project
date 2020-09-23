package com.intradyn.EmailArchive;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BackUp;
import pages.BasePage;

public class BackUpDef extends BasePage {

	@Then("^Files displayed according to its start time, end time, File type or Error message along with the up and down arrows$")
	public void files_displayed_according_to_its_start_time_end_time_File_type_or_Error_message_along_with_the_up_and_down_arrows()
			throws Throwable {

		BackUp.getRBHistoryTableData();
	}

	@Then("^Click on \"([^\"]*)\" up and down arrow once$")
	public void click_on_up_and_down_arrow_once(String data) throws Throwable {

		BackUp.clickOnStartUPandDownArrow(data);
	}

	@Then("^Files is displayed in the descending order of it files \"([^\"]*)\" time$")
	public void files_is_displayed_in_the_descending_order_of_it_files_time(String a) throws Throwable {

		BackUp.isRemoteHistorySortedOrder(a);
	}

	@Then("^Remote Backup Host confiuration all fields are displayed$")
	public void remote_Backup_Host_confiuration_all_fields_are_displayed() throws Throwable {

		Assert.assertTrue(BackUp.isRemoteHostConfigFielsPresent());
	}

	@Then("^Enter encryption key$")
	public void enter_encryption_key() throws Throwable {

		BackUp.setEncyptionKey();
	}

	@Then("^click on view check box$")
	public void click_on_view_check_box() throws Throwable {

		BackUp.clickOnViewCheckBox();
	}

	@Then("^Entered Encryption Key is displayed$")
	public void entered_Encryption_Key_is_displayed() throws Throwable {

		BackUp.getEncryptionKey();
	}

	@Then("^Select Filesystem type on host$")
	public void select_Filesystem_type_on_host() throws Throwable {

		BackUp.clickOnNFS();
	}

	@Then("^Select filesystem type on host$")
	public void select_filesystem_type_on_host() throws Throwable {

		BackUp.clickOnSMBAndCIFS();
	}

	@Then("^Enter Host Name \"([^\"]*)\"$")
	public void enter_Host_Name(String data) throws Throwable {

		BackUp.setHostName(data);
	}

	@Then("^Path on host \"([^\"]*)\"$")
	public void path_on_host(String data) throws Throwable {
		BackUp.setHostPath(data);
	}

	@Then("^Click on Save and Test$")
	public void click_on_Save_and_Test() throws Throwable {

		BackUp.clickOnSaveAndTest();
	}

	@Then("^Remote backup location has been saved message is displayed$")
	public void remote_backup_location_has_been_saved_message_is_displayed() throws Throwable {

		BackUp.getRemoteBackUpMessage();
	}

	@Then("^Frequency radio buttons and I never intend to schedule this job checkbox is displayed$")
	public void frequency_radio_buttons_and_I_never_intend_to_schedule_this_job_checkbox_is_displayed()
			throws Throwable {

		BackUp.isFrequencyPresent();
		BackUp.isINeverIntendedToScheduleThisJob();
	}

	@Then("^Remote backup schedule has been updated message is displayed$")
	public void remote_backup_schedule_has_been_updated_message_is_displayed() throws Throwable {

		BackUp.getRBScheduleMessage();
	}

	@Then("^Select Hourly option, and set the hours \"([^\"]*)\"$")
	public void select_Hourly_option_and_set_the_hour_s(String a) throws Throwable {

		BackUp.clickOnFrequencyHourly(a);
	}

	@Then("^Select daily option at \"([^\"]*)\", and set the time \"([^\"]*)\"$")
	public void select_daily_option_at_and_set_the_time(String a, String b) throws Throwable {

		BackUp.clickOnFrequencyDaily(a, b);
	}

	@Then("^Select the never intend to do a backup check box$")
	public void select_the_never_intend_to_do_a_backup_check_box() throws Throwable {
		BackUp.clickOnNeverIntendCheckBox();
	}

	@Then("^Select weekly on \"([^\"]*)\" option at \"([^\"]*)\", and set the time \"([^\"]*)\"$")
	public void select_weekly_on_option_at_and_set_the_time(String a, String b, String c) throws Throwable {

		BackUp.clickOnFrequencyWeekly(a, b, c);
	}

	@Then("^Begin Backup button is displayed$")
	public void begin_Backup_button_is_displayed() throws Throwable {

		Assert.assertTrue(BackUp.isBeginBackupPresent());
	}

	@Then("^click on Remote host Config$")
	public void click_on_Remote_host_Config() throws Throwable {

		BackUp.clickOnRemoteHostConfigLink();
	}

	@Then("^Select Pause Remote Backup check box$")
	public void select_Pause_Remote_Backup_check_box() throws Throwable {

		BackUp.clickOnPauseRemoteBackUp();
	}

	@Then("^Process details in the status is displayed with start and end time$")
	public void process_details_in_the_status_is_displayed_with_start_and_end_time() throws Throwable {

		BackUp.getProcessDetails();
	}

	@Then("^Product key option and Begin Restoration button is displayed$")
	public void product_key_option_and_Begin_Restoration_button_is_displayed() throws Throwable {

		Assert.assertTrue(BackUp.isProductKeyLabelPresent());
		Assert.assertTrue(BackUp.isBeginRestorationPresent());
	}

	@Then("^Staus is displayed with three details Encryption Key, Warning, Enter stand by mode$")
	public void staus_is_displayed_with_three_details_Encryption_Key_Warning_Enter_stand_by_mode() throws Throwable {

		Assert.assertTrue(BackUp.isEncryptionKeyPresent());
		Assert.assertTrue(BackUp.isWarningPresent());
		Assert.assertTrue(BackUp.isEnterStandByModePresent());
	}

	@Then("^Warning Standby Target is displayed with Name, FQDN or IP, Product Key, Current Sched, Actions$")
	public void warning_Standby_Target_is_displayed_with_Name_FQDN_or_IP_Product_Key_Current_Sched_Actions()
			throws Throwable {
         Thread.sleep(3000);
		BackUp.getWarmStandByTarget();
	}

	@Then("^Available Warm standby Target machines$")
	public void available_Warm_standby_Target_machines() throws Throwable {

		BackUp.getWarmStandByMachines();
	}

	@Then("^Click on magnifying icon displayed in the Warning Standby Target$")
	public void click_on_magnifying_icon_displayed_in_the_Warning_Standby_Target() throws Throwable {

		BackUp.clickOnWarmStandByMagGlass();
	}

	@Then("^Click on calendar icon displayed in the Warning Standby Target$")
	public void click_on_calendar_icon_displayed_in_the_Warning_Standby_Target() throws Throwable {

		BackUp.clickOnWarmStandByCalander();
	}

	@Then("^click on pencil icon displayed in the Warm StandBy$")
	public void click_on_pencil_icon_displayed_in_the_Warm_StandBy() throws Throwable {
		BackUp.clickOnWarmStandByPencil();
	}

	@Then("^User enters the name \"([^\"]*)\"$")
	public void user_enters_the_name(String sText) throws Throwable {
		String user = getRandomString(3);
		BackUp.setAddUserName(sText + "_" + user);
	}

	@Then("^Scheduling Warm Standby mandatory fields$")
	public void scheduling_Warm_Standby_mandatory_fields() throws Throwable {

		BackUp.getSchedulingWarmStandByMadatoryFileds();
	}

	@Then("^user Set Target data sync as Always Preferred$")
	public void user_Set_Target_data_sync_as_Always_Preferred() throws Throwable {
		BackUp.clickOnAlwaysPreferred();
	}

	@Then("^Other option is minimised and two option is visible$")
	public void other_option_is_minimised_and_two_option_is_visible() throws Throwable {
		BackUp.VerifyOtherOptions();
	}

	@Then("^Select one or more week days, Enter Shutdown Time, Enter Reactivation Time$")
	public void select_one_or_more_week_days_Enter_Shutdown_Time_Enter_Reactivation_Time() throws Throwable {
		BackUp.selectMultipleDays(3);
	}

	@When("^user clicks on Click here option mentioned$")
	public void user_clicks_on_Click_here_option_mentioned() throws Throwable {
		BackUp.clickOnClickHere();
	}

	@Then("^Submit button is present$")
	public void submit_button_is_present() throws Throwable {
		Assert.assertTrue(BackUp.isSubmitButtonPresent());
	}

	@Then("^This field is required message is displayed$")
	public void this_field_is_required_message_is_displayed() throws Throwable {
		BackUp.getThisFieldRequired();
	}

	@Then("^Click on \"([^\"]*)\" down arrow once$")
	public void click_on_down_arrow_once(String data) throws Throwable {

		BackUp.clickOnStartDownArrow(data);
	}

	@Then("^error message displayed$")
	public void error_message_displayed() throws Throwable {
		Assert.assertTrue(BackUp.isErrorMessageDisplayed());
	}

	@Then("^message displayed$")
	public void message_displayed() throws Throwable {
		Assert.assertTrue(BackUp.isMessageDisplayed());
	}

	@When("^all the fields are kept Empty$")
	public void all_the_fields_are_kept_Empty() throws Throwable {
		BackUp.setAllFieldsEmpty();
	}

	@Then("^Check box should be unchecked$")
	public void check_box_should_be_unchecked() throws Throwable {
		BackUp.isCheckBoxStatus();
	}

}
