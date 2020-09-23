package pages;

import org.openqa.selenium.By;

public class OutgoingSMTP extends BasePage {
	
	
	public static final By byOutgoingMailServer = findBy("//*[@id='id_server']");
	public static final By byMailServerUserName = findBy("//*[@id='id_username']");
	public static final By byMailServerPassword = findBy("//*[@id='id_password']");
	public static final By byFromAddress = findBy("//*[@id='id_fromaddress']");
	public static final By byDisableButton = findBy("//*[@name='disable']");
	public static final By byAddAddressButton = findBy("//*[@name='addaddr']");
	public static final By byRecipientAddressField = findBy("//*[@id=\"main\"]/div/div/div/div/form/fieldset/dl[1]/dd[2]/ul/li");
	public static final By byTestAll = findBy("//*[@name='testalladdrs']");
	
	
	public static void setOutgoingMailServer() {
		
		clearText(byOutgoingMailServer, "");
		setText(byOutgoingMailServer, "Outgoing Mail Server", "intradyn-com.mail.protection.outlook.com");
	}
	
	public static void setMultipleOutgoingMailServer() {
		
		clearText(byOutgoingMailServer, "");
		setText(byOutgoingMailServer, "Outgoing Mail Server", "qa@intradyn.com;a.com;b.com");
	}
	
	public static void clickOnAddAddress() {
		
		clickElement(byAddAddressButton, "Add Address");
	}
	
	public static void clickTestAll() {
		
		clickElement(byTestAll, "Test All");
	}
	
	public static void clearMandatoryfields() {
		
		clearText(byOutgoingMailServer, "");
		clearText(byFromAddress, "");		
	}	
	
	
	public static void setunauthenticatedOutgoingMailServer() {
		
		clearText(byOutgoingMailServer, "");
		setText(byOutgoingMailServer, "Outgoing Mail Server", "intramail.protection.com");
	}
	
	public static void setMailServerUserName() {
			
		clearText(byMailServerUserName, "");	
		setText(byMailServerUserName, "Mail Server Username", "admin");
		}
	
	public static void setMailServerPassword() {
		
		clearText(byMailServerPassword, "");
		setText(byMailServerPassword, "Mail Server Password", "admin");
	}
	
	public static void setFromAddress() {
		
		clearText(byFromAddress, "");
		setText(byFromAddress, "From Address", "ramkumardkr@gmail.com");
	}
	
	public static void clickOnDisableOutgoingMailsButton() {
		
		clickElement(byDisableButton, "Disable Outgoing Email");
	}
	
	public static void getRecipientAddressText() {
		
		String ra = driver.findElement(By.xpath("")).getText();
		System.out.println("Recipient address: " +ra);
	}
	
	public static void disableOutgoingEmail() {
		
		
	}

}
