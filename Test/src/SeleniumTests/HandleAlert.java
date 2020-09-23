package SeleniumTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAlert {
	@Test
	public void handlealertwindow() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.kayak.com/");  
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='fHTg-submit']/span/svg")).click();
		
		Thread.sleep(2000);
		Alert alert_window=driver.switchTo().alert();
		
		String actual_msg=alert_window.getText();
		alert_window.accept();
		System.out.println("The validation message is "+actual_msg);
		String Expected_Message="There can be a better validation message";
		Assert.assertEquals(actual_msg, Expected_Message);
		System.out.println("This will not print once assert condition fails");
	}

}
