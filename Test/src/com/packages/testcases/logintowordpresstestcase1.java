package com.packages.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.loginpageofwordpress;

public class logintowordpresstestcase1 {
	
	@Test
	public void verifywordpresslogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-admin");
		driver.manage().window().maximize();
		loginpageofwordpress object1=new loginpageofwordpress(driver);
		object1.typeusername();
		object1.typepassword();
		object1.clickloginbutton();
		driver.quit();
		
		
	}

}
