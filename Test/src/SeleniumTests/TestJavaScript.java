package SeleniumTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class InSideClass{
	public void add(int i,int j){
		System.out.println(i+j);
	}
}

public class TestJavaScript {	
	
		
	   	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
     		driver.manage().window().maximize();// Maximize the window

		driver.get("https://www.google.com"); // Open applicatiion
        // This will execute JavaScript in your script
		//((JavascriptExecutor)driver).executeScript("document.getElementById('username').value='mukesh';");
		TestJavaScript obj1= new TestJavaScript();
		
		
		}
	}

