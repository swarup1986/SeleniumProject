package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicitandexplicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement element2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		//WebElement element1=driver.findElement(By.xpath("//p[text()='WebDriver']"));
		boolean status1=element2.isDisplayed();
		System.out.println("Element status is "+status1);
		if (status1=true)
		{
			System.out.println("Webdriver is displayed");
		}
		else
		{
			System.out.println("Element is not visible");
		}

	}

}
