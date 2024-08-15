package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class InventoryPage extends TestBase {
	
	@FindBy(xpath="//a[@data-test='social-twitter']")private WebElement Facebook_logo;
	
	public InventoryPage() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public boolean verify_facebook_logo() {
		
		
		
		return Facebook_logo.isEnabled();
		
		
	}
	
	

}

