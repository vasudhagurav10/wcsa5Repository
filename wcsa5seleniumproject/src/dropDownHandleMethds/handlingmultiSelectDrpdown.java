package dropDownHandleMethds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class handlingmultiSelectDrpdown {
	
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Desktop/wcsa5workspace/WebElementLink/Username.html/UserName.html/multiple.html");
		WebElement multiselectdropdown=driver.findElement(By.id("menu"));
		Select sel=new Select(multiselectdropdown);
		
		
		//to select using index
		sel.selectByIndex(2);
	    Thread.sleep(500);
	    
		
		//to select using visible text
		sel.selectByVisibleText("pav bhaji");
		
		//to select using value
		sel.selectByValue("b3");
		Thread.sleep(1000);
		
		//to deselect by index
		sel.deselectByIndex(2);
		
		//to deselct using visible text
		sel.deselectByVisibleText("pav bhaji");
		
		//deselect using value
		sel.deselectByValue("b3");
		Thread.sleep(1000);
		for(int i=0;i<5;i++)
		{
			sel.selectByIndex(i);
			
		}
		Thread.sleep(1000);
		//for(int i=0;i<5;i++)
		//{
		  // sel.deselectByIndex(i);	
		//}
		
		//deselect all
		sel.deselectAll();

}
	}
