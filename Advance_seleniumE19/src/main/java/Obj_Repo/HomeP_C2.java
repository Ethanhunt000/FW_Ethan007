package Obj_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeP_C2 {

	public HomeP_C2(WebDriver driver) {
		PageFactory.initElements(driver,this);
}

	@FindBy(linkText="More")
	  private WebElement PCname;
	
	@FindBy(linkText="Campaigns")
	 private WebElement CampaignButton;
	
	
	public void LandingPage()
	{
		PCname.click();
		CampaignButton.click();
	}
	
}
