package dropDownHandleMethds;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/wcsa5workspace/WebElementLink/Username.html/UserName.html/multiple.html");
		
		//identify dropdown
		
		WebElement dropDownElemnent = driver.findElement(By.id("menu"));
		
		//handle the dropdown
		Select sel = new Select(dropDownElemnent);
		//to read options from dropdown
		 WebElement allOpts = sel.getWrappedElement();
		 System.out.println(allOpts.getText());
		
	}

}

