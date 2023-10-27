package EndToEndFlow;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.flipkart.com/");
           driver.findElement(By.xpath("//span[text()='✕']")).click();
           //driver.findElement(By.xpath("//input[@class='Pke_EE']"));
          
           driver.findElement(By.name("q")).sendKeys("iphone");
           driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
           String address = driver.getWindowHandle();
           driver.findElement(By.xpath("(//div[@class='CXW8mj'])[1]")).click();
           Set<String> childaddress = driver.getWindowHandles();
   		   for (String wh : childaddress) {
   			if(!address.equals(wh)) {
   				driver.switchTo().window(wh);
   			}
   			}
           driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
//         driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
           driver.findElement(By.xpath("//div[@class='_38NiRp']")).click();
           driver.findElement(By.xpath("//input[@class='_2IX_2- _3umUoc _17N0em']")).sendKeys("guravvasudha970@gmail.com");
          
          
	}

}
