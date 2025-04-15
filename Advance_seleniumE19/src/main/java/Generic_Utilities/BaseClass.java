package Generic_Utilities;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import Obj_Repo.LoginPageVtiger;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
    

  
  
public class BaseClass {
	//pulling code from git
	public WebDriver driver;
	public static WebDriver sdriver;
	@BeforeSuite(groups= {"smokeTest","regressionTest","sanity"})
	public void BeforeSuite() {
		System.out.println("data base connection");
	}
	@BeforeTest(groups={"smokeTest","regressionTest","sanity"})
	public void BeforTest() {
		System.out.println("parallel excecution");
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups={"smokeTest","regressionTest","sanity"})
	public void Beforclass() throws IOException {
		//File_Utility flib = new File_Utility();
		//String BROWSER = flib.getKeyAndValuePair("browser");
		//System.out.println("launching browser");
		
		//WebDriver driver;
           String BROWSER=System.getProperty("browser");
		
		if (BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			driver = new ChromeDriver();
		}
      sdriver=driver;
	}
	//@Parameters({"URL","USERNAME","PASSWORD"})
	@BeforeMethod(groups={"smokeTest","regressionTest","sanity"})
	public void Beformethod() throws IOException {
	  File_Utility flib = new File_Utility();
			String BROWSER = flib.getKeyAndValuePair("browser");
			String 	URL = flib.getKeyAndValuePair("url");
			String 	USERNAME = flib.getKeyAndValuePair("username");
		String 	PASSWORD = flib.getKeyAndValuePair("password");
		 WebDriver_utility wlib = new WebDriver_utility();
			 wlib.maximizewindow(driver);
		      wlib.waitElementToLoad(driver);

		 	  driver.get(URL);
			 LoginPageVtiger LOGIN = new LoginPageVtiger(driver);
	          LOGIN.loginIntoApp(USERNAME, PASSWORD);
		System.out.println("log in app");
	}
	@AfterMethod(groups={"smokeTest","regressionTest","sanity"})
	public void aftermethod() {
		System.out.println("logout from app");
	}
	@AfterClass(groups={"smokeTest","regressionTest","sanity"})
	public void afterclass() {
		driver.quit();
		System.out.println("close the broswer");
	}
	@AfterTest(groups={"smokeTest","regressionTest","sanity"})
	public void aftertest() {
		System.out.println("parallel excution close");
	}
	@AfterSuite(groups={"smokeTest","regressionTest","sanity"})
	public void aftersuite() {
		System.out.println("close database connection");
		//pulledd the code
	}
}
