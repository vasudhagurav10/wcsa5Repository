package dropDownHandleMethds;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperatoinalMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Lenovo/Desktop/wcsa5workspace/WebElementLink/Username.html/UserName.html/multiple.html");
		WebElement multiselectDD = driver.findElement(By.id("menu"));
	   	Select sel = new Select(multiselectDD);
	   	
	   	//using isMultiple 
	    boolean result= sel.isMultiple();
	    System.out.println(result);
	    
	    //get options method using for loop
	    List<WebElement> dropDownOptions = sel.getOptions();
	    for (int i = 0; i < dropDownOptions.size(); i++)
	    {
	       	String options = dropDownOptions.get(i).getText();
	       	System.out.println(options);
	       	Thread.sleep(1000);  	
		}
	    System.out.println();
	    
	    
	    //using for each loop
	    List<WebElement> ops = sel.getOptions();
	    for (WebElement wb : ops) 
	    {
		  String textOFOps = wb.getText();	
		  System.out.println(textOFOps);
		}
	    for (int i = 0; i <=4; i++) 
	    {
			sel.selectByIndex(i);
		}
	    WebElement firstOps = sel.getFirstSelectedOption();
	    System.out.println("first selected option is:"+firstOps.getText());
	    
	}

}
