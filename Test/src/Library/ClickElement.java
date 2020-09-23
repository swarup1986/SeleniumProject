package Library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {

	public static void clickbyxpath(WebDriver localdriver, String localxpath)
	{
		Actions act=new Actions(localdriver);
		act.moveToElement(localdriver.findElement(By.xpath(localxpath))).click().build().perform();
	}
}
