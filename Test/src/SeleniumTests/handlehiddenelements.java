package SeleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlehiddenelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Swarup\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		//WebElement element=driver.findElement(By.id("male"));
		//element.click();     //This will not work as the element is hidden
		int x=driver.findElement(By.id("male")).getLocation().getX();
		int y=driver.findElement(By.id("male")).getLocation().getY();
		System.out.println("The X coordinate is "+x);
		System.out.println("The Y coordinate is "+y);  
		//the coordinate values will come as 0,0 which proves it is hidden element
		List<WebElement> radio=driver.findElements(By.id("male"));
		int count=radio.size();
		System.out.println("The no. of elements are "+count);
		for(int i=0;i<count;i++)
		{
			int x1=radio.get(i).getLocation().getX();
			if(x1!=0)
			{
				System.out.println("We reached the correct element");
				radio.get(i).click();
				break;
			}
			
		}

	}

}
