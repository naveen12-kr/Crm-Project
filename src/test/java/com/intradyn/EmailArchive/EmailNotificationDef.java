package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.EmailNotification;

public class EmailNotificationDef {

	@When("^Enter a valid email address in \"([^\"]*)\" field$")
	public void enter_a_valid_email_address_in_field(String sText) throws Throwable {

		EmailNotification.setRecipientAddress(sText);
	}

	@When("^Click on Add Address button$")
	public void click_on_Add_Address_button() throws Throwable {

		EmailNotification.clickOnAddAddressButton();
	}

	@When("^user clicks on respective \"([^\"]*)\"  test address icon$")
	public void user_clicks_on_respective_test_address_icon(String data) throws Throwable {
		EmailNotification.clickOnRespectiveTestAddressIcon(data);
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {

		EmailNotification.getMsgText();
	}

	@Then("^Added email addresses and the carrier information is displayed under Email Notification$")
	public void added_email_addresses_and_the_carrier_information_is_displayed_under_Email_Notification()
			throws Throwable {

		EmailNotification.addedEmailAddress();
	}

	@When("^Enter a valid phone number in \"([^\"]*)\" field$")
	public void enter_a_valid_phone_number_in_field(String sText) throws Throwable {

		EmailNotification.setPhoneNumRecipientAddress(sText);
	}

	@When("^Select \"([^\"]*)\" from the dropdown menu on Carrier field$")
	public void select_from_the_dropdown_menu_on_Carrier_field(String arg1) throws Throwable {

		EmailNotification.selectCarrier(arg1);
		System.out.println(arg1 + " is selected");
	}

	@Then("^Not valid email address is displayed$")
	public void not_valid_email_address_is_displayed() throws Throwable {

		EmailNotification.getNotValidEmailMsg();
	}

	@When("^Click on Delete Address X icon against the phone number to be deleted$")
	public void click_on_Delete_Address_X_icon_against_the_phone_number_to_be_deleted() throws Throwable {

		EmailNotification.deletePhoneNumber();
	}

	@When("^click on Test All$")
	public void click_on_Test_All() throws Throwable {

		EmailNotification.clickOnTestAll();
	}

	@Then("^Message displays as This configuration ID already exists$")
	public void message_displays_as_This_configuration_ID_already_exists() throws Throwable {

		EmailNotification.getErrorMsg();
	}

	@Then("^The entered email address is not saved on Email Notifications page$")
	public void the_entered_email_address_is_not_saved_on_Email_Notifications_page() throws Throwable {
		EmailNotification.isEmailFieldCleared();
	}

	@When("^user click on the Linktext Outgoing SMTP$")
	public void user_click_on_the_Linktext_Outgoing_SMTP() throws Throwable {
		EmailNotification.clickOnOutGoingSMTPLink();
	}

	@When("^No email address is added under Email Notification$")
	public void no_email_address_is_added_under_Email_Notification() throws Throwable {
		EmailNotification.isNoEmailAddressAdded();
	}

}
