package SeleniumTests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import Library.CaptureScreenshot;

public class capturescreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.ie.driver", "C:\\Swarup\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		CaptureScreenshot.capturescreenshot(driver, "facebookloginpage");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("s");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//TakesScreenshot ts=(TakesScreenshot)driver;
		//File source=ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(source, new File("./Screenshots/Validation1.png"));
		//System.out.println("Screenshot taken successfully");
		CaptureScreenshot.capturescreenshot(driver, "facebookloginafterenteringloginname");
		driver.quit();

	}

}
