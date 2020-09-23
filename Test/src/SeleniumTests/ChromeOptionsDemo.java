package SeleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeOptionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-infobars"); //will disable the info that chrome is controlled by automated s/w
		options.setAcceptInsecureCerts(true);
		options.addEncodedExtensions("C:\\Users\\STantub\\AppData\\Local\\Google\\Chrome\\Application\\72.0.3626.119\\default_apps\\gmail.crx");
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();

	}

}
