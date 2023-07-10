package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorgithub {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2FPipedreamHQ%2Fpipedream%2Ftree%2Fmaster%2Fcomponents%2Fgithub%3Fgclid%3DCjwKCAjwvJyjBhApEiwAWz2nLZrZyNPG92RyMyJpVLi4D73A07MM_DxtFJUYV1WcblP9aBmoeUe3phoCEUgQAvD_BwE");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name^='l']")).sendKeys("vasudhagurav");
		Thread.sleep(2000);
		
	    driver.findElement(By.cssSelector("input[name^='p']")).sendKeys("vasundhara1028@");
		Thread.sleep(2000);
		
	//	driver.findElement(By.cssSelector("input[id^='e']")).sendKeys("guravvasudha970@gmail.com");
		//Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='commit']")).click();

}
}
