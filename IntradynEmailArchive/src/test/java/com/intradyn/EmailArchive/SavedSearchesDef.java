package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import pages.AllEmails;
import pages.SavedSearches;

public class SavedSearchesDef {
	
	@Then("^User clicks on Run icon$")
	public void user_clicks_on_Run_icon() throws Throwable {
	    SavedSearches.clickOnRunIcon();
	    Thread.sleep(3000);
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

}
