package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AccessControl;

public class AccessControlDef {

	@Then("^click on the \"([^\"]*)\" button$")
	public void click_on_the_button(String data) throws Throwable {

		AccessControl.clickOnreateRuleButton(data);
		Thread.sleep(5000);
	}

	@When("^Enter valid user name in Name text field$")
	public void enter_valid_user_name_in_Name_text_field() throws Throwable {

		AccessControl.getUserFromList();
	}

	@When("^Enter valid user name in Name text field1$")
	public void enter_valid_user_name_in_Name_text_field1() throws Throwable {

		AccessControl.getUserFromList1();
	}

	@When("^User select \"([^\"]*)\" from the drop down \"([^\"]*)\"$")
	public void user_select_from_the_drop_down(String data, int sText) throws Throwable {
		AccessControl.selectTags(data, sText);
	}

	@Then("^user enters email address$")
	public void user_enters_email_address() throws Throwable {
		AccessControl.setEmail();
	}

	@Then("^user enters invalid user$")
	public void user_enters_invalid_user() throws Throwable {
		AccessControl.setInvalidUser();
	}

	@When("^user click on Look Up link \"([^\"]*)\"$")
	public void user_click_on_Look_Up_link(String data) throws Throwable {
		AccessControl.ClickOnLookUp(data);
	}

	@Then("^Selected emails should be added into Users text field$")
	public void selected_emails_should_be_added_into_Users_text_field() throws Throwable {
		AccessControl.Verify();
	}

	@Then("^User click On OK button$")
	public void user_click_On_OK_button() throws Throwable {
		AccessControl.ClickOnOk();
	}

	@Then("^user click on \"([^\"]*)\" icon$")
	public void user_click_on_icon(String data) throws Throwable {
		AccessControl.ClickOnIcon(data);
	}

	@Then("^User select multiple \"([^\"]*)\" from the drop down \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_select_multiple_from_the_drop_down_and(String data, int sText, int Data) throws Throwable {
		AccessControl.selectMultipleTags(data, sText, Data);
	}

	@Then("^User clicks on Check box$")
	public void user_clicks_on_Check_box() throws Throwable {
		AccessControl.ClickOnCheckBox();
	}

	@Then("^user click on Delete icon$")
	public void user_click_on_Delete_icon() throws Throwable {
		AccessControl.ClickOnDeleteIcon();
	}

}
