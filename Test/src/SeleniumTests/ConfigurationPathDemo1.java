package SeleniumTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Library.ConfigReader;

public class ConfigurationPathDemo1 {
	ConfigReader config1;
	@BeforeTest
	public void setup()
	{
       config1=new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver",config1.chromepath());
		System.out.println("Setup is ready");
	}
	
	@Test
	public void openchromewithpropertiesfile() throws Exception
	{
		//File src=new File("./ConfigurationFile/Config.Property");
		//FileInputStream fis=new FileInputStream(src);
		//Properties prop=new Properties();
		
		//prop.load(fis);
		System.out.println("Test Started");
		WebDriver driver=new ChromeDriver();
		
		driver.get(config1.getURL());
		driver.quit();
		System.out.println("Test is finished");
		
	}

}
