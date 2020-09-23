package SeleniumTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	
	@Test
	public void softassertdemo()
	{
		SoftAssert assertion1=new SoftAssert();
		System.out.println("Softassert test has started");
		assertion1.assertEquals(10,12,"Values does not match");
		System.out.println("Softassert test has complted");
		assertion1.assertAll();
	}
	@Test
	public void hardassertdemo()
	{
		System.out.println("Hardassert TEST has started");
		Assert.assertEquals(12, 20);
		System.out.println("Hardassert TEST has completed");
	}

}
