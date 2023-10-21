package dropDownHandleMethds;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskToSelectOption {
	public static void main(String[] args) throws InterruptedException {
		
		//single select dropdown
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/wcsa5workspace/WebElementLink/Username.html/UserName.html/SingleSelectDropDown.html");
		
		//identify dropdown on webpage
		
		WebElement drpdownelement = driver.findElement(By.id("menu"));
		
		
		//handle the dropdown by crating obj of select....
		Select sel = new Select(drpdownelement);
		
		//real the all option of dropdown
		List<WebElement> alloptin = sel.getOptions();
		
		//to read list use looping statments
		for(WebElement op:alloptin)
		{
			if(op.getText().equals("Milk Shake"))
			{
				Thread.sleep(2000);
				op.click();
				break;
			}
		}
		
	}

}
