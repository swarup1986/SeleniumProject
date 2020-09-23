package com.wordpress.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class logintowordpresspagefactory {
	
	WebDriver driver;
	
	public logintowordpresspagefactory(WebDriver ldriver) 
	{
		this.driver=ldriver;
	}
	
	@FindBy(id="user_login") WebElement username;
		
	@FindBy(how=How.ID,using="user_pass")
	@CacheLookup   //this maintains a cache of web elements so that execution does not search for the elements
	WebElement password;  //rather it searches cache and it expedites execution.mainly useful for elements which hadrly changes
	
	@FindBy(how=How.XPATH,using="//*[@id='wp-submit']")
	@CacheLookup
	WebElement submit_button;
	
	@FindBy(how=How.LINK_TEXT,using="Lost your password?")
	@CacheLookup
	WebElement forgetpassword_link;
	
	public void logintowordpress(String uid, String passwd)
	{
		username.sendKeys(uid);
		password.sendKeys(passwd);
		submit_button.click();
	}
	

}
