package com.intradyn.EmailArchive;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.OutgoingSMTP;

public class OutGoingSMTPdef {

	@When("^user enters out going SMTP Server$")
	public void user_enters_out_going_SMTP_Server() throws Throwable {
		OutgoingSMTP.setOutgoingMailServer();
	}

	@When("^user enters mail servfer username$")
	public void user_enters_mail_servfer_username() throws Throwable {
		OutgoingSMTP.setMailServerUserName();
	}

	@When("^user enters mail server username$")
	public void user_enters_mail_server_username() throws Throwable {
		OutgoingSMTP.setMailUserName();
	}

	@When("^user enters mail Server password$")
	public void user_enters_mail_Server_password() throws Throwable {
		OutgoingSMTP.setMailPassword();
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

	@When("^user enters invalid out going SMTP Server$")
	public void user_enters_invalid_out_going_SMTP_Server() throws Throwable {
		OutgoingSMTP.setInvalidOutgoingMailServer();
	}

	@Then("^Disable Outgoing Email button appears$")
	public void disable_Outgoing_Email_button_appears() throws Throwable {
		Assert.assertTrue(OutgoingSMTP.isDisableOutgoingMailsButtonPresent());
	}

	@When("^clear the field of out going SMTP Server$")
	public void clear_the_field_of_out_going_SMTP_Server() throws Throwable {
		OutgoingSMTP.setOutgoingMailServerAsClear();
	}

	@When("^clear the field of from address$")
	public void clear_the_field_of_from_address() throws Throwable {
		OutgoingSMTP.setFromAddressAsClear();
	}

	@When("^user enters invalid from address$")
	public void user_enters_invalid_from_address() throws Throwable {
		OutgoingSMTP.setInvalidFromAddress();
	}

	@Then("^the entered data is not saved and the fields are cleared$")
	public void the_entered_data_is_not_saved_and_the_fields_are_cleared() throws Throwable {
		OutgoingSMTP.isTheFieldsAreCleared();
	}

}
