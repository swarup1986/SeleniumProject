package SeleniumTests;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.get("http://www.naukri.com");  //in case of naukri we will just close ad pop-ups
		driver.manage().window().maximize();
		String parent_window=driver.getWindowHandle();
		System.out.println("The parent window is "+parent_window);
		//driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		Set<String> allwindows=driver.getWindowHandles();
		int total_windows_count=allwindows.size();
		System.out.println("The total no. of windows open at this moment is "+total_windows_count);
		for(String child:allwindows)
		{
			if(!parent_window.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				String child_window=driver.getWindowHandle();
				System.out.println("The child window is "+child_window);
				String child_title=driver.getTitle();
				System.out.println("The child window title is "+child_title);
				//driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
				Thread.sleep(3000);
				driver.close();
			}
		}
        driver.switchTo().window(parent_window);
        String parent_title=driver.getTitle();
        System.out.println("The title of the parent window is "+parent_title);
	}

}
