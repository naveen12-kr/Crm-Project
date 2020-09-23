package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SystemSettings;

public class SystemSettingsDef {
	
	@When("^user selects the default charset \"([^\"]*)\"$")
	public void user_selects_the_default_charset(String arg1) throws Throwable {
	   
		SystemSettings.selectDefaultCharset(arg1);
	}

	@When("^user selects default language \"([^\"]*)\"$")
	public void user_selects_default_language(String arg1) throws Throwable {
	    
		SystemSettings.selectDefaultLanguage(arg1);
	}

	@When("^user selects the Time Zone \"([^\"]*)\"$")
	public void user_selects_the_Time_Zone(String arg1) throws Throwable {
	  
		SystemSettings.selectTimeZone(arg1);
	}

	@When("^user selects the Time determination method as Set Time Mnaually$")
	public void user_selects_the_Time_determination_method_as_Set_Time_Mnaually() throws Throwable {
	    
		SystemSettings.clickOnSetTimeManually();
	}
	
	@When("^user selects the Time determination method as Synchronize with NTP Server$")
	public void user_selects_the_Time_determination_method_as_Synchronize_with_NTP_Server() throws Throwable {
	    
		SystemSettings.clickOnSynchrinizeWithNTPServer();
	}
	@When("^current date and time is dispalyed$")
	public void current_date_and_time_is_dispalyed() throws Throwable {
	    SystemSettings.getDateAndTime();
	}

	@Then("^Message displayed$")
	public void Message_displayed() throws Throwable {
	    SystemSettings.getMessage();
	}

	@When("^user selects the preselected NTP servers \"([^\"]*)\"$")
	public void user_selects_the_preselected_NTP_servers(String arg1) throws Throwable {
	    SystemSettings.selectPreselectedNTPServers(arg1);
	}

	@When("^user see the \"([^\"]*)\"$")
	public void user_see_the(String arg1) throws Throwable {
	 SystemSettings.getListOfNTPServers();
	}

}
