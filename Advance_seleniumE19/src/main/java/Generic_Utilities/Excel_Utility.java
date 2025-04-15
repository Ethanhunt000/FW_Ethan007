package Generic_Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Utility {

	public String getExcelData(String SheetName,int ranNum,int cellNum) throws EncryptedDocumentException, IOException {
		
		
		// step1:- path connection
		FileInputStream fis1 = new FileInputStream("./src/test/resources/commondata.xlsx");

		// step2:-keeps the workbook/excelfile in read mode
		Workbook book = WorkbookFactory.create(fis1);

		// step3:- Navigating expected sheet
		Sheet sheet = book.getSheet(SheetName);

		// step4:- Navigating expected row--->row value starts from 0
		Row row = sheet.getRow(ranNum);

		// step5:- Navigating expected cell--->cell value starts from 0
		Cell cell = row.getCell(cellNum);

		String ExcelData = cell.getStringCellValue();
		System.out.println(ExcelData);
		return ExcelData;
	}
   public String getExcelDataUsingFormatter(String SheetName,int ranNum,int cellNum) throws EncryptedDocumentException, IOException
   {
	   FileInputStream fis1 = new FileInputStream("./src/test/resources/commondata.xlsx");

		// step2:-keeps the workbook/excelfile in read mode
		Workbook book = WorkbookFactory.create(fis1);

		// step3:- Navigating expected sheet
		Sheet sheet = book.getSheet(SheetName);

		// step4:- Navigating expected row--->row value starts from 0
		Row row = sheet.getRow(ranNum);

		// step5:- Navigating expected cell--->cell value starts from 0
		Cell cell = row.getCell(cellNum);
		
		DataFormatter format=new DataFormatter();
		String ExcelData = format.formatCellValue(cell);
		
		
		
	//	System.out.println(ExcelData);
		return  ExcelData;
   }
}
