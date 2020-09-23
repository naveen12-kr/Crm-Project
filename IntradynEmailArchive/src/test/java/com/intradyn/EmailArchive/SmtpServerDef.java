package com.intradyn.EmailArchive;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.SmtpServer;
import pages.UsersAndGroups;

public class SmtpServerDef extends BasePage{
	
	@When("^User navigate to SMTP Server in Email servers$")
	public void user_navigate_to_SMTP_Server_in_Email_servers() throws Throwable {
	    
		SmtpServer.clickOnSmtpServer();
	}

	@When("^The SMTP Server is currently running$")
	public void the_SMTP_Server_is_currently_running() throws Throwable {
	    
		SmtpServer.getSmtpRunning(); 
	}

	@When("^User clicks on Reset$")
	public void user_clicks_on_Reset() throws Throwable {

		SmtpServer.clickOnResetbutton();
	}

	@Then("^server is restarted message is displayed$")
	public void server_will_restarted_and_the_message_is_displayed() throws Throwable {
	    SmtpServer.getSmtpRunning();
		
	}
	@Then("^Error message displayed$")
	public void error_message_displayed() throws Throwable {
	   SmtpServer.getADDServerError();
	}
	
	@Then("^User check SMTP Server$")
	public void start_SMTP_Server() throws Throwable {
		if(UsersAndGroups.isSmtpServerStatus1()) {
			UsersAndGroups.clickOnStartServer();
	    }
		else {
			System.out.println("SMTP sever is currently running");
		}
	}
	

     @When("^User check SMTP Server is inactive$")
     public void user_check_SMTP_Server_is_inactive() throws Throwable {
    	 if(UsersAndGroups.isSmtpServerStatus()) {
 	    	UsersAndGroups.clickOnStopServer();
 	    }
 		else {
 			System.out.println("SMTP sever is currently Stopped");
 		}
    
    }
     @When("^User gives some TimeOut period$")
     public void user_gives_some_TimeOut_period() throws Throwable {
         SmtpServer.setSMTPTimeOut();
         
     }
     
     @When("^User gives no TimeOut period$")
     public void user_gives_no_TimeOut_period() throws Throwable {
    	 
    	 SmtpServer.setNoSMTPTimeOut();
        
     }

     @Then("^this field is Requierd message is displayed$")
     public void this_field_is_Requierd_message_is_displayed() throws Throwable {
        SmtpServer.getThisFieldIsReq();
     }
     
     @When("^User gives invalid TimeOut period$")
     public void user_gives_invalid_TimeOut_period() throws Throwable {
    	 SmtpServer.setInvalidSMTPTimeOut();
         
     }
     
     @When("^User gives valid list of Domains in Domains field$")
     public void user_gives_valid_list_of_Domains_in_Domains_field() throws Throwable {
         SmtpServer.setValidDomain();
     }
     
     @When("^User gives invalid formate TimeOut period$")
     public void user_gives_invalid_formate_TimeOut_period() throws Throwable {
    	 
    	 SmtpServer.setInvalidFormateSMTPTimeOut();
        
     }
     
     @When("^User enters existing IP Address$")
     public void user_enters_existing_IP_Address() throws Throwable {
         SmtpServer.setExistingUserName();
     }

     @When("^User click on ADD Server Button$")
     public void user_click_on_ADD_Server_Button() throws Throwable {
    	 
    	 SmtpServer.clickOnADDServerButton();
        
     }
     
     @When("^User clicks on ADD Server List Button$")
     public void user_clicks_on_ADD_Server_List_Button() throws Throwable {
         
    	 SmtpServer.clickOnADDServerListButton();
     }

     @When("^User clicks on Choose File Button$")
     public void user_clicks_on_Choose_File_Button() throws Throwable {
    	 SmtpServer.addServerList();
         
     }
     
     @When("^User Choose invalid File$")
     public void user_Choose_invalid_File() throws Throwable {
    	 SmtpServer.addServerList1();
     }
     
     @Then("^This Field Is Required Message displayed$")
     public void this_Field_Is_Required_Message_displayed() throws Throwable {
        SmtpServer.getMessage();
     }
     
     @When("^user click on the Delete Icon$")
     public void user_click_on_the_Delete_Icon() throws Throwable {
         SmtpServer.clickOnCrossDeleteIcon();
     }


}
