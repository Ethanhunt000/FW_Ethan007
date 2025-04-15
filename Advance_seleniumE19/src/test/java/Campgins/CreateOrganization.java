package Campgins;



import java.io.FileInputStream;
import java.io.FileNotFoundException;


import java.util.Properties;

import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_utility;
//import Obj_Repo.LoginPage;
import Obj_Repo.LoginPageVtiger;

public class CreateOrganization {

	public static void main(String[] args) throws Throwable {

	
		File_Utility flib=new File_Utility();
		String BROWSER = flib.getKeyAndValuePair("browser");
		String URL = flib.getKeyAndValuePair("url");
		String USERNAME = flib.getKeyAndValuePair("username");
		String PASSWORD = flib.getKeyAndValuePair("password");
		
		
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
		WebDriver_utility wlib = new WebDriver_utility();
		wlib.maximizewindow(driver);
        wlib.waitElementToLoad(driver);
		driver.get(URL);
//		driver.findElement(By.name("user_name")).sendKeys(USERNAME);
//		driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("submitButton")).click();
		  LoginPageVtiger LOGIN = new LoginPageVtiger(driver);
		   LOGIN.loginIntoApp(USERNAME, PASSWORD);

		driver.findElement(By.linkText("Organizations")).click();
		
		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();

	
		
		Java_Utility jlib=new Java_Utility();
		int ranNum=jlib.GetRandomNum();
		

		Excel_Utility	elib=new Excel_Utility();
		String SheetName=elib.getExcelData("Organization", 0,0)+ranNum;
		
		driver.findElement(By.name("accountname")).sendKeys(SheetName);
		// -------------------------------------------------------------------------------------------------------
		
		String phnNum=elib.getExcelDataUsingFormatter("Organization",1,0);
		driver.findElement(By.id("phone")).sendKeys(phnNum);
		// -------------------------------------------------------------------------------------------------------
	
		String emailId=elib.getExcelDataUsingFormatter("Organization",2,0);
		
		driver.findElement(By.id("email1")).sendKeys(emailId);

		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Thread.sleep(2000);
		String actData = driver.findElement(By.xpath("//span[@id='dtlview_Organization Name']")).getText();
/*	if(actData.contains(SheetName))
	{
		System.out.println("Organization name is created");
	}
	else
	{
		System.out.println("Organization name is not created");
	} */
		WebDriver_utility Wlib2 = new WebDriver_utility();
		Wlib2.VerifyElement(driver, actData, SheetName);
	driver.findElement(By.xpath("//img[@src=\"themes/softed/images/user.PNG\"]")).click();
	driver.findElement(By.linkText("Sign Out")).click();
	}


	}


