package SeleniumTests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeadlessBrowserTesting {
	
	@Test
	public void HeadLessBrowseFacebook()
	{
		WebDriver driver=new HtmlUnitDriver();
		driver.get("http://www.facebook.com");
		String Actual_Title=driver.getTitle();
		System.out.println("The actual title is "+Actual_Title);
		Assert.assertTrue(Actual_Title.contains("Facebook"));
		System.out.println("This will print if the assert statement passes");
	}
	@Test
	public void HeadLessBrowseFacebookTitle()
	{
		WebDriver driver=new HtmlUnitDriver();
		driver.get("http://www.facebook.com");
		String Actual_Title=driver.getTitle();
		System.out.println("The actual title is "+Actual_Title);
		Assert.assertTrue(Actual_Title.contains("QTP"));
		System.out.println("This will not print if the assert statement fails");
	}

}
