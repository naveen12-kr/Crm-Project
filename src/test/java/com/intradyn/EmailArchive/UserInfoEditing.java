package com.intradyn.EmailArchive;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.SearchEmail;
import pages.UsersAndGroups;

public class UserInfoEditing extends BasePage {

	@When("^clicks on edit button$")
	public void clicks_on_edit_button() throws Throwable {
		UsersAndGroups.clickOnEditIcon();

	}

	@Then("^User able to see personnal details$")
	public void user_able_to_see_personnal_details() throws Throwable {
		Assert.assertTrue(UsersAndGroups.isPersonalInfoPresent());

	}

	@Then("^User changes his password \"([^\"]*)\"$")
	public void user_changes_his_password(String pswd) throws Throwable {
		UsersAndGroups.setChangePassword(pswd);

	}

	@Then("^User changes his confirm password \"([^\"]*)\"$")
	public void user_changes_his_confirm_password(String cnfrmPswd) throws Throwable {
		UsersAndGroups.setConfirmPassWord(cnfrmPswd);
	}

	@Then("^User changes his full name \"([^\"]*)\"$")
	public void user_changes_his_full_name(String fullName) throws Throwable {
		UsersAndGroups.setFullName(fullName);

	}

	@Then("^User changes his phone number \"([^\"]*)\"$")
	public void user_changes_his_phone_number(String phoneNo) throws Throwable {
		UsersAndGroups.setPhoneNumber(phoneNo);

	}

	@Then("^User changes his email addresses \"([^\"]*)\"$")
	public void user_changes_his_email_addresses(String email) throws Throwable {
		UsersAndGroups.setEmailAddresses(email);

	}

	@Then("^Clicks on save button$")
	public void clicks_on_save_button() throws Throwable {

	}

	@Then("^message \"([^\"]*)\" is displayed$")
	public void message_is_displayed(String arg1) throws Throwable {

	}

	@When("^User click on search$")
	public void user_click_on_search() throws Throwable {
		SearchEmail.clickOnSearchButton();
		sleepApplication(10000);
	}

	@Then("^Total mail count should show$")
	public void total_mail_count_should_show() throws Throwable {
		SearchEmail.getEmailTotalCount();
	}

	@When("^User select search by \"([^\"]*)\" date$")
	public void user_select_search_by_date(String arg) throws Throwable {
		SearchEmail.selectSearchEmailBy(arg);
		sleepApplication(2000);
	}

	@When("^Date field is default$")
	public void date_field_is_default() throws Throwable {
		WebElement ele = driver.findElement(findBy("//*[@name='email_date']/input"));
		String data1 = driver.findElement(By.xpath("//*[@id='current-time']")).getText();
		System.out.println(data1);
		String data2[] = data1.split(" ");
		System.out.println(data2[0]);
		System.out.println(ele.getAttribute("value"));
		Assert.assertEquals(ele.getAttribute("value"), data2[0]);
		sleepApplication(2000);
	}

	@When("^User click on All Email$")
	public void user_click_on_All_Email() throws Throwable {
		SearchEmail.clickOnAllEmail();

	}

	@Then("^Total email per day calender should show$")
	public void total_email_per_day_calender_should_show() throws Throwable {
		Assert.assertTrue(SearchEmail.isTotalUserCalenderPresent());

	}

	@When("^User select mail to any date$")
	public void user_select_mail_to_any_date() throws Throwable {
		SearchEmail.clickOnDatetoEmail();

	}

	@Then("^All email list should be shown$")
	public void all_email_list_should_be_shown() throws Throwable {

	}

	@When("^User open any mail$")
	public void user_open_any_mail() throws Throwable {
		SearchEmail.clickOnEmail();
		sleepApplication(10000);
		SearchEmail.getEmailFrom();
	}

	@When("^User open any mail to$")
	public void user_open_any_mailTO() throws Throwable {
		SearchEmail.clickOnEmail();
		sleepApplication(2000);
		SearchEmail.getEmailto();
	}

