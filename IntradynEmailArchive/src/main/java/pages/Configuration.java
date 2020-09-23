package pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.set.SynchronizedSortedSet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Configuration extends BasePage {
	
	public final static By byConfiguration = findBy("/html/body/div/header/div/div[2]/ul/li[6]/a");
	public final static By byTags = findBy("//div//li//*[contains(text(), 'Tags')]");
	public final static By byLegalHolds = findBy("//li//*[contains(text(), 'Legal Holds')]");
	public final static By byAddTagTextBox = findBy("//input[contains(@name, 'newName')]");
	public final static By byAddTagButton = findBy("//*[@id='main']/div[2]/div/div[2]/div/div/form/input[2]");
	public final static By byTagName = findBy("//input[contains(@name,'cname')]");
	public final static By byDescription = findBy("//textarea[@id='id_desc']");
	public final static By byEditDescription = findBy("//textarea[@id='id_desc']");
	public final static By byMagnifyingGlassList = findBy("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr[i]/td[4]/a/img");
	public final static By byLegalHoldCheckBox = findBy("//input[contains(@name,'legalhold')]");
	public final static By byCreateTagButton = findBy("//input[contains(@value, 'Create Tag')]");
	public final static By byNewTagConfigurationHeader = findBy("//div//h1[contains(text(), 'New Tag Configuration')]");
	public final static By byPenIcon = findBy("//*[@id='main']/div[3]/div/div[2]/div/table/tbody/tr[3]/td[5]/a/img");
	public final static By byDelete = findBy("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr[2]/td[6]/form/input[2]");
	public final static By byMagnifyingGlass = findBy("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr[3]/td[4]/a/img");
	public final static By byEmptyTag = findBy("//div//li[contains(text(),'This field is required')]");
	public final static By byCurrentEmailTagsHeader = findBy("//div//h3[contains(text(), 'Current Email Tags')]");
	public final static By bySaveChanges = findBy("//*[@id='submit']");
	public final static By byConfigIdAlreadyExists = findBy("//*[@id='main']/div[2]/div/div[2]/div/div/form/ul/li");
	public final static By bycrossIcon = findBy("//*[@id='main']//table/tbody/tr[2]/td[6]/form/input[2]");
	public final static By byEmailView = findBy("//*[@id='emails-list']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/b/u");
	public final static By byEmailDisplay = findBy("//*[@id='plainBody']/div");
	public final static By byEmailCheckBox = findBy("//*[@id='main']/div[3]/div/div[1]/div[1]/div[2]/ul/li[1]/label/span");
	public final static By byForwardPopup = findBy("//span[contains(text(),'Forward')]");
	public static final By byForwardOkbutton=findBy("//div[4]//*[contains(text(),'Ok')]");
	public static final By byForwardSecondWindowOk = findBy("/html/body/div[10]/div[3]/div/button");
	public static final By byPrintToPDFOKButton = findBy("/html/body/div[3]/div[3]/div/button");
	public static final By byPDFOKButton = findBy("/html/body/div[7]/div[3]/div/button");
	public static final By byTagOKButton = findBy("/html/body/div[10]/div[3]/div/button");
	public static final By byEmailDisplayed = findBy("//*[@id='emailDisplayContent']");
	public static final By byIncludeAttachments = findBy("//*[@id=\"pdf_attach\"]");
	public static final By byEntireTag = findBy("//*[@name='redact'][@id='tag-redact']");
	public static final By byIntradynLogo = findBy("/html/body/div/header/div/div[1]/a/img");
	public static final By byDashboadPage = findBy("//*[@id='main']/div/div[1]/div/h1");
	public static final By byAccountSettingsIcon = findBy("/html/body/div/header/div/div[3]/ul/li[1]/a");
	public static final By byAccountSettingsPage = findBy("//*[@id='content']/h1");
	public static final By byHelpIcon = findBy("/html/body/div/header/div/div[3]/ul/li[2]/a");
	public static final By byLogoutIcon = findBy("/html/body/div/header/div/div[3]/ul/li[3]/a");
	public static final By byLoginPage = findBy("//*[@id='user_login']");
	public static final By byHomeLogoCollapseIcon = findBy("//*[@id='menu-collapse']");
	public static final By bySettingsDisplay = findBy("//*[@id='left-menu']/h3[1]");
	
	
	
	//////////////////////////// CLICKERS ///////////////////////
	
	
	public static void clickOnForwardOKbutton() {
		clickElement(byForwardOkbutton,"Ok button");
		sleepApplication(3000);
	}
	
	public static void clickOnSecondForwardOKbutton() {
		clickElement(byForwardSecondWindowOk,"Ok button");
		sleepApplication(3000);
	}
	
	public static boolean isExportPopUpPresent() {
		return isElementPresent(byForwardPopup,"Forward PopUp");
	}
	
	public static void clicksOnLinkTab(String data){
	clickElement(findBy("//li//*[contains(text(), '"+data+"')]"), data);
	}
	
	public static void clicksOnSecondWindow(String data){
		
		clickElement(findBy("//div//*[@class='"+data+"']"), data);
		
		}
	
	
	public static void clickOnConfiguration() {
		
		clickElement(byConfiguration, "Configuration");
	}
	
	public static void clickOnPDFCheckBox() {
		
		clickElement(findBy("//*[@id='pdf_attach']"), "Include Attachments");
	}
	
   public static void clickOnLegalHoldCheckBox() {
	   
		
		clickElement(byLegalHoldCheckBox, "Legal Hold CheckBox");
	}
	
	public static void clickOnTags() {
		
		clickElement(byTags, "Tags");
	}
	
	public static void clickOnLegalHolds() {
		
		clickElement(byLegalHolds, "Legal Holds");
	}
	
     public static void clickOnCreateTagButton() {
		
		clickElement(byCreateTagButton, "Create New Tag");
	}
     
     public static boolean isDescDisabled() {
    	 
    	 
    	 isElementEnabled(byDescription, "Discription field");
    	 
		return false;
    	 
    	 
     }

    public static void clickOnMgToViewEmails() throws InterruptedException {
    	 
   
		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
		List<WebElement> mg= table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[4]"));
	
		Iterator<WebElement> itr = mg.iterator();	
		
		
		while(itr.hasNext()) {
			
			
			WebElement row = itr.next();
			row.click();
		     Thread.sleep(3000);
		     
		     String sr = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();
		     Thread.sleep(3000);
		     
		     String[] r = sr.split(" ");
		     
		     String total_count = r[3];
		     int a = Integer.parseInt(total_count);
		     
		     try {
		    	 if(a==0) {
			    	 
		    		 clickONCurrentEmailTagsHeader1();
		    		 Thread.sleep(3000); 
			     }
		    	 
		     }catch(Exception e)
		     {
		    	 System.out.print(e);
		     }
		     finally
		     {
		    	 if(a!=0)
		    	 {
		    		 System.out.println("INFO: Total number of emails in a tag: " + a); 
		    		 Thread.sleep(3000);
		    		 break;
		    	 }
		     }		     
		}
       
     }
    
    public static void clickOnMgToViewEmailsCount() throws InterruptedException {
   	 
    	   
		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
		List<WebElement> mg= table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[4]"));
	
		Iterator<WebElement> itr = mg.iterator();	
		
		
		while(itr.hasNext()) {
			
			
			WebElement row = itr.next();
			row.click();
		     Thread.sleep(3000);
		     
		     String sr = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();
		     Thread.sleep(3000);
		     
		     String[] r = sr.split(" ");
		     String total_count = r[3];
		     int a = Integer.parseInt(total_count);
		     
		     
		     
		     try {
		    	 if(a<=2) {
			    	 
		    		 clickONCurrentEmailTagsHeader1();
		    		 Thread.sleep(3000);
		    		 
			     }
		    	 
		     }catch(Exception e)
		     {
		    	 System.out.print(e);
		     }
		     finally
		     {
		    	 if(a>2)
		    	 {
		    		 System.out.println("INFO: Total number of emails in a tag: " + a); 
		    		 
		    		 Thread.sleep(3000);
		    		 break;
		    	 }
		     }		     
		}
       
     }
    
    public static void clickOnMgNoEmailsUnderTag() throws InterruptedException {
   	     	   
		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
		List<WebElement> mg= table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[4]"));
	
		Iterator<WebElement> itr = mg.iterator();	
				
		while(itr.hasNext()) {
						
			WebElement row = itr.next();
			row.click();
		     Thread.sleep(3000);
		     
		     String sr = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();
		     Thread.sleep(3000);
		     
		     String[] r = sr.split(" ");
		     String total_count = r[3];
		     int a = Integer.parseInt(total_count);
		     
		     try {
		    	 if(a==0) {
		    		 
		    		 System.out.println("INFO: Total number of emails in a tag: " + a); 
		    		 clickONCurrentEmailTagsHeader1();
		    		 Thread.sleep(3000);
			    	  
			     }
		     }catch(Exception e)
		     {
		    	 System.out.print(e);
		     }
		     finally
		     {
		    	 if(a!=0)
		    	 {

		    		 clickONCurrentEmailTagsHeader1();
		    		 Thread.sleep(3000); 
		    	 }
		     }		     
		}
       
     }
    
    public static void getValidLegalHoldsFromTable() throws InterruptedException {
    	
    	WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
		List<WebElement> pencil = table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[3]"));
		Thread.sleep(2000);
		
		System.out.println(pencil.size());
    	
    }
    
     
     public static void clickOnPencilAndEditDesc() throws InterruptedException {
    	 
    	   
		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
		List<WebElement> pencil = table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[5]/a"));
		Thread.sleep(2000);
		
		for(int l=1; l<=pencil.size(); l++)
		{
			
			WebElement table1 = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
			List<WebElement> row = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+l+"']/td[5]/a"));
			Thread.sleep(2000);
			row.get(l).click();
			
			boolean i = isLegalHoldCheckBoxSelected();
			 System.out.println(i);
		     
		     if(i == true)
		    {
		    	 driver.findElement(By.xpath("//*[@id='ok']")).click();
		    	 
		    	/* driver.navigate().to(EnvironmentUtils.getConfig().getProperty("intradyn_url"));
				 driver.navigate().refresh();*/
		    	 break;
		     }
		     else
		     {
						    
			 driver.findElement(byDescription).clear();
		     Thread.sleep(3000);
		     
		     String newDesc = getRandomString(10);
		     driver.findElement(byDescription).sendKeys(newDesc);
		     Thread.sleep(3000);
		     
		     clickOnSaveChanges();
		     System.out.println("INFO: Description edited successfully");
		     Thread.sleep(10000);
		    break;
			/* driver.navigate().to(EnvironmentUtils.getConfig().getProperty("intradyn_url"));
			 Thread.sleep(3000);
			 driver.navigate().refresh();*/
			 
		     }
		}
		
		
     }
     
     public static void getValidLeagalHold() throws InterruptedException {
    	 
  	   
 		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
 		List<WebElement> row1 = table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[3]"));
 		Thread.sleep(2000);
 		
 		System.out.println("INFO: Number of rows in a table " +row1.size());

 			String[] nameArray = new String[row1.size()];
 						
 			for(int i = 0; i < row1.size(); i++ )
 			{
 				WebElement table1 = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
 				List<WebElement> row = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[3]"));
 		 		
 				nameArray[i] = row.get(i).getText();
 				
 				if(nameArray[i].equals("True"))
 				{
 					
 					List<WebElement> name = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[1]"));
 					System.out.println("INFO: Current Legal Hold Tag Nmae: "+name.get(i).getText()); 
 					
 					
 					/*List<WebElement> row3 = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[5]/a"));
 					Thread.sleep(2000);
 					row3.get(i).click();
 					
 					String page1 = driver.findElement(By.xpath("//div//h1[contains(text(),'Legal Hold Details')]")).getText();
 					System.out.println("The defintion of the selected "+page1+" displayed");
 					
 					Thread.sleep(3000);
 					driver.findElement(By.xpath("//*[@id='ok']")).click();
 					
 					String page = driver.findElement(By.xpath("//div//h3[contains(text(),'Current Legal Holds')]")).getText();
 					System.out.println(page+" is returned");
 			  
 					Thread.sleep(3000);
 			    	 driver.navigate().to(EnvironmentUtils.getConfig().getProperty("intradyn_url"));
 					 driver.navigate().refresh();*/
 				}	
 			}		
 			
     }
 
     public static void clickOnPencilIcon() throws InterruptedException {
    	 
  	   
 		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
 		List<WebElement> pencil = table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[5]/a"));
 		Thread.sleep(2000);
 		
 		String[] nameArray = new String[pencil.size()];
 		
 		for(int i=0; i<pencil.size(); i++)
 		{
 			WebElement table1 = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
				List<WebElement> row = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[3]"));
		 		
				nameArray[i] = row.get(i).getText();
				
				if(nameArray[i].equals("True"))
				{
					List<WebElement> name = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[1]"));
 					System.out.println("INFO: Legal Hold Tag Nmae: "+name.get(i).getText());
					
					List<WebElement> lp = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[5]/a"));
					Thread.sleep(2000);
					lp.get(i).click();
					
					String page1 = driver.findElement(By.xpath("//div//h1[contains(text(),'Legal Hold Details')]")).getText();
					System.out.println("INFO: The defintion of the selected "+page1+" displayed");
					
					
					Thread.sleep(3000);
					driver.findElement(By.xpath("//*[@id='ok']")).click();
					
					String page = driver.findElement(By.xpath("//div//h3[contains(text(),'Current Legal Holds')]")).getText();
					System.out.println("INFO: "+page+" is returned");
			  
				/*	Thread.sleep(3000);
			    	 driver.navigate().to("https://10.100.1.134/tagging/tag/");
					 driver.navigate().refresh();*/
					break;
 		     }
 		}
 		
 		
      }
     
     public static void clickOnPencil() throws InterruptedException {
    	 
    	   
  		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
  		List<WebElement> pencil = table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[5]/a"));
  		Thread.sleep(2000);
  		
  		String[] nameArray = new String[pencil.size()];
  		
  		for(int i=0; i<pencil.size(); i++)
  		{
  			WebElement table1 = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
 				List<WebElement> row = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[3]"));
 		 		
 				nameArray[i] = row.get(i).getText();
 				
 				if(nameArray[i].equals("False"))
 				{
 					
 					List<WebElement> name = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[1]"));
  					System.out.println("Legal Hold Tag Nmae: "+name.get(i).getText());
 					
 					List<WebElement> lp = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[5]/a"));
 					Thread.sleep(2000);
 					lp.get(i).click();
 					
 				//	String page = driver.findElement(By.xpath("//div//h3[contains(text(),'Current Legal Holds')]")).getText();
				//	System.out.println(page+" is returned");
 			  
 					Thread.sleep(3000);
 			  // 	 driver.navigate().to("http://10.100.1.134/tagging/tag/");
 			//		 driver.navigate().refresh();
 					sleepApplication(5000);
 					break;
  		     }
  		}
  		
  		
       }
     
     public static void clickONCurrentEmailTagsHeader() {
    	 
    	 clickElement(byCurrentEmailTagsHeader, "Current Email header");
     }
	
     public static void clickONCurrentEmailTagsHeader1() {
    	 
    	 clickElement1(byCurrentEmailTagsHeader, "Current Email header");
     }
	
	public static void setAddNewTagText(String Ram) {
			
		setText(byAddTagTextBox, "Add New Tag", Ram);
	}
	
	public static void clickOnAddTagsButton() {
		
		clickElement(byAddTagButton, "Add Tag Button");
	}
	
	
	public static void clickOnCrossDeleteIcon() {
		
		String delete = driver.findElement(bycrossIcon).getAttribute("title");
		
		clickElement(bycrossIcon, "Delete Icon");
		
		System.out.println(delete+" is ready for delete");
	}
	
	public static void clickOnEmailToView() {
		
		clickElement(byEmailView, "Email");
	}
	
	public static void clickOnAnotherEmailToView() {
		
		clickElement(findBy("//*[@id='emails-list']/div[3]/div/div[2]/div[2]/div[1]/div[1]/b/u"), "Another Email");
	}
	
	public static void clickOnRightClickOpenHere() {
		
		WebElement link = driver.findElement(By.xpath("//*[@id='emails-list']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/b/u"));
		Actions action = new Actions(driver);
		action.contextClick(link).build().perform();
		driver.findElement(By.xpath("//div[@id='jqContextMenu']//ul//li[@id='menu_open_here']")).click();
		System.out.println("Right click operation performed successfully");
	
	}
	
	public static void clickOnRightClickOpenNewTab() {
		
		WebElement link = driver.findElement(By.xpath("//*[@id='emails-list']/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/b/u"));
		Actions action = new Actions(driver);
		action.contextClick(link).build().perform();
		driver.findElement(By.xpath("//div[@id='jqContextMenu']//ul//li[@id='menu_open_there']")).click();
		System.out.println("Right click operation performed successfully");
	
	}
	
	public static void clickOnEmailsCheckBox() {
		
		clickElement(byEmailCheckBox, "Email Check Box");
	}
	
	public static void clickOnPrintToPDF() {
		Actions action = new Actions(driver);
		WebElement print = driver.findElement(By.xpath("//*[@id='print']"));
		action.moveToElement(print).moveToElement(driver.findElement(By.xpath("//*[@id='print_pdfs']"))).click().build().perform();		
	}
	
	public static void clickOnPDFOKbutton() {
		clickElement(byPrintToPDFOKButton,"Ok button");
		sleepApplication(5000);
	}
	public static void clickOnPDFOKbutton2() {
		clickElement(byPDFOKButton,"Ok button");
		sleepApplication(5000);
	}
	
	public static void clickOnTagOKbutton() {
		clickElement(byTagOKButton,"Ok button");
		sleepApplication(5000);
	}
	
	public static void clickOnRemoveTagTab() {
		Actions action = new Actions(driver);
		WebElement tag = driver.findElement(By.xpath("//*[@id='tag']"));
		action.moveToElement(tag).moveToElement(driver.findElement(By.xpath("//*[@id='delete_tag']"))).click().build().perform();		
	}
	
	public static void clickOnIntradynLogo() {
		
		clickElement(byIntradynLogo, "Intradyn Logo");
	}
	
	public static void clickOnAccountSettingsIcon() {
		
		clickElement(byAccountSettingsIcon, "Account Settings Icon");
	}
	
	public static void clickOnHelpIcon() {
		
		clickElement(byHelpIcon, "Help Icon");
	}

	public static void clickOnLogoutIcon() {
	
	clickElement(byLogoutIcon, "Logout Icon");
	}
	
	public static void clickOnHomeLogoCollapseIcon() {
		
		clickElement(byHomeLogoCollapseIcon, "Main Collapse Icon");
	}
	
	
	
	
	
	
	////////////////////////////////////////////////////////////////////////
	
	public static void setDescription(String description) {
		
		setText(byDescription, "description", description);
	}
	
		
	public static void editDescription(String description) throws InterruptedException {
	
		driver.findElement(byDescription).clear();
		
		Thread.sleep(3000);
		}
	
	public static boolean isLegalHoldCheckBoxPresent() {
		
		return isElementPresent(byLegalHoldCheckBox, "Legal Hold CheckBox");
	}
	
	public static boolean isTagAddSuccesfully() {
		
		WebElement message = driver.findElement(By.xpath("//*[@id='main']/div[1]"));
		String msg = message.getText();
		
		System.out.println("INFO: "+ msg);
		return msg != null;
		
		
	}
	
	
	public static void isDescriptionFieldEmpty() {
		
		WebElement message = driver.findElement(By.xpath("//*[@id='id_desc']"));
		boolean msg = message.getText().isEmpty();
					
			System.out.println("INFO: The Description field is empty :" +msg);
			
	}
	
	public static void setExistingTagName() throws InterruptedException {
		
		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
  		List<WebElement> pencil = table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[5]/a"));
  		Thread.sleep(2000);
  		
  		String[] nameArray = new String[pencil.size()];
  		
  		for(int i=0; i<pencil.size(); i++)
  		{
  			WebElement table1 = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
 				List<WebElement> row = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[3]"));
 		 		
 				nameArray[i] = row.get(i).getText();
 				
 				List<WebElement> name = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[1]"));
 				
 				String lhNames = name.get(i).getText();
 				
					System.out.println("Legal Hold Tag Nmae: "+lhNames);
					
					driver.findElement(By.xpath("//*[@id='id_newName']")).clear();
					
					driver.findElement(By.xpath("//*[@id='id_newName']")).sendKeys(lhNames);
					
					clickOnAddTagsButton();
					
					Thread.sleep(3000);
					
					Configuration.getMsgConfigIdAlreadyExists();			
					
  		}
 				
 		
	}
	
