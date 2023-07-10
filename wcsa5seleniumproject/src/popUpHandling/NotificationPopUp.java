package popUpHandling;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp {
	static WebDriver driver;
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String browserValue = sc.next();
	if(browserValue.equalsIgnoreCase("chrome")) {
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     //handle notification PouUp
     ChromeOptions co = new ChromeOptions();
     co.addArguments("--disable-notifications");
     ChromeDriver driver = new ChromeDriver(co);
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("https://www.easemytrip.com/");
	}
	else if(browserValue.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "./driver.firefoxdriver.exe");
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--disable-notification");
		driver=new FirefoxDriver(fo);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/");
		}
	else if(browserValue.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--disable-notification");
		driver=new EdgeDriver(eo);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.easemytrip.com/");
		}
	else
	{
		System.out.println("enter valid browserValue");
	}
     
     
	}

}
