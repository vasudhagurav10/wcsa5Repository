package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class InvalidLoginTestcase extends BestTest {
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InterruptedException {
		BestTest bt = new BestTest();
		bt.setup();
		
		LoginPage lp = new LoginPage(driver);
		
		Flib flib = new Flib();
		int rc = flib.getLeastRowCount(EXCEL_PATH, "invalidcreds");
		
		for (int i = 0; i < rc; i++) {
			lp.InvalidLoginMethods(flib.readExcelData(EXCEL_PATH, "invalidcreds", i,0),flib.readExcelData(EXCEL_PATH, "invalidcreds",i,1));
			
		}
	}

}
