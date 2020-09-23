package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluentwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(10, TimeUnit.SECONDS)
			    .pollingEvery(1, TimeUnit.SECONDS)
			    .ignoring(NoSuchElementException.class);

			WebElement element = wait.until(new Function<WebDriver, WebElement>() 
			{
			  public WebElement apply(WebDriver driver) 
			  {
				  WebElement element1=driver.findElement(By.xpath("//*[@id='demo']"));
				  String values=element1.getAttribute("innerHTML");
				  if(values.equalsIgnoreCase("Webdriver"))
				  {
					  System.out.println("The value is "+values);
					  return element1;
				  }
				  else
				  {
					  System.out.println("The values are...."+values);
					  return null;
				  }
			  
			}
			});
			Boolean status=element.isDisplayed();
			if(status)
			{
				System.out.println("Element is found "+status);
			}
	}

}
