package actionsClassMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickMethod {
	//use to perform double click
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//launch the acti time
		driver.get("http://desktop-1alah1n/login.do");
		//explicite wait
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		//perform login operation
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//home page
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.titleContains(driver.getTitle()));
		
		//click on setting module..
		driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
		
		driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("uploadNewLogoOption")).click();
		
		//click on button to select the file
		
		//driver.findElement(By.name("formCustomInterfaceLogo.logo")).click();
		
		//perform double click
		
		WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
		
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
