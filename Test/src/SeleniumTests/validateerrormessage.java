package SeleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class validateerrormessage {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(2000);
		//String Actual_Error=driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]/div")).getText();
        String Actual_Error=driver.findElement(By.xpath(".//p[@text()='Enter an email or phone number']")).getAttribute("innerHTML");

		String Expected_Error="Enter an email or phone number";
		Assert.assertEquals(Actual_Error, Expected_Error);
		System.out.println("The test with assertequal has passed");
		Assert.assertTrue(Actual_Error.contains("Lets not match the error message"), "The error message does not match");
		System.out.println("The test with Asserttrue has passed as well");
	}

}
