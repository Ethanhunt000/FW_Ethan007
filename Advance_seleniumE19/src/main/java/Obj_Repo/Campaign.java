package Obj_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaign {

	public Campaign(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(name="campaignname")
	  private WebElement Campaign1;
	
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	 private WebElement SaveButton;
	
	@FindBy(xpath="//img[@alt=\"Select\"]")
	  private WebElement window;
	
	public WebElement getwindow() {
		return  window;
	}
	
	public WebElement getCampaign1() {
		return Campaign1;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	

public void CampVerification1(String Name)//SheetName1
{
	Campaign1.sendKeys(Name);
	SaveButton.click();
}
public void CampVerification123(String SheetName1)
{
	Campaign1.sendKeys(SheetName1);
	window.click();

}
public void CampVerification1234()
{
	SaveButton.click();
}
public void CampVerification(String SheetName1)//SheetName1
{
	Campaign1.sendKeys(SheetName1);
	SaveButton.click();
}
}