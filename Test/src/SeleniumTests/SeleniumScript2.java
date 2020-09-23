package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumScript2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Swarup\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
        WebDriver driver=new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.navigate().to("http://www.facebook.com/");
        
        WebElement email=driver.findElement(By.id("email"));
        WebElement passwd=driver.findElement(By.id("pass"));
        email.sendKeys("swarup.wipro@gmail.com");
        passwd.sendKeys("hummerh2");
        String actualtitle=driver.getTitle();
        System.out.println("The title of the page is " +actualtitle);
        driver.findElement(By.id("u_0_2")).click();
        driver.close();  
        
	}

}
