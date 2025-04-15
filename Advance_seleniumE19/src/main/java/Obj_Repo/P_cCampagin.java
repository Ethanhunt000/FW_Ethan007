package Obj_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P_cCampagin {

	

		public P_cCampagin(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		@FindBy(name="campaignname")
		  private WebElement Campaign12;
		
		@FindBy(xpath="//img[@alt=\\\"Select\\\"]")
		  private WebElement window;
		
		public WebElement getwindow() {
			return  window;
		}
		public WebElement getCampaign12() {
			return Campaign12;
		}
	public void CampVerification123(String SheetName1)
	{
		Campaign12.sendKeys(SheetName1);
		window.click();
	
	}
	}

