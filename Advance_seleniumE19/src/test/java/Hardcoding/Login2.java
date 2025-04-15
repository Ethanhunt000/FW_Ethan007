package Hardcoding;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login2{

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/common_data1.properties.txt");

		// step2:-create an object to properties class to load all the keys
		Properties pro = new Properties();
		pro.load(fis);

		// step3:-read the value using getProperty()
		String BROWSER = pro.getProperty("browser");
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");

		WebDriver driver;

		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}

		driver.get(URL);
		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
		driver.findElement(By.id("submitButton")).click();

		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.cssSelector("[alt=\"Create Product...\"]")).click();

		// step1:- path connection
		FileInputStream fis1 = new FileInputStream("./src/test/resources/commondata.xlsx");

		// step2:-keeps the workbook/excelfile in read mode
		Workbook book = WorkbookFactory.create(fis1);

		// step3:- Navigating expected sheet
		Sheet sheet = book.getSheet("Product");

		// step4:- Navigating expected row--->row value starts from 0
		Row row = sheet.getRow(0);

		// step5:- Navigating expected cell--->cell value starts from 0
		Cell cell = row.getCell(0);

		String prdName = cell.getStringCellValue();
		System.out.println(prdName);

		driver.findElement(By.name("productname")).sendKeys(prdName);

		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		String actData = driver.findElement(By.xpath("//td[@id='mouseArea_Campaign Name']")).getText();

		if (actData.contains(prdName)) {
			System.out.println("Product Name is created");
		} else {
			System.out.println("Product Name is not created");
		}

		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
		driver.findElement(By.linkText("Sign Out")).click();
	}

}
 
