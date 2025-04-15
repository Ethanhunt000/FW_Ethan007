package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Inserting_data_into_properties_files {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		Properties pro = new Properties();
		pro.setProperty("browser","chrome");
		pro.setProperty("url","http://localhost:8888/");
		pro.setProperty("username","admin");
		pro.setProperty("password","admin");
		
		FileOutputStream fis = new FileOutputStream("./src/test/resources/common_data1.properties.txt");
		pro.store(fis, "StoringData");
		
		//---------------------------------------------//
		FileInputStream fis1 = new FileInputStream("./src/test/resources/common_data1.properties.txt");
		// step2:-create an object to properties class to load all the keys
	Properties pro1 = new Properties();
		pro1.load(fis1);

		// step3:-read the value using getProperty()
		String BROWSER = pro1.getProperty("browser");
		String URL = pro1.getProperty("url");
		String USERNAME = pro1.getProperty("username");
		String PASSWORD = pro1.getProperty("password");
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
          driver.findElement(By.name("user_password")).sendKeys(USERNAME);
          driver.findElement(By.id("submitButton")).click();
	}

}
