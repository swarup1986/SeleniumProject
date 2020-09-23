package SeleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "C:\\Swarup\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		String title1=driver.getTitle();
		System.out.println("Page title is "+title1);
		WebElement element1=driver.findElement(By.id("month"));
		Select sel1=new Select(element1);
		WebElement selected_value=sel1.getFirstSelectedOption();
		System.out.println("Before selection default value is "+selected_value.getText());
		sel1.selectByValue("8");
		WebElement selected_value1=sel1.getFirstSelectedOption();
		System.out.println("After selection value is "+selected_value1.getText());
		List<WebElement> month_list=sel1.getOptions();
		int month_list_count=month_list.size();
		System.out.println("The total no. of months is "+month_list_count);
		for(WebElement ele:month_list)
		{
			String month_name=ele.getText();
			System.out.println("Month Names are "+month_name);
		}
		Thread.sleep(3000);
		sel1.selectByIndex(2);

	}

}
