package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/wcsa5workspace/WebElementLink/Alerttt.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(2000);
		
		//handle alert pop up
	    Alert al = driver.switchTo().alert();
	   // al.accept();
	    //al.dismiss();
	    
	    System.out.println(al.getText());
		
	}

}
