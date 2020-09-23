package com.intradyn.EmailArchive;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.SearchEmail;
import pages.UsersAndGroups;

public class AccessEmailContent extends BasePage {
	@When("^Select Taged Emails$")
	public void select_Taged_Emails() throws Throwable {

		SearchEmail.clickOnEmailtoSelect();
		sleepApplication(6000);
		SearchEmail.clickOnRemoveTag();
		sleepApplication(2000);

	}
	@When("^User enter social security number$")
	public void user_enter_social_security_number() throws Throwable {
	    
	}

	@Then("^User select \"([^\"]*)\" from SSN$")
	public void user_select_from_SSN(String arg1) throws Throwable {
	   
	}

	@When("^Select first Email$")
	public void select_first_Email() throws Throwable {

		SearchEmail.clickOnFirstemail();
	}

	@Then("^\"([^\"]*)\" popup is displayed$")
	public void remove_Tag_popup_is_displayed(String text) throws Throwable {

		Assert.assertTrue(SearchEmail.isSearchtermTextPresent(text));
	}

	@When("^Select Tag$")
	public void select_Tag() throws Throwable {
		SearchEmail.clickOnSelectTag();
		sleepApplication(1000);
	}

	@When("^Click on OK button$")
	public void click_on_OK_button() throws Throwable {
		SearchEmail.clickOnOKbutton();
		sleepApplication(1000);
	}

	@Then("^Successfully Tag Romove message is display$")
	public void successfully_Tag_Romove_message_is_display() throws Throwable {
		waitToLoadPage(UsersAndGroups.bysuccessmsg, "Success Message");
		Assert.assertTrue(UsersAndGroups.isSuccessmsgPresent());

	}

	@Then("^Select any number of Emails$")
	public void select_any_number_of_Emails() throws Throwable {
		SearchEmail.clickOnEmailtoSelect();
		sleepApplication(2000);
	}

	@Then("^Click on Label option$")
	public void click_on_Label_option() throws Throwable {
		SearchEmail.hoverOnLabel();
		sleepApplication(1000);
		UsersAndGroups.clickOntext("Remove Label");
	}

	@Then("^\"([^\"]*)\" Filter will be minimized$")
	public void filter_will_be_minimized(String arg1) throws Throwable {
		Assert.assertFalse(SearchEmail.isExpanSearchPresent());

	}

	@Then("^User click on Label Option$")
	public void user_click_on_Label_Option() throws Throwable {
		SearchEmail.clickOnLabelOption();
	}

	@Then("^Click On Label$")
	public void click_on_Label() throws Throwable {
		SearchEmail.clickOnLabel();
	}

	@Then("^Successfully Label Romove message is display$")
	public void successfully_Label_Romove_message_is_display() throws Throwable {
		Assert.assertTrue(UsersAndGroups.isSuccessmsgPresent());

	}
}
