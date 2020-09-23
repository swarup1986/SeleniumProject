package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	// We can copy the before and after method in base class so as to reuse this for every test case
	//like invalidlogin class will extend this class and then these two methods will run alternatively before and after
	//each test case
	
	WebDriver driver;
	
	@BeforeMethod //If we write beforeclass then this will be run before all the methods in the class
	public void setupApplication()
	{
		Reporter.log("Browser Session Started",true);
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		Reporter.log("Application Started",true);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
	}
	@AfterMethod ////If we write afterclass then this will be run after all the methods are executed in the class
    public void closeApplication()
    {
    	driver.quit();
    	Reporter.log("Browser Session Ended",true);
    }

}