	@When("^user selects from Add Search Term \"([^\"]*)\"\\.$")
	public void user_selects_from_Add_Search_Term(String data) throws Throwable {
		SearchEmail.clickOnAddSearchButton();
		SearchEmail.selectAddSearchquery(data);
	}

	@Then("^Click on Delete option shown with the cross icon\\.$")
	public void click_on_Delete_option_shown_with_the_cross_icon() throws Throwable {
		SearchEmail.clickOnCrossButton();
	}

	@Then("^Email content should be shown$")
	public void email_content_should_be_shown() throws Throwable {

	}

	@Then("^user able to see that search term fields with cross icon$")
	public void user_able_to_see_that_search_term_fields_with_cross_icon() throws Throwable {
		SearchEmail.isFieldsWithCrossIconDisplayed();
	}

	@When("^User click on searchs$")
	public void user_click_on_searchs() throws Throwable {
		SearchEmail.clickonSearchTab();
	}

	@Then("^User enter email to search$")
	public void user_enter_email_to_search() throws Throwable {
		SearchEmail.setemailFrom();
		sleepApplication(4000);
	}

	@Then("^User select \"([^\"]*)\" Email from$")
	public void user_select_Email_from(String arg1) throws Throwable {
		SearchEmail.selectsendfromtype(arg1);
		sleepApplication(2000);
	}

	@Then("^User select Email to \"([^\"]*)\"$")
	public void user_select_Email_to(String arg1) throws Throwable {
		SearchEmail.setEmailTo();
	}

	@Then("^User get the contents of email$")
	public void user_get_the_contents_of_email() throws Throwable {
		SearchEmail.getemailTextContents();
	}

	@Then("^Save and search PopUp should open$")
	public void save_and_search_PopUp_should_open() throws Throwable {
		SearchEmail.isSavedSearchesPopUpDisplayed();
	}

	@When("^User Enter Name and Description$")
	public void user_Enter_Name_and_Description() throws Throwable {
		SearchEmail.setcriteriaName("TEST" + getRandomString(3));
		SearchEmail.setcriteriaDescription("Test Description");
	}

	@Then("^User click on \"([^\"]*)\" button$")
	public void user_click_on_button(String arg1) throws Throwable {
		SearchEmail.clickOnButton(arg1);
	}

	@Then("^Successfull save search message should shown$")
	public void successfull_save_search_message_should_shown() throws Throwable {
		Assert.assertTrue(UsersAndGroups.isSuccessmsgPresent());
	}

	@When("^User click on Collapse icon of \"([^\"]*)\"$")
	public void user_click_on_Collapse_icon_of_query_terms(String text) throws Throwable {
		UsersAndGroups.clickOntext(text);
		sleepApplication(1000);
	}

	@Then("^Search field minimised$")
	public void search_field_minimised() throws Throwable {
		Assert.assertFalse(SearchEmail.isExpanSearchPresent());

	}

	@Then("^\"([^\"]*)\" filter is display$")
	public void filter_is_display(String text) throws Throwable {
		Assert.assertTrue(SearchEmail.isSearchtermTextPresent(text));

	}

	@Then("^\"([^\"]*)\" is displayed with the icon$")
	public void is_displayed_with_the_icon(String text) throws Throwable {
		Assert.assertTrue(SearchEmail.isSearchtermTextPresent(text));

	}

	@Then("^\"([^\"]*)\" button is displayed$")
	public void button_is_displayed(String arg1) throws Throwable {
		Assert.assertTrue(SearchEmail.isExpanSearchPresent());

	}

	@Then("^Mail box is displayed$")
	public void mail_box_is_displayed() throws Throwable {

	}

	@When("^User select \"([^\"]*)\" from the second drop down$")
	public void user_select_from_the_second_drop_down(String arg1) throws Throwable {
		SearchEmail.selectSecondDropdown(arg1);
	}

