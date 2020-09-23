package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HandleCertificate {
    @Test 
	public void handlesecuritycertificate()
	{
    	System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		DesiredCapabilities capability=new DesiredCapabilities();
		capability.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ChromeOptions options=new ChromeOptions();
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		options.setAcceptInsecureCerts(true);
		options.merge(capability);
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.kayak.com/");  
		driver.manage().window().maximize();
	}
}
