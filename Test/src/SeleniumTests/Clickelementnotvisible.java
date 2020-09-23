package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import Library.ClickElement;

public class Clickelementnotvisible {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Swarup\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement element=driver.findElement(By.id("persistent"));  //this may fail as we are capturing the checkbox
		//WebElement element=driver.findElement(By.xpath("//*[@id='login-username-form']/p[2]/span[1]/label")); //this will work as we are capturing the text
		ClickElement.clickbyxpath(driver, "//*[@id='login-username-form']/p[2]/span[1]/label");
		//Actions act=new Actions(driver);
		//act.moveToElement(driver.findElement(By.id("persistent"))).click().build().perform();
		//in above case we are performing two operation i.e mouse hover and click,so build and perform..else only perform
		

	}

}
