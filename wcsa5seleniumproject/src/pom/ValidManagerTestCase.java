package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class ValidManagerTestCase extends BestTest {
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BestTest bt = new BestTest();
		bt.setup();
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		UserPage up = new UserPage(driver);
		
		WorkLab wl = new WorkLab();
		
		lp.validLoginMethods(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		hp.clickOnusersModule();
		up.createManager(flib.readExcelData(EXCEL_PATH, "managercreds", 1, 0),flib.readExcelData(EXCEL_PATH, "managercreds", 1, 1),flib.readExcelData(EXCEL_PATH, "managercreds", 1, 2),flib.readExcelData(EXCEL_PATH, "managercreds", 1, 3));
		up.deletemanager();
		wl.handleConfirmationPopup();
		Thread.sleep(2000);
		bt.tearDown();
	}

}
