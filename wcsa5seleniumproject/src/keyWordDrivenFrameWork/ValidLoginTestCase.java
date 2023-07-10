package keyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BestTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		BestTest bt = new BestTest();
		bt.openBrowser();
		
		
		Flib flib = new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH, "Username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH, "Password"));
		driver.findElement(By.id("loginButton")).click();
		
		//Thread.sleep(2000);
		bt.closeBrowser();
		
	}

}
