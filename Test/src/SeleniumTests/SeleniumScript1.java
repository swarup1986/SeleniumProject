package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumScript1 {
      public void invokebrowser()
      {
	      try {
	    	 System.setProperty("webdriver.gecko.driver","C:\\Swarup\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
			 WebDriver driver=new FirefoxDriver();
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			  driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			  driver.get("http://www.edureka.co");
			  driver.findElement(By.xpath("/html/body/div[2]/header/section/nav/div/a[2]")).click();
			  String actualtitle;
			  actualtitle=driver.getTitle();
			  System.out.println("The title is " +actualtitle);
			  driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	   
      }
	
	public static void main(String[] args) {
		SeleniumScript1 obj1=new SeleniumScript1();
		obj1.invokebrowser();
		
	}

}
