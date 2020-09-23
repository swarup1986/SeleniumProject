package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollPage {

	@Test
	public void scrollpage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		driver.get("https://freecrm.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("swarup.wipro@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hayabusa12");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		driver.findElement(By.xpath("//span[contains(text(), 'Contacts')]")).click();
	}
}
