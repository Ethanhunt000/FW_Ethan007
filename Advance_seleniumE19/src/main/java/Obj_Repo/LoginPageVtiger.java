package Obj_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageVtiger {

	
	public LoginPageVtiger(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
  @FindBy(name="user_name")
  private WebElement UserTextFiled;
  
  @FindBy(name="user_password")
  private WebElement UserPassword;
  
  @FindBy(id="submitButton")
  private WebElement LoginButton;

public WebElement getUserTextFiled() {
	return UserTextFiled;
}

public WebElement getUserPassword() {
	return UserPassword;
}

public WebElement getLoginButton() {
	return LoginButton;
}

     public void loginIntoApp(String username,String password)
     {
    	 UserTextFiled.sendKeys(username);
    	 UserPassword.sendKeys(password);
    	 LoginButton.click();
     }

	}


