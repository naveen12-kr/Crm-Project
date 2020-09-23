package pages;

import org.openqa.selenium.By;

public class LogInPage extends BasePage {

	public final static By bySignInWithUserId = findBy("//*[@id=\"user_login\"]");
	public final static By byNewSignInWithUserId = findBy("//*[@id='userNameInput']");
	public final static By byNewSignInWithUserId1 = findBy("//*[@id='username']");
	public final static By byPassword = findBy("//*[@id=\"user_pass\"]");
	public final static By byNewPassword = findBy("//*[@id='passwordInput']");
	public final static By byNewPassword1 = findBy("//*[@id='password']");
	public final static By byLoginButton = findBy("//*[contains(@id,'submit')]");
	public final static By byInvalidLogin = findBy("//*[@id=\"loginform\"]/p[4]");
	public final static By byUserText = findBy("/html/body/div/header/div/div[3]/div/div/p[1]");
	public final static By byBuildVersion = findBy("//table/tbody/tr[2]/td[2]");

	////////////////////////////////////////////////////////////
	////////////////////// Validators ////////////////////////
	///////////////////////////////////////////////////////////

	////////////////////////////////////////////////////////////
	////////////////////// Setters ///////////////////////////
	///////////////////////////////////////////////////////////

	public static void setSignInwithUserId(String sText) {
		setText(bySignInWithUserId, "User Id", sText);

	}

	public static void setNewSignInwithUserId(String sText) {
		setText(byNewSignInWithUserId, "User Id", sText);

	}

	public static void setNewSignInwithUserId1(String sText) {
		setText(byNewSignInWithUserId1, "User Id", sText);

	}

	public static void setPasswordValue(String sText) {
		setText(byPassword, "Pssword Field", sText);
	}

	public static void setNewPasswordValue(String sText) {
		setText(byNewPassword, "Pssword Field", sText);
	}

	public static void setNewPasswordValue1(String sText) {
		setText(byNewPassword1, "Pssword Field", sText);
	}

	public static boolean isSearchInputPresent() {
		return isElementPresent(byUserText, "UserId");

	}

	////////////////////////////////////////////////////////////
	////////////////////// Getters ///////////////////////////
	///////////////////////////////////////////////////////////

	public static String getErrorMsg() {
		return getText(byInvalidLogin, "Error Msg");

	}

	////////////////////////////////////////////////////////////
	////////////////////// Clickers ///////////////////////////
	///////////////////////////////////////////////////////////

	public static void clickLogIn() {
		// sleepApplication(3000);
		// setNewSignInwithUserId1(EnvironmentUtils.getConfig().getProperty("username"));
		clickElement(byLoginButton, "LogIn Button");
		waitForPageLoad(30);
		// setNewPasswordValue1(EnvironmentUtils.getConfig().getProperty("password"));
		// setNewSignInwithUserId(EnvironmentUtils.getConfig().getProperty("username1"));
		// setNewPasswordValue(EnvironmentUtils.getConfig().getProperty("password1"));
		// clickElement(byLoginButton, "LogIn Button");
		// waitForPageLoad(30);
	}

	////////////////////////////////////////////////////////////
	///////////////////// Helper Methods /////////////////////
	///////////////////////////////////////////////////////////

	public static void login() {
		waitForPageLoad(30);
		// sleepApplication(3000);
		// setNewSignInwithUserId1(EnvironmentUtils.getConfig().getProperty("username2"));
		// setNewSignInwithUserId(EnvironmentUtils.getConfig().getProperty("username1"));
		setSignInwithUserId(EnvironmentUtils.getConfig().getProperty("username"));
		waitForPageLoad(10);
		sleepApplication(3000);
		setPasswordValue(EnvironmentUtils.getConfig().getProperty("password"));
		// setNewPasswordValue(EnvironmentUtils.getConfig().getProperty("password1"));
		sleepApplication(2000);
	}

	public static void clickOnTab(String data) {
		clickElement(findBy("//li//*[contains(text(),'" + data + "')]"), data);
	}

}
