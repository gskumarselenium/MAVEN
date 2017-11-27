package com.OHRMS.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.OHRMS.baseclass.Baseclass;

public class Dashboardpage extends Baseclass {

	public Dashboardpage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//object repository or page factory
	@FindBy(linkText="Welcome Admin")
	WebElement Welcomeadmin;
	
	@FindBy(xpath="//span[contains(text(),'Assign Leave')]")
	WebElement AssignLeave;
	
	@FindBy(xpath="//span[contains(text(),'Leave List')]")
	WebElement LeaveList;
	
	@FindBy(xpath="//span[contains(text(),'Timesheets')]")
	WebElement Timesheets;


	
	
}
