package com.intradyn.Runner.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import pages.EnvironmentUtils;

@RunWith(ExtendedCucumber.class)

@ExtendedCucumberOptions(jsonReport = "target/cucumberRegression.json",
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

@CucumberOptions(tags = {},
		features = { "src/test/resources/Features/Regression/"}, 
		glue = {"com.intradyn.EmailArchive"}, 
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/output/RegressionReport.html",
				  "json:target/cucumberRegression.json" }, monochrome = true, strict = true)



public class IntradynRegressionRunner {

	public static String excelPath = System.getProperty("user.dir") + "\\AddNewUser\\RegressionExcel.xlsx";

	@BeforeClass
	public static void classBefore() throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet spreadsheet = workbook.createSheet("FirstSheet");
		CellStyle style = workbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		Font font = workbook.createFont();
		font.setColor(IndexedColors.RED.getIndex());
		style.setFont(font);
		Row row = spreadsheet.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Scenario Name");
		cell.setCellStyle(style);
		int columnIndex = cell.getColumnIndex();
		spreadsheet.autoSizeColumn(columnIndex);
		Cell cell1 = row.createCell(1);
		cell1.setCellValue("Status");
		cell1.setCellStyle(style);
		Cell cell2 = row.createCell(2);
		cell2.setCellValue("Date OF Execution");
		cell2.setCellStyle(style);
		int columnInde = cell2.getColumnIndex();
		spreadsheet.autoSizeColumn(columnInde);
		FileOutputStream out = new FileOutputStream(new File(excelPath));
		workbook.write(out);
		workbook.close();
		out.close();
	}
	@AfterClass
	public static void AfterClass() {
		Reporter.setSystemInfo("URL :", EnvironmentUtils.getConfig().getProperty("intradyn_url"));
		Reporter.setSystemInfo("Version : ",EnvironmentUtils.getConfig().getProperty("version"));
		
		
	}


}
