package com.packages.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.loginpageofwordpress;
import com.wordpress.pages.loginpageofwordpresswithparameter;
import com.wordpress.pages.loginwithparameterizationforopeningsite;

public class loginwithparameterizationofopeningsite {
	
	@Test
	public void verifywordpresslogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-admin");
		driver.manage().window().maximize();
		loginwithparameterizationforopeningsite object1=new loginwithparameterizationforopeningsite(driver);
		object1.logintowordpress("admin", "demo123");
		driver.quit();
		
		
	}

}
