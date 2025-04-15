package Obj_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CampValidation {

	public CampValidation(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
		
	
		    public void VerifyElementCreateCamp(WebDriver driver,String Name)
		    {
		    	String actData1 = driver.findElement(By.xpath("//td[@id='mouseArea_Campaign Name']")).getText();
			

	 if (actData1.contains(Name)) {
				System.out.println("Product Name is created");
			} else {
					System.out.println("Product Name is not created");
			}
		    }
}


