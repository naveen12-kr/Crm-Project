package com.intradyn.EmailArchive;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DepartmentSetUp;
import pages.UsersAndGroups;

public class UsersAndGroupsDef {

	@Then("^prev button is enabled$")
	public void prev_button_is_enabled() throws Throwable {
		Assert.assertTrue(UsersAndGroups.isPrevButtonEnabled());
	}

	@Then("^This field is required is displayed$")
	public void this_field_is_required_is_displayed() throws Throwable {
		UsersAndGroups.getFieldIsRequired();
	}

	@Then("^Password and confirmation password did not match message is displayed$")
	public void password_and_confirmation_password_did_not_match_message_is_displayed() throws Throwable {
		UsersAndGroups.getErrorMessagePassword();
	}

	@Then("^\"([^\"]*)\" is displayed under User Creation Wizard$")
	public void is_displayed_under_User_Creation_Wizard(String gText) throws Throwable {
		UsersAndGroups.getCurrentClass(gText);
	}

	@When("^Clicks on Prev button$")
	public void clicks_on_Prev_button() throws Throwable {
		UsersAndGroups.clickOnPreButton();
	}

	@Then("^prev button is disabled$")
	public void prev_button_is_disabled() throws Throwable {
		Assert.assertTrue(UsersAndGroups.isPrevButtonDisabled());
	}

	@Then("^User select any Group Membership$")
	public void user_select_any_Group_Membership() throws Throwable {
		UsersAndGroups.clickOnGroup();
	}

	@Then("^Clicks on HR/legal permission$")
	public void clicks_on_HR_legal_permission() throws Throwable {
		UsersAndGroups.clickHRLegalPermissions();
	}

	@Then("^Clicks on Admin permission$")
	public void clicks_on_Admin_permission() throws Throwable {
		UsersAndGroups.clickAdminPermissions();
	}

	@Then("^Clicks on admin permission$")
	public void clicks_on_admin_permission() throws Throwable {
		UsersAndGroups.clickAdminPermissions();
	}

	@Then("^Clicks on end-user permission$")
	public void clicks_on_end_user_permission() throws Throwable {
		UsersAndGroups.clickEndUserPermissions();
	}

	@Then("^HR/legal permissions are selected$")
	public void hr_legal_permissions_are_selected() throws Throwable {
		UsersAndGroups.getPermissions();
	}

	@Then("^admin permissions are selected$")
	public void admin_permissions_are_selected() throws Throwable {
		UsersAndGroups.getPermissions();
	}

	@Then("^end-user permissions are selected$")
	public void end_user_permissions_are_selected() throws Throwable {
		UsersAndGroups.getPermissions();
	}

	@Then("^select any radio button as home page$")
	public void select_any_radio_button_as_home_page() throws Throwable {
		UsersAndGroups.clickOnAnyRadioButton();
	}

	@Then("^select No default search addresses as Search Rule$")
	public void select_No_default_search_addresses_as_Search_Rule() throws Throwable {
		UsersAndGroups.setDepartmentalSearchRules();
	}

	@Then("^select User can search on his own addresses as Search Rule$")
	public void select_No_User_can_search_on_his_own_addresses_as_Search_Rule() throws Throwable {
		UsersAndGroups.setDepartmentalSearchRule();
	}

	@Then("^User Searchable Departments is displayed$")
	public void user_s_Searchable_Departments_is_displayed() throws Throwable {
		Assert.assertTrue(UsersAndGroups.isUserSearchableDepartments());
	}

	@Then("^User Searchable Addresses is displayed$")
	public void user_s_Searchable_Addresses_is_displayed() throws Throwable {
		Assert.assertTrue(UsersAndGroups.isUserSearchableAddresses());
	}

	@Then("^Add Department list is displayed$")
	public void add_Department_list_is_displayed() throws Throwable {
		Assert.assertTrue(UsersAndGroups.isAddDepartment());
	}

	@Then("^Entered email address is displayed$")
	public void entered_email_address_is_displayed() throws Throwable {
		Assert.assertTrue(UsersAndGroups.isEnteredEmailAddress());
	}

	@Then("^select User can search on User can search on addresses within the department he belongs to as Search Rule$")
	public void select_User_can_search_on_User_can_search_on_addresses_within_the_department_s_he_belongs_to_as_Search_Rule()
			throws Throwable {
		UsersAndGroups.setDepartmentalSearchRule1();
	}

