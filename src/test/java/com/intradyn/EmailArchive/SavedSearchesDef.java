package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AllEmails;
import pages.BasePage;
import pages.SavedSearches;
import pages.SearchEmail;

public class SavedSearchesDef extends BasePage {

	@Then("^User clicks on Run icon$")
	public void user_clicks_on_Run_icon() throws Throwable {
		SavedSearches.clickOnRunIcon();
		Thread.sleep(3000);
	}

	@Then("^User clicks on Edit Icon$")
	public void user_clicks_on_Edit_Icon() throws Throwable {
		SavedSearches.clickOnEditIcon();
		Thread.sleep(1000);
	}

	@Then("^User clicks on Clear Fields Icon$")
	public void user_clicks_on_Clear_Fields_Icon() throws Throwable {
		SavedSearches.clickOnClearFieldsIcon();
	}

	@Then("^Saved Name and Saved description fields should be cleared$")
	public void saved_Name_and_Saved_description_fields_should_be_cleared() throws Throwable {
		SavedSearches.isFieldsCleared();
	}

	@Then("^User clicks on save changes button$")
	public void user_clicks_on_save_changes_button() throws Throwable {
		SavedSearches.clickOnSaveChangesButton();
	}

	@Then("^The message \"([^\"]*)\" is displayed$")
	public void the_message_is_displayed(String data) throws Throwable {
		SavedSearches.isRequiredMessageDisplayed(data);
		Thread.sleep(3000);
	}

	@Then("^The Message \"([^\"]*)\" is displayed$")
	public void the_Message_is_displayed(String data) throws Throwable {
		SavedSearches.isMessageDisplayed(data);
	}

	@Then("^Message \"([^\"]*)\" is displayed$")
	public void message_is_displayed(String data) throws Throwable {
		SavedSearches.isMessageSentDisplayed(data);
	}

	@Then("^user able to get Search \"([^\"]*)\" respective to \"([^\"]*)\" Edited Changes \"([^\"]*)\"$")
	public void user_able_to_get_Search_respective_to_Edited_Changes(String data, String sText, String text)
			throws Throwable {
		Thread.sleep(3000);
		SavedSearches.isFeildsAreEditable(data, sText, text);
	}

	@Then("^Then User able to see All Emails$")
	public void then_User_able_to_see_All_Emails() throws Throwable {
		AllEmails.getTotalEmailsCount();
	}

	@Then("^User clicks on delete Icon$")
	public void user_clicks_on_delete_Icon() throws Throwable {
		SavedSearches.clickOnDeleteIcon();
	}

	@Then("^File deleted Succesfully$")
	public void file_deleted_Succesfully() throws Throwable {

	}

	@Then("^File \"([^\"]*)\" Succesfully$")
	public void file_Succesfully(String data) throws Throwable {
		SavedSearches.isSuccessMessageDisplayed(data);
	}

	@When("^user clicks on the same$")
	public void user_clicks_on_the_same() throws Throwable {

		SavedSearches.clickOnCalenderIconSame();
	}

	@Then("^User able to see week days, Run time, Notification email addresses$")
	public void user_able_to_see_week_days_Run_time_Notification_email_addresses() throws Throwable {
		SavedSearches.isRequiredDataPresent();

	}

	@Then("^Configure \"([^\"]*)\" Scheduling Searches \"([^\"]*)\"$")
	public void configure_Scheduling_Searches(String data, String sText) throws Throwable {
		SearchEmail.selectQueryTerm1(data, sText);
	}

	@Then("^Configure \"([^\"]*)\" Scheduling Searches1 \"([^\"]*)\"$")
	public void configure_Scheduling_Searches1(String data, String sText) throws Throwable {
		String days[]=sText.split(" ");
		for (String string : days) {
			SavedSearches.setSchedulingSearchData(data, string);
		}
		
	}

	@Then("^enter data \"([^\"]*)\" in Scheduling Searches\"([^\"]*)\"$")
	public void enter_data_in_Scheduling_Searches(String data, String sText) throws Throwable {
		SearchEmail.getQueryTerms(data, sText);
	}

	@When("^User clicks on collapse icon$")
	public void user_clicks_on_collapse_icon() throws Throwable {
		SavedSearches.clickOnCollapseIcon();
	}

