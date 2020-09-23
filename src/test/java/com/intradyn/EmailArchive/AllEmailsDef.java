package com.intradyn.EmailArchive;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AllEmails;

public class AllEmailsDef {

	@Then("^User able to see present year displayed under Years section$")
	public void user_able_to_see_present_year_displayed_under_Years_section() throws Throwable {
		Assert.assertTrue(AllEmails.isYearPresent());
	}

	@Then("^User able to see last month is displayed under Month section$")
	public void user_able_to_see_last_month_is_displayed_under_Month_section() throws Throwable {
		Assert.assertTrue(AllEmails.isMonthPresent());
	}

	@Then("^User able to see count of Total emails received and Parsing failures for day$")
	public void user_able_to_see_count_of_Total_emails_received_and_Parsing_failures_for_day() throws Throwable {
		AllEmails.getEmailsCount();
	}

	@When("^User Click on Test Expand and Collapse icon$")
	public void user_Click_on_Test_Expand_and_Collapse_icon() throws Throwable {
		AllEmails.clickOnCollapseIcon();
	}

	@When("^User Click on Test Expand icon$")
	public void user_Click_on_Test_Expand_icon() throws Throwable {
		AllEmails.clickOnExpandIcon();
		Thread.sleep(2000);
	}

	@Then("^All fields are minimised$")
	public void all_fields_are_minimised() throws Throwable {
		Assert.assertTrue(AllEmails.isParsingFailureCollapse());
	}

	@Then("^verify total email results matches with list of emails$")
	public void verify_total_email_results_matches_with_list_of_emails() throws Throwable {
		AllEmails.VerifyEmailsCount();
	}

	@When("^User click on Total Recevied Emails Count in Calender$")
	public void user_click_on_Total_Recevied_Emails_Count_in_Calender() throws Throwable {
		AllEmails.clickOnReceivedEmailsCount();
		Thread.sleep(3000);
	}

	@Then("^User able to see All Emails List under Received Emails$")
	public void user_able_to_see_All_Emails_List_under_Received_Emails() throws Throwable {
		AllEmails.getTotalEmailsCount();
	}

	@When("^User click on Parsing Failures count in calender$")
	public void user_click_on_Parsing_Failures_count_in_calender() throws Throwable {
		AllEmails.clickOnParsingFailuresCount();
		Thread.sleep(3000);
	}

	@Then("^User able to see All Emails List under Parsing Failures$")
	public void user_able_to_see_All_Emails_List_under_Parsing_Failures() throws Throwable {
		AllEmails.getTotalEmailsCount();
	}

	@When("^User click on Parsing Failures count in Parsing$")
	public void user_click_on_Parsing_Failures_count_in_Parsing() throws Throwable {
		AllEmails.clickOnParsingFailuresCount();
		Thread.sleep(3000);
	}

}
