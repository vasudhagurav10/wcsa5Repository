package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertionInTestNG {
	    @Test
	    public void verification() throws InterruptedException 
	    {
		System.setProperty("webdriver.chrome.drivet", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("http://desktop-1alah1n/login.do");
	    // non critical feature
         String actuslTitle = driver.getTitle();
         SoftAssert sa = new SoftAssert();
         sa.assertEquals(driver.getTitle(), actuslTitle);
         
         driver.findElement(By.name("username")).sendKeys("admin");
	    	driver.findElement(By.name("pwd")).sendKeys("manager");
	    	driver.findElement(By.id("loginButton")).click();
	    	System.out.println("title  match test case pass ");
	    	
	    	sa.assertAll();
	    	
	    	
//	    if(driver.getTitle().equalsIgnoreCase(actuslTitle))
//	    {
//	    	driver.findElement(By.name("username")).sendKeys("admin");
//	    	driver.findElement(By.name("pwd")).sendKeys("manager");
//	    	driver.findElement(By.id("loginButton")).click();
//	    	System.out.println("title  match test case pass ");
//	    }
//	    else
//	    {
//	    	System.out.println("title not match test case failed ");
//	    }
	    
	   
	    //critical feature
//	    if(driver.getTitle().equalsIgnoreCase("qwerf"))
//	    {
//	    	System.out.println("Home Pagetitle  match test case pass");
//	    }
//	    else
//	    {
//	    	System.out.println("Home Page title not match test case failed ");
//	    }
	    
	    String actualTitleOfHomePage = driver.getTitle();
	    Assert.assertEquals(driver.getTitle(), "qweffs");
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Logout")).click();
	    }

}
