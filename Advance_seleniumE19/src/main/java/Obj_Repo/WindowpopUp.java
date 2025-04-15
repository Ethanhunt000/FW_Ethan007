package Obj_Repo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowpopUp {

	


		public WindowpopUp(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}

		
		  @FindBy(name="search_text")
		  private WebElement search1;
		  
		  @FindBy(css="[name=\"search\"]")
		  private WebElement SearchClick;
		  
		//  @FindBy(xpath="//a[text()='\" + Name + \"']")
		//  private WebElement DynamicSearch;

		public WebElement getSearch1() {
			return search1;
		}

		//public WebElement getDynamicSearch() {
		//	return DynamicSearch;
		//}

		public WebElement getSignOutButton() {
			return SearchClick;
		}
		public void PopPage(String name)
	    {
			search1.sendKeys(name); 
			SearchClick.click();
		//	DynamicSearch.click();
	    }

	public void dynamicXpath(WebDriver driver,String Name )
		{
		driver.findElement(By.xpath("//a[text()='" + Name + "']")).click();
		}
}

