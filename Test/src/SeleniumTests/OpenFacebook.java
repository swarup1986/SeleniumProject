package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenFacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Swarup\\Selenium\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http:\\facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("swarup.wipro@gmail.com");
		driver.findElement(By.xpath("//*[@id='u_0_c']")).sendKeys("FirstName");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[1]/form/div[1]/div[7]/span/span[2]")).click();
        Select sel1=new Select(driver.findElement(By.xpath("//*[@id='month']")));
        sel1.selectByVisibleText("May");
        Select sel2=new Select(driver.findElement(By.xpath("//*[@id='day']")));
        sel2.selectByIndex(10);
        Select sel3=new Select(driver.findElement(By.xpath("//*[@id='year']")));
        sel3.selectByValue("1970");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div[2]/a")).click();
        driver.navigate().back();
        String title=driver.getTitle();
        System.out.println("The page title is"+title);
        driver.navigate().back();
		//		driver.quit();

	}

}
