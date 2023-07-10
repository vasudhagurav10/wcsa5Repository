package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class getAttributeMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//p[contains(@class,'oxd-text oxd-text--p orangehrm-login-forgot-header')]")).getAttribute("id");
		//System.out.println(driver.findElement(By.xpath("//p[contains(@class,'oxd-text oxd-text--p orangehrm-login-forgot-header')]")).getAttribute("class"));
		
		WebElement Attribute=driver.findElement(By.xpath("//p[contains(@class,'oxd-text oxd-text--p orangehrm-login-forgot-header')]"));
		String classvalue=Attribute.getAttribute("class");
		System.out.println(classvalue);
	}

}
