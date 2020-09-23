package Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserttest1 {
	@Test
	public void test1()
	{
	   Assert.assertEquals(12, 13);
	}
	@Test
	public void test2()
	{
	   Assert.assertEquals(12, 12,"When actual does not match expected this message prints");
	   System.out.println("When actual equals expected this should print");
	}
	@Test
	public void test3()
	{
	   String MyName="Vunti Ghosh";
	   Assert.assertTrue(MyName.contains("Vunti"));
	   System.out.println("Name is matching");
	   
	}
	@Test
	public void test4()
	{
	   String MyName="Vunti Ghosh";
	   Assert.assertTrue(MyName.contains("Khunti"),"Names does not match");
	   System.out.println("Name is matching");
	   
	}
	@Test
	public void test5()
	{
	   Assert.assertTrue(false);
	   System.out.println("When asserttrue is false the test will fail based on a condition");
	   
	}
}
