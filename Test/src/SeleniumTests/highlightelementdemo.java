package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Library.highlightfield;

public class highlightelementdemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Swarup\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("email"));
		highlightfield.highLightElement(driver, username);
		username.sendKeys("swarup.wipro@gmail.com");
		WebElement passwd=driver.findElement(By.xpath("//*[@id='pass']"));
		highlightfield.highLightElement(driver, passwd);
		passwd.sendKeys("password");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//*[text()='Log In']"));
		highlightfield.highLightElement(driver, login);
		login.click();

	}

}
