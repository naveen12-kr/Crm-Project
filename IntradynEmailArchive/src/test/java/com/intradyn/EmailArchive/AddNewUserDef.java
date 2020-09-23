package com.intradyn.EmailArchive;
import org.junit.Assert;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.SearchEmail;
import pages.UsersAndGroups;

public class AddNewUserDef extends BasePage {
	public static String user;
	@When("^User Clicks on UserAndGroups tab$")
	public void user_Clicks_on_UserAndGroups_tab() throws Throwable {
		
		UsersAndGroups.clickUsersAndGroups();
		waitForPageLoad(3000);
	    
	}
	
	@When("^Enter new user name \"([^\"]*)\"$")
	public void enter_new_user_name(String sText) throws Throwable {
			user=getRandomString(3);
		UsersAndGroups.setAddUserText(sText+"_"+user);  
	}
	
	@When("^Enter existing user name \"([^\"]*)\"$")
	public void enter_existing_user_name(String sText) throws Throwable {
		UsersAndGroups.setExistingUserName();
	}

	@When("^Click on Add User button$")
	public void click_on_Add_User_button() throws Throwable {
		
		UsersAndGroups.clickAddUserButton();
	    
	}

	@Then("^User able to see the User Creation Wizard$")
	public void user_able_to_see_the_User_Creation_Wizard() throws Throwable {
		Assert.assertTrue(UsersAndGroups.isUserPersonalInfoText());
			
	}
	
	@When("^User enter the password \"([^\"]*)\"$")
	public void user_enter_the_password(String sText) throws Throwable {
		
		UsersAndGroups.setPassword(sText);
	    
	}

	@When("^User enters the confirm password \"([^\"]*)\"$")
	public void user_enters_the_confirm_password(String sText) throws Throwable {
		
		UsersAndGroups.setConfirmPassword(sText);
	    
	}

	@When("^User enters full name \"([^\"]*)\"$")
	public void user_enters_full_name(String sText) throws Throwable {
		
		UsersAndGroups.setFullName(sText);
	    
	}

	@When("^User enters phone number \"([^\"]*)\"$")
	public void user_enters_phone_number(String sText) throws Throwable {
	    
		UsersAndGroups.setPhoneNumber(sText);
	}

	@When("^User enters email addresses \"([^\"]*)\"$")
	public void user_enters_email_addresses(String sText) throws Throwable {
		
		UsersAndGroups.setEmailAddresses(sText);
		
	    
	}

	
	@Then("^User able to see the Configuration details$")
	public void user_able_to_see_the_Configuration_details() throws Throwable {
		
		Assert.assertTrue(UsersAndGroups.isConfigureOptionsVerifiedPresent());
		
	}
	
	@When("^User Enters session timeout in minitues \"([^\"]*)\"$")
	public void user_Enters_session_timeout_in_minitues(String sText) throws Throwable {
	    
		UsersAndGroups.setSessionTimeOut(sText);
	}

	@When("^Verify active account checkbox is checked$")
	public void verify_active_account_checkbox_is_checked() throws Throwable {
	   UsersAndGroups.isActiveAccountEnabled();
		
	}

	@When("^selects language fron dropdown \"([^\"]*)\"$")
	public void selects_language_fron_dropdown(String arg1) throws Throwable {
		
		UsersAndGroups.setLanguage();
	    
	}

	@When("^selects the time zone	from dropdown \"([^\"]*)\"$")
	public void selects_the_time_zone_from_dropdown(String arg1) throws Throwable {
		
		UsersAndGroups.clickTimeZone();
	    
	}

	@When("^Clicks on next button$")
	public void clicks_on_next_button() throws Throwable {
		
		UsersAndGroups.clickNextButton();
	    Thread.sleep(4000);
	}

	@Then("^User able to see the Set Group Membership$")
	public void user_able_to_see_the_Set_Group_Membership() throws Throwable {
		Assert.assertTrue(UsersAndGroups.isSetGroupMembershipText());
		    
	}
	
	@When("^User clicks on the groups he present$")
	public void user_clicks_on_the_groups_he_present() throws Throwable {
	   
		UsersAndGroups.clickGroupMembership();
	}
	
	
	@Then("^User able to see the Select Permissions$")
	public void user_able_to_see_the_Select_Permissions() throws Throwable {
		
		UsersAndGroups.isSelectPermissionsText();
		
	}
	
	@When("^Click on end user permissions$")
	public void click_on_end_user_permissions() throws Throwable {
		
		UsersAndGroups.clickEndUserPermissions();
	   
	}
	
	@Then("^User able to see the Set home page details$")
	public void user_able_to_see_the_Set_home_page_details() throws Throwable {
	    
		UsersAndGroups.isSetHomepagedetails();
	}
	
	@When("^Click home page for new user$")
	public void click_home_page_for_new_user() throws Throwable {
	    
		UsersAndGroups.clickUserHomePage();
	}
	
	@Then("^User able to see the Set General Search Rule details$")
	public void user_able_to_see_the_Set_General_Search_Rule_details() throws Throwable {

		UsersAndGroups.isSetGeneralSearchRuleText();
	}
	