	@Then("^Scheduled Search List disappears\\.$")
	public void scheduled_Search_List_disappears() throws Throwable {
		SavedSearches.isScheduledSearchesPresent();
	}

	@Then("^Scheduled Search List disappears2\\.$")
	public void scheduled_Search_List_disappears2() throws Throwable {
	    
		SavedSearches.isScheduledSearchesPresent2();
	}

	@When("^User Clicks on any \"([^\"]*)\" Icon$")
	public void user_Clicks_on_any_Icon(int data) throws Throwable {
		Thread.sleep(2000);
		SavedSearches.clickOnIcon(data);
	}

	@When("^User Clicks on any \"([^\"]*)\" Icon2$")
	public void user_Clicks_on_any_Icon2(int data) throws Throwable {

		SavedSearches.clickOnEnableIcon(data);
	}

	@Then("^Saerch Name is added in Enabled Searches$")
	public void saerch_Name_is_added_in_Enabled_Searches() throws Throwable {
		SavedSearches.getEnabledSearches();
	}

	@Then("^Saerch Name is added in Disabled Searches$")
	public void saerch_Name_is_added_in_Disabled_Searches() throws Throwable {
		SavedSearches.getDisabledSearches();
	}

	@Then("^Scheduled search runs should be opend with Search run time and Hits list$")
	public void scheduled_search_runs_should_be_opend_with_Search_run_time_and_Hits_list() throws Throwable {
		SavedSearches.isScheduledsearchRunsPresent();
	}

	@Then("^User  Clcik on magnifying glass of search run$")
	public void user_Clcik_on_magnifying_glass_of_search_run() throws Throwable {
		SavedSearches.clickOnMagnifyingGlassIcon();
	}

	@Then("^Email count should be matched with Hits count$")
	public void email_count_should_be_matched_with_Hits_count() throws Throwable {
		SavedSearches.isEmailCountMatched();
	}

	@Then("^Select the one day \"([^\"]*)\" from week days list \"([^\"]*)\"$")
	public void select_the_one_day_from_week_days_list(String sText, String data) throws Throwable {

		SavedSearches.selectOneDayFromWeekdays(sText, data);
	}

	@Then("^Click on Delete icon without selecting checkbox$")
	public void click_on_Delete_icon_without_selecting_checkbox() throws Throwable {

		SavedSearches.clickOnDelete();
	}

	@Then("^Select the multiple days \"([^\"]*)\" from week days list \"([^\"]*)\"$")
	public void select_the_multiple_days_from_week_days_list(String sText, String data) throws Throwable {

		SavedSearches.selectMultipleDaysFromWeekdays(sText, data);
	}

	@Then("^Configure tags in Scheduling Searches$")
	public void configure_tags_in_Scheduling_Searches() throws Throwable {
		SavedSearches.selectTag();
	}

	@When("^User clicks on Save Search Criteria tab$")
	public void user_clicks_on_Save_Search_Criteria_tab() throws Throwable {
		SavedSearches.clickOnSavesSearchCriteria();
	}

	@When("^click on saved search criteria save button$")
	public void click_on_saved_search_criteria_save_button() throws Throwable {

		SavedSearches.clickOnSSCSaveButton();
		Thread.sleep(5000);
	}

	@Then("^user clicks on calender \"([^\"]*)\" icon$")
	public void user_clicks_on_calender_icon(String name) throws Throwable {
		SavedSearches.clickOnSavedsearchQueriesIcons(name);
	}

	@Then("^User clicks on schedule icon$")
	public void user_clicks_on_schedule_icon() throws Throwable {
		SavedSearches.clickOnScheduleIconInSS();
	}

	@When("^Enter user name and description \"([^\"]*)\"$")
	public void enter_user_name_and_description(String arg1) throws Throwable {
		SavedSearches.setUser();
		SavedSearches.setDesc(arg1);
	}

	@Then("^user select \"([^\"]*)\" Search run and click on Delete Icon$")
	public void user_select_Search_run_and_click_on_Delete_Icon(String data) throws Throwable {
		SavedSearches.clickOnDeleteOption(data);
	}

	@Then("^search run should be deleted$")
	public void search_run_should_be_deleted() throws Throwable {
		SavedSearches.isSearchRunDataDeleted();
	}

	@Then("^search run should be displayed$")
	public void search_run_should_be_displayed() throws Throwable {
		SavedSearches.isSearchRunDataDisplayed();
	}

}
