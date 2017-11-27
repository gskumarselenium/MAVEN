package com.OHRMS.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.OHRMS.util.Testutil;

public class Baseclass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	// this is baseclass constructor to declare fileinputstream class
	public Baseclass() throws IOException{    
		prop=new Properties(); // to create propery file statements
	FileInputStream fip=new FileInputStream
			("E:\\SELENIUM WORKSPACE 2017\\MAVEN\\HRMS_POM\\src\\main\\java\\com\\OHRMS\\config\\config.properties");
	prop.load(fip); // to load config.properties file properly.
	
	}


public static void initialization(){
	String browsername=prop.getProperty("browser");
	
	if(browsername.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM SOFTWARES 2017\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	else if(browsername.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", "E:\\SELENIUM SOFTWARES 2017\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	//driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
}
}

