package DataDrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.readexceldatafordatadriven;

public class logintowordpressDataDrivenExcel {
	WebDriver driver;
	
	@Test(dataProvider="wordpresslogindata")
	public void wordpressloginwithdatadriven(String username,String password) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-admin");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println("The title after successful login is "+title);
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User is unable to login--Invalid Credential");
		System.out.println("User is able to login successfully");
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit(); //we have to call this under after method else it will not execute for failed test cases
		//in case of invalid credential and after assertion statement this will not execute
	}
	@DataProvider(name="wordpresslogindata")
	public Object[][] passdata()
	{
		readexceldatafordatadriven object1=new readexceldatafordatadriven("C:\\Swarup\\workspace\\Test\\Test_Data\\InputData.xlsx");
		int rows=object1.getRowCount(0);
		Object[][] data=new Object[rows][2];
		for(int i=0;i<rows;i++)
		{
			data[i][0]=object1.getdata(0, i, 0);
			data[i][1]=object1.getdata(0, i, 1);
		}
		
		return data;
		
	}

}
