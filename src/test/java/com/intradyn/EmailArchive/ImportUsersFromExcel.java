package com.intradyn.EmailArchive;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.SmtpServer;
import pages.UsersAndGroups;

public class ImportUsersFromExcel extends BasePage {

	@When("^User clicks on Import users from excel file$")
	public void user_clicks_on_Import_users_from_excel_file() throws Throwable {

		UsersAndGroups.clickImportUsersFromExcel();
	}

	@Then("^Error message Displayed$")
	public void error_message_Displayed() throws Throwable {
		SmtpServer.isErrorMessageDisplayed();
	}

	@Then("^User is able to see Excel-Based User Creation Wizard$")
	public void user_is_able_to_see_Excel_Based_User_Creation_Wizard() throws Throwable {

		Assert.assertTrue(UsersAndGroups.isExcelBaserdUserCreation());
	}

	@Then("^The corresponding File \"([^\"]*)\" is downloaded$")
	public void the_corresponding_File_is_downloaded(String data) throws Throwable {
		String downloadPath = System.getProperty("user.dir") + "\\download\\";
		System.out.println(downloadPath);
		isFileDownloaded(downloadPath, data);
	}

	@When("^User clicks on browse and uploads excel file$")
	public void user_clicks_on_browse_and_uploads_excel_file() throws Throwable {

		UsersAndGroups.setUsersFileUpload();
		Thread.sleep(2000);

	}

	@Then("^Good users found$")
	public void good_users_found() throws Throwable {

		UsersAndGroups.getTotalUsers();
	}

	@Then("^Good users Found: none$")
	public void good_users_Found_none() throws Throwable {
		UsersAndGroups.isGoodUsersFoundNone();
	}

	@Then("^next button should be disabled$")
	public void next_button_should_be_disabled() throws Throwable {
		UsersAndGroups.isNextButtonDisabled();
	}

}
