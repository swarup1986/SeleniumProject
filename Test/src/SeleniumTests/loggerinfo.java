package SeleniumTests;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loggerinfo {

	public static void main(String[] args) {
		Logger loggerobject=Logger.getLogger("loggerinfo");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		loggerobject.info("Chrome Driver instantiated");
		driver.get("https://www.redbus.in/");
		loggerobject.info("RedBus site opened");
		driver.manage().window().maximize();
		loggerobject.info("Browser window maximized");
		driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[3]/div/label")).click();
		loggerobject.info("Date Picker Clicked");
		
		

	}

}
