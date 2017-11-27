package com.OHRMS.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.OHRMS.Pages.Dashboardpage;
import com.OHRMS.Pages.LoginPage;
import com.OHRMS.baseclass.Baseclass;

import Academy.HomePage;

public class LoginPageTest extends Baseclass {

	LoginPage LoginPage;
    HomePage homePage;
   
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws Exception{
		
		initialization();
		LoginPage=new LoginPage();		
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title=LoginPage.validateloginPageTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@Test(priority=2)
	public void LoginTest() throws Exception{
		homePage=LoginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	@AfterMethod
	public void teardown(){
		//driver.quit();
	}
}
