package SeleniumTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Booststrapdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Swarup\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='menu1']")).click();;
		List <WebElement> dd_menu=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		int menu_item_count=dd_menu.size();
		System.out.println("The no. of menu items is "+menu_item_count);
		for(WebElement ele:dd_menu)
		{
			String item_names=ele.getAttribute("innerHTML");
			
			if (item_names.contentEquals("JavaScript"))
			{
				System.out.println("Java Script Found");
				ele.click();
				break;
			}
			System.out.println("Menu Items Names are "+item_names);
		}
		
		driver.quit();

	}

}
