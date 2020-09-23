package com.intradyn.EmailArchive;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.Configuration;
import pages.SearchEmail;
import pages.UsersAndGroups;

public class ConfigurationDef extends BasePage {

	public static String newTag;
	public static String newDesc;
	public static String newTag1;
	public static String newActivityName;

	/*
	 * @When("^user navigate to Configuration$") public void
	 * user_navigate_to_Configuration() throws Throwable {
	 * 
	 * Configuration.clickOnConfiguration(); }
	 */
	@When("^user navigate to \"([^\"]*)\"$")
	public void user_navigate_to_link_tab(String arg) throws Throwable {

		Configuration.clicksOnLinkTab(arg);
	}

	@When("^user enters the valid tag name \"([^\"]*)\"$")
	public void user_enters_the_valid_tag_name(String newName) throws Throwable {

		newTag = getRandomString(4);
		newTag1 = Configuration.setAddNewTagText(newName + "" + newTag);
	}

	@When("^user click on Add Tag$")
	public void user_click_on_Add_Tag() throws Throwable {

		Configuration.clickOnAddTagsButton();
	}

	@When("^enter a valid \"([^\"]*)\"$")
	public void enter_a_valid(String text) throws Throwable {

		newDesc = getRandomString(10);
		Configuration.setDescription(text + "" + newDesc);

	}

	@Then("^The message is displayed added tag successfully$")
	public void the_message_is_displayed_added_tag_successfully() throws Throwable {

		Assert.assertTrue(Configuration.isTagAddSuccesfully());

	}

	@When("^user click on Create Tag$")
	public void user_click_on_Create_Tag() throws Throwable {

		Configuration.clickOnCreateTagButton();
	}

	@When("^Select the check box Legal Hold$")
	public void select_the_check_box_Legal_Hold() throws Throwable {

		Configuration.clickOnLegalHoldCheckBox();

	}

	@Then("^The message \"([^\"]*)\" is displayed\\.$")
	public void the_message_is_displayed(String arg1) throws Throwable {

		Assert.assertTrue(Configuration.isEmptyTag());

	}

	@When("^User leaves the description as empty$")
	public void user_leaves_the_description_as_empty() throws Throwable {

		Assert.assertTrue(Configuration.isDescriptionFieldEmpty());
	}

	@When("^Click on the \"([^\"]*)\"$")
	public void click_on_the(String arg1) throws Throwable {

		Configuration.clickOnMgToViewEmailsCount();
	}

	@When("^Click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {

		Configuration.clickOnMgNoEmailsUnderTag();
	}

	@When("^Click on the \"([^\"]*)\" to view emails$")
	public void click_on_the_to_view_emails(String arg1) throws Throwable {
		Configuration.clickOnMgToViewEmails();
	}

	// *********************Edit Tag
	// ************************************************

	@When("^click on the pencil icon and edit description$")
	public void click_on_the_icon() throws Throwable {

		Configuration.clickOnPencilAndEditDesc();
		System.out.println("User edited tags description successfully");

	}

	/*
	 * @When("^a valid Legal Hold is created$") public void
	 * a_valid_Legal_Hold_is_created() throws Throwable {
	 * 
	 * Configuration.getValidLeagalHold(); }
	 */

	@When("^a valid Legal Hold is created$")
	public void a_valid_Legal_Hold_is_created() throws Throwable {

		Configuration.getValidLeagalHold();
	}

	@When("^click on the pencil icon$")
	public void click_on_the_pencil_icon() throws Throwable {
		Configuration.clickOnPencilIcon();
	}

	@When("^click on the pencil icon for legal hold true$")
	public void click_on_the_pencil_icon_for_legal_hold_true() throws Throwable {
		Configuration.clickOnPencilIcon();
	}

	@Then("^All the input fields are disabled$")
	public void all_the_input_fields_are_disabled() throws Throwable {

		Assert.assertFalse(Configuration.isDescDisabled());
		System.out.println("INFO: Description field is disabled");

	}

	@When("^Enter an existing/deleted tag name$")
	public void enter_an_existing_deleted_tag_name() throws Throwable {

		Configuration.setExistingTagName();
	}

