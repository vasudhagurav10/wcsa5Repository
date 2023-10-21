package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/wcsa5workspace/WebElementLink/confirmation.html");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(1000);
		
		//handle alert pop up
	    Alert al = driver.switchTo().alert();
	   // al.accept();
	    al.dismiss();
	    
	    System.out.println(al.getText());
		
	}

	}
