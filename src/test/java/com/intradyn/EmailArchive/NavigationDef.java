package com.intradyn.EmailArchive;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Navigation;

public class NavigationDef {

	@When("^User clicks on \"([^\"]*)\" tab$")
	public void user_clicks_on_tab(String data) throws Throwable {

		Navigation.clickOnEmailViewingLPanel(data);

	}

	@Then("^User able to see header \"([^\"]*)\"$")
	public void user_able_to_see_header(String data) throws Throwable {

		Assert.assertTrue(Navigation.isH3Present(data));

	}

	@Then("^User able to see header Contacts$")
	public void user_able_to_see_header_Contacts() throws Throwable {
		Assert.assertTrue(Navigation.isContactsHeader());
	}

	@Then("^user able to see the \"([^\"]*)\"$")
	public void user_able_to_see_the(String data) throws Throwable {

		Assert.assertTrue(Navigation.isHeaderH1Present(data));
	}

	@When("^user click on \"([^\"]*)\"$")
	public void user_click_on(String usersAndGroups) throws Throwable {

		Navigation.clickOnUserandGroupsLPanel(usersAndGroups);
	}

	@Then("^user should see header \"([^\"]*)\"$")
	public void user_should_see_header(String usersAndGroups) throws Throwable {

		Assert.assertTrue(Navigation.isH3Present(usersAndGroups));
	}

	@Then("^user able to see \"([^\"]*)\"$")
	public void user_able_to_see(String usersAndGroups) throws Throwable {

		Assert.assertTrue(Navigation.isHeaderH1Present(usersAndGroups));
	}

	@When("^user click on the \"([^\"]*)\"$")
	public void user_click_on_the(String status) throws Throwable {

		Navigation.clickOnStatusLPanel(status);
	}

	@Then("^user should able to see header \"([^\"]*)\"$")
	public void user_should_able_to_see_header(String status) throws Throwable {

		Assert.assertTrue(Navigation.isH3Present(status));
	}

	@Then("^user should able to see the \"([^\"]*)\"$")
	public void user_should_able_to_see_the(String status) throws Throwable {

		Assert.assertTrue(Navigation.isHeaderH1Present(status));

	}

	@Then("^user able to see Groups$")
	public void user_able_to_see_Groups() throws Throwable {
		Assert.assertTrue(Navigation.isGroupsHeader());
		Thread.sleep(2000);
	}

	@When("^user clicks \"([^\"]*)\" tab$")
	public void user_clicks_tab(String backup) throws Throwable {
		Navigation.clickOnBackupLPanel(backup);
	}

	@When("^user clicks Backup tab$")
	public void user_clicks_Backup_tab() throws Throwable {
		Navigation.clickOnBackUpTab();
	}

	@Then("^user have to see header \"([^\"]*)\"$")
	public void user_have_to_see_header(String backup) throws Throwable {
		Assert.assertTrue(Navigation.isH3Present(backup));
	}

	@Then("^user have to see the \"([^\"]*)\"$")
	public void user_have_to_see_the(String backup) throws Throwable {
		Assert.assertTrue(Navigation.isHeaderH1Present(backup));
	}

	@When("^User Click On \"([^\"]*)\" tab$")
	public void user_Click_On_tab(String maintenance) throws Throwable {

		Navigation.clickOnMaintenanceLPanel(maintenance);
	}

	@Then("^User able to See header \"([^\"]*)\"$")
	public void user_able_to_See_header(String maintenance) throws Throwable {

		Assert.assertTrue(Navigation.isH3Present(maintenance));
	}

	@Then("^User able to see the \"([^\"]*)\"$")
	public void User_able_to_see_the(String maintenance) throws Throwable {

		Assert.assertTrue(Navigation.isHeaderH1Present(maintenance));
	}

	@When("^user click on \"([^\"]*)\" Tab$")
	public void user_click_on_Tab(String configuration) throws Throwable {
		Navigation.clickOnConfigurationLPanel(configuration);

	}

	@Then("^user ables to see header \"([^\"]*)\"$")
	public void user_ables_to_see_header(String configuration) throws Throwable {
		Assert.assertTrue(Navigation.isH3Present(configuration));

	}

	@Then("^user able to see the header \"([^\"]*)\"$")
	public void user_able_to_see_the_header(String configuration) throws Throwable {
		Assert.assertTrue(Navigation.isHeaderH1Present(configuration));

	}

}
