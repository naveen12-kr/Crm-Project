package com.intradyn.EmailArchive;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Configuration;
import pages.LegalHolds;
import pages.Navigation;

public class LegalHoldsDef {
	
	
	@When("^user click on Create Legal hold$")
	public void user_click_on_Create_Legal_hold() throws Throwable {
	    LegalHolds.clicksOnCreateLeagalHold();
	}
	
	@When("^user click on Add Legal Holds$")
	public void user_click_on_Add_Legal_Holds() throws Throwable {
	    
		Configuration.clickOnAddTagsButton();
		
	}
	
	@When("^user clicks on  Expand - icon on Current Legal Holds$")
	public void user_clicks_on_Expandicon_on_Current_Legal_Holds() throws Throwable {
		LegalHolds.clicksOncollapseCurrentEmailTags();
	   
	}
	
	@Then("^Current Legal Holds table is not displayed$")
	public void current_Legal_Holds_table_is_not_displayed() throws Throwable {
	   LegalHolds.isCurrentLegalHoldsTableNotPresent();
	}
	
	@When("^user clicks on  Expand \\+ icon on Current Legal Holds$")
	public void user_clicks_on_Expand_icon_on_Current_Legal_Holds() throws Throwable {
	    LegalHolds.clicksOnCurrentEmailTags();
	}

	@Then("^Current Legal Holds table is displayed$")
	public void current_Legal_Holds_table_is_displayed() throws Throwable {
		LegalHolds.isCurrentLegalHoldsTable();
	    
	}
	
	@When("^user selcts the check box Legal Hold$")
	public void user_selcts_the_check_box_Legal_Hold() throws Throwable {
	    
	LegalHolds.isLegalHoldCheckBoxSelected();
		
	}
	
	@When("^user not select the legal holds checkbox$")
	public void user_not_select_the_legal_holds_checkbox(String data) throws Throwable {
	    
	LegalHolds.deselectLegalHolds(data);
		
	}
	
	@When("^user not select the \"([^\"]*)\" checkbox$")
	public void user_not_select_the_checkbox(String arg1) throws Throwable {
	    LegalHolds.deselectLegalHolds(arg1);
	}
	
	@Then("^added tag is not found under the current legal holds table$")
	public void added_tag_is_not_found_under_the_current_legal_holds_table() throws Throwable {
	    Thread.sleep(5000);
		LegalHolds.legalHoldCountInTable();
		System.out.println("Legal Hold Name is not added under the Current Legal Holds table");
		
	}
	
	@Then("^Number of Legal holds in a table$")
	public void number_of_Legal_holds_in_a_table() throws Throwable {
		LegalHolds.legalHoldCountInTable();
	}

	@Then("^added tag is displayed on the Tags page under the current email tags table$")
	public void added_tag_is_displayed_on_the_Tags_page_under_the_current_email_tags_table() throws Throwable {
	    
		LegalHolds.legalHoldAddedInAllTags();
		
	}
	
	@Then("^Click on the \"([^\"]*)\" of Legal Hold$")
	public void click_on_the_of_Legal_Hold(String arg1) throws Throwable {
	    LegalHolds.clickOnMgToViewEmailsCount();
	}

	@Then("^user able to see the list of emails$")
	public void user_able_to_see_the_list_of_emails() throws Throwable {
	    
	}
	
	@When("^click on the Pencil Icon of Legal Hold$")
	public void click_on_the_Pencil_Icon_of_Legal_Hold() throws Throwable {
	    LegalHolds.clickOnPencilIcon();
	}

	@Then("^definition of the current Legal Hold is displayed$")
	public void definition_of_the_current_Legal_Hold_is_displayed() throws Throwable {
	    LegalHolds.isLegalHoldDetails();
	}

	@Then("^All input fields are disabled$")
	public void all_input_fields_are_disabled() throws Throwable {
	    
	}

	@Then("^Click on Ok button$")
	public void click_on_Ok_button() throws Throwable {
	    LegalHolds.clickOnOKButton();
	}
	
	@When("^Click on the \"([^\"]*)\" of Legal Holds$")
	public void click_on_the_of_Legal_Holds(String arg1) throws Throwable {
	    LegalHolds.clickOnMgToViewEmails();
	}
	
	@Then("^The message This field is required displayed$")
	public void the_message_This_field_is_required_displayed() throws Throwable {
	    
		LegalHolds.getThisFieldRequired();
	}
   
	@When("^user click on Create Legal Holds$")
	public void user_click_on_Create_Legal_Holds() throws Throwable {
	   LegalHolds.clicksOnCreateLeagalHold();
	}
	
	@Then("^the message description field is required displayed$")
	public void the_message_description_field_is_required_displayed() throws Throwable {
	   LegalHolds.getDescriptionFieldRequired();
	}
	
	@Then("^the Already existed message displayed$")
	public void the_Already_existed_message_displayed() throws Throwable {
	   LegalHolds.getExistingLegalHoldMessage();
	}
	
	@When("^Enter an existing/deleted Legalhold name$")
	public void enter_an_existing_deleted_Legalhold_name() throws Throwable {
	    LegalHolds.setExistingLegalHoldName();
	}
	
	@When("^Enter an deleted Legalhold name$")
	public void enter_an_deleted_Legalhold_name() throws Throwable {
	    LegalHolds.setDeleteLegalHoldName();
	}
	
	@Then("^Select the checkbox against Remove all Redactions$")
	public void select_the_checkbox_against_Remove_all_Redactions() throws Throwable {
	   LegalHolds.selectRemoveAllRedactions();
	}

	@Then("^Select Current Document in Unredact$")
	public void select_Current_Document_in_Unredact() throws Throwable {
	    LegalHolds.selectCurrentDocumentUnredact();
	}
    
	@Then("^Select the checkbox against single redaction to be removed$")
	public void select_the_checkbox_against_single_redaction_to_be_removed() throws Throwable {
	  LegalHolds.selectRemoveRedaction();  
	}
	
	@When("^Select the checkbox against Remove multiple Redactions$")
	public void select_the_checkbox_against_Remove_multiple_Redactions() throws Throwable {
	   LegalHolds.selectRemoveMultipleRedaction();
	}
	

   @Then("^Select Entire Tag to Unredact$")
   public void select_Entire_Tag_to_Unredact() throws Throwable {
    LegalHolds.clickOnEntireTagUnredact();
  }


}
