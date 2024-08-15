package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.InventoryPage;
import Pages.LoginPage;
import base.TestBase;

public class InventoryPage_Test  extends TestBase{
	
	
	
	LoginPage login;
	InventoryPage invent;
	
	
	@BeforeMethod
	public void setup() throws IOException {
		
		initialization();
		login=new LoginPage();
		invent=new InventoryPage();
	
		login.loginToApplication();

		
		
	}
	
	@Test
	public void verify_facebook_logo_Test() {
		
		boolean exp_isenabled_facebookLogo=false;
		boolean act_isenabled_facebookLogo=invent.verify_facebook_logo();
		Assert.assertEquals( act_isenabled_facebookLogo,exp_isenabled_facebookLogo);
		Reporter.log("Fb logo is enabled "+act_isenabled_facebookLogo);
		
	}
	
	
	
	@AfterMethod
	public void close_Browser() 
	{
		
	
		driver.close();	
	
	}
	
	
	
	
	
	
	
	

}
