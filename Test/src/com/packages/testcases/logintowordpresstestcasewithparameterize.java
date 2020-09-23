package com.packages.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.loginpageofwordpress;
import com.wordpress.pages.loginpageofwordpresswithparameter;

public class logintowordpresstestcasewithparameterize {
	
	@Test
	public void verifywordpresslogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-admin");
		driver.manage().window().maximize();
		loginpageofwordpresswithparameter object1=new loginpageofwordpresswithparameter(driver);
		object1.typeusername("admin");
		object1.typepassword("demo123");
		object1.clickloginbutton();
		driver.quit();
		
		
	}

}
