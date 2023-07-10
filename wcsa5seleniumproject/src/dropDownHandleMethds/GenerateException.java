package dropDownHandleMethds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenerateException {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/wcsa5workspace/WebElementLink/Username.html/UserName.html/SingleSelectDropDown.html");
		
		//identify dropdown on webpage
		
		WebElement drpdownelement = driver.findElement(By.id("menu"));
		
		
		//handle the dropdown by crating obj of select....
		Select sel = new Select(drpdownelement);
		
		//select the option from dropdown
		//use selectin methods
		Thread.sleep(2000);
		sel.selectByIndex(2);  //from single select dropdown
		
		Thread.sleep(2000);
		//try to deselct given option from drpdown
		sel.deselectByIndex(2);
	}

}
