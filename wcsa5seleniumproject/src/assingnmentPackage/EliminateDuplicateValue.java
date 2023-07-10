package assingnmentPackage;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateValue {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/wcsa5workspace/WebElementLink/Username.html/UserName.html/mutlidublicate.html");
		
		//identify dropdown
		WebElement dropDownElement = driver.findElement(By.id("menu"));
		//handle dropdown
		
		Select sel = new Select(dropDownElement);
		HashSet<String> hs = new HashSet<String>();
		//to get options from dropDown
		List<WebElement> allOpts = sel.getOptions();
		//to read option from dropDown
		for(int i=0;i<allOpts.size();i++)
		{
			WebElement op = allOpts.get(i);
		
		//get text of web element and add into set
			String value = op.getText();
			
			//add the value into set means duplicate value not allowed
			//insertion order not maintain
			hs.add(value);
		}
		//read the value from the set
		for(String element:hs)
		{
			Thread.sleep(2000);
			System.out.println(element);
		}
		
	}

}
