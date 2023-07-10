package assingnmentPackage;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateValueTreeset {
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
		TreeSet<String> ts = new TreeSet<String>();
		List<WebElement> allOpts = sel.getOptions();
		for(int i=0;i<allOpts.size();i++)
		{
			WebElement op = allOpts.get(i);
			String value = op.getText();
			ts.add(value);
		}
		for(String element:ts)
		{
			Thread.sleep(2000);
			System.out.println(element);
			}
		}
}