	@Then("^Email FromTo is displayed under Query Terms filter list$")
	public void email_FromTo_is_displayed_under_Query_Terms_filter_list() throws Throwable {

		SearchEmail.isEmailfromPresent();

	}

	@Then("^\"([^\"]*)\" is displayed by default under Email FromTo$")
	public void is_displayed_by_default_under_Email_FromTo(String arg1) throws Throwable {

		SearchEmail.getDropdownDefaultValue(arg1);
	}

	@Then("^Delete option shown with the cross icon is displayed for Email FromTo$")
	public void delete_option_shown_with_the_cross_icon_is_displayed_for_Email_from_to() throws Throwable {
		SearchEmail.isDeleteEmailFromToPresent();
	}

	@Then("^look up option magnigine icon is displayed$")
	public void look_up_option_magnigine_icon_is_displayed() throws Throwable {

		SearchEmail.isMagnigineIconforEmailFromToPresent();
	}

	@Then("^Empty Mail box is displayed$")
	public void empty_Mail_box_is_displayed() throws Throwable {

	}

	@When("^User select \"([^\"]*)\" from the second drop down \"([^\"]*)\"$")
	public void user_select_from_the_second_drop_down(String data, String sText) throws Throwable {
		SearchEmail.selectQueryTerms(data, sText);
	}

	@When("^User select \"([^\"]*)\" from the second drop down1 \"([^\"]*)\"$")
	public void user_select_from_the_second_drop_down1(String data, String sText) throws Throwable {
		SearchEmail.selectQueryTerm1(data, sText);
	}
	
	
	@When("^User select \"([^\"]*)\" from the second drop down3 \"([^\"]*)\"$")
	public void user_select_from_the_second_drop_down3(String data, String sText) throws Throwable {
		SearchEmail.selectQueryTerm3(data, sText);
		Thread.sleep(500);
	}
	@When("^User select \"([^\"]*)\" from the second drop down2 \"([^\"]*)\"$")
	public void user_select_from_the_second_drop_down2(String data, int sText) throws Throwable {
		SearchEmail.selectQueryTerms2(data, sText);
	}

	@When("^Enter the Data \"([^\"]*)\" for Search \"([^\"]*)\"$")
	public void enter_the_Data_for_Search(String data, String sText) throws Throwable {
		SearchEmail.getQueryTerms(data, sText);
	}

	@When("^User eters SSN Subject in Match partial Social Security Number$")
	public void user_eters_SSN_Subject_in_Match_partial_Social_Security_Number() throws Throwable {
		SearchEmail.getSSNData();
	}

	@Then("^User able to see header Recent Searches$")
	public void user_able_to_see_header_Recent_Searches() throws Throwable {
		SearchEmail.isRecentSearchesPresent();
	}

	@Then("^Mail list is displayed according to the recent search term$")
	public void mail_list_is_displayed_according_to_the_recent_search_term() throws Throwable {
		SearchEmail.isMailListDisplayedAccordingly();
	}

	@Then("^Load Search fields should be displayed$")
	public void load_Search_fields_should_be_displayed(DataTable arg1) throws Throwable {
		SearchEmail.isLoadSearchFieldsDisplayed();

	}

	@When("^Delete option shown with the cross icon is displayed$")
	public void delete_option_shown_with_the_cross_icon_is_displayed() throws Throwable {
		SearchEmail.isDeleteOptionDisplayed();
	}

	@Then("^Empty Mail box for email text is displayed$")
	public void empty_Mail_box_is_for_email_text_displayed() throws Throwable {
		SearchEmail.isEmptyMailBoxDisplayed();
	}

	@Then("^click on Query terms$")
	public void click_on_Query_terms() throws Throwable {

		SearchEmail.clickOnQueryTerms();
	}

	@Then("^user able to get calender for date$")
	public void user_able_to_get_calender_for_date() throws Throwable {
		SearchEmail.isCalenderDisplayed();
	}

	@Then("^user able to all the required fields of saved Searches$")
	public void user_able_to_all_the_required_fields_of_saved_Searches() throws Throwable {
		SearchEmail.isFieldsOfSavedSearchesDisplayed();
	}

