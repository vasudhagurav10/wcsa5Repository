package EndToEndFlow;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String address = driver.getWindowHandle();
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
		Set<String> childaddress = driver.getWindowHandles();
		for (String wh : childaddress) {
			if(!address.equals(wh)) {
				driver.switchTo().window(wh);
			}
			}
		
		driver.findElement(By.xpath("(//div[@class='a-checkbox'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		//driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
        driver.findElement(By.xpath("//a[@id='attach-close_sideSheet-link']")).click();
    //     driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
       // driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
        driver.findElement(By.xpath("//a[@aria-label='0 items in cart']")).click();
        driver.findElement(By.xpath("//input[@name='submit.delete.3418f2cd-8f73-4568-a656-65da6cabc556']"));
}
}
