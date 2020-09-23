package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Maintenance;

public class MaintenanceDef {
	
	@When("^user clicks on the visit this page link$")
	public void user_clicks_on_the_visit_this_page_link() throws Throwable {
	    
		Maintenance.clickOnVisitThisSite();
	}
	
	@Then("^User able to see the Maintanence Key Contract details$")
	public void user_able_to_see_the_Maintanence_Key_Contract_details() throws Throwable {
	    
		Maintenance.getMaintenanceKeyContract();
	}

	@Then("^The information displayed is read-only$")
	public void the_information_displayed_is_read_only() throws Throwable {
	    
		
	}


}
