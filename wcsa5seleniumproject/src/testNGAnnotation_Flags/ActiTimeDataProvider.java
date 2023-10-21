package testNGAnnotation_Flags;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class ActiTimeDataProvider {
	@Test(dataProvider = "actitimedata")
	public void invalidLoginMethod(String usn,String pass) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.get("http://desktop-1alah1n/login.do");
	    
	    driver.findElement(By.name("username")).sendKeys(usn);
	    driver.findElement(By.name("pwd")).sendKeys(pass);
	    driver.findElement(By.id("loginButton")).click();
	    driver.findElement(By.name("username")).clear();
	}
  @DataProvider(name="actitimedata")
  public Object[][] testData() {
	  
         Object[][] testdata1 = new Object[5] [2];
         testdata1[0][0]="ad_main";
         testdata1[0][1]="mana_ger";
         
         testdata1[1][0]="manager";
         testdata1[1][1]="admin";
         
         testdata1[2][0]="@admin";
         testdata1[2][1]="@manager";
         
         testdata1[3][0]="admin1";
         testdata1[3][1]="manager23";
         
         testdata1[4][0]="admin123";
         testdata1[4][1]="manager123";
         
         return testdata1;
         
        		 
  }
}

