package com.packages.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.pages.logintowordpresspagefactory;

import Library.parameterizebrowser;

public class verifyloginwithpagefactory {
	
	@Test
	public void verifylogin()
	{
		WebDriver driver=parameterizebrowser.startbrowser("chrome", "http://demosite.center/wordpress/wp-admin");
		logintowordpresspagefactory pageobjects=PageFactory.initElements(driver, logintowordpresspagefactory.class);
		//the .class extension returns the binary of the class
		//page factory method returns all the page objects of the mentioned class
		pageobjects.logintowordpress("admin", "demo123");
	}

}