	@When("^user clicks on Clear Fields icon$")
	public void user_clicks_on_Clear_Fields_icon() throws Throwable {
		SearchEmail.clickOnClearFieldsButton();
	}

	@Then("^all the fields are cleared$")
	public void all_the_fields_are_cleared() throws Throwable {
		SearchEmail.isFieldsAreClearedDisplayed();
	}

	@When("^when clicks on cross icon of email from/to$")
	public void when_clicks_on_cross_icon_of_email_from_to() throws Throwable {
		SearchEmail.clickOnCrossIcon();
	}

	@Then("^email from/to is deleted$")
	public void email_from_to_is_deleted() throws Throwable {
		SearchEmail.isOptionDeleted();
	}

	@Then("^user able to see all the required fields of Email From$")
	public void user_able_to_see_all_the_required_fields_of_Email_From() throws Throwable {
		SearchEmail.isAllFieldsDisplayed();
	}

	/////
	@When("^User select \"([^\"]*)\" from the Email from drop down$")
	public void user_select_from_the_Email_from_drop_down(String data, DataTable table) throws Throwable {
		String[] arr = { "Adam", "Adrian", "Arthur", "Amy", "Armand", "Bert", "Bob", "Brian", "Beatrice", "Curt",
				"Cosmo", "Cathy" };

		List<List<String>> dataT = table.raw();
		for (int j = 0; j < dataT.size(); j++) {
			SearchEmail.selectQueryTerms(data, dataT.get(j).get(0));
			for (int i = 0; i < arr.length; i++) {
				if (data.contains("op_email_fromuuid")) {
					SearchEmail.getQueryTerms("email_from", arr[i]);
				} else if (data.contains("op_email_textuuid")) {
					SearchEmail.getQueryTerms("email_text", arr[i]);
				} else if (data.contains("op_email_touuid")) {
					SearchEmail.getQueryTerms("email_to", arr[i]);
				} else if (data.contains("op_email_bodyuuid")) {
					SearchEmail.getQueryTerms("email_body", arr[i]);
				}
				sleepApplication(5000);
				SearchEmail.clickOnSearchButton();
				sleepApplication(8000);
				// UsersAndGroups.clickOntext("Query Terms");
				driver.findElement(findBy("//*[contains(text(),'Query Terms')]")).click();
				sleepApplication(3000);
			}
		}

	}

	@When("^User click on Collapse icons of \"([^\"]*)\"$")
	public void user_click_on_Collapse_icons_of_query_terms(String text, DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int j = 0; j < data.size(); j++) {
			SearchEmail.selectSearchEmailBy(data.get(j).get(0));
			sleepApplication(2000);
			SearchEmail.clickOnSearchButton();
			sleepApplication(18000);
			UsersAndGroups.clickOntext(text);
			sleepApplication(2000);
		}
		for (int i = 1; i < 7; i++) {
			js.executeScript("window.scrollBy(0,200)");
			SearchEmail.selectSecondDropdowns(i);
			sleepApplication(2000);
			SearchEmail.clickOnSearchButton();
			sleepApplication(10000);
			// UsersAndGroups.clickOntext(text);
			driver.findElement(findBy("//*[contains(text(),'Query Terms')]")).click();
			sleepApplication(1000);
		}
	}

	@When("^User click on Add Search Term$")
	public void user_click_on_Add_Search_Term() throws Throwable {
		SearchEmail.clickOnAddSearchTerm();
		sleepApplication(3000);
	}

	@When("^User select \"([^\"]*)\" field$")
	public void user_select_Email_Search_field(String sText) {
		SearchEmail.selectSearchTerm(sText);
		sleepApplication(7000);
	}
	@And("^User select the server of exchange server$")
	public void user_select_the_server_of_exchange_server() throws Throwable{
		
		SearchEmail.userSelectTheServerOfExchangeServer();
		Thread.sleep(3000);
	}
}
