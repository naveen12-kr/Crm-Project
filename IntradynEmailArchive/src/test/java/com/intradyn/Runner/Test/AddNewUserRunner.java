package com.intradyn.Runner.Test;

import org.junit.runner.RunWith;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;

@RunWith(ExtendedCucumber.class)

@ExtendedCucumberOptions(jsonReport = "target/cucumberSanity.json",
// jsonUsageReport = "target/81/cucumber-usage.json",
usageReport = true, 
detailedReport = true,
detailedAggregatedReport = true,
overviewReport = true,
overviewChartsReport = true,
pdfPageSize = "A4 Landscape",
toPDF = true,
outputFolder = "target/81",
retryCount = 0)

@CucumberOptions(tags = "@Sanity",
		features = { "src/test/resources/Features/Sanity/"}, 
		glue = {"com.intradyn.EmailArchive"}, 
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/output/SanityReport.html",
				  "json:target/cucumberRegression.json" }, monochrome = true, strict = true)

public class AddNewUserRunner {


}
