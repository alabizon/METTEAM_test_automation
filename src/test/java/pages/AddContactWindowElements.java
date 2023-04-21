package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class AddContactWindowElements extends BaseClass {
	
	
	/**
	 * Beginning Elements from Add Contact page
	 */
	
	@FindBy (id = "cEmail2")
	public WebElement contactId;
	
	@FindBy (id = "cFirstName")
	public WebElement contactFirstName;
	
	@FindBy (id = "cMiddleName")
	public WebElement contactMiddleName;
	
	@FindBy (id = "cLastName")
	public WebElement contactLastName;
	
	@FindBy (id = "cSuffix")
	public WebElement contactSuffix;
	
	@FindBy (id = "cDescription")
	public WebElement contactDescription;
	
	@FindBy (id = "cFax")
	public WebElement contactFax;
	
	@FindBy (id = "cPhone1")
	public WebElement contactPhone1;
	
	@FindBy (id = "cPhone2")
	public WebElement contactPhone2;
	
	@FindBy (id = "cCellPhone")
	public WebElement contactCellPhone;
	
	@FindBy (id = "cEmail1")
	public WebElement contactEmail1;
	
	@FindBy (id = "mNotes")
	public WebElement contactNotes;
	
	@FindBy (xpath = "//*[@id ='btnSave' and  @class = 'x-btn x-btn-icon-text x-btn-text-icon']")
	public WebElement buttonSave;
	
	@FindBy (xpath = "//*[@class = ' x-btn-text tb-add-small' and @type = 'button']")
	public WebElement buttonAddFacility;
	
	@FindBy (id = "btnClose")
	public WebElement buttonClose;
	
	/**
	 * End Elements Add Contact page
	 */
	
public AddContactWindowElements() {
		
	    PageFactory.initElements(driver, this);
}
}