public static void setExistingTagNameAsUpperCase() throws InterruptedException {
		
		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
  		List<WebElement> pencil = table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[5]/a"));
  		Thread.sleep(2000);
  		
  		String[] nameArray = new String[pencil.size()];
  		
  		for(int i=0; i<pencil.size(); i++)
  		{
  			WebElement table1 = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
 				List<WebElement> row = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[3]"));
 		 		
 				nameArray[i] = row.get(i).getText();
 				
 				List<WebElement> name = table1.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr['"+i+"']/td[1]"));
 				
 				String lhNames = name.get(i).getText();
 				
					System.out.println("Legal Hold Tag Nmae: "+lhNames);
					
					driver.findElement(By.xpath("//*[@id='id_newName']")).clear();
					
					driver.findElement(By.xpath("//*[@id='id_newName']")).sendKeys(lhNames.toUpperCase());
					
					clickOnAddTagsButton();
					
					Thread.sleep(3000);
					
					String text = driver.findElement(By.xpath("//div//h1[contains(text(), 'New Tag Configuration')]")).getText();
					System.out.println(text);
					
					driver.navigate().back();
					
					Thread.sleep(3000);
					
  		}
 				
 		
	}
	
		
  	public static boolean isLegalHoldCheckBoxSelected() {
		
		return isElementSelected(byLegalHoldCheckBox, "Legal Hold CheckBox");
	}
  
  	public static boolean isEmptyTag() {
		
		return isElementPresent(byEmptyTag, "This fied is required");
	}
  
  	public static void clickOnSaveChanges() {
	  
	  clickElement(bySaveChanges, "Save Changes");
	  
  	}
  	
  	public static void getMsgConfigIdAlreadyExists() {
  		
  		getText(byConfigIdAlreadyExists, "");
		
	}
  	
  	public static void selectDateinDescOrder(String data) throws InterruptedException
	{
		WebElement mb = driver.findElement(By.xpath("//*[@id='sort']"));
		Select s = new Select(mb);
		s.selectByVisibleText(data);
		System.out.println(data + " is selected");
	}
  	
  	public static void selectCheckBoxInTag() throws InterruptedException
	{
  		/*String num = getRandomIntiger(1);
  		int i = Integer.parseInt(num);
  		
		driver.findElement(By.xpath("//*[@id='lookup_items']/input['"+i+"']")).click();*/
  		
  		List<WebElement> ele = driver.findElements(By.xpath("//*[@id='lookup_items']/input"));	
		ele.get(0).click();	
		sleepApplication(2000);
	}
  	
  	
  	public static void isDateSortedOrder()
	{
  		
  		String row1 = driver.findElement(By.xpath("//*[@id='emails-list']/div[3]/div/div[1]/div[3]/div[1]")).getText();
  		String row2 = driver.findElement(By.xpath("//*[@id='emails-list']/div[3]/div/div[3]/div[3]/div[1]")).getText();
			System.out.println("Emails Dates:");	
			System.out.println(row1);
			System.out.println(row2);
	
			if((row1.compareTo(row2)) < 0)
			{
			System.out.println("The Mail Dates are in accending Order");
			
			}
			else if((row1.compareTo(row2)) > 0)
			{
				System.out.println("The Mail Dates are in Decending Order");
			}
			else
			{
				System.out.print("Both the Mail Dates are same");
			}
	
	}
  	
  	public static void isEmailAddressInSortedOrder()
	{
  		
  		String address1 = driver.findElement(By.xpath("//*[@id='emails-list']/div[3]/div/div[1]/div[2]/div[2]/span[1]")).getText();
  		String address2 = driver.findElement(By.xpath("//*[@id='emails-list']/div[3]/div/div[2]/div[2]/div[2]/span[1]")).getText();
			System.out.println("Emails Addresses:");	
			System.out.println(address1);
			System.out.println(address2);
		
			if((address1.compareTo(address2)) < 0)
			{
			System.out.println("The Mail Addresses are in accending Order");
			
			}
			else if((address1.compareTo(address2)) > 0)
			{
				System.out.println("The Mail Addresses are in Decending Order");
			}
			else
			{
				System.out.print("Both the Mail Addresses are same");
			}
	}
  	
  	public static void isEmailSubjectsInSortedOrder()
	{
  		
  		String subject1 = driver.findElement(By.xpath("//*[@id='emails-list']/div[3]/div/div[1]/div[2]/div[1]/div[1]/b/u")).getText();
  		String subject2 = driver.findElement(By.xpath("//*[@id='emails-list']/div[3]/div/div[2]/div[2]/div[1]/div[1]/b/u")).getText();
			System.out.println("Emails Subjects:");	
			System.out.println(subject1);
			System.out.println(subject2);
	
			if((subject1.compareTo(subject2)) < 0)
			{
			System.out.println("The Mail Subjects are in accending Order");
			
			}
			else if((subject1.compareTo(subject2)) > 0)
			{
				System.out.println("The Mail Subjects are in Decending Order");
			}
			else
			{
				System.out.print("Both the Mail Subjects are same");
			}
	}

  	public static void isEmailDisplay() {
  		
  		isElementPresent(byEmailDisplay, "Email Display");
  	}
  	
  	public static void isCommentsPageDisplay() {
  		
  		isElementPresent(findBy("//h1[contains(text(),'Message Tags and Comments')]"), "Message Tags and Comments Page");
  	}
  	
  	public static void isEmailDisplayinNewWindow() throws InterruptedException {
  		
  		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> I1 = s1.iterator();
		while(I1.hasNext()) {
			
			String child_window = I1.next();
			if(!parent.equals(child_window)) {
				
				driver.switchTo().window(child_window);
				
				System.out.println(driver.switchTo().window(child_window).getTitle());
			}
		}
		
		Thread.sleep(5000);
		
		isElementPresent(byEmailDisplay, "Email Display in New Window");
		
		driver.switchTo().window(parent);
  		
  	}
  	
  	public static void isPrintDisplayinNewWindow() throws InterruptedException {
  		
  		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> I1 = s1.iterator();
		while(I1.hasNext()) {
			
			String child_window = I1.next();
			if(!parent.equals(child_window)) {
				
				driver.switchTo().window(child_window);
				Thread.sleep(3000);
				
				System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
			}
		}
				
		driver.switchTo().window(parent);
		System.out.println("Successfully displayed in new window");
  		
  	}
  	
  	public static void isPDFDisplayinNewWindow() throws InterruptedException {
  		
  		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> I1 = s1.iterator();
		while(I1.hasNext()) {
			
			String child_window = I1.next();
			if(!parent.equals(child_window)) {
				
				driver.switchTo().window(child_window);
				Thread.sleep(3000);
				
				System.out.println(driver.switchTo().window(child_window).getCurrentUrl());
			}
		}
				
		driver.switchTo().window(parent);
		System.out.println("Successfully displayed in new window");
  		
  	}
  	
  	public static void getSelectedEmailsDisplay() {
  		
  		String name = driver.findElement(By.xpath("//*[@id='selected_total']")).getText();
  		
  		System.out.println("Total Mails "+name);
  	}
  	
  	public static void getEmailDisplayed()
  	{
  		String msg = driver.findElement(By.xpath("//*[@id='emailDisplayContent']")).getText();
  		System.out.println(msg);
  	}
  	
  	public static void getDownload() {
  		
  		Actions action = new Actions(driver);
		WebElement toolBar = driver.findElement(By.xpath("//*[@id=\"toolbar\"]"));
		action.moveToElement(toolBar).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"download\"]"))).click().build().perform();	
  		
  	}
  	
  	public static void clickOnEntireTag() {
  		
  		clickElement(byEntireTag, "Entire Tag");
  	}
  	
  	public static void selectCurrentDocument() {
  		clickElement(findBy("//*[@id='document-redact']"), "Current Document");
  	}
  	
  	public static void clickOnRedactOKButton() {
  		clickElement(findBy("/html/body/div[5]/div[11]/div/button"), "Redact OK Button");
  	}
  	
  	public static void clickOnUnredactOKButton() {
  		clickElement(findBy("/html/body/div[6]/div[11]/div/button"), "Unredact OK Button");
  	}
  	
  	public static void selectRemoveFromCurrentEmail() {
  		
  		clickElement(findBy("//*[@id='document-removeredact']"), "Remove From Current Email");
  	}
  	
  	public static void selectRemoveFromEntireTag() {
  		
  		clickElement(findBy("//*[@id='tag-removeredact']"), "Remove From Entire Tag");
  	}
  	
  	public static void selectRemoveAllRedactions() {
  		
  		clickElement(findBy("//*[@id='select-all']"), "Remove All Redactions");
  	}
   	
  	public static void getCurrentEmailTags() throws InterruptedException {
  		
  		WebElement table = driver.findElement(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table"));
 		List<WebElement> row1 = table.findElements(By.xpath("//*[@id='main']/div[2]/div/div[2]/div/table/tbody/tr/td[3]"));
 		Thread.sleep(2000);
 		
 		System.out.println("Current Email Tags Table is displaying");
 		System.out.println("INFO: Number of rows in a table " +row1.size());
  	}
  	
  	public static void isEmailsTagsTableDisplay() {
  		
  		isElementPresent(findBy("//*[@id='main']/div[2]/div/div[2]/div[@style='display: none;']"), "Collapse Icon");
  		System.out.println("Current Emails Tags Table is Minimised");
  	}
  	
  	public static void isDashboardPage() {
  		
  		isElementPresent(byDashboadPage, "Dashboard Page");
  	}
  	
  	public static void isAccountSettingsPage() {
  		
  		isElementPresent(byAccountSettingsPage, "Account Settings Page");
  	}
  	
  	public static void getHelpDocumentation() throws InterruptedException {
  		
  		String parent = driver.getWindowHandle();
		Set<String> s1 = driver.getWindowHandles();
		
		Iterator<String> I1 = s1.iterator();
		while(I1.hasNext()) {
			
			String child_window = I1.next();
			if(!parent.equals(child_window)) {
				
				driver.switchTo().window(child_window);
				
				System.out.println("New Window Title: "+driver.switchTo().window(child_window).getTitle());
			}
			System.out.println("Help Documentation is displayed in new Window");
		}
		
		Thread.sleep(3000);		
		driver.switchTo().window(parent);
  		
  	}
  	
  	public static void isLoginPageDisplay() {
  		isElementPresent(byLoginPage, "Login Page");
  		
  	}
  	
  	public static void isSettingsHeaderDisplay() {
  		
  		isElementPresent(bySettingsDisplay, "Side Menu");
  	}
  	
  	public static void isSideMenuDisplay() {
  		
  		isElementPresent(findBy("//*[@id='left-menu'][@style='display: none;']"), "Collapse Icon");
  		System.out.println("Side Menu is disappeared");
  	}
  	
  	public static void selectMakeThisDefault() {
  		clickElement(findBy("//*[@id='make_default']"), "Make This The Default");
  	}
  	
  	public static void selectEmailText() {
  		
  		WebElement data = driver.findElement(By.xpath("//*[@id='plainBody']/div"));
  		
  		//JavascriptExecutor js = (JavascriptExecutor)driver;
  		//js.executeScript("arguments[0].setAttribute('style','background: blue;');", data);
  		
  		Actions action = new Actions(driver);
  		action.moveToElement(data,10,30).click().keyDown(Keys.SHIFT).moveToElement(data, 60, 0).click().keyUp(Keys.SHIFT).build().perform();
  	}
  	
  	public static void selectEmailBodyText() {
  		
  		WebElement data = driver.findElement(By.xpath("//*[@id='plainBody']/div"));
  		
  		Actions action = new Actions(driver);
  		action.moveToElement(data,10,30).click().keyDown(Keys.SHIFT).moveToElement(data, 60, 0).click().keyUp(Keys.SHIFT).build().perform();
  	}
  	
  	public static void selectHeaderValue() throws InterruptedException {
  		
  		WebElement data = driver.findElement(By.xpath("//*[@id='msgView']/tbody/tr[5]/td[2]"));
  		
  		Actions action = new Actions(driver);
  		action.moveToElement(data,100, 0).click().keyDown(Keys.SHIFT).moveToElement(data, 200, 0).click().keyUp(Keys.SHIFT).build().perform();
  		    		
  	}
  	
  	public static void selectHeaderLabels() throws InterruptedException {
  		
  		WebElement data = driver.findElement(By.xpath("//*[@id=\"msgView\"]/tbody/tr[1]"));
  		
  		Actions action = new Actions(driver);
  		action.moveToElement(data).doubleClick().build().perform();
  		Thread.sleep(2000);
    		
  	}
  	
  	public static void selectEmailAttachment() throws InterruptedException {
  		
  		WebElement data = driver.findElement(By.xpath("//*[@id=\"msgView\"]/tbody/tr[6]/td[2]/a[1]"));
  		
  		Actions action = new Actions(driver);
  		action.moveToElement(data,100, 0).click().keyDown(Keys.SHIFT).moveToElement(data, 200, 0).click().keyUp(Keys.SHIFT).build().perform();
  		    		
  	}
  	
  	public static void getEmailText() {
  		
  		System.out.println("Redacted Text is:");
  		String data = driver.findElement(By.xpath("//*[@id='plainBody']/div")).getText();
  		System.out.println(data);
  	
  	}
  	
  	public static void getAnotherEmailText() {
  		
  		System.out.println("Pop Up window is not displayed.");
  		
  		System.out.println("Redacted Text is:");
  		String data = driver.findElement(By.xpath("//*[@id='plainBody']/div")).getText();
  		System.out.println(data);
  	
  	}
  	
  	public static void getLabelText() {
  		
  		String data = driver.findElement(By.xpath("//*[@id=\"msgView\"]/tbody/tr[1]")).getText();
  		System.out.println("Email Header Text :" +data);
  		
  	}
  	
  	public static void getAttachments() {
  		
  		
  	}
  		
}
