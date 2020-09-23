package SeleniumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNgProject {

	@Test(priority=1,description="This test logs an user to the site")
	public void logintoapplication()
	{
		System.out.println("Login to application successful");
		Assert.assertEquals("Swarup", "Vunti");
	}
	@Test(priority=2,dependsOnMethods="logintoapplication")
	public void additem()
	{
		System.out.println("Item is added to Cart");
	}
	@Test(priority=3)
	public void checkout()
	{
	System.out.println("User has logged out successfully");
	}
	@Test(dependsOnMethods="checkout")
	public void sortproduct()
	{
		System.out.println("User can sort products now");
	}
	
	
}
