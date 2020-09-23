package SeleniumTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handletabledata {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[3]/div/label")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[5]")).click();
		//In abobe case We are selecting 22nd mar 2019. Below dynamic method is more wise option
		//this is static method of selecting a particular data. But this will fail as once this date is over we will be unable to select this
		List<WebElement> Dates_List=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//td"));
		int Total_Dates=Dates_List.size();
		for (int i=0;i<Total_Dates;i++)
		{
			String Date_Value=Dates_List.get(i).getText();
			if(Date_Value.equalsIgnoreCase("25"))
			{
				Dates_List.get(i).click();
				break;
			}
		}
		

	}

}
