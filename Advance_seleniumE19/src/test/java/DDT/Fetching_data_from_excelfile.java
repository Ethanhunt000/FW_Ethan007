package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetching_data_from_excelfile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
FileInputStream fis= new FileInputStream("./src/test/resources/commondata.xlsx");
      
		
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Sheet1");
		
	/*	Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
	 //   Row row1=sheet.getRow(1);
	//	Cell cell1=row1.getCell(1);
		
		String exceldata=cell.getStringCellValue();
	//	String exceldata2=cell1.getStringCellValue();
		System.out.println(exceldata);
	//	System.out.println(exceldata2);
	///
	 */
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row != null) { // Check if row is not null
                // Loop through all cells in the row
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    Cell cell = row.getCell(j);
                    if (cell != null) {
                        switch (cell.getCellType()) {
                            case STRING:
                                System.out.print(cell.getStringCellValue() + "\t");
                                break;
                            case NUMERIC:
                                System.out.print(cell.getNumericCellValue() + "\t");
                                break;
                            case BOOLEAN:
                                System.out.print(cell.getBooleanCellValue() + "\t");
                                break;
                            case FORMULA:
                                System.out.print(cell.getCellFormula() + "\t");
                                break;
                            default:
                                System.out.print(" \t");
                                break;
                        }
                    }
                }
                System.out.println(); // New line after each row
            }
        }
	}

}
