package BasePackage;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseClass
{
	@Test(description="This test case depicts invalid login")
    public void InvalidlogintoApplication1() throws Exception
    {
    	driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("admin1");
		driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("demo124");
		driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
		Thread.sleep(3000);
		Reporter.log("Click on login button",true);
    }
	@Test(description="Again this is another example for invalid test case")
    public void InvalidlogintoApplication2() throws Exception
    {
    	driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("demo124");
		driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
		Thread.sleep(3000);
		Reporter.log("Click on login button",true);
    }
}
