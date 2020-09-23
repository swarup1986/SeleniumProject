package SeleniumTests;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KeycloakCreateUser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://apinbanisrhel1.ra-int.com:9043/auth/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Administration Console')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='kc-login']")).click();
		//Login to Application Successful
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Users')]")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);			
		driver.findElement(By.id("createUser")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Adding Details in Create User Page
		driver.findElement(By.id("username")).sendKeys("user5");
		driver.findElement(By.id("email")).sendKeys("user5_swa@gmail.com");
		driver.findElement(By.id("firstName")).sendKeys("user5_FirstName");
		driver.findElement(By.id("lastName")).sendKeys("user5_LastName");
		
		driver.findElement(By.xpath("//button[@class='ng-binding btn btn-primary'][contains(text(),'Save')]")).click();
		WebElement button=driver.findElement(By.xpath("//a[contains(text(),'Role Mappings')]"));
		driver.findElement(By.xpath("//span[@class='pficon pficon-close']")).click();
		System.out.println("The success message is closed");
		Thread.sleep(5000);
		//Navigating to Credentials Page
		WebElement credentialTab=driver.findElement(By.xpath("//a[contains(text(),'Credentials')]"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",credentialTab);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='newPas']")).sendKeys("Admin@12345");
		driver.findElement(By.xpath("//input[@id='confirmPas']")).sendKeys("Admin@12345");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ng-binding btn btn-danger']")).click();
		Thread.sleep(5000);
		
		//Navigating to RoleMapping Tab
		WebElement rolemappingTab=driver.findElement(By.xpath("//a[contains(text(),'Role Mappings')]"));
		executor.executeScript("arguments[0].click();", rolemappingTab);
		Select clientRoles=new Select(driver.findElement(By.xpath("//select[@id='clients']")));
		List<WebElement> options=clientRoles.getOptions();
		
		System.out.println("No. of elements in the dropdown is "+options.size());
		System.out.println("The fourth value is "+options.get(4).getText());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		options.get(4).click();		
		
		driver.findElement(By.xpath("//option[contains(text(),'user')]")).click();
		driver.findElement(By.xpath("//div[@class='form-group']//div[2]//div[1]//button[1]")).click();
		driver.findElement(By.xpath("//ol[@class='breadcrumb']//a[@class='ng-binding'][contains(text(),'Users')]")).click();
		driver.findElement(By.xpath("//button[@id='viewAllUsers']")).click();
		//assertEquals(driver.findElement(By.xpath("//tr[7]//td[2]")).getText(), "user5");
		System.out.println("Test passed without error");
        
	}

}
