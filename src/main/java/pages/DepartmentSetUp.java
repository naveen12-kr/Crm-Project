package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DepartmentSetUp extends BasePage {

	public static String user;
	public static final By byDescription = findBy("//*[@id='id_descript']");
	public static final By byAddDepartmentButton = findBy("//input[@value='Add Department']");
	public static final By byThisFieldIsReq = findBy("//ul[@class='errorlist']/li");
	public static final By byPencilIcon = findBy("//*[@id='main']/div/div[2]/div/div/table/tbody/tr[2]/td[5]/form/a");
	public static final By byDepartEmailAddress = findBy("//*[@id=\"id_newAddrs\"]");
	public static final By byNewNameDept = findBy("//*[@id='id_newName']");

	////////////////////////////////// CLICKERS
	////////////////////////////////// ////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////

	public static void clickOnAddDepartmentButton(String data) {

		clickElement(findBy("//input[@value='" + data + "']"), data + " Button");
	}

	public static void clickOnPencilIconDept() {

		//List<WebElement> list = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[4]"));
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[7]"));

		for (int i = 2; i < list.size();) {

			String type = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + i + "]/td[4]"))
					.getText();
			if (type.equals("Manual setup")) {
				int j = i - 1;
				driver.findElement(By.xpath("(//*[contains(@title,'Edit')])[" + j + "]")).click();
				System.out.println("INFO : Clicking on Pencile Icon");
				break;
			}
		}
	}

	public static void clickOnDeleteSubDepart() {

		List<WebElement> list = driver
				.findElements(By.xpath("//*[@class=\"bordered-table\"]/tbody/tr/td[2]/form/input[2]"));

		for (int i = 0; i < list.size();) {

			list.get(i).click();

			break;
		}
	}

	public static void clickOnDeleteDepartEmailAddress() {

		List<WebElement> list = driver
				.findElements(By.xpath("//*[@class='bordered-table'][2]/tbody/tr/td[2]/form/input[2]"));

		for (int i = 0; i < list.size();) {

			list.get(i).click();

			break;
		}
	}

	public static void clickOnDeleteDepartEmailConfig() {

		/*
		 * List<WebElement> list = driver .findElements(By.xpath(
		 * "//*[@class='bordered-table']/tbody/tr/td[5]/form/input[2]"));
		 * 
		 * for (int i = 0; i < list.size();) {
		 * 
		 * list.get(i).click();
		 * 
		 * break; }
		 */
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[4]"));

		for (int i = 2; i < list.size();) {

			String type = driver.findElement(By.xpath("//*[@class='bordered-table']/tbody/tr[" + i + "]/td[4]"))
					.getText();
			System.out.println(type);
			if (type.equals("Manual setup")) {
				int j = i - 1;
				driver.findElement(By.xpath("(//*[contains(@title,'Delete')])[" + j + "]")).click();
				System.out.println("INFO : Clicking on Delete Icon");
				break;
			}
		}
	}

	////////////////////////////////// SETTERS AND GETTERS
	////////////////////////////////// ///////////////////////////////////////////////
	/////////////////////////////////////////////////////////////////////////////////////////////////////

	public static void setDescription(String sText) {

		clearText(byDescription, " ");
		user = getRandomString(8);
		setText(byDescription, "Description", user);
	}

	public static void getErrorMsgThisFieldIsReq() {

		getText(byThisFieldIsReq, "Error msg");
	}

	public static void selectDepartSubDepartName() {

		WebElement selectElement = driver.findElement(By.xpath("//div//form//select[@name='newDept']"));
		Select s = new Select(selectElement);

		s.selectByIndex(0);
		WebElement ss = s.getFirstSelectedOption();
		String dd = ss.getText();
		System.out.println("INFO: Selected Department name is : " + dd);

		clickElement(byAddDepartmentButton, "Add Department Button");

		List<WebElement> list = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));

		for (int i = 0; i < list.size(); i++) {

			String text = list.get(i).getText();

			if (text.equals(dd)) {

				System.out.println("INFO: Department name" + text + "is added successfully in the table");
			}

		}
	}

	public static void setDepartEmailAddress(String sText) {

		setText(byDepartEmailAddress, "Depart Email Address", sText);
	}

	public static void getExistingDeptName() {

		List<WebElement> list = driver.findElements(By.xpath("//*[@class='bordered-table']/tbody/tr/td[1]"));
		System.out.println(list.size());
		for (int i = 0; i < list.size();) {

			String ss = list.get(i).getText();

			setText(byNewNameDept, "New Name", ss);

			break;
		}
	}

}
