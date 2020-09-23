package com.intradyn.EmailArchive;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.LogInPage;
import pages.Navigation;

public class LoginPageDef extends BasePage{
	
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
	   openUrl();
	   waitForPageLoad(30000);
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		LogInPage.login();
	}

	@When("^User click the login button$")
	public void user_click_the_login_button() throws Throwable {
		
		LogInPage.clickLogIn();
	}

	@Then("^User are successfully logged in the New-UI app$")
	public void user_are_successfully_logged_in_the_New_UI_app() throws Throwable {
		
		Assert.assertTrue(LogInPage.isSearchInputPresent());
		sleepApplication(2000);
		Navigation.clickOnUserandGroupsLPanel("System Summary");
		sleepApplication(3000);
		String version=driver.findElement(findBy("//table//tbody//tr[2]//td[2]")).getText();
		pages.EnvironmentUtils.setProperty("version", version);	
	   
	}
	
}