	@When("^User selects the Departmental Search Rule$")
	public void user_selects_the_Departmental_Search_Rule() throws Throwable {
		
		UsersAndGroups.SetGeneralSearchRule();
	   
	}

	@When("^Enter the Search Results Limit \"([^\"]*)\"$")
	public void enter_the_Search_Results_Limit(String sText) throws Throwable {
		
		UsersAndGroups.clearSearchResultLimitValue();
		Thread.sleep(3000);
		UsersAndGroups.setSearchResultLimit(sText);
	    
	}
	
	@Then("^User able to see Set allowed search addresses details$")
	public void user_able_to_see_Set_allowed_search_addresses_details() throws Throwable {
	    
		UsersAndGroups.isSetallowedsearchaddressesText();
	}
	
	@When("^User has all search permissions click finish$")
	public void user_has_all_search_permissions_click_finish() throws Throwable {
		
		UsersAndGroups.clickFinish();
	    
	}

	@Then("^The user POP was created successfully$")
	public void the_user_POP_was_created_successfully() throws Throwable {
	    
		UsersAndGroups.getUserFromTable();
	}

	///////////////////////////ADD FETCHER///////////////////////////////////////////////
	@When("^User navigate to Configuration$")
	public void user_navigate_to_Configuration() throws Throwable {
		UsersAndGroups.clickOntext("Configuration");
		sleepApplication(3000);
	   
	}

	@Then("^User see Email Server Page$")
	public void user_Email_Server_Page() throws Throwable {
	   
	}

	@Then("^Outgoing smtp server page should open$")
	public void outgoing_smtp_server_page_should_open() throws Throwable {
	    
	}

	@When("^User click on Save$")
	public void user_click_on_Save() throws Throwable {
	    UsersAndGroups.clickOnSaveButton();
	}

	@Then("^Enter Fetcher name to add fetcher$")
	public void enter_Fetcher_name_to_add_fetcher() throws Throwable {
	   UsersAndGroups.setNewFetcherName("MySampleFetcher"+getRandomString(2));
	   
	}

	@Then("^User clicks on Add Fetcher$")
	public void user_clicks_on_Add_Fetcher() throws Throwable {
		UsersAndGroups.clickOnAddFetcher();
		sleepApplication(3000);
	   
	}

	@Then("^Fetcher Configuration Form should open$")
	public void fetcher_Configuration_Form_should_open() throws Throwable {
	    
	}
	@Then("^Outgoing mail save successfully$")
	public void outgoing_mail_save_successfully() throws Throwable {
		System.out.println("The successfully message is mnot displayed but saved successfully");
	}

	@Then("^Fill all the required infomaton$")
	public void fill_all_the_required_infomaton() throws Throwable {
	   UsersAndGroups.setServerAddress("intradyn.fetcher..com");
	   sleepApplication(1000);
	   UsersAndGroups.setServerDescription("smtp.intrady");
	   sleepApplication(1000);
	   UsersAndGroups.setServerUserName("Sudhakar");
	   UsersAndGroups.setServerpassword("intradyn123");
	   sleepApplication(1000);
	   UsersAndGroups.clickOnchekbox();
	   sleepApplication(1000);
	   
	}
	@Then("^User select \"([^\"]*)\"$")
	public void user_select(String arg1) throws Throwable {
		UsersAndGroups.selectProtocol(arg1);
		sleepApplication(5000);
	}
	@Then("^User click on Create Fetcher$")
	public void user_click_on_Create_Fetcher() throws Throwable {
	   UsersAndGroups.clickOnCreateFetcher();
	   sleepApplication(2000);
	   
	}
	@Then("^Fetcher should created successfully$")
	public void fetcher_should_created_successfully() throws Throwable {
	   Assert.assertTrue(UsersAndGroups.isSuccessmsgPresent());
	}

	@When("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String data) throws Throwable {
		UsersAndGroups.clickOntext(data);
		sleepApplication(2000);
	}

	@When("^User click on Configuration \"([^\"]*)\"$")
	public void user_click_on(String arg1) throws Throwable {
	    UsersAndGroups.clickOnSMTPServer();	
	    sleepApplication(10000);
	}
	@Then("^Start or Stop smtp Server$")
	public void start_or_Stop_smtp_Server() throws Throwable {
	    if(UsersAndGroups.isSmtpServerStatus()) {
	    	UsersAndGroups.clickOnStopServer();
	    	Assert.assertTrue(UsersAndGroups.isServerStopedPresent());
	    }
	    else {
	    	UsersAndGroups.clickOnStartServer();
	    	Assert.assertTrue(UsersAndGroups.isServerRunning());
	    }
	    sleepApplication(3000);
	}
	@When("^User click on Outgoing SMTP$")
	public void user_click_on_Outgoing_SMTP() throws Throwable {
		UsersAndGroups.clickOnOutgoingSmtp();
	   
	}
	@When("^Click on Status icon blue magnifying glass$")
	public void click_on_Status_icon_blue_magnifying_glass() throws Throwable {
		SearchEmail.clickOnStatusIcon();
	}
	@When("^Process details for the SMTP Server on System Status page is displayed$")
	public void Process_details_for_SMTP_Server_on_System_Status_page_displayed() throws Throwable {
		Assert.assertTrue(SearchEmail.isSmtpStatusPresent());
	}
}


