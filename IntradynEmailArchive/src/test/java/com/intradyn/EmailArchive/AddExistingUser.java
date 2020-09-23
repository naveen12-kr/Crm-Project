package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import pages.UsersAndGroups;

public class AddExistingUser {
	
	@Then("^message \"([^\"]*)\"ram\"([^\"]*)\" is dispalyed$")
	public void message_ram_is_dispalyed(String arg1, String arg2) throws Throwable {
	    
		UsersAndGroups.getMessage();
	}

}