	@When("^Enter an existing/deleted tag name in upper case$")
	public void enter_an_existing_deleted_tag_name_in_upper_case() throws Throwable {

		Configuration.setExistingTagNameAsUpperCase();
	}

	@When("^click on the pencil icon and Legal holds$")
	public void click_on_the_pencil_icon_and_Legal_holds() throws Throwable {
		Configuration.clickOnPencil();

	}

	@When("^user click on Save Changes$")
	public void user_click_on_Save_Changes() throws Throwable {

	}

	@Then("^The message edited successfully is displayed$")
	public void the_message_edited_successfully_is_displayed() throws Throwable {

	}

	@Then("^The selected legal hold is displayed$")
	public void the_selected_legal_hold_is_displayed() throws Throwable {
		Assert.assertTrue(Configuration.getLegalHoldDetails());
	}

	@Then("^On clicking OK Legal Holds page is returned$")
	public void on_clicking_OK_Legal_Holds_page_is_returned() throws Throwable {

	}

	@When("^user clicks on the Legal holds checkbox and clicks on save$")
	public void user_clicks_on_the_Legal_holds_checkbox_and_clicks_on_save() throws Throwable {

		Configuration.clickOnLegalHoldCheckBox();

		Thread.sleep(1000);

		Configuration.clickOnSaveChanges();

	}

	@Then("^Legal Holds page is returned$")
	public void legal_Holds_page_is_returned() throws Throwable {
		sleepApplication(1000);
		Assert.assertTrue(UsersAndGroups.isSuccessmsgPresent());
	}

	@Then("^New tag Configuration page is open$")
	public void new_tag_Configuration_page_is_open() throws Throwable {
		Configuration.isNewTagConfigurationPageOpened();
	}

	@When("^edit the \"([^\"]*)\"$")
	public void edit_the(String description) throws Throwable {

	}

	@When("^user click on Save$")
	public void user_click_on_Save() throws Throwable {

	}

	@Then("^No emails are displayed$")
	public void no_emails_are_displayed() throws Throwable {

	}

	@When("^a valid tag is created and emails are tagged under that tag$")
	public void a_valid_tag_is_created_and_emails_are_tagged_under_that_tag() throws Throwable {

	}

	@When("^user click on the Delete icon$")
	public void user_click_on_the_Delete_icon() throws Throwable {
		Configuration.clickOnCrossDeleteIcon();
	}

	@When("^user click on the Delete icon in legal holds$")
	public void user_click_on_the_Delete_icon_in_legal_holds() throws Throwable {
		Configuration.clickOnCrossDeleteIcon1();
	}

	@When("^user Select \"([^\"]*)\" from sort by dropdown menu$")
	public void user_Select_from_sort_by_dropdown_menu(String arg1) throws Throwable {
		Configuration.selectDateinDescOrder(arg1);
		Thread.sleep(3000);
	}

	@When("^user click on an email to be viewed$")
	public void user_click_on_an_email_to_be_viewed() throws Throwable {
		Thread.sleep(5000);
		Configuration.clickOnEmailToView();
		Thread.sleep(5000);
	}

	@Then("^user able to the respected email should be visible with Email Addresses, Subject and message body$")
	public void user_able_to_the_respected_email_should_be_visible_with_Email_Addresses_Subject_and_message_body()
			throws Throwable {
		Assert.assertTrue(Configuration.isSameEmailOpened());
	}

	@When("^user click on another email to be viewed$")
	public void user_click_on_another_email_to_be_viewed() throws Throwable {
		Configuration.clickOnAnotherEmailToView();
		Thread.sleep(5000);
	}

	@Then("^The email is displayed in the same window$")
	public void the_email_is_displayed_in_the_same_window() throws Throwable {
		Assert.assertTrue(Configuration.isEmailDisplay());

	}

	@When("^Right click on the email and click on Open Here$")
	public void right_click_on_the_email_and_click_on_Open_Here() throws Throwable {
		Configuration.clickOnRightClickOpenHere();
		Thread.sleep(7000);
	}

	@When("^Right click on the email and click on Open in a New Tab$")
	public void right_click_on_the_email_and_click_on_Open_in_a_New_Tab() throws Throwable {
		Configuration.clickOnRightClickOpenNewTab();
		Thread.sleep(3000);
	}

