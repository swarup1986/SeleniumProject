package SeleniumTests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowwithList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.naukri.com");  
		driver.manage().window().maximize();
		String parent_window=driver.getWindowHandle();
		System.out.println("The parent window is "+parent_window);
		//driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		Set<String> allwindows=driver.getWindowHandles();
		int total_windows_count=allwindows.size();
		System.out.println("The total no. of windows open at this moment is "+total_windows_count);
		ArrayList<String> all_tabs=new ArrayList<>(allwindows);  //convert set of windowhandles to an arraylist
		driver.switchTo().window(all_tabs.get(3));    //now we can use get method to fetch navigate to the window with help of index
		driver.close();                               //now we can close the ads in naukri
		driver.switchTo().window(all_tabs.get(2));
		driver.close();
		driver.switchTo().window(all_tabs.get(1));
		driver.close();
		driver.switchTo().window(all_tabs.get(0));
		System.out.println("The title of the parent window is "+driver.getTitle());
	}

}
