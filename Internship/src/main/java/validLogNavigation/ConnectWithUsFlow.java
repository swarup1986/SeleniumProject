package validLogNavigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectWithUsFlow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.validlog.com/contact-us/");
		driver.manage().window().maximize();
		driver.findElement(By.id("form-field-name")).sendKeys("a");
		driver.findElement(By.id("form-field-phone")).sendKeys("3");
		driver.findElement(By.id("form-field-email")).sendKeys("ee");
		driver.findElement(By.id("form-field-message")).sendKeys("ddd");
		driver.findElement(By.xpath("//span[contains(text(),'Send')]")).click();	

	}

}
