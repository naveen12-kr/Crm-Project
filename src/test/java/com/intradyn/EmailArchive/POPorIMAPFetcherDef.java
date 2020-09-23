package com.intradyn.EmailArchive;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.POPorIMAPFetchers;

public class POPorIMAPFetcherDef {

	@Then("^Enter existing fetcher name to add$")
	public void enter_existing_fetcher_name_to_add() throws Throwable {

		POPorIMAPFetchers.setExistingFetcher();
	}

	@Then("^Message displayed This configuration ID already exists$")
	public void message_displayed_This_configuration_ID_already_exists() throws Throwable {

		POPorIMAPFetchers.getExistingFetcherErrorMsg();
	}

	@Then("^The Port number field is populated$")
	public void the_Port_number_field_is_populated() throws Throwable {

		POPorIMAPFetchers.getPortNumber();
	}

	@Then("^The Mailbox name  field  is populated$")
	public void the_Mailbox_name_field_is_populated() throws Throwable {

		POPorIMAPFetchers.getMailboxName();
	}

	@When("^user clicks on refresh icon$")
	public void user_clicks_on_refresh_icon() throws Throwable {

		POPorIMAPFetchers.clickOnRefreshButton();
	}

	@When("^user clicks on connection icon$")
	public void user_clicks_on_connection_icon() throws Throwable {

		POPorIMAPFetchers.clickOnConnectionIcon();
	}

	@When("^user clicks on pencil icon$")
	public void user_clicks_on_pencil_icon() throws Throwable {

		POPorIMAPFetchers.clickOnPencilIcon();
	}

	@When("^user clicks on delete icon$")
	public void user_clicks_on_delete_icon() throws Throwable {

		POPorIMAPFetchers.clickOnDeleteIcon();
	}

	@When("^user Select Restart the fetcher service$")
	public void user_Select_Restart_the_fetcher_service() throws Throwable {

		POPorIMAPFetchers.selectRestartfetcherservice();
	}

	@When("^user Select Reset the fetcher service$")
	public void user_Select_Reset_the_fetcher_service() throws Throwable {

		POPorIMAPFetchers.selectCompletelyResetFetcher();

	}

	@When("^click on submit button$")
	public void click_on_submit_button() throws Throwable {

		POPorIMAPFetchers.clickOnSubmitButton();
	}

	@When("^Health Checkup Status for the fetcher is pending$")
	public void health_Checkup_Status_for_the_fetcher_is_pending() throws Throwable {

		POPorIMAPFetchers.getConnectionDetails();
	}

	@When("^Click on Run tests button on Health Checkup Page$")
	public void click_on_Run_tests_button_on_Health_Checkup_Page() throws Throwable {

		POPorIMAPFetchers.clickOnRunTests();
		Thread.sleep(3000);
	}

	@When("^Click on a status for a test$")
	public void click_on_a_status_for_a_test() throws Throwable {

		POPorIMAPFetchers.clickOnStatusConnection();
	}

	@Then("^The description of status is displayed for the test$")
	public void the_description_of_status_is_displayed_for_the_test() throws Throwable {

		POPorIMAPFetchers.getStatusConnection();
	}

	@Then("^The description disappears on clicking again$")
	public void the_description_disappears_on_clicking_again() throws Throwable {

		POPorIMAPFetchers.clickOnStatusConnection();
		Assert.assertTrue(POPorIMAPFetchers.isStatusDescPresent());
	}

	@When("^Click on Up a Test Level$")
	public void click_on_Up_a_Test_Level() throws Throwable {

		POPorIMAPFetchers.clickOnUpaTestLevel();
	}

	@Then("^Fetch Health Checkup page is loaded$")
	public void fetch_Health_Checkup_page_is_loaded() throws Throwable {

		POPorIMAPFetchers.getFetchHealthCheckupPage();
	}

	@When("^user Edit the Server Description with \"([^\"]*)\"$")
	public void user_Edit_the_Server_Description_with(String arg1) throws Throwable {

		POPorIMAPFetchers.setServerDescription(arg1);
	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable {

		POPorIMAPFetchers.clickOnsaveButton();
	}
}
