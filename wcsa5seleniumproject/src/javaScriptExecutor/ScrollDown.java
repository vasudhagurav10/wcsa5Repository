package javaScriptExecutor;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launcg the browser
		WebDriver driver=new ChromeDriver();
		//maximaize the browser
		driver.manage().window().maximize();
		//apply implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the webapplication
		driver.get("https://www.selenium.dev");
		//to perform scrooling operation
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		//scrolldown
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,1000)");
		
	}

}
