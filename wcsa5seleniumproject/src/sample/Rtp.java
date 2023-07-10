package sample;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// to take user inputs use scanner class
		//new Scanner(System.in);

		Scanner sc = new Scanner(System.in);
		System.out.println("which browser we want to open!!!");
		String browservalue = sc.next();

		if (browservalue.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();

		} else if (browservalue.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();

		} else if (browservalue.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();

		}

	}

}
