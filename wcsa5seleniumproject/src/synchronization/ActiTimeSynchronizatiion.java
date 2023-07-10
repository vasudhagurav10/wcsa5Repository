package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeSynchronizatiion {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-1alah1n/login.do");
		
		//LoginPage
		
		String actualTitleloginPage=driver.getTitle();
		 explicitWaitMethod(driver,30, actualTitleloginPage);
			System.out.println("Title is matched,Test Case Passed!!");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();

		
			// Home page

			// "actiTIME - Enter Time-Track"

			System.out.println("Title is matched,Test Case Passed!!");
			// driver.findElement(By.linkText("Logout")).click();
			
		}
		
		public static void explicitWaitMethod(WebDriver driver,int sec,String title)
		{
			//To apply explicit wait
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(sec));
			wait.until(ExpectedConditions.titleContains(title));
		}

	}

