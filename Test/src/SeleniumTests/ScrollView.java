package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollView {

	public class ScrollPage {

		@Test
		public void scrollpage()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			JavascriptExecutor je= (JavascriptExecutor)driver;
			WebElement element=driver.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[3]"));
			je.executeScript("arguments[0].scrollIntoView(true);", element);
			System.out.println(element.getText());

}
}
}