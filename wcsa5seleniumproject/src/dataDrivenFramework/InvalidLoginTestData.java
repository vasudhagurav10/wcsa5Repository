package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-1alah1n/login.do");
		
		
		//read the data from the excel and test the login page
		Flib flib = new Flib();
		//to read multiple data use for loop
		int rc = flib.getLeastRowCount("./data/ActiTimeTestData.xlsx.xlsx", "invalidcreds");
		for (int i = 1; i < rc; i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx.xlsx", "invalidcreds", 1, 0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeTestData.xlsx.xlsx", "invalidcreds", 1, 1));
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).click();
		}
		
	}

}
