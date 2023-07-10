package assingnmentPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonByUsingGetHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//apply implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the web application
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute' and @id='twotabsearchtextbox']")).sendKeys("samsung mobile");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		String address = driver.getWindowHandle();
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> childaddress = driver.getWindowHandles();
		for (String wh : childaddress) {
			if(!address.equals(wh)) {
				driver.switchTo().window(wh);
			}
			}
			
		driver.findElement(By.xpath("//div[text()='Select delivery location']")).click();
		driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("411033");
		driver.findElement(By.xpath("//span[@class='a-button a-button-span12']")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.findElement(By.id("attach-sidesheet-view-cart-button")).click();
		//driver.findElement(By.name("submit.delete.2120052c-d6f2-4177-92cd-e8c9e00b73d1")).click();
	}

}
