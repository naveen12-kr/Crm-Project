package com.intradyn.EmailArchive;

import org.apache.http.cookie.ClientCookie;
import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.Configuration;
import pages.Exportemail;
import pages.SearchEmail;
import pages.UsersAndGroups;

public class ConfigurationDef extends BasePage{
	
	public static String newTag;
	public static String newDesc;
	
	/*@When("^user navigate to Configuration$")
	public void user_navigate_to_Configuration() throws Throwable {
	    
		Configuration.clickOnConfiguration();
	}
*/
	@When("^user navigate to \"([^\"]*)\"$")
	public void user_navigate_to_link_tab(String arg) throws Throwable {
	 
		Configuration.clicksOnLinkTab(arg);
	}

	@When("^user enters the valid tag name \"([^\"]*)\"$")
	public void user_enters_the_valid_tag_name(String newName) throws Throwable {
	    
		newTag = getRandomString(4);
		Configuration.setAddNewTagText(newName+""+newTag);
	}

	@When("^user click on Add Tag$")
	public void user_click_on_Add_Tag() throws Throwable {
	    
		Configuration.clickOnAddTagsButton();
	}

	@When("^enter a valid \"([^\"]*)\"$")
	public void enter_a_valid(String text) throws Throwable {
	  
		newDesc=getRandomString(10);
	   Configuration.setDescription(text+""+newDesc);
	   
	}


	@Then("^The message is displayed added tag successfully$")
	public void the_message_is_displayed_added_tag_successfully() throws Throwable {
	   
		Configuration.isTagAddSuccesfully();
		
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
	   
		Configuration.isDescriptionFieldEmpty();
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
		
	
	
	//*********************Edit Tag ************************************************
	
		@When("^click on the pencil icon and edit description$")
		public void click_on_the_icon() throws Throwable {
		
			Configuration.clickOnPencilAndEditDesc();
			System.out.println("User edited tags description successfully");
			
		}

		@When("^a valid Legal Hold is created$")
		public void a_valid_Legal_Hold_is_created() throws Throwable {

			Configuration.getValidLeagalHold();
		}

		@When("^click on the pencil icon$")
		public void click_on_the_pencil_icon() throws Throwable {
			Configuration.clickOnPencilIcon();
		}

		
		@Then("^All the input fields are disabled$")
		public void all_the_input_fields_are_disabled() throws Throwable {
				
			//Configuration.isDescDisabled();
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

		@Then("^The defintion of the selected legal hold  is displayed$")
		public void the_defintion_of_the_selected_legal_hold_is_displayed() throws Throwable {
		    
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
		
		@Then("^user able to see successfull message$")
		public void user_able_to_see_successfull_message() throws Throwable {
		    
		}
		
		@When("^user Select \"([^\"]*)\" from sort by dropdown menu$")
		public void user_Select_from_sort_by_dropdown_menu(String arg1) throws Throwable {
		    Configuration.selectDateinDescOrder(arg1);
		    Thread.sleep(3000);
		}

		@Then("^user able to see the emails are sorted by date in descending order$")
		public void user_able_to_see_the_emails_are_sorted_by_date_in_descending_order() throws Throwable {
		    Configuration.isDateSortedOrder();
		}
		
		@Then("^user able to see the emails are sorted by date in ascending order$")
		public void user_able_to_see_the_emails_are_sorted_by_date_in_ascending_order() throws Throwable {
		    Configuration.isDateSortedOrder();
		}
		
		@Then("^user able to see the email addresses are sorted by in ascending order$")
		public void user_able_to_see_the_email_addresses_are_sorted_by_in_ascending_order() throws Throwable {
		    Configuration.isEmailAddressInSortedOrder();
		}

		@Then("^user able to see the email addresses are sorted by in descending order$")
		public void user_able_to_see_the_email_addresses_are_sorted_by_in_descending_order() throws Throwable {
		    Configuration.isEmailAddressInSortedOrder();
		}
		
		@Then("^user able to see the email subjects are sorted by in ascending order$")
		public void user_able_to_see_the_email_subjects_are_sorted_by_in_ascending_order() throws Throwable {
		    Configuration.isEmailSubjectsInSortedOrder();
		}

		@Then("^user able to see the email subjects are sorted by in descending order$")
		public void user_able_to_see_the_email_subjects_are_sorted_by_in_descending_order() throws Throwable {
		    Configuration.isEmailSubjectsInSortedOrder();
		}
		@When("^user click on an email to be viewed$")
		public void user_click_on_an_email_to_be_viewed() throws Throwable {
		    Configuration.clickOnEmailToView();
		    Thread.sleep(5000);
		}
		
		@When("^user click on another email to be viewed$")
		public void user_click_on_another_email_to_be_viewed() throws Throwable {
		    Configuration.clickOnAnotherEmailToView();
		    Thread.sleep(5000);
		}

		@Then("^The email is displayed in the same window$")
		public void the_email_is_displayed_in_the_same_window() throws Throwable {
		    Configuration.isEmailDisplay();
		}
		
		@When("^Right click on the email and click on Open Here$")
		public void right_click_on_the_email_and_click_on_Open_Here() throws Throwable {
			Configuration.clickOnRightClickOpenHere();
		    Thread.sleep(5000);
		}
		
		@When("^Right click on the email and click on Open in a New Tab$")
		public void right_click_on_the_email_and_click_on_Open_in_a_New_Tab() throws Throwable {
		    Configuration.clickOnRightClickOpenNewTab();
		    Thread.sleep(3000);
		}

		@Then("^The email is displayed in the new window$")
		public void the_email_is_displayed_in_the_new_window() throws Throwable {
		    Configuration.isEmailDisplayinNewWindow();
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
		    Configuration.isCommentsPageDisplay();
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
			Configuration.isEmailsTagsTableDisplay();
		}
		
		@Then("^user click on Intradyn Logo$")
		public void user_click_on_Intradyn_Logo() throws Throwable {
		    Configuration.clickOnIntradynLogo();
		    Thread.sleep(5000);
		}

		@Then("^user able to see the Dashboard page$")
		public void user_able_to_see_the_Dashboard_page() throws Throwable {
		    Configuration.isDashboardPage();
		}
		
		@Then("^user click on Account Settings Icon$")
		public void user_click_on_Account_Settings_Icon() throws Throwable {
		    Configuration.clickOnAccountSettingsIcon();
		    Thread.sleep(5000);
		}

		@Then("^user able to see the Account Settings page$")
		public void user_able_to_see_the_Account_Settings_page() throws Throwable {
		    Configuration.isAccountSettingsPage();
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
		    Configuration.isLoginPageDisplay();
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
		    Configuration.isSettingsHeaderDisplay();
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
		
}
