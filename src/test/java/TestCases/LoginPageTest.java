package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Utility.ReadData;
import base.TestBase;

public class LoginPageTest extends TestBase
	{
	
	
	LoginPage login;
	
	@BeforeMethod
	public void setup() throws IOException 
	{
		
		initialization();
		login=new LoginPage();
		//login.loginToApplication();
		
	}
	
	
	@Test
	public void loginToApplicationTest()
	{
		String expURL="https://www.saucedemo.com/inventory.html";
		String actURL=login.loginToApplication();
		Assert.assertEquals(expURL,actURL);
		Reporter.log("Login Successful= " + actURL);
	}

	
	@Test
	public void verify_Url_Of_Application_Test() throws IOException 
	{
		
		String expurl=ReadData.getData("Url");   //https://www.saucedemo.com/
		String acturl=login.verify_Url_Of_Application();
		Assert.assertEquals(expurl, acturl);
		Reporter.log("The url application is : "+acturl);
	}
	@Test
	public void verify_Title_Of_Application_Test() throws IOException 
	{

		String exptitle=ReadData.getData("Title");   //Swag Labs
		String acttitle=login.verify_Title_Of_Application();
		Assert.assertEquals(exptitle, acttitle);
		Reporter.log("The title application is : "+acttitle);
		
	}
	
	@AfterMethod
	public void close_Browser() 
	{
		if(driver!=null) 
	{
		driver.close();	
	}
	}
}
