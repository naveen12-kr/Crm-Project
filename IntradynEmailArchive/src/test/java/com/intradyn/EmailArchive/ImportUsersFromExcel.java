package com.intradyn.EmailArchive;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.UsersAndGroups;

public class ImportUsersFromExcel {
	
	@When("^User clicks on Import users from excel file$")
	public void user_clicks_on_Import_users_from_excel_file() throws Throwable {
	   
		UsersAndGroups.clickImportUsersFromExcel();
	}

	@Then("^User is able to see Excel-Based User Creation Wizard$")
	public void user_is_able_to_see_Excel_Based_User_Creation_Wizard() throws Throwable {
	    
		Assert.assertTrue(UsersAndGroups.isExcelBaserdUserCreation());
	}
	
	
	@When("^User clicks on browse and uploads excel file$")
	public void user_clicks_on_browse_and_uploads_excel_file() throws Throwable {
		
		UsersAndGroups.setUsersFileUpload();
	    
	}

	@Then("^Good users found$")
	public void good_users_found() throws Throwable {
	    
		UsersAndGroups.getTotalUsers();
	}
	
	

}
