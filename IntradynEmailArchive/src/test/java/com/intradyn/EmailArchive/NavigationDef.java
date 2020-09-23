package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Navigation;

public class NavigationDef {
	
	
	@When("^User clicks on \"([^\"]*)\" tab$")
	public void user_clicks_on_tab(String data) throws Throwable {
	    
		Navigation.clickOnEmailViewingLPanel(data);
	
	}
	
	@Then("^User able to see header \"([^\"]*)\"$")
	public void user_able_to_see_header(String data) throws Throwable {
	    
		Navigation.getEmailViewingH3(data);
		
	}

	
	@Then("^User able to see header Contacts$")
	public void user_able_to_see_header_Contacts() throws Throwable {
	    Navigation.getContactsHeader();
	}
	
	@Then("^user able to see the \"([^\"]*)\"$")
	public void user_able_to_see_the(String data) throws Throwable {
	    
		Navigation.getEmailViewingHeaderH1(data);
	}
	
	@When("^user click on \"([^\"]*)\"$")
	public void user_click_on(String usersAndGroups) throws Throwable {
	    
		Navigation.clickOnUserandGroupsLPanel(usersAndGroups);
	}

	@Then("^user should see header \"([^\"]*)\"$")
	public void user_should_see_header(String usersAndGroups) throws Throwable {
	 
		Navigation.getUsersandGroupsH3(usersAndGroups);
	}

	@Then("^user able to see \"([^\"]*)\"$")
	public void user_able_to_see(String usersAndGroups) throws Throwable {
	    
		Navigation.getUsersandGroupsH1(usersAndGroups);
	}
	@When("^user click on the \"([^\"]*)\"$")
	public void user_click_on_the(String status) throws Throwable {
	    
		Navigation.clickOnStatusLPanel(status);
	}

	@Then("^user should able to see header \"([^\"]*)\"$")
	public void user_should_able_to_see_header(String status) throws Throwable {
	    
		Navigation.getStatusH3(status);
	}

	@Then("^user should able to see the \"([^\"]*)\"$")
	public void user_should_able_to_see_the(String status) throws Throwable {
	    
		Navigation.getStatusH1(status);
	}
	
	@Then("^user able to see Groups$")
	public void user_able_to_see_Groups() throws Throwable {
	    Navigation.getGroupsHeader();
	}
		
	@When("^user clicks \"([^\"]*)\" tab$")
	public void user_clicks_tab(String backup) throws Throwable {
	    Navigation.clickOnBackupLPanel(backup);
	}
	
	@When("^user clicks Backup tab$")
	public void user_clicks_Backup_tab() throws Throwable {
	    Navigation.clickOnBackUpTab();
	}

	@Then("^user have to see header \"([^\"]*)\"$")
	public void user_have_to_see_header(String backup) throws Throwable {
	    Navigation.getBackupH3(backup);
	}

	@Then("^user have to see the \"([^\"]*)\"$")
	public void user_have_to_see_the(String backup) throws Throwable {
	    Navigation.getBackupH1(backup);
	}
	
	
	@When("^User Click On \"([^\"]*)\" tab$")
	public void user_Click_On_tab(String maintenance) throws Throwable {
	    
		Navigation.clickOnMaintenanceLPanel(maintenance);
	}

	@Then("^User able to See header \"([^\"]*)\"$")
	public void user_able_to_See_header(String maintenance) throws Throwable {
	    
		Navigation.getMaintenanceH3(maintenance);
	}
	
	@Then("^User able to see the \"([^\"]*)\"$")
	public void User_able_to_see_the(String maintenance) throws Throwable {
	    
		Navigation.getMaintenanceH1(maintenance);
	}

	@When("^user click on \"([^\"]*)\" Tab$")
	public void user_click_on_Tab(String configuration) throws Throwable {
	    Navigation.clickOnConfigurationLPanel(configuration);
		
	}

	@Then("^user ables to see header \"([^\"]*)\"$")
	public void user_ables_to_see_header(String configuration) throws Throwable {
	    Navigation.getConfigurationH3(configuration);
		
	}

	@Then("^user able to see the header \"([^\"]*)\"$")
	public void user_able_to_see_the_header(String configuration) throws Throwable {
	    Navigation.getConfigurationH1(configuration);
		
	}
	
		
}
