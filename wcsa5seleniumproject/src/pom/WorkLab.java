package pom;

public class WorkLab extends BestTest {
	public void handleConfirmationPopup()
	{
		driver.switchTo().alert().accept();
	}

}
