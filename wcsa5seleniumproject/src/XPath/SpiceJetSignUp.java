package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetSignUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://spiceclub.spicejet.com/signup");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@class='form-control form-select ']")).sendKeys("mrs");
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("VasudhaVijay");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Gurav");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//select[@class='form-control form-select']")).sendKeys("India");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@placeholder='+91 01234 56789']")).sendKeys("9898989898");
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("guravvasudha970@gmail.com");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Vasundhara1028@");
	    Thread.sleep(2000);

}
}
