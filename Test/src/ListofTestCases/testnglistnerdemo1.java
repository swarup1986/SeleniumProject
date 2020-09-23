package ListofTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ListofTestCases.TestNGListner.class)
//we are binding the below class to this itestlistner class. So if we have multiple classes where we need to
// implement at suite level. TO do that we need to convert this class to testng so that an xml file is generated
//we can disable the above listener tag when implement at suite level
public class testnglistnerdemo1 {

	@Test
	public void testgooglepagetitle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String Actual_Title=driver.getTitle();
		System.out.println("Google title is "+Actual_Title);
		driver.quit();
	}
	@Test
	public void googletitlefail()
	{
		System.out.println("Forecefully we are failing this so that we get the failure message from itestlistner");
		Assert.assertTrue(false);
	}
	

}
