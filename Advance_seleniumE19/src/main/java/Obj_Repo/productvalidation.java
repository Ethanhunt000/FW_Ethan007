package Obj_Repo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class productvalidation {

	
	
	public String prdvalid(WebDriver driver,String prdName1) {
		
		
		String actData = driver.findElement(By.xpath("//span[@id='dtlview_Product Name']")).getText();
		return actData;

	/*	if (actData.contains(prdName1)) {
			System.out.println("Product Name is created");
		} else {
			System.out.println("Product Name is not created");
		}*/
	}   
	
	public void ElementisPresent(WebDriver driver,String prdName1) {
		
		List<WebElement> allNames = driver.findElements(By.xpath("(//table[@class='lvt small']/tbody/tr//td[3])[position()>1]"));
		
		 boolean flag=false;
			for (WebElement name : allNames)
			{
				String actPrd = name.getText();
				if(actPrd.equals(prdName1))
				{
				flag=true;
				break;
			}
				}
			if(flag)
			{
				System.out.println("product name is deleted");
			}
			else
			{
				System.out.println("Product name is not deleted");
			}
		
	}
	public void path1(WebDriver driver,String prdName1) {
		driver.findElement(By.xpath("//table[@class=\"lvt small\"]//a[text()='"+prdName1+"']/../preceding-sibling::td//input[@type=\"checkbox\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Delete\"]")).click();
	}
}
