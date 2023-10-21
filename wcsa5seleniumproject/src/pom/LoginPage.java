package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//*[@name='username']")private WebElement usnTB;
	@FindBy(xpath="//input[@type='password']")private WebElement passTB;
	@FindBy(xpath="//*[@id='loginButton']")private WebElement loginButton;
	@FindBy(xpath="//*[@id='keepLoggedInCheckBox']")private WebElement checkBox;
	@FindBy(partialLinkText = "Actimind Inc.") private WebElement actiMindLink;
	  
	
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	
	//utilization
	public WebElement getUsnTB() {
		return usnTB;
	}



	public WebElement getPassTB() {
		return passTB;
	}



	public WebElement getLoginButton() {
		return loginButton;
	}



	public WebElement getCheckBox() {
		return checkBox;
	}



	public WebElement getActiMindLink() {
		return actiMindLink;
	}
	
	//operational methods
	public void validLoginMethods(String validUsername,String validPassword)
	{
		usnTB.sendKeys(validUsername);
		passTB.sendKeys(validPassword);
		loginButton.click();
	}
	public void InvalidLoginMethods(String inValidUsername,String inValidPassword) throws InterruptedException
	{
		usnTB.sendKeys(inValidUsername);
		passTB.sendKeys(inValidPassword);
		//loginButton.clear();
		Thread.sleep(2000);
		
	}

}
