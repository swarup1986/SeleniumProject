package validLogNavigation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ConnectWithUsFlow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.validlog.com/contact-us/");
		driver.manage().window().maximize();
		driver.findElement(By.id("form-field-name")).sendKeys("test1_swa");
		driver.findElement(By.id("form-field-phone")).sendKeys("7744");
		driver.findElement(By.id("form-field-email")).sendKeys("test_swa@swa.com");
		driver.findElement(By.id("form-field-message")).sendKeys("test1_swa");
		driver.findElement(By.xpath("//span[contains(text(),'Send')]")).click();
		Thread.sleep(4000);
		driver.quit();

	}

}
