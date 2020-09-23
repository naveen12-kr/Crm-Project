package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MyExportedResults;

public class MyExportedResultsDef {

	@When("^User Click on download icon$")
	public void user_Click_on_download_icon() throws Throwable {
		MyExportedResults.clickOnDownloadIcon();
	}

	@Then("^Downloaded the \\.zip file$")
	public void downloaded_the_zip_file() throws Throwable {
		MyExportedResults.filedownloaded();
	}

	@When("^User click on the share icon$")
	public void user_click_on_the_share_icon() throws Throwable {
		MyExportedResults.clickOnShareIcon();
	}

	@When("^Enter Search Terms for another user by entering their name or part of their name when the popup window appears$")
	public void enter_Search_Terms_for_another_user_by_entering_their_name_or_part_of_their_name_when_the_popup_window_appears()
			throws Throwable {

		MyExportedResults.setSearchTerms();
	}

	@When("^Add the list of selected users to share$")
	public void add_the_list_of_selected_users_to_share() throws Throwable {
		// MyExportedResults.listOfSelectedUsers();
	}

	@When("^Click OK to share the exported \\.zip file$")
	public void click_OK_to_share_the_exported_zip_file() throws Throwable {
		// MyExportedResults.clickOnSharedOKButton();
	}

	@Then("^Shared the exported \\.zip file$")
	public void shared_the_exported_zip_file() throws Throwable {
		MyExportedResults.fileSharedSuccessfully();
	}

	@When("^click on the unshare icon$")
	public void click_on_the_unshare_icon() throws Throwable {
		MyExportedResults.clickOnUnShareIcon();
	}

	@When("^Click Submit to unshare the exported \\.zip file$")
	public void click_Submit_to_unshare_the_exported_zip_file() throws Throwable {
		MyExportedResults.clickOnUnshareSubmitButton();
	}

	@Then("^Unshared the exported \\.zip file$")
	public void unshared_the_exported_zip_file() throws Throwable {
		MyExportedResults.fileUnsharedSuccessfully();
	}

	@When("^Click on delete icon$")
	public void click_on_delete_icon() throws Throwable {
		MyExportedResults.clickOnDeleteIcon();
	}

	@When("^pop up alert message displayed$")
	public void pop_up_alert_message_displayed() throws Throwable {

		MyExportedResults.getDeletePopUp();
	}

	@When("^click on ok button$")
	public void click_on_ok_button() throws Throwable {

		MyExportedResults.clickOnOkPopUp();
	}

	@Then("^Deleted the file$")
	public void deleted_the_file() throws Throwable {

	}

	@Then("^Browse Exported Search Results is displayed without sorting$")
	public void browse_Exported_Search_Results_is_displayed_without_sorting() throws Throwable {
		MyExportedResults.isUnsortedOrder();
	}

	@When("^Click on Filename Sort by start arrow$")
	public void click_on_Filename_Sort_by_start_arrow() throws Throwable {
		MyExportedResults.clickOnAccendingFilenameArrow();
	}

	@Then("^Filename list is displayed in accending order$")
	public void filename_list_is_displayed_in_accending_order() throws Throwable {
		MyExportedResults.isFilenamesortedOrder();
	}

	@When("^Click on Filename Sort by end arrow$")
	public void click_on_Filename_Sort_by_end_arrow() throws Throwable {
		MyExportedResults.clickOnDecendingFilenameArrow();
	}

	@Then("^Filename list is displayed in decending order$")
	public void filename_list_is_displayed_in_decending_order() throws Throwable {

		MyExportedResults.isFilenamesortedOrder();
	}

	@When("^Click on Size Sort by start arrow$")
	public void click_on_Size_Sort_by_start_arrow() throws Throwable {
		MyExportedResults.clickOnAccendingSizeArrow();
	}

	@Then("^File Size list is displayed in accending order$")
	public void file_Size_list_is_displayed_in_accending_order() throws Throwable {

		MyExportedResults.isSizeSortedOrder();
	}

	@When("^Click on Size Sort by end arrow$")
	public void click_on_Size_Sort_by_end_arrow() throws Throwable {
		MyExportedResults.clickOnDecendingSizeArrow();
	}

	@Then("^File Size list is displayed in decending order$")
	public void file_Size_list_is_displayed_in_decending_order() throws Throwable {

		MyExportedResults.isSizeSortedOrder();
	}

	@When("^Click on Date Sort by start arrow$")
	public void click_on_Date_Sort_by_start_arrow() throws Throwable {
		MyExportedResults.clickOnAccendingDateArrow();
	}

	@Then("^Date list is displayed in accending order$")
	public void date_list_is_displayed_in_accending_order() throws Throwable {

		MyExportedResults.isDateSortedOrder();
	}

	@When("^Click on Date Sort by end arrow$")
	public void click_on_Date_Sort_by_end_arrow() throws Throwable {
		MyExportedResults.clickOnDecendingDateArrow();
	}

	@Then("^Date list is displayed in decending order$")
	public void date_list_is_displayed_in_decending_order() throws Throwable {

		MyExportedResults.isDateSortedOrder();
	}

}
