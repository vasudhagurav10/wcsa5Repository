package DependentIndependentXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkarthpLaptop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeOptions c=new ChromeOptions();
	//	c.add
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		
		driver.findElement(By.xpath("//input[contains(@class,'_3704LK')]")).sendKeys("HP laptop");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
      	Thread.sleep(2000);
		

		driver.findElement(By.xpath("//div[text()='Core i5']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//div[text()='Brand']")).click();
	    Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//div[text()='Windows 10']")).click();
		 Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='HP Omen Core i5 7th Gen - (8 GB/1 TB HDD/128 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA GeForce GTX 1...']/../..//div[text()='₹87,490']")).click();
}
}
