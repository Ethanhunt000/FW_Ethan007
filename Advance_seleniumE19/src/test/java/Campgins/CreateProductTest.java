package Campgins;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.Java_Utility;
import Generic_Utilities.WebDriver_utility;
import Obj_Repo.HomePage;
import Obj_Repo.LoginPageVtiger;
import Obj_Repo.PrdLookimg;
import Obj_Repo.VerificationP_C;
import Obj_Repo.productvalidation;



@Listeners(Generic_Utilities.ExtentReportImp.class)
public class CreateProductTest extends BaseClass {
@Test(groups={"smokeTest","regressionTest"})
	public  void CreateProduct() throws Throwable {
		
		
		HomePage a=new HomePage(driver);
		a.clickPRD();
	
        PrdLookimg b = new PrdLookimg(driver);
        b.prdImg();
        
		Java_Utility ran = new Java_Utility();
		int ranNum = ran.GetRandomNum();
		
		Excel_Utility elib = new Excel_Utility();
        String prdName1=elib.getExcelData("Product", 0,0)+ranNum;
        System.out.println(prdName1);

	
		VerificationP_C c = new VerificationP_C(driver);
		c.ProductVerification(prdName1);
		
		
		productvalidation d = new productvalidation();
		String actdata = d.prdvalid(driver, prdName1);
		Assert.assertEquals(actdata,prdName1);
		
		a.clickPRD();
		
		d.path1(driver, prdName1);
		
		Thread.sleep(2000);
		WebDriver_utility wlib = new WebDriver_utility();
		wlib.alert1(driver);
		
		d.ElementisPresent(driver, prdName1);
        a.Logout();
			
		}
	}


