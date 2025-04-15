package Obj_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrdLookimg {


	public PrdLookimg(WebDriver driver )
	{
		PageFactory.initElements(driver,this);
	}
	  @FindBy(xpath="//img[@alt='Create Product...']")
	  private WebElement prdImgButton;
	  

	  
	  
	  public WebElement getprdImgButton() {
		return prdImgButton;
	}
	
	public void prdImg()
    {
		prdImgButton.click();
    }


}