	@Then("^The email is displayed in the new window$")
	public void the_email_is_displayed_in_the_new_window() throws Throwable {
		Assert.assertTrue(Configuration.isEmailDisplayinNewWindow());
	}

	@Then("^Email content should be displayed three sections$")
	public void email_content_should_be_displayed_three_sections() throws Throwable {
		Configuration.isEmailDisplayedWith3SectionsNewWindow();
	}

	@When("^user click on Data Retention link$")
	public void user_click_on_Data_Retention_link() throws Throwable {
		Configuration.clickOnDataRetentionpolicyLink();
	}

	@Then("^user able see Data retention policy page in another window$")
	public void user_able_see_Data_retention_policy_page_in_another_window() throws Throwable {
		Assert.assertTrue(Configuration.isDataRetentionPageDisplayinNewWindow());
	}

	@When("^user click on the selected checkbox on the top of the email list$")
	public void user_click_on_the_selected_checkbox_on_the_top_of_the_email_list() throws Throwable {
		Configuration.clickOnEmailsCheckBox();
	}

	@Then("^user able to see All the emails in the list are selected$")
	public void user_able_to_see_All_the_emails_in_the_list_are_selected() throws Throwable {
		Configuration.getSelectedEmailsDisplay();
	}

	@And("^User click On forward Ok button$")
	public void User_click_On_forward_OK_button() {
		Configuration.clickOnForwardOKbutton();
	}

	@And("^User click On the forward Ok button$")
	public void User_click_On_the_forward_OK_button() {
		Configuration.clickOnSecondForwardOKbutton();
	}

	@Then("^user able to see printable format of the emails selected is open in a new window$")
	public void user_able_to_see_printable_format_of_the_emails_selected_is_open_in_a_new_window() throws Throwable {
		Configuration.isPrintDisplayinNewWindow();
	}

	@Then("^User click on Print to PDF tab$")
	public void user_click_on_Print_to_PDF_tab() throws Throwable {
		Configuration.clickOnPrintToPDF();
		Thread.sleep(5000);
	}

	@And("^User click On PDF Ok button$")
	public void User_click_On_PDF_OK_button() throws InterruptedException {
		Configuration.clickOnPDFOKbutton();
		Thread.sleep(5000);
	}

	@Then("^user able to see PDF in new window$")
	public void user_able_to_see_PDF_in_new_window() throws Throwable {
		Configuration.isPDFDisplayinNewWindow();
	}

	@Then("^user able to see Header in new window$")
	public void user_able_to_see_Header_in_new_window() throws Throwable {
		Configuration.isPDFDisplayinNewWindow();
	}

	@Then("^Choose a Tag by selecting the checkbox$")
	public void choose_a_Tag_by_selecting_the_checkbox() throws Throwable {
		Configuration.selectCheckBoxInTag();
	}

	@Then("^User click On Tag Ok button$")
	public void user_click_On_Tag_Ok_button() throws Throwable {
		Configuration.clickOnTagOKbutton();
	}

	@Then("^Select Multiple number of Emails$")
	public void Select_Multiple_number_of_Emails() throws Throwable {
		SearchEmail.clickOnMultipleEmailstoSelect();
	}

	@And("^user click on Remove Tag$")
	public void User_click_on_Remove_Tag() throws InterruptedException {
		Configuration.clickOnRemoveTagTab();

	}

	@Then("^user able to see the message as No Emails has been selected$")
	public void user_able_to_see_the_message_as_No_Emails_has_been_selected() throws Throwable {
		Configuration.getEmailDisplayed();
	}

	@Then("^user clicks on download$")
	public void user_clicks_on_download() throws Throwable {

		Configuration.getDownload();
	}

	@Then("^user able to see Comments page for the selected email$")
	public void user_able_to_see_Comments_page_for_the_selected_email() throws Throwable {
		Assert.assertTrue(Configuration.isCommentsPageDisplay());
	}

	@Then("^clicks on Include Attachments checkbox$")
	public void clicks_on_Include_Attachments_checkbox() throws Throwable {
		Configuration.clickOnPDFCheckBox();

	}

	@And("^User click On the Ok button$")
	public void User_click_On_the_OK_button() throws InterruptedException {
		Configuration.clickOnPDFOKbutton2();
		Thread.sleep(5000);
	}

