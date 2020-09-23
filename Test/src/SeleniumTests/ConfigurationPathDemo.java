package SeleniumTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigurationPathDemo {
	@Test
	public void testconfig() throws Exception
	{
		File src=new File("./ConfigurationFile/Config.Property");
		FileInputStream fis=new FileInputStream(src);
		Properties prop=new Properties();
		//property class to handle property file
		prop.load(fis);
		String chromepath=prop.getProperty("ChromePath");
		//Here chromepath is the key which is passed to the getproperty method which will fetch the associated value
		//which in this case is the chromedriverpath. In property file key-value pair are stored
		System.out.println("The chrome path is "+chromepath);
		//this code will be utilized in a separate test
		
	}

}
