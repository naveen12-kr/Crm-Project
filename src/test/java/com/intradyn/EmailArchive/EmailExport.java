package com.intradyn.EmailArchive;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.BasePage;
import pages.Exportemail;

public class EmailExport extends BasePage {

	@Then("^User click on \"([^\"]*)\" tab$")
	public void user_click_on(String arg1) throws Throwable {
		Exportemail.clickOnElementId(arg1);
	}

	@Then("^Export pop-up should open$")
	public void export_pop_up_should_open() throws Throwable {
		Assert.assertTrue(Exportemail.isExportPopUpPresent());
	}

	@Then("^User Enter \"([^\"]*)\" in \"([^\"]*)\"$")
	public void user_Enter_zip_file_Name(String name, String data) throws Throwable {
		Exportemail.setTextOnElementId(data, name);
	}

	@And("^User click On Ok button$")
	public void User_click_On_OK_button() {
		Exportemail.clickOnExportOKbutton();
	}

	@Then("^User select \"([^\"]*)\" is \"([^\"]*)\"$")
	public void user_select_is(String id, String data) throws Throwable {
		Exportemail.selectTextFromId(id, data);
	}

}
