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
public class loginpageofwordpress {
	
	WebDriver driver;
	
	By username=By.id("user_login");
	By password=By.xpath("//*[@id='user_pass']");
	By loginbutton=By.name("wp-submit");
	
	public loginpageofwordpress(WebDriver driver)
	{
		this.driver=driver;
	}
	public void typeusername()
	{
		driver.findElement(username).sendKeys("admin");
	}
	public void typepassword()
	{
		driver.findElement(password).sendKeys("demo123");
	}
    public void clickloginbutton()
    {
    	driver.findElement(loginbutton).click();
    }
}
