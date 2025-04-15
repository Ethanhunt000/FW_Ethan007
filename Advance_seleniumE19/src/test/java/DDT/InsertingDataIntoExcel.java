package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertingDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
FileInputStream fis= new FileInputStream("./src/test/resources/commondata.xlsx");
      
		
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("testcase");
		
	    Row row=sheet.createRow(6);
		Cell cell=row.createCell(7);
		
		cell.setCellValue("EthanHunt");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/commondata.xlsx");
		book.write(fos);
		book.close();
	}

}
