package DDT;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataProvider {

	public static void main(String[] args) throws Throwable, IOException {
		// TODO Auto-generated method stub
FileInputStream fis= new FileInputStream("./src/test/resources/commondata.xlsx");
      
		
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("testcase");
		
	    Row row=sheet.getRow(3);
		Cell cell=row.getCell(1);


		DataFormatter format=new DataFormatter();
		String exceldata=format.formatCellValue(cell);
		System.out.println(exceldata);
		
	}

}
