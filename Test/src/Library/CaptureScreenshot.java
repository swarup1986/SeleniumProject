package Library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class CaptureScreenshot {
public static void capturescreenshot(WebDriver driver,String screenshotname){
	try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/"+screenshotname+".png"));
		System.out.println("Screenshot taken successfully");
	} catch (Exception e) {
		
		System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
}
}
