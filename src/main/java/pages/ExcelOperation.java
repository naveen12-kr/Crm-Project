package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation extends BasePage {
	public static XSSFSheet spreadsheet;
	static XSSFRow row;
	static XSSFCell cell;
	static ArrayList<String> rowValue = new ArrayList<String>();
	static int noOfRows;
	static int noOfCells;
	public static XSSFWorkbook workbook;
	public static FileInputStream fis;

	public ExcelOperation(String fileName) throws IOException, InvalidFormatException {

		readExcel(fileName);
	}

	public void readExcel(String fileName) throws IOException {
		String excelFilePath = "";

		if (fileName.contains("MYEXCEL")) {
			excelFilePath = excelPath + "\\MYEXCEL.xlsx";
		} else if (fileName.contains("RegressionExcel")) {
			excelFilePath = excelPath + "\\RegressionExcel.xlsx";
		} else if (fileName.contains("HandleRunningTags")) {
			excelFilePath = "C:\\Users\\dramkumar\\Desktop\\Intradyn\\AddNewUser" + "\\HandleRunningTags.xlsx";
		}
		fis = new FileInputStream(new File(excelFilePath));
		workbook = new XSSFWorkbook(fis);
		spreadsheet = workbook.getSheetAt(0);
		noOfRows = spreadsheet.getLastRowNum();
		// noOfCells = spreadsheet.getRow(noOfRows).getLastCellNum();

	}

	@SuppressWarnings("deprecation")
	public String getExcelCellValueOf(int rowNumber, int cellNumber) throws IOException {

		row = spreadsheet.getRow(rowNumber);
		cell = row.getCell(cellNumber);

		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_STRING:

			return cell.getStringCellValue();
		case Cell.CELL_TYPE_BOOLEAN:
			return Boolean.toString(cell.getBooleanCellValue());
		case Cell.CELL_TYPE_NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				cell.setCellValue("'" + new SimpleDateFormat("yyyy-MM-dd").format(cell.getDateCellValue()) + "'");
				return cell.getDateCellValue().toString();
			} else {

				return Double.toString(cell.getNumericCellValue());
			}

		}
		return "";
	}

	public static ArrayList<String> getExcelRowValueOf(int rowNumber) throws IOException {

		row = spreadsheet.getRow(rowNumber);
		Iterator<Cell> cellIterator = row.iterator();
		while (cellIterator.hasNext()) {
			Cell cell = cellIterator.next();

			switch (cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				rowValue.add(cell.getStringCellValue());
				break;
			case Cell.CELL_TYPE_BOOLEAN:
				break;
			case Cell.CELL_TYPE_NUMERIC:

				if (DateUtil.isCellDateFormatted(cell)) {

					cell.setCellValue("" + new SimpleDateFormat("dd-MMM-yyyy").format(cell.getDateCellValue()) + "");
					rowValue.add(cell.getStringCellValue());
				} else {
					rowValue.add(new DataFormatter().formatCellValue(cell));
				}
				break;
			}

		}
		return rowValue;

	}

	public static int getAllNumberOfRow() {
		return noOfRows;
	}

	public static int getAllNumberOfCell() {
		return noOfCells;
	}

	/*
	 * public static void updateTestStatus(String status, String scenarioname)
	 * throws IOException {
	 * 
	 * int rownum = spreadsheet.getLastRowNum(); int t = rownum + 1; Row row =
	 * spreadsheet.createRow(t); Cell ceel = row.createCell(0);
	 * ceel.setCellValue(scenarioname); Cell cel = row.createCell(1);
	 * cel.setCellValue(status);
	 * 
	 * DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 * LocalDateTime now = LocalDateTime.now();
	 * 
	 * Cell celd = row.createCell(2); celd.setCellValue(dtf.format(now));
	 * 
	 * ExcelOperation.fis.close(); FileOutputStream outputStream = new
	 * FileOutputStream(excelPath + "\\MYEXCEL.xlsx");
	 * ExcelOperation.workbook.write(outputStream); workbook.close();
	 * outputStream.close(); }
	 */

}
