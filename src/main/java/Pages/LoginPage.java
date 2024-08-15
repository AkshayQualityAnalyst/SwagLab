package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase  
	{
	
	
	
	@FindBy(xpath="//input[@id='user-name']") private WebElement userTxtBox;
	@FindBy(xpath="//input[@id='password']") private WebElement passWordTxtBox;
	@FindBy(xpath="//input[@id='login-button']") private WebElement loginBtn;

	
	public LoginPage() {
		
		PageFactory.initElements( driver, this);
		
		
	}
	
	
	public String loginToApplication()
	{
		userTxtBox.sendKeys("standard_user");
		passWordTxtBox.sendKeys("secret_sauce");
		loginBtn.click();
		return driver.getCurrentUrl();
	}

	
	public String verify_Url_Of_Application() 
	{
		return driver.getCurrentUrl();
	
	}
	
	
	public String verify_Title_Of_Application()
	{
		return driver.getTitle();
		
	}
	

}
