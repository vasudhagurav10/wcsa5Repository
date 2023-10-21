package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-1alah1n/login.do");
		
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		
		WebElement passTB = driver.findElement(By.name("pwd"));
		passTB.sendKeys("manager");
		
		driver.findElement(By.id("loginButton"));
		
		driver.navigate().refresh();
		
		usnTB.sendKeys("admin");
	}

}