	@Then("^select User can search on User can search on all addresses$")
	public void select_User_can_search_on_User_can_search_on_all_addresses() throws Throwable {
		UsersAndGroups.setDepartmentalSearchRul();
	}

	@Then("^you cannot add new departments to their search permissions$")
	public void you_cannot_add_new_departments_to_their_search_permissions() throws Throwable {
		UsersAndGroups.getNewDepartments();
	}

	@Then("^you cannot add new addresses to their search permissions$")
	public void you_cannot_add_new_addresses_to_their_search_permissions() throws Throwable {
		UsersAndGroups.getNewAddresses();
	}

	@When("^Enter valid email address \"([^\"]*)\" in Exclusion Addresses field$")
	public void enter_valid_email_address_in_Exclusion_Addresses_field(String data) throws Throwable {

		UsersAndGroups.setExclisionAddresses(data);
	}

	@Then("^New window of Look Up Search Addresses page should be open$")
	public void new_window_of_Look_Up_Search_Addresses_page_should_be_open() throws Throwable {

		UsersAndGroups.getLookUpNewWindow();
	}

	@When("^user click on Look Up link$")
	public void user_click_on_Look_Up_link() throws Throwable {

		UsersAndGroups.clickOnLookUpLink();
	}

	@When("^Enter \"([^\"]*)\" in Search Terms field$")
	public void enter_in_Search_Terms_field(String data) throws Throwable {

		UsersAndGroups.setSearchTerms(data);
	}

	@When("^List of email addresses should be displayed in below list and select one email address$")
	public void list_of_email_addresses_should_be_displayed_in_below_list_and_select_one_email_address()
			throws Throwable {

		UsersAndGroups.selectOneInSelectableList();
	}

	@When("^List of email addresses should be displayed in below list and select multiple email address$")
	public void list_of_email_addresses_should_be_displayed_in_below_list_and_select_multiple_email_address()
			throws Throwable {
		UsersAndGroups.selectMultipleInSelectableList();
	}

	@When("^Selected email address should be added into Selected box$")
	public void selected_email_address_should_be_added_into_Selected_box() throws Throwable {

	}

	@Then("^The selected email address should be added into Exclusion Addresses box$")
	public void the_selected_email_address_should_be_added_into_Exclusion_Addresses_box() throws Throwable {
		UsersAndGroups.getSelectedAddresses();

	}

	@When("^user click on add selections button$")
	public void user_click_on_add_selections_button() throws Throwable {
		UsersAndGroups.clickOnAddSelectionsButton();
	}

	@When("^Added email address are shown into Exclusion Addresses list$")
	public void added_email_address_are_shown_into_Exclusion_Addresses_list() throws Throwable {
		UsersAndGroups.getExclusionOverrides();
	}

	@When("^Added email address are shown into Exclusion overrides$")
	public void added_email_address_are_shown_into_Exclusion_overrides() throws Throwable {
		UsersAndGroups.getExclusionOverridesDetails();
	}

	@When("^Select email address from dropdown list under Exclusion Overrides$")
	public void select_email_address_from_dropdown_list_under_Exclusion_Overrides() throws Throwable {
		UsersAndGroups.selectEmailAddressesFromDropdown();
	}

	@When("^Select user name from dropdown list under Exclusion Overrides$")
	public void select_user_name_from_dropdown_list_under_Exclusion_Overrides() throws Throwable {
		UsersAndGroups.selectUserNameFromDropdown();
	}

	@When("^User click On Add Override button$")
	public void user_click_On_Add_Override_button() throws Throwable {
		UsersAndGroups.clickOnAddOverideButton();
		Thread.sleep(3000);

	}

	@When("^Click on Delete icon under the Exclusion Overrides$")
	public void click_on_Delete_icon_under_the_Exclusion_Overrides() throws Throwable {
		UsersAndGroups.clickOnDeleteUnderExclusionOverrides();
	}

	@When("^user clicks on \"([^\"]*)\" button$")
	public void user_clicks_on_button(String data) throws Throwable {
		DepartmentSetUp.clickOnAddDepartmentButton(data);
		Thread.sleep(1000);
	}

