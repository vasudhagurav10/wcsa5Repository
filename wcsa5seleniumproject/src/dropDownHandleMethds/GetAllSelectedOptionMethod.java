package dropDownHandleMethds;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionMethod {
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
		
		//select multiple option from dropdown
		for(int i=2;i<4;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		
		//to read all selected option from dropdown
		List<WebElement> allOpts = sel.getAllSelectedOptions();
		
	//	for(WebElement op:allOpts)
	//	{
	//		Thread.sleep(2000);
	//		System.out.println(op.getText());
	//	}
		for(int i=0;i<allOpts.size();i++)
		{
			Thread.sleep(2000);
			System.out.println(allOpts.get(i).getText());
		}
		
	}

}
