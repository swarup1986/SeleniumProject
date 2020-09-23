package SeleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class Mousehoveroperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		WebElement ele= driver.findElement(By.xpath("//button[text()='Automation Tools']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		List<WebElement> Links=driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		int link_count=Links.size();
		System.out.println("The number of links are" +link_count);
		for(int i=0;i<link_count;i++)
		{
			WebElement element=Links.get(i);
			String element_text=element.getAttribute("innerHTML");
			boolean status=element.isEnabled();
			System.out.println("The three tools are " +element_text +"And the link staus is  "+status);
			if(element_text.equalsIgnoreCase("Appium"))
			{
				System.out.println("TEST");
				element.click();
				break;
			}
			
		}
		

	}

}
