package testcase;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnToreadExcel {

	public static void main(String[] args) throws IOException {

		// Step:1 set the path of the excelfile

		XSSFWorkbook book = new XSSFWorkbook("./exceldata/Leads.xlsx");

		// Step:2 ->identify the sheet that have corresponding data
		XSSFSheet sheet = book.getSheetAt(0);

		// Step:3 -->From sheet identify the rows to read

		XSSFRow row = sheet.getRow(1);

		// Step:4 -->From the row -->reach the cell to read
		XSSFCell cell = row.getCell(0); 

		// Step:5 -->Get the string from the cell

		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);

		// book-->sheet-->row-->cell-->string

		// To read all the data from excel

		// to find the number of rows in the excel book
		int rowCount = sheet.getLastRowNum(); // provide the count of rows with data
		System.out.println(rowCount);// will ignore the first row and treat it as header

		// to get the count of the columns
		int colCount = row.getLastCellNum();
		System.out.println(colCount);
		
		
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		System.out.println(physicalNumberOfCells);

		for (int i = 1; i <= rowCount; i++) { // row iteration -outerloop
			for (int j = 0; j < colCount; j++) {// col iteration-innerloop
				// book-->sheet-->row-->cell-->string

				String stringCellValue2 = sheet.getRow(i).getCell(j).getStringCellValue();

				System.out.println(stringCellValue2);
			}
		}

	}

}
