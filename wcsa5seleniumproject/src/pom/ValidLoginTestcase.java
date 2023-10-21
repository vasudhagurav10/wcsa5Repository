package pom;

import java.io.IOException;

public class ValidLoginTestcase extends BestTest {
	public static void main(String[] args) throws IOException {
		BestTest bt = new BestTest();
		bt.setup();
		
		
		Flib flib = new Flib();
		
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMethods(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password") );
		HomePage hp = new HomePage(driver);
		hp.clickOnLogoutLink();
	}

}
