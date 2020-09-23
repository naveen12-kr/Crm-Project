package pages;

import org.openqa.selenium.By;

public class SavedSearches extends BasePage{
	
	public static final By byRunIcon = findBy("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr[2]/td[4]/input");
	public static final By byDeleteCrossIcon = findBy("//*[@id='main']//table/tbody/tr[2]/td[7]/input");
	
	
	////////////////////////////// CLICKERS /////////////////////////////////////
	
	public static void clickOnRunIcon() {
		
		getHandOverText();
		clickElement(byRunIcon, "Run Icon");
	}
	
	public static void clickOnDeleteIcon() {
		
		clickElement(byDeleteCrossIcon, "Delete");
	}
	
	////////////////////////////// VALIDATION ///////////////////////////////
	
	public static void getHandOverText() {
		
		String tname = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr[2]/td[4]/input")).getAttribute("title");
		System.out.println(tname+" is successfully");
	}
	
}