	@Then("^user navigate to second window \"([^\"]*)\"$")
	public void user_navigate_to_second_window(String arg1) throws Throwable {

		Configuration.clicksOnSecondWindow(arg1);
		Thread.sleep(3000);
	}

	@When("^Select the text to be redacted$")
	public void select_the_text_to_be_redacted() throws Throwable {
		sleepApplication(2000);
		Configuration.selectEmailText();
		Thread.sleep(3000);
	}

	@When("^Select Current Document$")
	public void select_Current_Document() throws Throwable {

		Configuration.selectCurrentDocument();
	}

	@When("^user Select the checkbox againest Remove all Redactions$")
	public void user_Select_the_checkbox_againest_Remove_all_Redactions() throws Throwable {

		Configuration.selectRemoveAllRedactions();
	}

	@When("^select the option Remove from current email$")
	public void select_the_option_Remove_from_current_email() throws Throwable {

		Configuration.selectRemoveFromCurrentEmail();
	}

	@When("^select the option Remove from entire tag$")
	public void select_the_option_Remove_from_entire_tag() throws Throwable {

		Configuration.selectRemoveFromEntireTag();
	}

	@When("^click on Redact OK button$")
	public void click_On_Redact_OK_button() throws Throwable {

		Configuration.clickOnRedactOKButton();
		Thread.sleep(5000);
	}

	@When("^click on Unredact OK button$")
	public void click_on_Unredact_OK_button() throws Throwable {

		Configuration.clickOnUnredactOKButton();
		Thread.sleep(5000);
	}

	@When("^click on Make this the default checkbox$")
	public void click_On_Make_this_default_checkbox() throws Throwable {
		Configuration.selectMakeThisDefault();
	}

	@Then("^Selected text is redacted in the current Email$")
	public void Selected_text_is_redacted_in_the_current_Email() throws Throwable {
		Configuration.getEmailText();
	}

	@Then("^Selected text is redacted in the Another Email$")
	public void Selected_text_is_redacted_in_the_Another_Email() throws Throwable {
		Configuration.getAnotherEmailText();
	}

	@When("^Select Entire Tag$")
	public void select_Entire_Tag() throws Throwable {

		Configuration.clickOnEntireTag();
	}

	@Then("^user click on the collapse icon to maximise$")
	public void user_click_on_the_collapse_icon_to_maximise() throws Throwable {
		Configuration.clickONCurrentEmailTagsHeader();
		Thread.sleep(3000);
		Configuration.clickONCurrentEmailTagsHeader1();
	}

	@Then("^user click on the collapse icon to minimise$")
	public void user_click_on_the_collapse_icon_to_minimise() throws Throwable {
		Configuration.clickONCurrentEmailTagsHeader();
	}

	@Then("^user able to see the Emails Tags Table$")
	public void user_able_to_see_the_Emails_Tags_Table() throws Throwable {
		Configuration.getCurrentEmailTags();
		Thread.sleep(3000);
	}

	@Then("^Emails Tags Table was minimised$")
	public void Emails_Tags_Table_was_minimised() throws Throwable {
		Assert.assertTrue(Configuration.isEmailsTagsTableDisplay());
	}

	@Then("^user click on Intradyn Logo$")
	public void user_click_on_Intradyn_Logo() throws Throwable {
		Configuration.clickOnIntradynLogo();
		Thread.sleep(5000);
	}

	@Then("^user able to see the Dashboard page$")
	public void user_able_to_see_the_Dashboard_page() throws Throwable {
		Assert.assertTrue(Configuration.isDashboardPage());
	}

	@Then("^user click on Account Settings Icon$")
	public void user_click_on_Account_Settings_Icon() throws Throwable {
		Configuration.clickOnAccountSettingsIcon();
		Thread.sleep(5000);
	}

	@Then("^user able to see the Account Settings page$")
	public void user_able_to_see_the_Account_Settings_page() throws Throwable {
		Assert.assertTrue(Configuration.isAccountSettingsPage());
	}

	@Then("^user click on Help Icon$")
	public void user_click_on_Help_Icon() throws Throwable {
		Configuration.clickOnHelpIcon();
	}

