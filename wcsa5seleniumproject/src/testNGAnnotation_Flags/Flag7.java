package testNGAnnotation_Flags;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Flag7 {
	@Test()
	public void loginMethod()
	{
		System.out.println("It Is Use To Perform Login");
	}
	@Test(dependsOnMethods = "LoginMethod")
	public void createUserMethod() 
	{
		Assert.fail();
		System.out.println("It Is use To cretae user");
	}
	@Test(dependsOnMethods = "createUserMethod",alwaysRun = true)
	public void logOutMethod()
	{
		System.out.println("It is use to perform logout");
	}

}
