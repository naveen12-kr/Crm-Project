package com.intradyn.EmailArchive;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.BasePage;

public class Helper extends BasePage {

	String path = System.getProperty("user.dir");

	@Before
	public void InitialSetUp(Scenario scenario) throws IOException {
		System.out.println("************* STARTING NEW TEST **************");
		System.out.println("INFO: Initial setup for new Test");
		InitialConfig();
		System.out.println("INFO: Initial setup Done");
		System.out.println("INFO: Scenario: " + scenario.getName());
	}

	@After
	public void closeSetup(Scenario scenario) throws InvalidFormatException, IOException {

		// new ExcelOperation("MYEXCEL");

		// ExcelOperation.updateTestStatus(scenario.getStatus(),
		// scenario.getName());

		if (scenario.isFailed()) {
			try {
				scenario.write("Current Page URL is " + driver.getCurrentUrl());
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				String randomString = getRandomString(5);
				File file = new File(path + "/../target/screenshot_failure/screenshot_" + scenario.getName() + "_"
						+ randomString + ".png");
				file.getParentFile().mkdirs();
				FileOutputStream out = new FileOutputStream(file);
				out.write(screenshot);
				out.close();
				Reporter.addScreenCaptureFromPath("../../target/screenshot_failure/screenshot_" + scenario.getName()
						+ "_" + randomString + ".png");
			} catch (Exception somePlatformsDontSupportScreenshots) {
				System.err.println(somePlatformsDontSupportScreenshots.getMessage());
			}

		} else {

		}
		System.out.println("INFO: Inside CloseSetup");
		driver.quit();
		// driver.close();
		System.out.println("INFO: CloseSetup Done");
		System.out.println("*************END TEST ************");

	}

}