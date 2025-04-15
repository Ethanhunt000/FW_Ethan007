package Obj_Repo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Capgin_Product_Method {

	
	
	public void VerificationC_A(WebDriver driver, String Name) {
		
		String actData = driver.findElement(By.xpath("//span[@id=\"dtlview_Campaign Name\"]")).getText();

		if (actData.equals(Name)) {
			System.out.println("Campaign name is created");
		} else {
			System.out.println("Campaign name is not created");
		}
	
		String actPrd = driver.findElement(By.xpath("//span[@id='dtlview_Product']")).getText();
		if (actPrd.equals(Name)) {
			System.out.println("product name is created");
		} else {
			System.out.println("product name is not created");
		}
	
	}
}
