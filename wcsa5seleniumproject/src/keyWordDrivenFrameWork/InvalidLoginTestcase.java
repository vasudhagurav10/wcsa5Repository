package keyWordDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLoginTestcase extends BestTest {
	public static void main(String[] args) throws IOException {
		BestTest bt = new BestTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		int rc = flib.getLeastRowCount(EXCEL_PATH, "invalidcreds");
		for (int i = 1; i < rc; i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1));
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
		}
		bt.closeBrowser();
	}

}