	@Then("^user able to see the Help Documentation for Tags$")
	public void user_able_to_see_the_Help_Documentation_for_Tags() throws Throwable {
		Configuration.getHelpDocumentation();
	}

	@Then("^user click on Logout Icon$")
	public void user_click_on_Logout_Icon() throws Throwable {
		Configuration.clickOnLogoutIcon();
	}

	@Then("^user able to see Login Page$")
	public void user_able_to_see_Login_Page() throws Throwable {
		Assert.assertTrue(Configuration.isLoginPageDisplay());
	}

	@Then("^click on Collapse - icon on Home Logo for hide$")
	public void click_on_Collapse_icon_on_Home_Logo_for_hide() throws Throwable {
		Configuration.clickOnHomeLogoCollapseIcon();
	}

	@Then("^Side menu disappears$")
	public void side_menu_disappears() throws Throwable {
		Configuration.isSideMenuDisplay();
	}

	@Then("^click on Collapse - icon on Home Logo for display$")
	public void click_on_Collapse_icon_on_Home_Logo_for_display() throws Throwable {
		Configuration.clickOnHomeLogoCollapseIcon();
		Thread.sleep(3000);
		Configuration.clickOnHomeLogoCollapseIcon();
	}

	@Then("^Side menu is displayed$")
	public void side_menu_is_displayed() throws Throwable {
		Assert.assertTrue(Configuration.isSettingsHeaderDisplay());
	}

	@When("^Select the email body to be redacted$")
	public void select_the_email_body_to_be_redacted() throws Throwable {
		Configuration.selectEmailBodyText();
		Thread.sleep(3000);
	}

	@When("^select the email header value to be redacted$")
	public void select_the_email_header_value_to_be_redacted() throws Throwable {
		Configuration.selectHeaderValue();
		Thread.sleep(3000);
	}

	@Then("^selected header value is redacted$")
	public void selected_header_value_is_redacted() throws Throwable {

	}

	@When("^select the email header text to be redacted$")
	public void select_the_email_header_text_to_be_redacted() throws Throwable {

		Configuration.selectHeaderLabels();
	}

	@Then("^selected header text is not redacted$")
	public void selected_header_text_is_not_redacted() throws Throwable {

		Configuration.getLabelText();
	}

	@When("^select the attachment document name to be redacted$")
	public void select_the_attachment_document_name_to_be_redacted() throws Throwable {
		Configuration.selectEmailAttachment();
	}

	@Then("^selected attachment document name is redacted$")
	public void selected_attachment_document_name_is_redacted() throws Throwable {

	}

	@When("^user clicks on  pencil icon for edit the server details$")
	public void user_clicks_on_pencil_icon_for_edit_the_server_details() throws Throwable {
		Configuration.clickOnPencilIconForEditingServerDetails();
	}

	@When("^user click on Test Icon$")
	public void user_click_on_Test_Icon() throws Throwable {
		Configuration.clickOnTestIconForTestingServerDetails();
	}

	@Then("^the Result of the test in obtained$")
	public void the_Result_of_the_test_in_obtained() throws Throwable {
		Configuration.getTheResultOfTHeTest();
	}

	@Then("^User enters the activity name as \"([^\"]*)\"$")
	public void user_enters_the_activity_name_as(String sText) throws Throwable {
		String user = getRandomString(3);
		Configuration.setActivityName(sText + "_" + user);
		newActivityName = sText + "_" + user;
	}

	@Then("^Activity name should be added under the Exchange Servers Activities list$")
	public void activity_name_should_be_added_under_the_Exchange_Servers_Activities_list() throws Throwable {
		Configuration.isActivityNameAddedInList();
	}

	@Then("^Server name should be added under the Exchange Servers Activities list$")
	public void Server_name_should_be_added_under_the_Exchange_Servers_Activities_list() throws Throwable {
		Configuration.isServerNameAddedInList();
	}

	@Then("^user Edit Version of any of the Exchange Server$")
	public void user_Edit_Version_of_any_of_the_Exchange_Server() throws Throwable {
		Configuration.setEditingVersion();
	}

	@Then("^The version  of the server should be changed$")
	public void the_version_of_the_server_should_be_changed() throws Throwable {
		Configuration.isVersionEditted();
	}

