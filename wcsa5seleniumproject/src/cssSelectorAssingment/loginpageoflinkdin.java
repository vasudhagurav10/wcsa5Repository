package cssSelectorAssingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpageoflinkdin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/checkpoint/rm/sign-in-another-account");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@class='text-color-text font-sans text-md outline-0 bg-color-transparent grow']")).sendKeys("guravvasudha970@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("Vasundhara1028@");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class='btn__primary--large from__button--floating']")).click();

}
}
