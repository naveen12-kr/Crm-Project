package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import pages.UsersAndGroups;

public class UsersAndGroupsDef {
	
	@Then("^prev button is enabled$")
	public void prev_button_is_enabled() throws Throwable {
	    
		UsersAndGroups.isPrevButtonEnabled();
		
	}
	
	@Then("^This field is required is displayed$")
	public void this_field_is_required_is_displayed() throws Throwable {
	    
		UsersAndGroups.getFieldIsRequired();
	}

	@Then("^Password and confirmation password did not match message is displayed$")
	public void password_and_confirmation_password_did_not_match_message_is_displayed() throws Throwable {
	    
		UsersAndGroups.getErrorMessagePassword();
	}

}
