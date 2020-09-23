package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class OutgoingSMTP extends BasePage {

	public static final By byOutgoingMailServer = findBy("//*[@id='id_server']");
	public static final By byMailServerUserName = findBy("//*[@id='id_username']");
	public static final By byMailServerPassword = findBy("//*[@id='id_password']");
	public static final By byFromAddress = findBy("//*[@id='id_fromaddress']");
	public static final By byDisableButton = findBy("//*[@name='disable']");

	public static void setOutgoingMailServer() {

		clearText(byOutgoingMailServer, "");
		setText(byOutgoingMailServer, "Outgoing Mail Server", "intradyn-com.mail.protection.outlook.com");
	}

	public static void setInvalidOutgoingMailServer() {

		clearText(byOutgoingMailServer, "");
		setText(byOutgoingMailServer, "Outgoing Mail Server", "intrady");
	}

	public static void setOutgoingMailServerAsClear() {

		clearText(byOutgoingMailServer, "");

	}

	public static void setMailServerUserName() {

		clearText(byMailServerUserName, "");
		setText(byMailServerUserName, "Mail Server Username", "admin");
	}

	public static void setMailUserName() {

		clearText(byMailServerUserName, "");
	}

	public static void setMailPassword() {

		clearText(byMailServerPassword, "");
	}

	public static void setFromAddressAsClear() {

		clearText(byFromAddress, "");

	}

	public static void setMailServerPassword() {

		clearText(byMailServerPassword, "");
		setText(byMailServerPassword, "Mail Server Password", "admin");
	}

	public static void setInvalidFromAddress() {

		clearText(byFromAddress, "");
		setText(byFromAddress, "From Address", "ramk");
	}

	public static void setFromAddress() {

		clearText(byFromAddress, "");
		setText(byFromAddress, "From Address", "ramkumardkr@intradyn.com");
	}

	public static void clickOnDisableOutgoingMailsButton() {

		clickElement(byDisableButton, "Disable Outgoing Email");
	}

	public static boolean isDisableOutgoingMailsButtonPresent() {

		return isElementPresent(byDisableButton, "Disable Outgoing Email");
	}

	public static void isTheFieldsAreCleared() {

		String FromAddress = driver.findElement(By.xpath("//*[@id='id_fromaddress']")).getAttribute("value");
		String MailServerPassword = driver.findElement(By.xpath("//*[@id='id_password']")).getText();
		String MailServerUserName = driver.findElement(By.xpath("//*[@id='id_username']")).getText();
		String OutgoingMailServer = driver.findElement(By.xpath("//*[@id='id_server']")).getText();

		Assert.assertTrue((FromAddress.equals("")) && (MailServerPassword.equals(""))
				&& (MailServerUserName.equals("") && (OutgoingMailServer.equals(""))));

		System.out.println("INFO: All the fields are empty");

	}
}
