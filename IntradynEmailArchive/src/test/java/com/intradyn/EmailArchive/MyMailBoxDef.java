package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MyMailBox;

public class MyMailBoxDef {
	
	@When("^user clicks on collapse icon of Mailbox$")
	public void user_clicks_on_collapse_icon_of_Mailbox() throws Throwable {
	    
		MyMailBox.clickOnCollapseMailbox();
		Thread.sleep(5000);
	}

	@Then("^Mailbox all fields are disappears$")
	public void mailbox_all_fields_are_disappears() throws Throwable {
	    
		System.out.println("Mailbox all fields are invisible");
	}

	@When("^user clicks on collapse icon of All received and sent$")
	public void user_clicks_on_collapse_icon_of_All_received_and_sent() throws Throwable {
		
		MyMailBox.clickOnCollapseAllReceivedandSent();	    
	}

	@Then("^All received and sent fields are disappears$")
	public void all_received_and_sent_fields_are_disappears() throws Throwable {
	    
		System.out.println("All received and sent fields are invisible");
	}

	@When("^Click on CheckBox All received and sent$")
	public void click_on_CheckBox_All_received_and_sent() throws Throwable {
	    
		MyMailBox.clickOnAllReceivedAndSentCheckbox();
	}

	@When("^Click on dropdown box and select \"([^\"]*)\"$")
	public void click_on_dropdown_box_and_select(String data) throws Throwable {
	 
		MyMailBox.getMailBoxDropdown(data);

	}

	@When("^click on view button$")
	public void click_on_view_button() throws Throwable {
	    
		MyMailBox.clickOnViewButton();
	}

		
	@When("^Click on CheckBox received$")
	public void click_on_CheckBox_received() throws Throwable {
	    
		MyMailBox.clickOnReceivedMailCheckbox();
	}
	

	@Then("^All \"([^\"]*)\" mails displayed and it should be last \"([^\"]*)\"$")
	public void all_mails_displayed_and_it_should_be_last(String arg1, String arg2) throws Throwable {
		
		MyMailBox.isReceivedAndSentMails();
	}

		
	@When("^Click on CheckBox Sent$")
	public void click_on_CheckBox_Sent() throws Throwable {
	    
		MyMailBox.clickOnSentMailCheckbox();
	}
	
	
}
