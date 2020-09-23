package pages;

import org.openqa.selenium.By;

public class Exportemail extends BasePage{
	
	public static final By byExportPopup = findBy("//span[contains(text(),'Export')]");
	public static final By byExportOkbutton = findBy("//div[2]//*[contains(text(),'Ok')]");
	
	
	
	
	 //////////////////////////////////VALIDATION//////////////////////////////////////////////////////////////
	 //////////////////////////////////////////////////////////////////////////////////////////////////////
	public static boolean isExportPopUpPresent() {
		return isElementPresent(byExportPopup,"Export PopUp");
	}
	
	//////////////////////////////////CLICKER//////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void clickOnElementId(String data) {
		clickElement(findBy("//*[@id='" + data + "']"), data);
		sleepApplication(2000);
		
	}
	public static void clickOnExportOKbutton() {
		clickElement(byExportOkbutton,"Ok button");
		sleepApplication(5000);
	}
	
	
	
	//////////////////////////////////SETTER//////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void setTextOnElementId(String data,String name) {
	setText(findBy("//*[@id='"+data+"']"),data, name);
	sleepApplication(1000);
	}
	
	public static void selectTextFromId(String id,String data) {
		setSelectBoxText(findBy("//*[@id='"+id+"']"), data, data);
		sleepApplication(1000);
	}
	
}
