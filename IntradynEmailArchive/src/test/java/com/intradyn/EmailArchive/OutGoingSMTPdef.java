package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.OutgoingSMTP;

public class OutGoingSMTPdef {
	
	@When("^user enters out going SMTP Server$")
	public void user_enters_out_going_SMTP_Server() throws Throwable {
	    OutgoingSMTP.setOutgoingMailServer();
	}
	
	@When("^user enters unauthenticated out going SMTP Server$")
	public void user_enters_unauthenticated_out_going_SMTP_Server() throws Throwable {
	    OutgoingSMTP.setunauthenticatedOutgoingMailServer();
	}

	@When("^user enters mail servfer username$")
	public void user_enters_mail_servfer_username() throws Throwable {
	   OutgoingSMTP.setMailServerUserName();
	}

	@When("^user enters mail server password$")
	public void user_enters_mail_server_password() throws Throwable {
	  OutgoingSMTP.setMailServerPassword();
	}

	@When("^user enters from address$")
	public void user_enters_from_address() throws Throwable {
	    OutgoingSMTP.setFromAddress();
	}

	@Then("^User click on Disable Outgoing Email$")
	public void user_click_on_Disable_Outgoing_Email() throws Throwable {
	    OutgoingSMTP.clickOnDisableOutgoingMailsButton();
	}
	
	@When("^user leaves the mandatory fields$")
	public void user_leaves_the_mandatory_fields() throws Throwable {
	    
		OutgoingSMTP.clearMandatoryfields();
	}
	
	@Then("^user clicks the Test All button$")
	public void user_clicks_the_Test_All_button() throws Throwable {
	    
		OutgoingSMTP.clickTestAll();
	}


	
	
}
