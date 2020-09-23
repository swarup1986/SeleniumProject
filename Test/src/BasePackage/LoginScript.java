package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginScript {
	WebDriver driver;
	@BeforeMethod
	public void setupApplication()
	{
		Reporter.log("Browser Session Started",true);
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		Reporter.log("Application Started",true);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
	}
	@Test
    public void logintoApplication()
    {
    	driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("demo123");
		driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
		Reporter.log("Click on login button",true);
		//so if this test fails due to some reason say unable to locate element then also browser will be closed
		//this is really helpful when we are running 20-25 TCs which are dependent on an element which changed and
		//for which all the 20-25 cases are failing. So we need to close all 20-25 browser instances
    }
	@AfterMethod
    public void closeApplication()
    {
    	driver.quit();
    	Reporter.log("Browser Session Ended",true);
    }
}