	@When("^user click on Delete Icon$")
	public void user_click_on_Delete_Icon() throws Throwable {
		Configuration.clickOnDeleteIconForTestingServerDetails();
	}

	@Then("^Server name should be deleted from the list$")
	public void server_name_should_be_deleted_from_the_list() throws Throwable {
		Configuration.isNameDeleted();
	}

	@Then("^Activity name should be deleted from the list$")
	public void Activity_name_should_be_deleted_from_the_list() throws Throwable {
		Configuration.isNameDeleted();
	}

	@When("^user clicks on pencil icon for edit the Activity details$")
	public void user_clicks_on_pencil_icon_for_edit_the_Activity_details() throws Throwable {
		Configuration.clickOnPencilIconForEditingTheActivityDetails();
	}

	@When("^user edit the Activity details$")
	public void user_edit_the_Activity_details() throws Throwable {
		Configuration.setEditingTime();
	}

	@Then("^Activity is eddited successfully$")
	public void activity_is_eddited_successfully() throws Throwable {
		Configuration.isTimeGotEditted();
	}

	@When("^user clicks on Delete icon for edit the Activity details$")
	public void user_clicks_on_Delete_icon_for_edit_the_Activity_details() throws Throwable {
		Configuration.clickOnDeleteIconForTestigActivityDetails();
	}

	@When("^user Clicks on Activate Up Arrow option$")
	public void user_Clicks_on_Activate_Up_Arrow_option() throws Throwable {
		Configuration.clickOnUpArrow();
	}

	@When("^user Clicks on Deactivate Down Arrow option$")
	public void user_Clicks_on_Deactivate_Down_Arrow_option() throws Throwable {
		Configuration.clickOnDownArrow();
	}

	@Then("^Arrow direction should be changed$")
	public void arrow_direction_should_be_changed() throws Throwable {
		Configuration.isArrowDirectionChangedUptoDown();
	}

	@Then("^Arrow direction should be changed to down$")
	public void arrow_direction_should_be_changed_to_down() throws Throwable {
		Configuration.isArrowDirectionChangedDowntoUp();
	}

	@When("^add deleted tag name$")
	public void add_deleted_tag_name() throws Throwable {
		Configuration.setDeletedTagAsTag();
	}

	@When("^user clicks on maginfing glass of tag having mails$")
	public void user_clicks_on_maginfing_glass_of_tag_having_mails() throws Throwable {
		Configuration.clickonMaginfingGlas();
	}

	@When("^user clicks on maginfing glass of tag having no mails$")
	public void user_clicks_on_maginfing_glass_of_tag_having_no_mails() throws Throwable {
		Configuration.clickonMaginfingGlas1();
	}

	@Then("^Total mail count should show as Zero$")
	public void total_mail_count_should_show_as_Zero() throws Throwable {
		SearchEmail.getEmailTotalCount1();
	}

	@Then("^The recently saved configuration file with current date$")
	public void the_recently_saved_configuration_file_with_current_date() throws Throwable {
		Configuration.isSavedWithCurrentDate();
	}

	@When("^Clcik on Download symbol of Config Filename$")
	public void clcik_on_Download_symbol_of_Config_Filename() throws Throwable {
		Configuration.clickonDownloadIcon();
	}

	@Then("^The config file should be downloaded into the local disk$")
	public void the_config_file_should_be_downloaded_into_the_local_disk() throws Throwable {
		Configuration.isFileDownloaded();
	}

	@Then("^All Tag names should be arranged in ascending order by defayult$")
	public void all_Tag_names_should_be_arranged_in_ascending_order_by_defayult() throws Throwable {
		Configuration.isTagsAreInAccendingOrder();
	}

	@Then("^Federated Search Configuration page should be displayed with  (\\d+) sections$")
	public void federated_Search_Configuration_page_should_be_displayed_with_sections(int arg1) throws Throwable {
		Configuration.isDisplayedWithThereSections();
	}

	@Then("^ServerInfo section should be displayed with all the requied fields$")
	public void serverinfo_section_should_be_displayed_with_all_the_requied_fields() throws Throwable {
		Configuration.isServerInfoDisplayedWithRespectiveFields();
	}

}
