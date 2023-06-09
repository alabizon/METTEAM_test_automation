package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddUserWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add User page
	 */
	
	@FindBy (id = "cFirstName")
	public WebElement userFirstName;
	
	@FindBy (id = "cLastName")
	public WebElement userLastName;
	
	@FindBy (id = "cInitials")
	public WebElement userInitials;
	
	@FindBy (id = "cUsername")
	public WebElement userUsername;
	
	@FindBy (id = "cPassword")
	public WebElement userPassword;
	
	@FindBy (id = "cEmail1")
	public WebElement userEmail1;
	
	@FindBy (id = "cPhone1")
	public WebElement userPhone1;
	
	@FindBy (id = "cPhone2")
	public WebElement userPhone2;
	
	@FindBy (id = "cTechStampNumber")
	public WebElement userStampNumber;
	
	@FindBy (id = "cEmployeeNumber")
	public WebElement userEmployeeNumber;
	
	@FindBy (id = "cPayGrade")
	public WebElement userPayGrade;
	
	@FindBy (id= "btnSave")
	public WebElement buttonSave;
	
	@FindBy (xpath = "//*[@class = ' x-btn-text' and text()='OK']")
	public WebElement okOnAlert;
	
	@FindBy (id = "btnGroupMembership")
	public WebElement buttonGroups;
	
	@FindBy (id = "tbClose")
	public WebElement buttonClose;
	
	/**
	 * End Elements Add User page
	 */
	
public AddUserWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}