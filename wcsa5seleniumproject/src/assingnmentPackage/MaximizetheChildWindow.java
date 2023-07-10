package assingnmentPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizetheChildWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launch the browser
				WebDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//apply implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//launch the web-application
				driver.get("http://omayo.blogspot.com/");
				Thread.sleep(2000);
				
				//launch the child wiindow
				Thread.sleep(2000);
				WebElement childWindow = driver.findElement(By.partialLinkText("Open a popup window"));
				
				Point elementLoc = childWindow.getLocation();
       			int xaxis = elementLoc.getX();
				int yaxis = elementLoc.getY();
				//scroll till open a pop up window link
				JavascriptExecutor jse =(JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
				
				childWindow.click();
				
	}

}
