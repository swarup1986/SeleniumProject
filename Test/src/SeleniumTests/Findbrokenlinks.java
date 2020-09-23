package SeleniumTests;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findbrokenlinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Swarup\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("The total no. of links are "+links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement ele=links.get(i);
			String url=ele.getAttribute("href");
			verifyactivelinks(url);
		}
		
		
	}

	private static void verifyactivelinks(String linkurl) {
		try {
			URL url=new URL(linkurl);
			HttpURLConnection obj1=(HttpURLConnection)url.openConnection();
			obj1.setConnectTimeout(3000);
			if(obj1.getResponseCode()==200)
			{
				System.out.println(linkurl+" -- " +obj1.getResponseMessage());
			}
			if(obj1.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
			{
				System.out.println(linkurl+"  --  " +obj1.getResponseMessage() + "  --  " +HttpURLConnection.HTTP_NOT_FOUND);
			}
		} catch (Exception e) {


			
		}
		
	}

}
