package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.MyLabels;
import pages.SearchEmail;

public class MyLabelsDef extends BasePage {

	@Then("^Click on the \"([^\"]*)\" of My Labels$")
	public void click_on_the_of_My_Labels(String arg1) throws Throwable {
		MyLabels.clickOnMgLabelEmailsCount();
	}

	@When("^Enter the valid label name \"([^\"]*)\"$")
	public void enter_the_valid_label_name(String newName) throws Throwable {

		MyLabels.setAddNewLabelText(newName);
	}

	@When("^click on Add label$")
	public void click_on_Add_label() throws Throwable {

		MyLabels.clickOnAddLabelButton();
	}

	@Then("^The label name is added to the Current Labels table$")
	public void the_label_name_is_added_to_the_Current_Labels_table() throws Throwable {

		MyLabels.getAddedLabelName();
	}

	@When("^Enter the existing label name in the field$")
	public void enter_the_existing_label_name_in_the_field() throws Throwable {

		MyLabels.setExistingLabelName();
	}

	@Then("^Click on red delete icon against the Label to be deleted$")
	public void click_on_red_delete_icon_against_the_Label_to_be_deleted() throws Throwable {

		MyLabels.deleteAddedLabelName();
	}

	@Then("^The number of emails listed matches the superscript on the View Labeled Emails$")
	public void the_number_of_emails_listed_matches_the_superscript_on_the_View_Labeled_Emails() throws Throwable {

		MyLabels.getCountOnMG();
	}

	@When("^Click on the \"([^\"]*)\" of Labels$")
	public void click_on_the_of_Labels(String arg1) throws Throwable {

	}

	@Then("^user able to see the print button$")
	public void user_able_to_see_the_print_button() throws Throwable {

	}

	@Then("^user able to see the emails are sorted in \"([^\"]*)\"$")
	public void user_able_to_see_the_emails_are_sorted_in(String data) throws Throwable {
		MyLabels.getEmailsOrder(data);
	}

	@Then("^User able to see the email addresses are Sorted by in \"([^\"]*)\" order \"([^\"]*)\"$")
	public void user_able_to_see_the_email_addresses_are_Sorted_by_in_order(String data, String sText)
			throws Throwable {
		MyLabels.getEmailsOrder(data, sText);
	}

	@Then("^User able to see the email addresses are sorted by in \"([^\"]*)\" order \"([^\"]*)\"$")
	public void user_able_to_see_the_email_addresses_are_sorted_by_in_order(String data, String sText)
			throws Throwable {
		MyLabels.getEmailsfromOrder(data, sText);
	}

	@Then("^Select any label present$")
	public void select_any_label_present() throws Throwable {
		MyLabels.selectLabel();
	}

	@Then("^Email content should be displayed in (\\d+) sections$")
	public void email_content_should_be_displayed_in_sections(int arg1) throws Throwable {
		MyLabels.isEmailContains3Parts();
	}

	@Then("^Click On Tag$")
	public void click_On_Tag() throws Throwable {
		SearchEmail.clickOnTag();
	}

	@Then("^Select any legalhold present$")
	public void select_any_legalhold_present() throws Throwable {
		MyLabels.selectLegalHold();
	}

}
