package SeleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testradiobuttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Swarup\\Selenium\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		List <WebElement> elements=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		//driver.findElement(By.xpath("//*[@id='java']"));
		//driver.quit();
		for (WebElement ele:elements)
		{
			String languages=ele.getAttribute("value");
			System.out.println("The languages are "+languages);
			if (languages.equalsIgnoreCase("RUBY"))
			{
				ele.click();
			}
		}
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement ele:checkboxes)
		{
			String checkbox_values=ele.getAttribute("id");
			System.out.println("Checkbox values are "+checkbox_values);
			if (checkbox_values.equalsIgnoreCase("SING"))
			{
				ele.click();
			}
		}

	}

}
