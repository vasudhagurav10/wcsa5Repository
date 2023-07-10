package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launcg the browser
		WebDriver driver=new ChromeDriver();
		//maximaize the browser
		driver.manage().window().maximize();
		//apply implicite wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the webapplication
		driver.get("https://www.selenium.dev");
		//identify the webelement
		WebElement newselement = driver.findElement(By.xpath("//h2[text()='News']"));
		//to perform scrolling operation for a news element
		
		//location of newselement
		Point loc = newselement.getLocation();		
		int xaxis = loc .getX();
		int yaxis = loc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-180)+")");
		
		//jse.executeScript("window.scrollBy(5000,0)");
		jse.executeScript("arguments[0].scrollIntoView(false)",newselement);
	}

}
//h2[text()='News']