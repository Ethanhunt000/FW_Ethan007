package Obj_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	  @FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	  private WebElement ThemeIcon;
	  
	  @FindBy(linkText="Sign Out")
	  private WebElement SignOutButton;
	  
	  @FindBy(linkText="Products")
	  private WebElement prd;
	  
	  


	  @FindBy(xpath="//a[text()='More']")
	  private WebElement MoreButton;
	  
	  @FindBy(xpath="//a[text()='Campaigns']")
	  private WebElement CampaignsButton;
	  
	
	  public WebElement getPrd() {
			return prd;
		} 
	  

	public WebElement getThemeIcon() {
		return ThemeIcon;
	}

	public WebElement getSignOutButton() {
		return SignOutButton;
	}
	
	
	 public WebElement getMoreButton() {
		return MoreButton;
	}

	public WebElement getCampaignsButton() {
		return CampaignsButton;
	}

	public void LandingPage()
    {
	MoreButton.click();
   	CampaignsButton.click();
    }
	public void Logout()
    {
		 ThemeIcon.click();
   	 SignOutButton.click();   	  
    }
	
	public void clickPRD() {
		prd.click();
	}
}

