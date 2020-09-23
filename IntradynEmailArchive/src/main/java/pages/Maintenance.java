package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Maintenance extends BasePage {
	
	
	public static void clickOnVisitThisSite() throws InterruptedException {
		
		driver.findElement(By.linkText("visit this page")).click();
		System.out.println("User clicks on the visit this site link");
		Thread.sleep(2000);
	}
	
	public static void getMaintenanceKeyContract() {
		
		WebElement table = driver.findElement(By.xpath("//*[@class='nomargin']"));

		List<WebElement> row1 = table.findElements(By.xpath("//*[@class='nomargin']/dl/dd"));

		System.out.println("Maintenance Key Contract : ");

		for (int i = 0; i < row1.size(); i++) {

			List<WebElement> dt = table
					.findElements(By.xpath("//*[@class='nomargin']/dl/dt['" + i + "']"));
			String s = dt.get(i).getText();

			List<WebElement> dd = table
					.findElements(By.xpath("//*[@class='nomargin']/dl/dd['" + i + "']"));
			String s1 = dd.get(i).getText();

			System.out.println(s + ": -->" + s1);
		}
		System.out.println("");
	}
}


