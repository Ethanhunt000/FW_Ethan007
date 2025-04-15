package Campgins;

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
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Utilities.BaseClass;
import Generic_Utilities.Excel_Utility;
import Generic_Utilities.File_Utility;
import Generic_Utilities.WebDriver_utility;
import Obj_Repo.CampValidation;
import Obj_Repo.Campaign;
import Obj_Repo.HomePage;
import Obj_Repo.LoginPageVtiger;
import Obj_Repo.camplookImg;
 

@Listeners(Generic_Utilities.ExtentReportImp.class)
public class CreateCampTest extends BaseClass {
@Test(groups={"smokeTest","regressionTest"})
	public void createCampTest() throws IOException {

          
          HomePage home2=new HomePage(driver);
          home2.LandingPage();
          
          camplookImg cmg = new camplookImg(driver);
          cmg.CreateImg();
      //    Assert.fail("test case failing");
          Excel_Utility elib = new Excel_Utility();
          String Name=elib.getExcelData("Product", 0,0);
          
          Campaign Camp = new Campaign(driver);
          Camp.CampVerification1(Name);
   
          CampValidation wlib3 =new CampValidation(driver);
          
  		  wlib3.VerifyElementCreateCamp(driver,Name);
  		 
  		  home2.Logout();

  	     driver.close();
  			}

}