	@Then("^Enter the content in Description field \"([^\"]*)\"$")
	public void enter_the_content_in_Description_field(String sText) throws Throwable {
		DepartmentSetUp.setDescription(sText);
	}

	@Then("^This field is required message displayed$")
	public void this_field_is_required_message_displayed() throws Throwable {
		DepartmentSetUp.getErrorMsgThisFieldIsReq();
	}

	@Then("^Click on pencil icon for editing the department$")
	public void click_on_pencil_icon_for_editing_the_department() throws Throwable {
		DepartmentSetUp.clickOnPencilIconDept();
		Thread.sleep(3000);

	}

	@Then("^Select one Department name under the Departments subDepartments$")
	public void select_one_Department_name_under_the_Departments_subDepartments() throws Throwable {
		DepartmentSetUp.selectDepartSubDepartName();
	}

	@Then("^Click on Delete icon under the Departments subDepartments list$")
	public void click_on_Delete_icon_under_the_Departments_subDepartments_list() throws Throwable {
		DepartmentSetUp.clickOnDeleteSubDepart();
	}

	@Then("^Enter one email id \"([^\"]*)\"in the text field under the Department's Email Addresses\\.$")
	public void enter_one_email_id_in_the_text_field_under_the_Department_s_Email_Addresses(String sText)
			throws Throwable {
		DepartmentSetUp.setDepartEmailAddress(sText);
		Thread.sleep(2000);
	}

	@When("^Click on delete icon under the Departments emial addresses list$")
	public void click_on_delete_icon_under_the_Departments_emial_addresses_list() throws Throwable {
		DepartmentSetUp.clickOnDeleteDepartEmailAddress();
	}

	@Then("^Click on the Delete icon of Departmental Email Address Configuration$")
	public void click_on_the_Delete_icon_of_Departmental_Email_Address_Configuration() throws Throwable {
		DepartmentSetUp.clickOnDeleteDepartEmailConfig();
	}

	@Then("^Enter existing Department name in text field$")
	public void enter_existing_Department_name_in_text_field() throws Throwable {
		DepartmentSetUp.getExistingDeptName();
	}

	@Then("^get the Results of the run$")
	public void get_the_Results_of_the_run() throws Throwable {
		UsersAndGroups.getRunTestResult();
	}

	@Then("^user clicks on Up a Test Level icon$")
	public void user_clicks_on_Up_a_Test_Level_icon() throws Throwable {
		UsersAndGroups.clickOnUpTestLevel();
	}

	@When("^user clicks on Groups tab$")
	public void user_clicks_on_Groups_tab() throws Throwable {
		UsersAndGroups.clickGroupsTab();
	}

	@When("^user enters the exclusion addresses \"([^\"]*)\"$")
	public void user_enters_the_exclusion_addresses(String sText) throws Throwable {
		UsersAndGroups.setExclusionAddresses(sText);
	}

	@Then("^get the user name to be enterd$")
	public void get_the_user_name_to_be_enterd() throws Throwable {
		UsersAndGroups.getMemberName();
		Thread.sleep(2000);
	}

	@Then("^user clicks on members link$")
	public void user_clicks_on_members_link() throws Throwable {
		UsersAndGroups.clickOnMembersLink();
	}

	@Then("^user enters member name$")
	public void user_enters_member_name() throws Throwable {
		UsersAndGroups.setMemberName();
	}

	@Then("^user enter multiple member name$")
	public void user_enter_multiple_member_name() throws Throwable {
		UsersAndGroups.setMultipleMemberName();
	}

	@Then("^The user name should be added into membership$")
	public void the_user_name_should_be_added_into_membership() throws Throwable {
		UsersAndGroups.isMemberAdded();
	}

	@Then("^user Select any one of the members$")
	public void user_Select_any_one_of_the_members() throws Throwable {
		UsersAndGroups.selectAnyMemberName();
	}

	@Then("^user clicks on cross Icon$")
	public void user_clicks_on_cross_Icon() throws Throwable {
		UsersAndGroups.clickOnCrossIcon();
	}

	@Then("^the group is deleted$")
	public void the_group_is_deleted() throws Throwable {
		UsersAndGroups.isGroupDeleted();
	}

	@Then("^Add the Deleted group in new Group$")
	public void add_the_Deleted_group_in_new_Group() throws Throwable {
		UsersAndGroups.setGroupName();
	}

}
