package SeleniumTests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import Library.CaptureScreenshot;

public class phantomjsdemo {
	@Test
	public void capturefacebookscreenshot() throws IOException
	{
	  File src=new File("C:\\Swarup\\Selenium\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	  System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
	  //absolutepath is needed as we are getting a file whose location needs to be defined
	  //Also we need to specify the binary path as it is an executable instead of a JAR
	  WebDriver driver=new PhantomJSDriver();
	  driver.get("http://www.facebook.com");
	  String Actual_Title=driver.getTitle();
	  System.out.println("The title is "+Actual_Title);
	  //CaptureScreenshot.capturescreenshot(driver,"phantomjsdriverexample");
	    TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String screenshotname="facebookscreenshot";
		FileUtils.copyFile(source, new File("./Screenshots/"+screenshotname+".png"));
		System.out.println("Screenshot taken successfully");	  
	  }
	
	}
