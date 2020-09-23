package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifypagetitle {
	/*@Test
	public void capturepagetitle()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Swarup\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://learn-automation.com/");
		String page_title=driver.getTitle();
		String Expected_Title="Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step";
		Assert.assertEquals(page_title, Expected_Title);
		System.out.println("Test case passed---Title Matches");
				
	}
	@Test
	public void capturepagetitlewithasserttrue()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Swarup\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		String page_title=driver.getTitle();
		Assert.assertTrue(page_title.contains("QTP"), "Title does not contain QTP");
		System.out.println("Test case passed---Title Matches");
				
	}*/
	@Test
	public void navigateToWarGamingSite()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://asia.wargaming.net/en");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='tiles-wrapper ready']//a[1]")).click();
		//String page_title=driver.getTitle();
		//Assert.assertTrue(page_title.contains("QTP"), "Title does not contain QTP");
		//System.out.println("Test case passed---Title Matches");
				
	}

}
