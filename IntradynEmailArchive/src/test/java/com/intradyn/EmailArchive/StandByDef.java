package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.StandBy;
import pages.Status;

public class StandByDef extends BasePage {


	@When("^Warm Standby Overview is displayed$")
	public void warm_Standby_Overview_is_displayed() throws Throwable {
		StandBy.isStandByOverViewDisp();
	}

	@When("^User enters valid stand by target \"([^\"]*)\"$")
	public void user_enters_valid_stand_by_target(String StandByTargetName) throws Throwable {
		String StandByName = getRandomString(8);
		StandBy.setValidTargetName(StandByName);
	}

	@When("^User clicks on the Add Standby Target button$")
	public void user_clicks_on_the_Add_Standby_Target_button() throws Throwable {
		StandBy.clickOnAddStandByTarget();
	}

	@Then("^Adding Warm Standby Target is displayed$")
	public void adding_Warm_Standby_Target_is_displayed() throws Throwable {
		StandBy.isAddingTargetDisp();
	}
	
	@When("^user clicks on Calendar Icon$")
	public void user_clicks_on_Calendar_Icon() throws Throwable {
	    
		StandBy.clickOnCalendarIcon();
	}

	@When("^user click on Pencil icon$")
	public void user_click_on_Pencil_icon() throws Throwable {
	    
		StandBy.clickOnPencilIcon();
	}

	@Then("^User enters the \"([^\"]*)\"$")
	public void user_enters_the(String arg1) throws Throwable {
		String ProductKey = getRandomString(25);
		String IPAddress = getRandomString(10);

		StandBy.setProductKey(ProductKey);
		Thread.sleep(2000);
		StandBy.setIPAddress(IPAddress);
		Thread.sleep(2000);

	}

	@Then("^User clicks on Save button$")
	public void user_clicks_on_Save_button() throws Throwable {
		StandBy.clickOnSaveButton();

	}

	/***********************************
	 * Magnifier
	 ******************************************/

	@When("^user clicks on \"([^\"]*)\" glass$")
	public void user_clicks_on_icon(String arg1) throws Throwable {
		StandBy.clickOnMagnifierIcon();

	}

	@Then("^Process Details: standby is displayed$")
	public void process_Details_standby_is_displayed() throws Throwable {
		StandBy.isProcessDetailsDisp();

	}

	/***********************************
	 * Calendar Icon
	 ******************************************/
	
	@Then("^Scheduling Warm Standby is displayed$")
	public void scheduling_Warm_Standby_is_displayed() throws Throwable {
	    StandBy.isWarmStandByDisp();
	}

	@Then("^select always option under Standby Target$")
	public void select_always_option_under_Standby_Target() throws Throwable {
	    
		StandBy.clickOnAlwaysRadioButton();
	}
	
	@Then("^user clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
		
		StandBy.clickOnSubmitButton();
	}

	@Then("^The standby streaming schedule was changed successfully is displayed$")
	public void the_standby_streaming_schedule_was_changed_successfully_is_displayed() throws Throwable {
		
		StandBy.isScheduledChengesSuccesfully();
	}

	@Then("^select Schedule daily downtime under Standby Target$")
	public void select_Schedule_daily_downtime_under_Standby_Target() throws Throwable {
	    
		StandBy.clickOnScheduledDailyDowntime();
	}

	@Then("^\"([^\"]*)\" are displayed$")
	public void are_displayed(String arg1) throws Throwable {
		
		StandBy.isScheduledownTimeFieldsPresent();
	}

	@When("^user select single week Day$")
	public void user_select_single_week_Day() throws Throwable {

		StandBy.getSingleDaySelected();
	}

	@Then("^Week Days And Shutdown Time And Reactivation Time are displayed$")
	public void week_Days_And_Shutdown_Time_And_Reactivation_Time_are_displayed() throws Throwable {

	}

	@Then("^user select Multiple week Days$")
	public void user_select_Multiple_week_Days() throws Throwable {

		StandBy.getMultipleDaysSelected();
	}

	/***********************************************
	 * Pencil Icon
	 **********************************************/

	@Then("^Updating Standby Target is displayed$")
	public void updating_Standby_Target_is_displayed() throws Throwable {
	    
		StandBy.isUpdateStandbyTargetDisp();
	}
	
	@Then("^Updating \"([^\"]*)\"$")
	public void updating(String arg1) throws Throwable {
	    
		StandBy.setTargetName(arg1);
		StandBy.editProductKey(arg1);
		StandBy.editIp(arg1);
	}

	@Then("^click on Update button$")
	public void click_on_Update_button() throws Throwable {
	    
		StandBy.clickOnUpdateButton();
	}

	@Then("^Updated target is displayed$")
	public void updated_target_is_displayed() throws Throwable {
	    
		StandBy.isUpdateTargetDisp();
	}

		
	@Then("^user click on \"([^\"]*)\" icon and clicks on Update, Standby Target is displayed$")
	public void user_click_on_icon_and_clicks_on_Update_Standby_Target_is_displayed(String arg1) throws Throwable {
	    
		StandBy.clickOnPencilIconToUpdate();
	}

	@Then("^user clicks on Update button$")
	public void user_clicks_on_Update_button() throws Throwable {

		StandBy.clickOnUpdateButton();
	}

	@When("^user clicks on the Cross icon$")
	public void user_clicks_on_the_Cross_icon() throws Throwable {
	   
		StandBy.clickOnDeleteIcon();
	}


	@Then("^Pop Up window is displayed$")
	public void pop_Up_window_is_displayed() throws Throwable {
		
		StandBy.isPopupWindowDisp();
	}

	@Then("^user clicks on Cancel button$")
	public void user_clicks_on_Cancel_button() throws Throwable {

		StandBy.clickOnCancelForPopup();
	}

	@When("^user clicks on Ok button$")
	public void user_clicks_on_Ok_button() throws Throwable {
		
		StandBy.clickOnOKForPopup();
	}

	@Then("^target name is deleted successfully$")
	public void target_name_is_deleted_successfully() throws Throwable {

		Status.getStatusOfSpecificTest();
	}
}
