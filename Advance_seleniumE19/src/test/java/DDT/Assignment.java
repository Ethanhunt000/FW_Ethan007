package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis= new FileInputStream("./src/test/resources/commondata.xlsx");
		      
				
				Workbook book=WorkbookFactory.create(fis);
				Sheet sheet=book.getSheet("Sheet1");
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.flipkart.com");
				driver.manage().window().maximize();
				List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
				for(int i=0;i<alllinks.size();i++)
				{
					Row row = sheet.createRow(i);
					     Cell cell = row.createCell(0);
					     cell.setCellValue(alllinks.get(i).getAttribute("href"));
					     
				}
				FileOutputStream fos=new FileOutputStream("./src/test/resources/commondata.xlsx");
				book.write(fos);
				book.close();
				for (int i = 0; i < alllinks.size(); i++) {
				    Row row = sheet.createRow(i);
				    Cell cell = row.createCell(0);
				    String link = alllinks.get(i).getAttribute("href");
				    cell.setCellValue(link);

				    // Print link to the console
				    System.out.println(link);
				}
			}
		}
		
	


