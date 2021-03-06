/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author STantub
 * 
 * This is the login page of Wordpress site
 *
 */
public class loginpageofwordpresswithparameter {
	
	WebDriver driver;
	
	By username=By.id("user_login");
	By password=By.xpath("//*[@id='user_pass']");
	By loginbutton=By.name("wp-submit");
	
	public loginpageofwordpresswithparameter(WebDriver driver)
	{
		this.driver=driver;
	}
	public void typeusername(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	public void typepassword(String passwd)
	{
		driver.findElement(password).sendKeys(passwd);
	}
    public void clickloginbutton()
    {
    	driver.findElement(loginbutton).click();
    }
}
