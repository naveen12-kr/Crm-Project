package pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LegalHolds extends BasePage{
	
	
	public final static By byCreateleaglHoldButton = findBy("//*[@id='submit']");
	public final static By byAddLegalHoldsButton= findBy("//*[@id='main']/div[2]/div/div[2]/div/div/form/input[2]");
	public final static By byLegalHoldCheckBox = findBy("//input[contains(@name,'legalhold')]");
	public final static By byLegalHoldName = findBy("//*[@id='id_cname']");
	public final static By byCurrentLegalHolds = findBy("//div//h3[contains(text(), 'Current Legal Holds')]");
	public final static By byLegalHoldDetails = findBy("//div//h1[contains(text(), 'Legal Hold Details')]");
	public final static By byOKButton = findBy("//*[@id='ok']");
	public final static By byThisFieldIsRequiredText = findBy("//*[@id='main']/div[2]/div/div[2]/div/div/form/ul/li");
	public final static By byDescriptionFieldRequired = findBy("//*[@id='main']/div/div/div/div/form/fieldset/dl[2]/dd[2]/ul/li");
	public final static By byExistingLegalHoldName = findBy("//*[@id='main']/div[2]/div/div[2]/div/div/form/ul/li");
	public final static By byCurrentEmailTags = findBy("//div//h3[contains(text(),'Current Email Tags')]");
	public final static By byCurrentLegalHoldsTable = findBy("//*[@id=\"main\"]/div[2]/div/div[2]/div/table");
	public final static By byCurrentLegalHoldsTableNotPresent = findBy("//*[@class='query-open']");
	public final static By byEntireTag = findBy("//*[@name='removeredact'][@id='tag-removeredact']");
	
	public static void clicksOnCreateLeagalHold(){
		
		clickElement(byCreateleaglHoldButton, "Add Legal Hold");
	}
	
    public static void clicksOnCurrentEmailTags() throws InterruptedException{
		
		clickElement(byCurrentEmailTags, "collapse");
		
		Thread.sleep(2000);
		
		clickElement(byCurrentEmailTags, "expanded");
	}
    
 public static void clicksOncollapseCurrentEmailTags() throws InterruptedException{
		
		clickElement(byCurrentEmailTags, "collapse");
		
		Thread.sleep(5000);
		
		
	}
	
	public static void clickOnAddLegalHoldsButton() {
		
		clickElement(byAddLegalHoldsButton, "Add Legal Holds");
	}
	
	public static void clickOnMgToViewEmailsCount() throws InterruptedException {
	   	 
		   
		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> mg= table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[3]"));
	
		Iterator<WebElement> itr = mg.iterator();	
		
		while(itr.hasNext()) {
		
			WebElement row = itr.next();
			row.click();
		     Thread.sleep(5000);
		     
		     String sr = driver.findElement(By.xpath("//*[@id='total_count']")).getText();
		     
		     int a = Integer.parseInt(sr);
		     
		     if(a<2) {
		    	 clicksOnCurentLegalHoldHeader();
		    	 Thread.sleep(3000);
		    		 
			     }
		     if(a>= 2)
	    	 {
	    		 System.out.println("List emails in a tag: " + a); 
	    		 Thread.sleep(3000);
	    		 clicksOnCurentLegalHoldHeader();
	    		 break;
	    	 }     
		}
       
     }
	
	public static void clickOnMgToViewEmails() throws InterruptedException {
	   	 
		   
		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> mg= table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[3]"));
	
		Iterator<WebElement> itr = mg.iterator();	
		
		while(itr.hasNext()) {
		
			WebElement row = itr.next();
			row.click();
		     Thread.sleep(5000);
		     
		     String sr = driver.findElement(By.xpath("//*[@id='total_count']")).getText();
		     
		     int a = Integer.parseInt(sr);
		     
		     if(a<2) {
		    	 clicksOnCurentLegalHoldHeader();
		    	 Thread.sleep(3000);
		    		 
			     }
		     if(a>= 2)
	    	 {
	    		 System.out.println("List emails in a tag: " + a); 
	    		 Thread.sleep(3000);
	    		 break;
	    	 }     
		}
       
     }
	
	public static void setExistingLegalHoldName() throws InterruptedException {
		
		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
  		String tagName = table.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[2]/td[1]")).getText();
  		Thread.sleep(2000);
  		
				
			System.out.println("Legal Hold Tag Nmae: "+tagName);
					
			driver.findElement(By.xpath("//*[@id='id_newName']")).clear();
					
			driver.findElement(By.xpath("//*[@id='id_newName']")).sendKeys(tagName);
								
	}
	
	public static void setDeleteLegalHoldName() throws InterruptedException {
		
		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
  		String tagName = table.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[2]/td[1]")).getText();
  		Thread.sleep(2000);
  		
				
			System.out.println("Legal Hold Tag Nmae: "+tagName);
			
			driver.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[2]/td[5]")).click();
			
			driver.switchTo().alert().accept();
					
			driver.findElement(By.xpath("//*[@id='id_newName']")).clear();
					
			driver.findElement(By.xpath("//*[@id='id_newName']")).sendKeys(tagName);
								
	}
	
	public static void clicksOnCurentLegalHoldHeader(){
		
		clickElement1(byCurrentLegalHolds, "Current Legal Hold Header");
	}
	
    public static void clickOnEntireTagUnredact() {
  		
  		clickElement(byEntireTag, "Entire Tag to Unredact");
  	}
	
	public static void clickOnPencilIcon() throws InterruptedException {
	   	 
		   
		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		WebElement mg= table.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[2]/td[4]"));
		mg.click();
     }
	
	public static void clickOnOKButton() {
		clickElement(byOKButton, "OK Button");
	}

	
	
	
	/////////////////////////////////////////////////////////////////////
	
	public static void legalHoldCountInTable() {
		
				
		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> mg= table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[1]"));
	
		System.out.println("No.of Legal Holds in a table: "+mg.size());
		
	}
	
	public static void getAddedTagName() {
		
		
		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		List<WebElement> mg= table.findElements(By.xpath("//*[@class='scheduled-table']/tbody/tr/td[1]"));
	
		System.out.println("No.of Legal Holds in a table: "+mg.size());
			
	}
	
	
	public static void isLegalHoldCheckBoxSelected() {
		
		isElementSelected(byLegalHoldCheckBox, "Legal Hold CheckBox");
	}
	
    public static void isCurrentLegalHoldsTable() {
		
		isElementPresent(byCurrentLegalHoldsTable, "Current Legal Holds Table");
	}
    
       public static void isCurrentLegalHoldsTableNotPresent() {
		
		isElementPresent(byCurrentLegalHoldsTableNotPresent, "Collapse");
	}
	
	public static void deselectLegalHolds(String data) throws InterruptedException
	{
		WebElement mb = driver.findElement(By.xpath("//input[contains(@name,'legalhold')]"));
		boolean status = mb.isSelected();
		
		if(status==true) {
			
			mb.click();
			System.out.println("Legal Hold check box is not selected");
		}else
		{
			System.out.println("Legal Hold check box is not selected");
		}
		
	}
	
	public static void legalHoldAddedInAllTags() {
		
		clickElement(findBy("//li//*[contains(text(),'Tags')]"), "Tags");
		sleepApplication(3000);
		
		WebElement table = driver.findElement(By.xpath("//*[@class='scheduled-table']"));
		String row1 = table.findElement(By.xpath("//*[@class='scheduled-table']/tbody/tr[2]/td[1]")).getText();
			
		System.out.println(row1+ " is added under the Tags table");
		
	}
		
	public static void isLegalHoldDetails() {
		
		isElementEnabled(byLegalHoldDetails, "Legal Hold Details");
	}
	
	public static void getThisFieldRequired() {
  		
  		getText(byThisFieldIsRequiredText, "Message");
  	}
	
    public static void getDescriptionFieldRequired() {
  		
  		getText(byDescriptionFieldRequired, "Message");
  	}
    
    public static void getExistingLegalHoldMessage() {
    	
    	getText(byExistingLegalHoldName, "");
    }
    
    public static void selectCurrentDocumentUnredact() {
  		clickElement(findBy("//*[@id='document-removeredact']"), "Current Document Unredact");
  	}
    public static void selectRemoveAllRedactions() {
  		clickElement(findBy("//*[@id=\"removeredact_form\"]/label[1]"), "Remove all Redactions");
  	}
    
    public static void selectRemoveRedaction() {
  		clickElement(findBy("//*[@id=\"removeredact_form\"]/label[1]/following::input[1]"), "Remove  Redaction");
  	}
    
    public static void selectRemoveMultipleRedaction() {
  		clickElement(findBy("//*[@id=\"removeredact_form\"]/label[1]/following::input[1]"), "Remove Multiple Redaction");
  		clickElement(findBy("//*[@id=\"removeredact_form\"]/label[1]/following::input[2]"), "Remove Multiple Redaction");
  	}
    
    

}
