package Obj_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class camplookImg {

	public camplookImg(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	  @FindBy(xpath="//img[@alt='Create Campaign...']")
	  private WebElement CreateCampaignsButton;
	  
	  
	  public WebElement getCreateCampaignsButton() {
		return CreateCampaignsButton;
	}
	
	public void CreateImg()
    {
		CreateCampaignsButton.click();
    }
	
}
