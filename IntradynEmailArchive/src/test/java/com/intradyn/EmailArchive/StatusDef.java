package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Status;

public class StatusDef {
	
	@Then("^Click on More linktext on top of Emails fetched during current week graph$")
	public void click_on_More_linktext_on_top_of_Emails_fetched_during_current_week_graph() throws Throwable {
	    
		Status.clickOnMoreLinkText();
	}

	@Then("^Email Activity page is returned$")
	public void email_Activity_page_is_returned() throws Throwable {
	   
		Status.isGraphsOfEmailFetchedPresent();
	}
	
	@Then("^Click on More linktext on top of Distict Addresses during current year$")
	public void click_on_More_linktext_on_top_of_Distict_Addresses_during_current_year() throws Throwable {
	    
		Status.clickOnMoreLinkDistinctAddress();
	}

	@Then("^Domains page is returned$")
	public void domains_page_is_returned() throws Throwable {
	  
		Status.isDomainsPresent();
	}

	@Then("^All configured domains are listed in the Domains page$")
	public void all_configured_domains_are_listed_in_the_Domains_page() throws Throwable {
	    
		Status.getDomainsList();
	}
	
	@Then("^Active jobs in the system$")
	public void active_jobs_in_the_system() throws Throwable {
	  
		Status.getActiveJobs();
	}
	
	@Then("^In-active jobs in the system$")
	public void in_active_jobs_in_the_system() throws Throwable {
	  
		Status.getInactiveJobs();
	}
	
	@Then("^Click on icon blue magnifying glass for an Active job$")
	public void click_on_icon_blue_magnifying_glass_for_an_Active_job() throws Throwable {
	    
		Status.clickOnMagnifyGlassActiveJob();
	}
	
	@Then("^Click on icon blue magnifying glass for an In-active job$")
	public void click_on_icon_blue_magnifying_glass_for_an_In_active_job() throws Throwable {
	    
		Status.clickOnMagnifyGlassInActiveJob();
		Thread.sleep(3000);
	}

	
	@Then("^The Process status should be in In-progress$")
	public void the_Process_status_should_be_in_In_progress() throws Throwable {
	   
		Status.getProcessStatus();
	}

	@Then("^The End-Time value is empty$")
	public void the_End_Time_value_is_empty() throws Throwable {
	    
		Status.getEndTime();
	}
	
	@Then("^The In-active job Process status is Finished$")
	public void the_In_active_job_Process_status_is_Finished() throws Throwable {
	    
		Status.getInactiveProcessStatus();
	}
	
	@Then("^The End-Time value is present$")
	public void the_End_Time_value_is_present() throws Throwable {
	    
		Status.getEndTime();
	}
	
	@Then("^Click on the linktext details in Total table$")
	public void click_on_the_linktext_details_in_Total_table() throws Throwable {
	   
		Status.clickOnLinkTextDetailsTotalTable();
		Thread.sleep(2000);
	}
	
	@Then("^All Emails page under Viewers module is returned$")
	public void all_Emails_page_under_Viewers_module_is_returned() throws Throwable {
	   
		Status.getAllEmailsPageUrl();
	}

	
	@Then("^Summary counts information displayed matches with the actual data$")
	public void summary_counts_information_displayed_matches_with_the_actual_data() throws Throwable {
	    
		Status.summaryCountAndTotalMailsMatching();
	}
	
	@When("^Click on the linktext details in  Index Related table$")
	public void click_on_the_linktext_details_in_Index_Related_table() throws Throwable {
	    
		Status.clickOnIndexRelatedTable();
	}
	
	@Then("^Parsing Failures page under Viewers modulel is returned$")
	public void parsing_Failures_page_under_Viewers_modulel_is_returned() throws Throwable {
	    
		Status.getParsingFailuresPageUrl();
	}
	
	@Then("^status of all the tests is displayed as pending$")
	public void status_of_all_the_tests_is_displayed_as_pending() throws Throwable {
	    
		Status.getStatusOfAllTheTest();
	}
	
	@When("^Click the blue arrow next to a specific test level$")
	public void click_the_blue_arrow_next_to_a_specific_test_level() throws Throwable {
	    
		Status.clickOnBlueArrow();
	}
	
	@When("^Click the blue arrow next to specific test level$")
	public void click_the_blue_arrow_next_to_specific_test_level() throws Throwable {
	    
		Status.clickOnBlueArrow2();
	}
	
	@When("^User clicks on the Run Tests button$")
	public void user_clicks_on_the_Run_Tests_button() throws Throwable {
	    
		Status.clickOnRunTests();
		Thread.sleep(5000);
	}

	@When("^Click on the link Show All Details$")
	public void click_on_the_link_Show_All_Details() throws Throwable {
	    
		Status.clickOnLinkShowAllDetails();
	}

	@Then("^The detailed information is displayed$")
	public void the_detailed_information_is_displayed() throws Throwable {
	    
		Status.getShowAllDetails();
		
	}
	
	@Then("^All detailed information is displayed$")
	public void all_detailed_information_is_displayed() throws Throwable {
	    
		Status.getAllDetailedInfo();
		
	}
	
	@When("^click on the link Hide all Details$")
	public void click_on_the_link_Hide_all_Details() throws Throwable {
	    
		Status.clickOnLinkHideAllDetails();
	}

	@Then("^Detailed information which was displayed is hidden$")
	public void detailed_information_which_was_displayed_is_hidden() throws Throwable {
	   
		Status.isTestDetailsHidden();
	}
	
	@When("^status is running click Cancel tests$")
	public void status_is_running_click_Cancel_tests() throws Throwable {
	    
		Status.clickOnCancelTests();
	}

	@Then("^status is cancelled for the remaining tests$")
	public void status_is_cancelled_for_the_remaining_tests() throws Throwable {
	    
		Status.getStatusCancelledDetails();
	}
	
	@Then("^user able to see Cancel tests button$")
	public void user_able_to_see_Cancel_tests_button() throws Throwable {
	    Status.isCancelTestsPresent();
	}

	@Then("^status appear after running completed$")
	public void status_appear_after_running_completed() throws Throwable {
	    Status.getStatus();
	}

	@Then("^user able to see Run tests button$")
	public void user_able_to_see_Run_tests_button() throws Throwable {
	    Status.isRunTestsPresent();
	}
	
	@Then("^user clicks on the Cancel Tests button$")
	public void user_clicks_on_the_Cancel_Tests_button() throws Throwable {
		
		Status.clickOnCancelTestsButton();
		Thread.sleep(1500);
	}
	
	@Then("^User Clicks on the Cancel Tests button$")
	public void User_Clicks_on_the_Cancel_Tests_button() throws Throwable {
		
		Status.clickOnCancelTestsButtonForAll();
		Thread.sleep(1500);
	}

	@When("^User clicks on Up a Test Level$")
	public void user_clicks_on_Up_a_Test_Level() throws Throwable {
	    Status.clickOnUpaTestLevel();
	    Thread.sleep(3000);
	}
	
	@When("^clicking the blue arrow which has No tests to run$")
	public void clicking_the_blue_arrow_which_has_No_tests_to_run() throws Throwable {
	    
		Status.ClickOnNotestToRunArrow();
	}

	@Then("^The page displays graphs of Current System Activity$")
	public void the_page_displays_graphs_of_Current_System_Activity() throws Throwable {
	    
		Status.getCurrentSystemActivity();
	}
	
	@When("^Choose (\\d+) for Refresh every drop down menu$")
	public void choose_for_Refresh_every_drop_down_menu(String arg1) throws Throwable {
	    
		Status.selectSeconds(arg1);
	}
	
	
	
}
