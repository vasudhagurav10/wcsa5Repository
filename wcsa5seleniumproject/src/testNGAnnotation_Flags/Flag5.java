package testNGAnnotation_Flags;

import org.testng.annotations.Test;

public class Flag5 {
	@Test()
	public void loginMethod()
	{
	 System.out.println("It Is Use To Perform Login");	
	}
	
	@Test(dependsOnMethods = "loginMethod")
	public void createUserMehtod()
	{
		System.out.println("It Is Use To Create User ");
	}
	
	@Test(dependsOnMethods = "createUserMethod")
	public void logoutMethod()
	{
		System.out.println("It Is Use To Perform Logout");
	}	

}
