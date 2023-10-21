package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	@FindBy(xpath="//input[@value='Create New User']")private WebElement userListCreatenewUserButton;
	@FindBy(name="username")private WebElement usnTB;
	@FindBy(xpath="//*[@name='passwordText']")private WebElement passTB;
	@FindBy(xpath="//*[@name='passwordTextRetype']")private WebElement retypePassTB;
	@FindBy(name="firstName")private WebElement firstNameTB;
	@FindBy(name="lastName")private WebElement lastNameTB;
	@FindBy(name="rightGranted[12]")private WebElement modifyEnterTimeTrackCheckBox;
	@FindBy(name="rightGranted[2]")private WebElement managerCust_projectCheckBox;
	@FindBy(name="rightGranted[1]")private WebElement generatesReportsCheckBox;
	@FindBy(name="rightGranted[5]")private WebElement manageUserCheckBox;
	@FindBy(name="rightGranted[7]")private WebElement manageBillingTypeCheckBox;
	@FindBy(xpath="//input[@type='submit']")private WebElement createUserButton;
    @FindBy(xpath="/HTML/BODY/DIV/FORM/TABLE/TBODY/TR[4]/TD/INPUT[2]")private WebElement cancelButton;
    @FindBy(xpath="//a[.=\"gurav, vasudha (test1)\"]")private WebElement userLink;
    @FindBy(xpath="//input[@value='Clean Up Demo Data']")private WebElement deleteButton;
    
    public UserPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }


	public WebElement getUserListCreate() {
		return userListCreatenewUserButton;
	}


	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPassTB() {
		return passTB;
	}


	public WebElement getRetypePassTB() {
		return retypePassTB;
	}


	public WebElement getFirstNameTB() {
		return firstNameTB;
	}


	public WebElement getLastNameTB() {
		return lastNameTB;
	}


	public WebElement getModifyEnterTimeTrackCheckBox() {
		return modifyEnterTimeTrackCheckBox;
	}


	public WebElement getManagerCust_projectCheckBox() {
		return managerCust_projectCheckBox;
	}


	public WebElement getGeneratesReportsCheckBox() {
		return generatesReportsCheckBox;
	}


	public WebElement getManageUserCheckBox() {
		return manageUserCheckBox;
	}


	public WebElement getManageBillingTypeCheckBox() {
		return manageBillingTypeCheckBox;
	}


	public WebElement getCreateUserButton() {
		return createUserButton;
	}


	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public void createManager(String username,String password,String fn,String ln) throws InterruptedException
	{
		userListCreatenewUserButton.click();
		Thread.sleep(2000);
		usnTB.sendKeys(username);
		passTB.sendKeys(password);
		retypePassTB.sendKeys(password);
		firstNameTB.sendKeys(fn);
		lastNameTB.sendKeys(ln);
		Thread.sleep(3000);
		modifyEnterTimeTrackCheckBox.click();
		managerCust_projectCheckBox.click();
		generatesReportsCheckBox.click();
		manageUserCheckBox.click();
		manageBillingTypeCheckBox.click();
		Thread.sleep(3000);
		cancelButton.click();
	}
	public void deletemanager() 
	{
		userLink.click();
		deleteButton.click();
	}
}
