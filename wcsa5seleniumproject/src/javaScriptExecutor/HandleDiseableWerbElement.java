package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDiseableWerbElement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launcg the browser
		WebDriver driver=new ChromeDriver();
		//maximaize the browser
		driver.manage().window().maximize();
		//apply implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Lenovo/Desktop/wcsa5workspace/disable.html");
		//identify the webelement
		driver.findElement(By.id("i1")).sendKeys("admin");
		
		//driver.findElement(By.id("i2")).sendKeys("manager");
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
//		{//generate a pop up
//		jse.executeScript("alert('hello there!!!');");}
		
		//handle to disable webelement
		jse.executeScript("document.getElementById('i2').value='manager'");
		
	}

}
