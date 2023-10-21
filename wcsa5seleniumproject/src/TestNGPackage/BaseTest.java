package TestNGPackage;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;

public class BaseTest {
	static WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("http://desktop-1alah1n/login.do");
	    
	}
	public void failedMethod(String failedMethodName)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+failedMethodName+".png");
		try
		{
			Files.copy(src, dest);
		}
		catch(Exception e)
		{
			
		}
	}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
	}


