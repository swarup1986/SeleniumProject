package SeleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchFrames {
    @Test 
	public void switchtonewframe() throws InterruptedException
	{
    	System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Swarup/Selenium/Iframe.html");
		driver.manage().window().maximize();
		int iframe_count1=driver.findElements(By.tagName("iframe")).size();
		System.out.println("The no. of IFrames before switching in the page is "+iframe_count1);
		//Count is coming as 3 which is correct
		driver.switchTo().frame("w3c");
		driver.findElement(By.id("genesis-mobile-nav-primary")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("Selenium");
		driver.findElement(By.xpath("//*[@id='wrapper']/header/div[1]/div[3]/div[1]/div/div[2]/a[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		WebElement element1=driver.findElement(By.xpath("//iframe[@title='selenium_news']"));
		//switching to a frame first where we don't have id or name for the frame. First we need to capture the frame,then switch
		driver.switchTo().frame(element1);
		driver.findElement(By.xpath("//*[@id='menu_projects']/a")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("html/body/a")).click();
		List<WebElement> iframes= driver.findElements(By.tagName("iframe"));
		int iframe_count=iframes.size();
		System.out.println("The no. of IFrames present in the page is "+iframe_count);
		//count is coming as 9 which needs further inspection
		
		
	}
}
