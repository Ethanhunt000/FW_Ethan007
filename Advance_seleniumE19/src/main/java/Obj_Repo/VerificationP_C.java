package Obj_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationP_C {
		
		public VerificationP_C(WebDriver driver) {
			PageFactory.initElements(driver,this);
	}

		@FindBy(name="productname")
		  private WebElement PName;
		
		@FindBy(xpath="//input[@title='Save [Alt+S]']")
		 private WebElement SaveButton;
		
		public WebElement getCampaign1() {
			return PName;
		}

		public WebElement getSaveButton() {
			return SaveButton;
		}
		public void CampProductVerification(String Name)
		{
			PName.sendKeys(Name);
			SaveButton.click();
		}
		public void ProductVerification(String prdName1)
		{
			PName.sendKeys(prdName1);
			SaveButton.click();
		}
}