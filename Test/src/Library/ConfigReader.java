package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	Properties prop;
	public ConfigReader()
	{
		try {
			File src=new File("./ConfigurationFile/Config.Property");
			FileInputStream fis=new FileInputStream(src);
			//In Library we should use try-catch instead of throws as we should handle errors here only instead of 
			//individual test cases
			prop=new Properties();
			
			prop.load(fis);
		} 
		catch (Exception e) {
			
			System.out.println("The exception is "+e.getMessage());
		}
	}
	
	public String chromepath()
	{
		String path=prop.getProperty("ChromePath");
		return path;
	}
	public String getURL()
	{
		String URL=prop.getProperty("URL");
		return URL;
	}

}
