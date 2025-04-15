package Campgins;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Properties;

import java.util.Properties;
import java.util.Random;
import java.util.Set;

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
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_utility;
import Obj_Repo.Campaign;
import Obj_Repo.Capgin_Product_Method;
import Obj_Repo.HomePage;
import Obj_Repo.HomePageCamp_Product;
import Obj_Repo.LoginPageVtiger;
import Obj_Repo.VerificationP_C;
import Obj_Repo.WindowpopUp;
import Obj_Repo.camplookImg;

public class CreateCampWithProductTest extends BaseClass {
@Test
	public void CreateCampWithProductTest() throws Throwable {

	
	/*	File_Utility flib = new File_Utility();
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
		   
		 LoginPageVtiger LOGIN = new LoginPageVtiger(driver);
         LOGIN.loginIntoApp(USERNAME, PASSWORD);
*/
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.cssSelector("[alt=\"Create Product...\"]")).click();

		Java_Utility ran = new Java_Utility();
		int ranNum = ran.GetRandomNum();
	


		 Excel_Utility elib = new Excel_Utility();
         String Name=elib.getExcelData("Product", 0,0)+ranNum;
         
         VerificationP_C pc = new  VerificationP_C(driver);
         pc.CampProductVerification(Name);


        HomePage Hm = new HomePage(driver);
        Hm.LandingPage();
     
        camplookImg img = new camplookImg(driver);
        img.CreateImg();

		
	    Excel_Utility elib1 = new Excel_Utility();
        String Name1=elib1.getExcelData("Campaign", 0,0);
          
        Campaign ABC = new Campaign(driver);
        ABC.CampVerification123(Name1);

        WebDriver_utility wlib1 = new WebDriver_utility();
        wlib1.switchtohandle(driver, "Products&action");
         
        WindowpopUp a = new WindowpopUp(driver);
        a.PopPage(Name);
		a.dynamicXpath(driver,"puma");
		
		wlib1.switchtohandle(driver, "Campaigns&action");
		
		ABC.CampVerification1234();
		
		Capgin_Product_Method c = new Capgin_Product_Method();
		c.VerificationC_A(driver, Name1);
		
		Hm.Logout();
	}
}