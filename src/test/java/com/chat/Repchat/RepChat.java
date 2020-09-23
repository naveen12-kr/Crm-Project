
package com.chat.Repchat;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RepChat {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://dart.ionlake.com/dart");

		Thread.sleep(3000);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='dijit_form_TextBox_0']")).sendKeys("naveen.kumar@zanjo.io");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@id='dijit_form_Button_0_label']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"dijit_form_TextBox_1\"]")).sendKeys("aMz3pba09rru");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@id='dijit_form_Button_0_label']")).click();

		Thread.sleep(5000);

		driver.manage().window().maximize();

		Thread.sleep(5000);

		sendMsg();

	}

	public static void sendMsg() throws Throwable {

		driver.findElement(By.xpath("//div[@class='appItem']//div[@class='title'][contains(text(),'Messages')]"))
				.click();

		Thread.sleep(3000);
		List<WebElement> msg = driver
				.findElements(By.xpath("//div[@class='leftAppPanelInner']//div[@class='middleNav']//li"));

		int count = msg.size();

		System.out.println(" INFO: Number of contact at list is  :" + count);
while(true) {
		for (int i = 1; i <= count; i++) {

			Thread.sleep(5000);

			driver.findElement(By.xpath("//div[@class='leftAppPanelInner']//div[@class='middleNav']//li[" + i + "]"))
					.click();

			Thread.sleep(5000);

			driver.findElement(By.xpath("//*[@id=\"dijit_form_SimpleTextarea_0\"]")).sendKeys("Hello how are you ");

			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@id='dijit_form_Button_12_label']")).click();
		}
		}

	}

}
